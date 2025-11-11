package ar.edu.unlp.info.oo1.ejercicio12_jobScheduler;

import java.util.List;

public class FIFO implements Strategy{
	
	public JobDescription next(JobScheduler jobsScheduler) {
		
		List<JobDescription>jobs = jobsScheduler.getJobs();
		JobDescription nextJob = jobs.get(0);
		jobsScheduler.unschedule(nextJob);
	    return nextJob;
	}
	
	
}
