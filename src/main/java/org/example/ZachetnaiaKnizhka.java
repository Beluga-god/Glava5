package org.example;

import java.util.*;

public class ZachetnaiaKnizhka {
    private String studentName;
    private List<Session> sessions;

    // Конструктор Зачетной Книжки
    public ZachetnaiaKnizhka(String studentName) {
        this.studentName = studentName;
        this.sessions = new ArrayList<>();
    }

    // Метод для добавления сессии
    public void addSession(Session session) {
        sessions.add(session);
    }

    // Метод для вывода всех сессий
    public void printSessions() {
        System.out.println("Сессии для студента: " + studentName);
        for (Session session : sessions) {
            session.printSessionInfo();
        }
    }

    // Внутренний класс Session для хранения информации о сессиях
    public static class Session {
        private String sessionName;
        private List<Subject> subjects;

        // Конструктор сессии
        public Session(String sessionName) {
            this.sessionName = sessionName;
            this.subjects = new ArrayList<>();
        }

        // Метод для добавления предмета
        public void addSubject(Subject subject) {
            subjects.add(subject);
        }

        // Метод для вывода информации о сессии
        public void printSessionInfo() {
            System.out.println("Сессия: " + sessionName);
            for (Subject subject : subjects) {
                subject.printSubjectInfo();
            }
        }

        // Внутренний класс Subject для хранения информации о предметах
        public static class Subject {
            private String subjectName;
            private String grade;

            // Конструктор предмета
            public Subject(String subjectName, String grade) {
                this.subjectName = subjectName;
                this.grade = grade;
            }

            // Метод для вывода информации о предмете
            public void printSubjectInfo() {
                System.out.println("Предмет: " + subjectName + ", Оценка: " + grade);
            }
        }
    }
}
