package com.examsys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    
    public Questions(){
    }
    
    public Questions(int id, String question)
    {
        this.id = id;
        this.name = question;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return name;
    }

    public void setQuestion(String question) {
        this.name = question;
    }
}
