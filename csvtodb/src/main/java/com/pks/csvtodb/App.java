package com.pks.csvtodb;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/batch/config/context.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("studentJob");
		
		try{
			JobExecution execution=launcher.run(job, new JobParameters());
			System.out.println("Execution status: "+execution.getStatus());
		}catch(Exception e){
			
		}
	}

}
