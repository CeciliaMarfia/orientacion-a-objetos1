package ar.edu.unlp.info.oo1.ejercicio12_jobScheduler;

import java.util.List;

public class LIFO implements Strategy{
	
	
	public JobDescription next(JobScheduler jobsScheduler) {
		
		List<JobDescription>jobs = jobsScheduler.getJobs();
		JobDescription nextJob = jobs.get(jobs.size()-1);
		jobsScheduler.unschedule(nextJob);
        return nextJob;

	}
}
