package brugerautorisation.transport.rmi;

import brugerautorisation.Diverse;
import brugerautorisation.data.Bruger;
import java.rmi.Naming;

public class Brugeradminklient {
	public static void main(String[] arg) throws Exception {
//		Brugeradmin ba =(Brugeradmin) Naming.lookup("rmi://localhost/brugeradmin");
		Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
                 
//                ba.ændrAdgangskode("s144868", "12345", "xxx");
    //ba.sendGlemtAdgangskodeEmail("jacno", "Dette er en test, husk at skifte kode");
		//ba.ændrAdgangskode("jacno", "kodenj4gvs", "xxx");
		Bruger b = ba.hentBruger("s144868", "xxx");
                
//                ba.sendGlemtAdgangskodeEmail("s144868", "Mit kodeord tak");
           //     ba.ændrAdgangskode("s144868", "12345", "54321");
//                System.out.println(b.adgangskode);
//		System.out.println("Fik bruger = " + b);
//		System.out.println("Data: " + Diverse.toString(b));
		// ba.sendEmail("jacno", "xxx", "Hurra det virker!", "Jeg er så glad");

                System.out.println(b.adgangskode);
                System.out.println(b.campusnetId);
                System.out.println(b.brugernavn);
                System.out.println(b.email);
                
		Object ekstraFelt = ba.getEkstraFelt("jacno", "xxx", "s123456_testfelt");
		System.out.println("Fik ekstraFelt = " + ekstraFelt);

		ba.setEkstraFelt("jacno", "xxx", "s123456_testfelt", "Hej fra Jacob"); // Skriv noget andet her
	}
}
