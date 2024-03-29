package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import javax.validation.constraints.Size;
import java.util.List;


@Entity
public class Skill extends AbstractEntity {


    @Size(max = 250)
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    public Skill(String description) {

        super();
        this.description = description;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }


}