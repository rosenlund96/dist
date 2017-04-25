package Service;

import javax.xml.ws.Endpoint;

public class BroadcastServer {

	
	public static void main(String[] args) {
	    
	    
	    System.out.println("Publicerer server over SOAP");
	    Servermanager manager = new Servermanager();
	   // Endpoint.publish("http://[::]:9959/brugeradmin", manager);
	   Endpoint.publish("http://[::]:9959/softskills", manager);
	    System.out.println("Server publiceret over SOAP");
	    
	    }
	
}
