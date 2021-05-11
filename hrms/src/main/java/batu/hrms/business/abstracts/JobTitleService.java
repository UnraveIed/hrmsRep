package batu.hrms.business.abstracts;

import java.util.List;

import batu.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
