package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание зачётной книжки для студента
        ZachetnaiaKnizhka zachetnaiaKnizhka = new ZachetnaiaKnizhka("Иванов Иван Иванович");

        // Создание сессии для студента
        ZachetnaiaKnizhka.Session session1 = new ZachetnaiaKnizhka.Session("Летняя сессия 2024");

        // Добавление предметов к сессии
        session1.addSubject(new ZachetnaiaKnizhka.Session.Subject("Математика", "5"));
        session1.addSubject(new ZachetnaiaKnizhka.Session.Subject("Физика", "4"));
        session1.addSubject(new ZachetnaiaKnizhka.Session.Subject("Программирование Python", "5"));

        // Добавление сессии в зачётную книжку
        zachetnaiaKnizhka.addSession(session1);

        // Создание еще одной сессии для студента
        ZachetnaiaKnizhka.Session session2 = new ZachetnaiaKnizhka.Session("Зимняя сессия 2024");

        // Добавление предметов ко второй сессии
        session2.addSubject(new ZachetnaiaKnizhka.Session.Subject("Математика", "4"));
        session2.addSubject(new ZachetnaiaKnizhka.Session.Subject("Программирование java", "5"));
        session2.addSubject(new ZachetnaiaKnizhka.Session.Subject("Мобильное программирование", "4"));

        // Добавление второй сессии в зачётную книжку
        zachetnaiaKnizhka.addSession(session2);

        // Вывод всех сессий для студента
        zachetnaiaKnizhka.printSessions();
    }
}





