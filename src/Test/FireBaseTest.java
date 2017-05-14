package Test;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Entities.User;
import Util.DriverI;
import Util.FireBaseDriver;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;


public class FireBaseTest {
	
   

    @Test
    public void doRead() {
        DriverI driver = new FireBaseDriver();
        driver.setChannel("https://softskill-tools.firebaseio.com/");
        Reader reader = driver.read("Brugere/jacno");
        try{
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(reader, User.class);
            System.out.println(user.getName());
        } catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("END");
    }

   

}