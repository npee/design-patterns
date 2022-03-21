package io.npee.designpatterns._09_templatemethod._04_sort_ducks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class DuckTest {

    @Test
    void sortDuckTest() {
        Duck[] ducks = {
            new Duck("Daffy", 8),
            new Duck("Dewey", 2),
            new Duck("Howard", 7),
            new Duck("Louie", 2),
            new Duck("Donald", 10),
            new Duck("Huey", 2),
        };
        System.out.println("정렬 전");
        display(ducks);

        Arrays.sort(ducks);
        display(ducks);
    }

    private void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }

}