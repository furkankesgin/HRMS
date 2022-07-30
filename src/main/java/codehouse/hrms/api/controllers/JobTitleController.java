package codehouse.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codehouse.hrms.business.abstracts.JobTitleService;
import codehouse.hrms.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitleController {
	
	
	private JobTitleService jobTitleService;

	@Autowired
	public JobTitleController(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/test")
	List<JobTitles> getAll() {
		return jobTitleService.getAll();
	}
	
}
