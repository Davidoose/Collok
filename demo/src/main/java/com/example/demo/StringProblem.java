package com.example.demo;

public final class StringProblem {
    public String result = "";
    private String string1;
    private String string2;
    private int n;

    public StringProblem(String string1) {
        this.string1 = string1;
        this.string2 = "";
    }

    public StringProblem(String string1, int n) {
        this.string1 = string1;
        this.n = n;
    }

    public StringProblem(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public void konkatekan() {
        result = string1 + string2;
    }

    public void stringTimes() {
        for (int i = 0; i < n; i++) {
            result += string1;
        }
    }

    String getStringRes(){
        return result;
    }
}
