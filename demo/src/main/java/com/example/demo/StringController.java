package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @RequestMapping("/StrNTimes")
    public StringProblem stringProblem(@RequestParam(value = "string1") String string1,
                                       @RequestParam(value = "n") int n) {
        StringProblem strPR = new StringProblem(string1, n);
        strPR.stringTimes();
        return strPR;
    }

    @RequestMapping("/StringPlusString")
    public StringProblem stringProblem1(@RequestParam(value = "string1") String string1,
                                        @RequestParam(value = "string2") String string2) {
        StringProblem strPR = new StringProblem(string1, string2);
        strPR.konkatekan();
        return strPR;
    }
}