package backingBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import managedBeans.LoginManagedBean;
import managedBeans.TestManagedBean;

@ManagedBean
@SessionScoped
public class LoginBackingBean {
	
	@ManagedProperty(value = "#{loginManagedBean}")
	private LoginManagedBean loginBean;
	
	@ManagedProperty(value = "#{testManagedBean}")
	private TestManagedBean testBean;
	
	public LoginManagedBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginManagedBean loginBean) {
		this.loginBean = loginBean;
	}

	public TestManagedBean getTestBean() {
		return testBean;
	}

	public void setTestBean(TestManagedBean testBean) {
		this.testBean = testBean;
	}

	public void loginAction(ActionEvent actionEvent) {
		System.out.println("User: " + loginBean.getUsername() + " Pass: " + loginBean.getPassword());
		testBean.setUsername(loginBean.getUsername());
		testBean.setPassword(loginBean.getPassword());
	}
}
