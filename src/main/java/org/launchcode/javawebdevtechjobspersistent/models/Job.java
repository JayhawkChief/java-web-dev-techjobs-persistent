package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Skill> skills = new ArrayList<>();

    @ManyToOne
    private Employer employer;

    public Job() {
    }

    public Job(Employer employer, Skill skill) {
        super();
        this.employer = employer;
        this.skill = skill;
    }

    // Getters and setters.


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
