package codehouse.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import codehouse.hrms.entities.concretes.JobTitles;

public interface JobTitlesDao extends JpaRepository<JobTitles, Integer>{

}
