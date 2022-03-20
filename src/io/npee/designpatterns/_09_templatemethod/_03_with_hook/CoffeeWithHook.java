package io.npee.designpatterns._09_templatemethod._03_with_hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("커피 거르기");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕, 우유 추가");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("커피에 우유와 설탕을 추가할까요? (y/n) ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO Exception");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
