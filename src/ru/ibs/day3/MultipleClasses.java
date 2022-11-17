package ru.ibs.day3;

public class MultipleClasses {
    public void workWithUser(String login, String pass) {
        User user = new User(login, pass);
    }
}

class User {
    String login;
    String pass;

    User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }
}