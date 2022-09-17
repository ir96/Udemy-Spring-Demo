package com.udemy.spring.demo.practice_6;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService{

    //default constructor
    public FileFortuneService() {
        System.out.println(">>FileFortuneService: inside default constructor");
    }


    private String fileName = "C:\\Users\\rindr\\IdeaProjects\\Udemy-Spring-Demo\\src\\main\\java\\com\\udemy\\spring\\demo\\practice_6\\fortune-data.txt";

    private List<String> theFortune = new ArrayList<>();
    private Random random = new Random();
    File theFile = new File(fileName);

    @PostConstruct
    private void loadFortuneFile() {
        System.out.println("\n>> FileFortuneService: inside the loadFortuneFile method");

        System.out.println("Reading Fortune from file: " + theFile);
        System.out.println("File exists: " + theFile.exists() + "\n");

        try (BufferedReader br = new BufferedReader(new FileReader(theFile))){
            String line;
            while ((line = br.readLine()) != null) {
             theFortune.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getFortune() {
        //pick a random string from the array of fortune-data sheet
        int index = random.nextInt(theFortune.size());
        String tempFortune = "\nindex: " + index + " - " + theFortune.get(index) + "\n";

        return tempFortune;
    }
}
