package org.launchcode.pleaseWork.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String displayHomePage(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "</ol>";

    }

    @GetMapping("form")
    public String form() {
        String html = "<form method='post'>" +
                "<input type = 'text' name='userName'/>" +
                "<select name='favLang1'>" +
                "  <option value='java'>Java</option>" +
                "  <option value='javaScript'>JavaScript</option>" +
                "  <option value='python'>Python</option>" +
                "</select>" +
                "<select name='favLang2'>" +
                "  <option value='java'>Java</option>" +
                "  <option value='javaScript'>JavaScript</option>" +
                "  <option value='python'>Python</option>" +
                "</select>" +
                "<select name='favLang3'>" +
                "  <option value='java'>Java</option>" +
                "  <option value='javaScript'>JavaScript</option>" +
                "  <option value='python'>Python</option>" +
                "</select>" +
                //"<input type='submit' value='Submit' /" +
                "<button type='submit'>Submit</button>" +
                "</form>";
        return html;
    }

    @PostMapping("favsList")
    public String submitted(@RequestParam String userName, String favLang1, String favLang2, String favLang3) {

    }




}
