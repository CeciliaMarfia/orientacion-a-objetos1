package ar.edu.unlp.info.oo1.ejercicio12_jobScheduler;

public class HighestPriority implements Strategy{
	
	public JobDescription next(JobScheduler jobsScheduler) {
		
		JobDescription nextJob = jobsScheduler.getJobs().stream()
	            .max((job1,job2) -> Double.compare(job1.getPriority(), job2.getPriority()))
	            .orElse(null);
		jobsScheduler.unschedule(nextJob);
	        return nextJob;
	}
}
