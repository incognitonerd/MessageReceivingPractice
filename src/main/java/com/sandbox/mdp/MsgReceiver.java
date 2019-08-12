package com.sandbox.mdp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MsgReceiver {
	private static final Logger LOGGER = LoggerFactory.getLogger(MsgReceiver.class);
	private static final String PRACTICE_QUEUE = "practiceQueue";
	
	@JmsListener(destination = PRACTICE_QUEUE)
	public void processMsg(String msg){
		LOGGER.info("Aruba message : " + msg);
	}
}