
package employment;

import javax.faces.bean.RequestScoped;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.ValueChangeEvent;
import javax.faces.bean.ManagedBean;

@RequestScoped
@ManagedBean

public class Employee
{
	private String EmpID, Name, Address, Deptt;
	
	public String getEmpID()
	{
		return EmpID;
	}
	public void setEmpID(String EmpID)
	{
		this.EmpID = EmpID;
	}
	
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public String getAddress()
	{
		return Address;
	}
	public void setAddress(String Address)
	{
		this.Address = Address;
	}
	
	public String getDeptt()
	{
		return Deptt;
	}
	public void setDeptt(String Deptt)
	{
		this.Deptt = Deptt;
	}
	public Employee() {}
	
	public void AutoFill(ValueChangeEvent vce)
	{
		ValueChangeEvent event = null;
		EmpID = event.getNewValue().toString();
		StringBuilder Name = new StringBuilder();
		StringBuilder Address = new StringBuilder();
		StringBuilder Deptt = new StringBuilder();
		
		findEmployeeDetails(EmpID, Name, Address, Deptt);
		setName(Name.toString());
		setAddress(Address.toString());
		setDeptt(Deptt.toString());
	}
	
	private void findEmployeeDetails(String EmpID, StringBuilder Name, StringBuilder Address, StringBuilder Deptt)
	{
		if(EmpID.compareTo("EMP001")==0)
		{
			Name.append("Vani");
			Address.append("Panchsheel Park");
			Deptt.append("Management");
		}
		else if(EmpID.compareTo("EMP002")==0)
		{
			Name.append("Barfi");
			Address.append("Moti Bagh");
			Deptt.append("Medical");
		}
		else if(EmpID.compareTo("EMP003")==0)
		{
			Name.append("Haider");
			Address.append("Friends Colony");
			Deptt.append("Commerce");
		}
		else if(EmpID.compareTo("EMP004")==0)
		{
			Name.append("Kittu");
			Address.append("Punjabi Bagh");
			Deptt.append("Engg");
		}
		else if(EmpID.compareTo("EMP005")==0)
		{
			Name.append("Guddu");
			Address.append("Greater Kailash");
			Deptt.append("IT");
		}
	}
	
/*	public void AutoFill()
	{
		StringBuilder Name = new StringBuilder();
		StringBuilder Address = new StringBuilder();
		StringBuilder Deptt = new StringBuilder();
		findEmployeeDetails(EmpID, Name, Address, Deptt);
		setName(Name.toString());
		setAddress(Address.toString());
		setDeptt(Deptt.toString());
	}*/
	
	//@Override
	public void afterPhase(PhaseEvent event)
	{
		System.out.println("After : "+event.getPhaseId().toString());
	}
	
	//@Override
	public void beforePhase(PhaseEvent event)
	{
		System.out.println("Before : "+event.getPhaseId().toString());
	}
	
	//@Override
	public PhaseId getPhaseId()
	{
		return PhaseId.ANY_PHASE;
	}
}
