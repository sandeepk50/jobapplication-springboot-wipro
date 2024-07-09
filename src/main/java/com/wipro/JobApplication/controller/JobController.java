package com.wipro.JobApplication.controller;

import com.wipro.JobApplication.model.Jobinfo;
import com.wipro.JobApplication.service.Jobservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wipro")
public class JobController {
    @Autowired
    private Jobservice jobService;

    @PostMapping("/addjob")
    public Jobinfo addJob(@RequestBody Jobinfo job) {
        return jobService.addJob(job);
    }

    @PostMapping("/addjobs")
    public List<Jobinfo> addJobs(@RequestBody List<Jobinfo> jobs) {
        return jobService.addJobs(jobs);
    }

    @GetMapping("/jobs")
    public List<Jobinfo> getAllJobs() {
        return jobService.getAllJobs();
    }
    @GetMapping("/job/{id}")
    public Jobinfo getJobById(@PathVariable int id) {
        return jobService.getJobById(id);
    }
    @GetMapping("/status/{jobStatus}")
    public List<Jobinfo> getJobsByStatus(@PathVariable String jobStatus) {
        return jobService.getJobsByStatus(jobStatus);
    }

    @PutMapping("/update/{id}")
    public Jobinfo updateJob(@PathVariable int id, @RequestBody Jobinfo job) {
        return jobService.updateJob(id,job);
    }
    @DeleteMapping("/delete/{id}")
    public String  deleteJob(@PathVariable int id) {
        return jobService.deleteJob(id);
    }
}