package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity{

    private String name;

    @ManyToOne
    private Employer employer;
    private String skills;

    public Job() {
    }

    public Job(Employer anEmployer, String someSkills) {
        super();
       employer = anEmployer;
        this.skills = someSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
