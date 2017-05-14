package Test;

import org.restonfire.BaseFirebaseRestDatabaseFactory;
import org.restonfire.FirebaseRestDatabase;
import org.restonfire.FirebaseRestReference;

import com.google.gson.GsonBuilder;
import com.ning.http.client.AsyncHttpClient;

public class RestFire {

	
	BaseFirebaseRestDatabaseFactory factory = new BaseFirebaseRestDatabaseFactory(
			  new AsyncHttpClient(),
			  new GsonBuilder().create()
			);
	FirebaseRestDatabase database = factory.create(
			  "http://database123.firebaseio.com",
			  null // accessToken
			);
	FirebaseRestReference ref = database.getReference("some/location");
	
}
