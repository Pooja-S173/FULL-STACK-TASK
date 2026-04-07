package com.healthcare.portal;

public class User {

    protected int id;
    protected String name;
    protected String password;

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }
}
