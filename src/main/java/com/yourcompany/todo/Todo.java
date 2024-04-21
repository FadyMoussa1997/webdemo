package com.yourcompany.todo;

import java.time.LocalDate;

public class Todo {

    private int id;

    private String title;

    private String description;

    private LocalDate due_date;


    public Todo(int id, String title, String description, LocalDate due_date) {

        if (title == null ) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        } else {
            this.id = id;
            this.title = title;
            this.description = description;
            this.due_date = due_date;
        }
    }

    public Todo(String title, String description, LocalDate due_date) {

        if (title == null ) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        } else {

            this.title = title;
            this.description = description;
            this.due_date = due_date;
        }
    }

    public Todo() {
        // Default constructor
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDue_date() {
        return due_date;
    }

    public void setDue_date(LocalDate due_date) {
        this.due_date = due_date;
    }
}


