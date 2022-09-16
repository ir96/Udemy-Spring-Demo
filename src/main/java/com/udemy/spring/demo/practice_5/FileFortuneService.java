package com.udemy.spring.demo.practice_5;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService{

    private String fileName = "C:\\Users\\rindr\\IdeaProjects\\Udemy-Spring-Demo\\src\\main\\java\\com\\udemy\\spring\\demo\\practice_5\\FortuneData.txt";

    File theFile = new File(fileName);
    String line;
    private List<String> theFortunes = new ArrayList<>();
    private Random random = new Random();

    public FileFortuneService() {
        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        //read fortunes from file
        try(BufferedReader br = new BufferedReader(new FileReader(theFile))) {

            while ((line = br.readLine()) != null) {
                theFortunes.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {

        //pick a random string from the array
        int index = random.nextInt(theFortunes.size());
        return "\n" + index + ": " + theFortunes.get(index) + "\n";
    }
}
