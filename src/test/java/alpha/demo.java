package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class demo {
		
private static Logger	log=(Logger) LogManager.getLogger(demo.class.getName());
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		log.debug("I AM Debugging");
		if(5>4) {
			log.info("Debugging successful");
		}
		log.fatal("Debugging unsuccessful");
		
	}

}
