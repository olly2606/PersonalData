package org.example;

public class Main {
    public static void main(String[] args) {
       Post post = new Post ();
       post.name = "Ilia";
       post.passport = "4444 №44444444";
       post.patronymic="Ivanovich";
       post.phone="89991111111";
       post.subscription=true;
       post.surname="Ivanov";
       FormDate birthday = new FormDate ();
       birthday.day = 23;
       birthday.month = 11;
       birthday.year=1997;
       post.birthday= birthday;
    }
}