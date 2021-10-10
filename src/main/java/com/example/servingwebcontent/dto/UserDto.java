package com.example.servingwebcontent.dto;

import com.example.servingwebcontent.domain.Job;

import javax.persistence.Column;
import java.util.List;

public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private List<Job> jobs;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
