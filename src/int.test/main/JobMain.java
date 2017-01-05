package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobMain {

	protected static final Logger logger = LoggerFactory.getLogger(JobMain.class);

	public static void main(String[] args) throws Exception {
		Server server = new Server(8081);

		WebAppContext context = new WebAppContext();
		// context.setContextPath("/myapp");
		// context.setWar("F:\\code\\git\\bdp-webide\\dist\\bdp-webide.war");
		context.setDescriptor("src/main/webapp/WEB-INF/web.xml");
		context.setResourceBase("src/main/webapp");
		server.setHandler(context);
		server.start();
		server.join();
	}
}
