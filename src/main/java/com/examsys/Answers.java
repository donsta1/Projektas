package com.examsys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answers {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private int status;
    private int fk_questionid;
    
    public Answers(){
    }
    
    public Answers(int id, String name, int status, int fk_questionid)
    {
        this.id = id;
        this.name = name;
        this.status = status;
        this.fk_questionid = fk_questionid;
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

    public void setQuestion(String name) {
        this.name = name;
    }
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public int getFk_questionid() {
        return fk_questionid;
    }

    public void setFk_questionid(int fk_questionid) {
        this.fk_questionid = fk_questionid;
    }
}
