package ar.edu.unlp.info.oo1.ejercicio12_jobScheduler;

public class MostEffort implements Strategy{

	@Override
	public JobDescription next(JobScheduler jobsScheduler) {
		
		JobDescription nextJob = jobsScheduler.getJobs().stream()
                .max((job1,job2) -> Double.compare(job1.getEffort(), job2.getEffort()))
                .orElse(null);
		jobsScheduler.unschedule(nextJob);
            return nextJob;
	}

	
}
