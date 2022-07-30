package codehouse.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codehouse.hrms.business.abstracts.JobTitleService;
import codehouse.hrms.dataAccess.abstracts.JobTitlesDao;
import codehouse.hrms.entities.concretes.JobTitles;

@Service
public class JobTitleManager implements JobTitleService {
	
	
	private JobTitlesDao jobTitlesDao;
	
	@Autowired
	public JobTitleManager(JobTitlesDao jobTitlesDao) {
		this.jobTitlesDao = jobTitlesDao;
	}


	public List<JobTitles> getAll() {
		return jobTitlesDao.findAll();
		
	}
	
}
