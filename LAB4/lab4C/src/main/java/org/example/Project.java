package org.example;

import java.util.Comparator;

public class Project implements Comparable<Project> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Project o) {
        return 0;
    }
}
