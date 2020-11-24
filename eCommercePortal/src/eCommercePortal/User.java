
package eCommercePortal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class User
{
	private String Username;
	private String Password;
	private String Feedback;
	
	public User() {}
	
	public String getUsername()
	{
		return Username;
	}
	public void setUsername(String Username)
	{
		this.Username = Username;
	}
	
	public String getPassword()
	{
		return Password;
	}
	public void setPassword(String Password)
	{
		this.Password = Password;
	}
	
	public String getFeedback()
	{
		return Feedback;
	}
	public void setFeedback(String Feedback)
	{
		this.Feedback = Feedback;
	}
	
	public String loginAction()
	{
		return "welcome";
	}
	public String submitAction()
	{
		return "submitted";
	}

}
