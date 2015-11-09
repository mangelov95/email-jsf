package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginManagedBean {
	private String username = "test";
	private String password = "testPass";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		//System.out.println("User is " + username);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
