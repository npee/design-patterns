package io.npee.designpatterns._09_templatemethod._04_arrays_sort;

public class Duck implements Comparable {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + ", 체중: " + weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck other = (Duck) o;
        if (this.weight < other.weight) {
            return -1;
        } else if (this.weight == other.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
