
package Grant_University;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

@ManagedBean
@RequestScoped

public class RegistrationForm
{
	private String FirstName;
	private String LastName;
	private String Gender;
	private String Address;
	private String ContactNo;
	private String EmailId;
	private String UserId;
	private String DateOfBirth;
	private String Password;
	private String ConfirmPassword;
	
	public RegistrationForm() {}
	
		public String getFirstName()
		{
			return FirstName;
		}
		public void setFirstName(String FirstName)
		{
			this.FirstName = FirstName;
		}
		
		public String getLastName()
		{
			return LastName;
		}
		public void setLastName(String LastName)
		{
			this.LastName = LastName;
		}
		
		public String getGender()
		{
			return Gender;
		}
		public void setGender(String Gender)
		{
			this.Gender = Gender;
		}
		
		public String getAddress()
		{
			return Address;
		}
		public void setAddress(String Address)
		{
			this.Address = Address;
		}
		
		public String getContactNo()
		{
			return ContactNo;
		}
		public void setContactNo(String ContactNo)
		{
			this.ContactNo = ContactNo;
		}
		
		public String getEmailId()
		{
			return EmailId;
		}
		public void setEmailId(String EmailId)
		{
			this.EmailId = EmailId;
		}
		
		public String getUserId()
		{
			return UserId;
		}
		public void setUserId(String UserId)
		{
			this.UserId = UserId;
		}
		
		public String getDateOfBirth()
		{
			return DateOfBirth;
		}
		public void setDateOfBirth(String DateOfBirth)
		{
			this.DateOfBirth = DateOfBirth;
		}
		
		public String getPassword()
		{
			return Password;
		}
		public void setPassword(String Password)
		{
			this.Password = Password;
		}
		
		public String getConfirmPassword()
		{
			return ConfirmPassword;
		}
		public void setConfirmPassword(String ConfirmPassword)
		{
			this.ConfirmPassword = ConfirmPassword;
		}

			public void validateEmail(FacesContext fc, UIComponent c, Object value) throws ValidatorException
			{
				String email = (String)value;
				Pattern mask = null;
				mask = Pattern.compile(".+.@+\\.[a-z]+");
				Matcher matcher = mask.matcher(email);
				
				if(!matcher.matches())
				{
					FacesMessage message = new FacesMessage();
					message.setDetail("Invalid e-mail ID");
					message.setSummary("Invalid e-mail ID");
					throw new ValidatorException(message);
				}
			}
			public void validateName(FacesContext fc, UIComponent c, Object value)
			{
				if( ((String)value).contains("!") || ((String)value).contains("@") || ((String)value).contains("#") ||
					((String)value).contains("$") || ((String)value).contains("%") || ((String)value).contains("&") ||
					((String)value).contains("*") )	throw new ValidatorException (new FacesMessage("Name cannot contain special characters"));
			}
			public void validatePassword(FacesContext fc, UIComponent c, Object value) throws ValidatorException
			{
				setPassword((String) value);
			}
			public void validateCPassword(FacesContext fc, UIComponent c, Object value) throws ValidatorException
			{
				String ConfirmPassword = (String) value;
				RegistrationForm RegistrationForm = new RegistrationForm();
				System.out.println(getPassword());
				
				if(ConfirmPassword.compareTo(getPassword())!=0)
				{
					FacesMessage message = new FacesMessage();
					message.setSummary("Password does not match");
					throw new ValidatorException(message);
				}
			}
}
