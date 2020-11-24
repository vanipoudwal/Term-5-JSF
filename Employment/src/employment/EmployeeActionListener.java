
package employment;

import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.faces.bean.ManagedBean;

@RequestScoped
@ManagedBean

public class EmployeeActionListener implements ActionListener
{
	public EmployeeActionListener() {}
	
		public void processAction(ActionEvent arg0) throws AbortProcessingException
		{
			Employee Employee = (Employee) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("Employee");
			StringBuilder Name = new StringBuilder();
			StringBuilder Address = new StringBuilder();
			StringBuilder Deptt = new StringBuilder();
			findEmployeeDetails(Employee.getEmpID(), Name, Address, Deptt);
			Employee.setName(Name.toString());
			Employee.setAddress(Address.toString());
			Employee.setDeptt(Deptt.toString());
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

		@Override
		public void actionPerformed(ActionEvent e) {}	
}
