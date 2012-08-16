package com.starter4ten;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.rules.ExternalResource;

/**
 * Junit external resource for starting a jetty server with the kanban app running inside. 
 */
public class ServerResource extends ExternalResource{
	
	public static final int PORT = 8888;

	private Server server;
	
	@Override
	protected void before() throws Throwable {
		if(!runServer()) {
			return;
		}
		
		server = new Server(PORT);
		server.setHandler(new WebAppContext("src/main/webapp", "/"));
		server.start();
	}
	
	@Override
	protected void after() {
		if(!runServer()) {
			return;
		}
		
		try {
			server.stop();
		} catch (Exception e) {
			// NOOP during test tearDown
		}
	}
	
	public static boolean runServer() {
		return !System.getProperties().containsKey("NO_SERVER");
	}

    

}
