package org.robertux.test.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private DateFormat dFmt = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	@Scheduled(fixedRate = 3000)
	public void tick() {
		this.logger.info("Right now is {}", dFmt.format(new Date()));
	}
}
