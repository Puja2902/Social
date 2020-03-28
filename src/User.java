import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class User {
	public String name;
	public long mobileNo;
	public String emailId;
	public String password;
	
	

	public User(String name, long mobileNo, String emailId, String password) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.password = password;
	}

	public void signUp() {
		this.emailId = AppUtility.enterStringUserDetail("Enter your email_id : ");
		this.name = AppUtility.enterStringUserDetail("Enter your name : ");
		this.mobileNo = AppUtility.enterIntegerUserDetail("Enter your mobile number : ");
		this.password = AppUtility.enterStringUserDetail("Enter your password : ");
	}

	public void displayUserDetail() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println(AppUtility.convertObjectToString(this));
	}

	public boolean login() {
		String enteredEmail = AppUtility.enterStringUserDetail("Enter your email_id : ");
		String enteredPassword = AppUtility.enterStringUserDetail("Enter your password : ");
		System.out.println(enteredEmail);
		System.out.println(password);
		System.out.println(enteredEmail.equalsIgnoreCase(emailId));
		if (enteredEmail.equalsIgnoreCase(emailId) && enteredPassword.equalsIgnoreCase(password)) {
			return true;
		}
		return false;

	}

}

