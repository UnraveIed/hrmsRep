package batu.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import batu.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
