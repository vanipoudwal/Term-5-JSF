
package Grant_University;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

@RequestScoped
@ManagedBean

public class CourseDetailsBean
{
		private String CourseName;
		private HtmlOutputText CourseId, CourseDuration, CourseEligibility, CourseFee;
		
		public CourseDetailsBean() {}
		
		public void CourseDetailsAction(ValueChangeEvent vce)
		{
			String cName = vce.getNewValue().toString();
			String cId = "", cDuration = "", cEligibility = "", cFee = "";
			
			if(cName.compareTo("Science")==0)
			{
				cId = "A-101";
				cDuration = "4 Years";
				cEligibility = "70% in High School";
				cFee = "$5000 p.a.";
			}
			else if(cName.compareTo("Law")==0)
			{
				cId = "A-105";
				cDuration = "5 Years";
				cEligibility = "60% in High School";
				cFee = "$3000 p.a.";
			}
			else if(cName.compareTo("Medical")==0)
			{
				cId = "A-110";
				cDuration = "6 Years";
				cEligibility = "70% in High School";
				cFee = "$7000 p.a.";
			}
			else if(cName.compareTo("Management")==0)
			{
				cId = "A-115";
				cDuration = "2 Years";
				cEligibility = "50% in High School";
				cFee = "$5000 p.a.";
			}
			CourseId().setValue(cId);
			CourseDuration().setValue(cDuration);
			CourseEligibility().setValue(cEligibility);
			CourseFee().setValue(cFee);
		}
		
		public String CourseName()
		{
			return CourseName;
		}
		public void setCourseName(String CourseName)
		{
			this.CourseName = CourseName;
		}
		
		public HtmlOutputText CourseId()
		{
			return CourseId;
		}
		public void setCourseId(HtmlOutputText CourseId)
		{
			this.CourseId = CourseId;
		}
		
		public HtmlOutputText CourseDuration()
		{
			return CourseDuration;
		}
		public void setCourseDuration(HtmlOutputText CourseDuration)
		{
			this.CourseDuration = CourseDuration;
		}
		
		public HtmlOutputText CourseEligibility()
		{
			return CourseEligibility;
		}
		public void setCourseName(HtmlOutputText CourseEligibility)
		{
			this.CourseEligibility = CourseEligibility;
		}
		
		public HtmlOutputText CourseFee()
		{
			return CourseFee;
		}
		public void setCourseFee(HtmlOutputText CourseFee)
		{
			this.CourseFee = CourseFee;
		}
}
