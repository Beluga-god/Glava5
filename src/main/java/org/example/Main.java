package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание зачётной книжки для студента
        ZachetnaiaKnizhka zachetnaiaKnizhka = new ZachetnaiaKnizhka("Иванов Иван Иванович");

        // Добавление сессий
        zachetnaiaKnizhka.addSession("Летняя сессия 2024");
        zachetnaiaKnizhka.addSession("Зимняя сессия 2024");

        // Добавление предметов в сессии
        zachetnaiaKnizhka.addSubjectToSession("Летняя сессия 2024", "Математика", "5");
        zachetnaiaKnizhka.addSubjectToSession("Летняя сессия 2024", "Физика", "4");
        zachetnaiaKnizhka.addSubjectToSession("Летняя сессия 2024", "Программирование Python", "5");

        zachetnaiaKnizhka.addSubjectToSession("Зимняя сессия 2024", "Математика", "4");
        zachetnaiaKnizhka.addSubjectToSession("Зимняя сессия 2024", "Программирование Java", "5");
        zachetnaiaKnizhka.addSubjectToSession("Зимняя сессия 2024", "Мобильное программирование", "4");

        // Вывод всех сессий для студента
        zachetnaiaKnizhka.printSessions();
    }
}
