package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String doctorOne() {
        return "<h1>William Hartnell</h1>\n" +
                "<img alt=\"Picture William Hartnell\" src=\"../img/williamHartnell.jpg\">\n" +
                "<h2>The Doctor Who</h2>";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String doctorTen() {
        return "<h1>David Tennant</h1>\n" +
                "<img alt=\"Picture David Tennant\" src=\"../img/davidTennant.jpg\">\n" +
                "<h2>The Doctor Who</h2>";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String doctorThirteen() {
        return "<h1>Jodie Whittaker</h1>\n" +
                "<img alt=\"Picture Jodie Whittaker\" src=\"../img/JodieWhittaker.jpg\">\n" +
                "<h2>The Doctor Who</h2>";
    }

}
