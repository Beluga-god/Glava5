package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание зачётной книжки для студента
        ZachetnaiaKnizhka zachetnaiaKnizhka = new ZachetnaiaKnizhka("Иванов Иван Иванович");

        // Создание первой сессии через экземпляр ZachetnaiaKnizhka
        ZachetnaiaKnizhka.Session session1 = zachetnaiaKnizhka.new Session("Летняя сессия 2024");

        // Добавление предметов к первой сессии
        session1.addSubject(session1.new Subject("Математика", "5"));
        session1.addSubject(session1.new Subject("Физика", "4"));
        session1.addSubject(session1.new Subject("Программирование Python", "5"));

        // Добавление первой сессии в зачётную книжку
        zachetnaiaKnizhka.addSession(session1);

        // Создание второй сессии через экземпляр ZachetnaiaKnizhka
        ZachetnaiaKnizhka.Session session2 = zachetnaiaKnizhka.new Session("Зимняя сессия 2024");

        // Добавление предметов ко второй сессии
        session2.addSubject(session2.new Subject("Математика", "4"));
        session2.addSubject(session2.new Subject("Программирование Java", "5"));
        session2.addSubject(session2.new Subject("Мобильное программирование", "4"));

        // Добавление второй сессии в зачётную книжку
        zachetnaiaKnizhka.addSession(session2);

        // Вывод всех сессий для студента
        zachetnaiaKnizhka.printSessions();
    }
}
