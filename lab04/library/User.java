package library;

import java.util.ArrayList;

public class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.id;
    }
}
