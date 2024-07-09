package com.wipro.JobApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobinfo")
public class Jobinfo {
    @Id  //Pk
    public int id;
    public  String jobTitle;
    public  String jobDescription;
    public  String company;
    public  String location;
    public  String industry;
    public  String qualification;
    public  int experience;
    public  double salary;
    public  String jobType;
    public  String contactInfo;
    public  String postedDate;
    public  String closingDate;
    public  String jobUrl;
    public  String jobStatus;
    public String designation;
}