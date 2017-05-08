package Test;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import Entities.User;
import Util.DriverI;
import Util.FireBaseDriver;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: reiz
 * Date: 4/21/12
 * Time: 12:37 PM
 */
public class FireBaseTest {

    @Test
    public void doWrite(){
        Map<String, String> data = new HashMap<String, String>();
        data.put("name", "rob");
        data.put("user", "robi");
        DriverI driver = new FireBaseDriver();
        driver.setChannel("https://dist-server.firebaseio.com/"+"email");
        boolean responseCode = driver.write(data);
        assert responseCode;
    }

    @Test
    public void doRead() {
        DriverI driver = new FireBaseDriver();
        Reader reader = driver.read("-IQLhiRv3cUHmZP9KR29");
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
        boolean deleted = driver.delete("-IQLhiRv3cUHmZP9KR29");
        assert deleted;
    }

}