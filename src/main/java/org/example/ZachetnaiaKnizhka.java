package org.example;

import java.util.ArrayList;
import java.util.List;

public class ZachetnaiaKnizhka {
    private String studentName;
    private List<Session> sessions;

    // Конструктор Зачетной Книжки
    public ZachetnaiaKnizhka(String studentName) {
        this.studentName = studentName;
        this.sessions = new ArrayList<>();
    }

    // Метод для добавления сессии
    public void addSession(String sessionName) {
        sessions.add(new Session(sessionName));
    }

    // Метод для добавления предмета в сессию
    public void addSubjectToSession(String sessionName, String subjectName, String grade) {
        for (Session session : sessions) {
            if (session.getSessionName().equals(sessionName)) {
                session.addSubject(subjectName, grade);
                return;
            }
        }
        System.out.println("Сессия с именем \"" + sessionName + "\" не найдена!");
    }

    // Метод для вывода всех сессий
    public void printSessions() {
        System.out.println("Сессии для студента: " + studentName);
        for (Session session : sessions) {
            session.printSessionInfo();
        }
    }

    // Внутренний класс Session для хранения информации о сессиях
    private class Session {
        private String sessionName;
        private List<Subject> subjects;

        // Конструктор сессии
        public Session(String sessionName) {
            this.sessionName = sessionName;
            this.subjects = new ArrayList<>();
        }

        public String getSessionName() {
            return sessionName;
        }

        // Метод для добавления предмета
        public void addSubject(String subjectName, String grade) {
            subjects.add(new Subject(subjectName, grade));
        }

        // Метод для вывода информации о сессии
        public void printSessionInfo() {
            System.out.println("Сессия: " + sessionName);
            for (Subject subject : subjects) {
                subject.printSubjectInfo();
            }
        }

        // Вложенный класс Subject для хранения информации о предметах
        private class Subject {
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
