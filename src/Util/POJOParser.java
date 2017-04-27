package Util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

import Entities.User;

public class POJOParser {
	
	public boolean ObjectToJson(User user){
		Gson gson = new Gson();
		String json = gson.toJson(user);
	    System.out.println(json);
	    try (FileWriter writer = new FileWriter("D:\\"+user.getName()+".json")) {

            gson.toJson(user, writer);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
		
		
	}
	
	
	public boolean JsonToObject(String username){
		 Gson gson = new Gson();

	        try (Reader reader = new FileReader("D:\\"+username+".json")) {

				// Convert JSON to Java Object
	            User user = gson.fromJson(reader, User.class);
	            System.out.println(user);

				// Convert JSON to JsonElement, and later to String
	            /*JsonElement json = gson.fromJson(reader, JsonElement.class);
	            String jsonInString = gson.toJson(json);
	            System.out.println(jsonInString);*/
	            return true;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return false;
	        }

	}

}
