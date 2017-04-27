package Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import Entities.BELBIN;
import Entities.DISC;
import Entities.THREESIXTY;
import Entities.User;
import resources.ItemDefinition;



public class BenytSoftskillsModServer {
	 public static boolean trustedUser = false;
	 public static boolean choice = false;
	    
		public static void main(String[] args) throws MalformedURLException, Exception {
	        URL url = new URL("http://ubuntu4.javabog.dk:9959/softskills?wsdl");
	        //URL url = new URL("http://localhost:9959/galgeservice?wsdl");
	        QName qname = new QName("http://Service/", "ServermanagerService");
	        Service service = Service.create(url, qname);
	        ServerI I = service.getPort(ServerI.class);
	        String brugernavn;
	        String adgangskode;
	        User currentUser = null;
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        while(trustedUser == false) {       
	        	System.out.println(I.CheckConnection());
	            System.out.print("Indtast dit brugernavn: ");        
	            brugernavn = scanner.next();
	            System.out.print("Indtast din adgangskode: ");
	            adgangskode = scanner.next();
	            System.out.println("Forsøger login");
	            boolean login = I.login(brugernavn, adgangskode);

	            if (login == true) {
	                trustedUser = true;
	                currentUser = new User(brugernavn, "Ikke defineret","Ikke defineret","Ikke defineret");
	                
	            }
	            else {
	                trustedUser = false;
	                System.out.print("Forkert brugernavn og/eller adgangskode \n");
	            }
	        }
	        System.out.println("Login successfuldt");
	        //clearScreen();
	        while(trustedUser == true){
	        	loop: for (;;) {
	        	System.out.println("--------------------------------");
	        	System.out.println("Velkommen til Softskills Toolbox");
	        	System.out.println("Vælg et menupunkt:");
	        	System.out.println("1. Se dine profiler");
	        	System.out.println("2. Butik");
	        	System.out.println("3. Mine resultater");
	        	System.out.println("4. Indstillinger");
	        	System.out.println("5. Log ud");
	        	System.out.println("--------------------------------");	
	        	int menupunkt = scanner.nextInt();
	        	switch(menupunkt){
	        	case 1: 
	        		currentUser.getSafeSize();
	        		break loop;
	        	case 2: 
	        		System.out.println("Vælg den profil du ønsker at købe: ");
	        		System.out.println("1. DISC Profil ");
	        		System.out.println("2. Belbin Profil ");
	        		System.out.println("3. 360-graders profil ");
	        		if(scanner.nextInt() == 1){
	        			currentUser.addToSafe(new DISC(ItemDefinition.TESTPrice_DATA[0],false,ItemDefinition.TESTName_DATA[0],ItemDefinition.TESTDescription_DATA[0], ItemDefinition.testType[0]), 1);
	        			System.out.println("Profilen er købt");
	        			break loop;
	        		}
	        		if(scanner.nextInt() == 2){
	        			currentUser.addToSafe(new BELBIN(ItemDefinition.TESTPrice_DATA[1],false,ItemDefinition.TESTName_DATA[1],ItemDefinition.TESTDescription_DATA[1], ItemDefinition.testType[1]),1);
	        			System.out.println("Profilen er købt");
	        			break loop;
	        		}
	        		if(scanner.nextInt() == 3){
	        			currentUser.addToSafe(new THREESIXTY(ItemDefinition.TESTPrice_DATA[2],false,ItemDefinition.TESTName_DATA[2],ItemDefinition.TESTDescription_DATA[2], ItemDefinition.testType[2]),1);
	        			System.out.println("Profilen er købt");
	        			break loop;
	        		}
	        		
	        		
	        	case 3:
	        		System.out.println("Ikke understøttet i konsolprogram");
	        		break loop;
	        	case 4:
	        		System.out.println("Ikke understøttet i konsolprogram");
	        		break loop;
	        	case 5: 
	        		System.out.println("Du er nu logget ud!");
	        		trustedUser = false;
	        		break loop;
	        	}	
	        }
	        }
	        

}
		 public static void clearScreen() {  
	            System.out.print("\033[H\033[2J");  
	            System.out.flush();  
	           }
}
