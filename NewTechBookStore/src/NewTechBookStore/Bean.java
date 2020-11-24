
package NewTechBookStore;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class Bean
{
	private String id;
	private String pass;
	
	public Bean() {}
	
	public String Action()
	{
		if(id.equals("student") && pass.equals("haider@123"))
		{
			return "student";
		}
		else
		{
			return "error";
		}
	}
	
	public String getid()
	{
		return id;
	}
	public void setid(String id)
	{
		this.id = id;
	}
	
	public String getpass()
	{
		return pass;
	}
	public void setpass(String pass)
	{
		this.pass = pass;
	}
}
