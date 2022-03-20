package io.npee.designpatterns._09_templatemethod._03_with_hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("차 우리기");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬 추가");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("차에 레몬을 추가할까요? (y/n) ");
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
