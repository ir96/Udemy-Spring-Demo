package com.udemy.spring.demo.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public String showPage() {
        return "menu";
    }

    //need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloWorld-form";
    }

    //need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloWorld";
    }


    //new a controller method to read form data and
    //add data to the model
    @RequestMapping("/processForm/v2")
    public String letsShout(HttpServletRequest request, Model model) {

        //read the request parameter from the html form
        String theName = request.getParameter("studentName");

        //convert the data to all caps
        theName = theName.toUpperCase(Locale.ROOT);

        //create the message
        String result = "Yo! " + theName;

        //add message(Data) to the model
        model.addAttribute("message", result);

        return "helloWorld";
    }


}
