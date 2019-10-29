package org.robertux.test.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SchedulerWebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerWebDemoApplication.class, args);
	}

}
