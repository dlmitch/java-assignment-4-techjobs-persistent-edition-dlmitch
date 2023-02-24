package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters.")
    @NotBlank(message = "Category is required.")
    private String location;

    public Employer() {
    }
//    public Employer(List<Job> jobs, String location) {
//        this.jobs = jobs;
//        this.location = location;
//    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
