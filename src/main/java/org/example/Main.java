package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Смирнов";
        post.patronymic = "Иванович";
        post.passport = "4005374923";
        post.phone = "+79111237654";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.date = 13;
        post.birthday.month = 06;
        post.birthday.year = 1991;

    }
}