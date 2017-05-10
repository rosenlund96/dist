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
    public void doWrite(){
        Map<String, String> data = new HashMap<String, String>();
        data.put("name", "Mathias");
        data.put("surName", "Larsen");
        DriverI driver = new FireBaseDriver();
        driver.setChannel("https://dist-server.firebaseio.com/Brugere");
        
        boolean responseCode = driver.write(data);
        
        assert responseCode;
    }

    @Test
    public void doRead() {
        DriverI driver = new FireBaseDriver();
        driver.setChannel("https://dist-server.firebaseio.com/");
        Reader reader = driver.read("Brugere/-KjcaaHJQM94BGwVuLIZ");
        try{
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(reader, User.class);
            System.out.println(user.getName());
        } catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("END");
    }

    @Test
    public void doDelete() {
    	DriverI driver = new FireBaseDriver();
    	driver.setChannel("https://dist-server.firebaseio.com/");
        boolean deleted = driver.delete("Brugere/-KjcaaHJQM94BGwVuLIZ");
        assert deleted;
    }

}