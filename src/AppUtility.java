import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class AppUtility {
	public static long enterIntegerUserDetail(String message) {
		Scanner s = new Scanner(System.in);
		System.out.println(message);
		long enteredUserDataInteger = s.nextLong();
		return enteredUserDataInteger;
	}

	public static String enterStringUserDetail(String message) {
		Scanner s = new Scanner(System.in);
		System.out.println(message);
		String enteredUserDataString = s.nextLine();
		return enteredUserDataString;
	}

	public static String convertObjectToString(Object obj)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(obj);
		return json;
	}

}
