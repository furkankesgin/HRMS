package codehouse.hrms.business.abstracts;

import java.util.List;

import codehouse.hrms.entities.concretes.JobTitles;

public interface JobTitleService {
	List<JobTitles> getAll();
}
