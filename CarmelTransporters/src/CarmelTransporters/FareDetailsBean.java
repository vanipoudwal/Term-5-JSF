
package CarmelTransporters;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

@RequestScoped
@ManagedBean

public class FareDetailsBean
{
	private String CityName;
	private HtmlOutputText TransportationCost, ServiceCharge, InsuranceCharge;
	
	public FareDetailsBean() {}
	
	public void FareDetailsAction(ValueChangeEvent vce)
	{
		String CityName = vce.getNewValue().toString();
		String TransportationCost = "", ServiceCharge = "", InsuranceCharge = "";
	
		if(CityName.compareTo("Science")==0)
		{
			TransportationCost = "Rs. 10000";
			ServiceCharge = "Rs. 100";
			InsuranceCharge = "Rs. 1000";
		}
		else if(CityName.compareTo("Science")==0)
		{
			TransportationCost = "Rs. 20000";
			ServiceCharge = "Rs. 200";
			InsuranceCharge = "Rs. 2000";
		}
		else if(CityName.compareTo("Science")==0)
		{
			TransportationCost = "Rs. 30000";
			ServiceCharge = "Rs. 300";
			InsuranceCharge = "Rs. 3000";
		}
		else if(CityName.compareTo("Science")==0)
		{
			TransportationCost = "Rs. 40000";
			ServiceCharge = "Rs. 400";
			InsuranceCharge = "Rs. 4000";
		}
		else if(CityName.compareTo("Science")==0)
		{
			TransportationCost = "Rs. 50000";
			ServiceCharge = "Rs. 500";
			InsuranceCharge = "Rs. 5000";
		}
		else if(CityName.compareTo("Science")==0)
		{
			TransportationCost = "Rs. 60000";
			ServiceCharge = "Rs. 600";
			InsuranceCharge = "Rs. 6000";
		}
		else if(CityName.compareTo("Science")==0)
		{
			TransportationCost = "Rs. 70000";
			ServiceCharge = "Rs. 700";
			InsuranceCharge = "Rs. 7000";
		}
		else if(CityName.compareTo("Science")==0)
		{
			TransportationCost = "Rs. 80000";
			ServiceCharge = "Rs. 800";
			InsuranceCharge = "Rs. 8000";
		}
		TransportationCost().setValue(TransportationCost);
		ServiceCharge().setValue(ServiceCharge);
		InsuranceCharge().setValue(InsuranceCharge);
	}

	public String CityName()
	{
		return CityName;
	}
	public void setCityName(String CityName)
	{
		this.CityName = CityName;
	}
	
	public HtmlOutputText TransportationCost()
	{
		return TransportationCost;
	}
	public void setTransportationCost(HtmlOutputText TransportationCost)
	{
		this.TransportationCost = TransportationCost;
	}
	
	public HtmlOutputText ServiceCharge()
	{
		return ServiceCharge;
	}
	public void setServiceCharge(HtmlOutputText ServiceCharge)
	{
		this.ServiceCharge = ServiceCharge;
	}
	
	public HtmlOutputText InsuranceCharge()
	{
		return InsuranceCharge;
	}
	public void setInsuranceCharge(HtmlOutputText InsuranceCharge)
	{
		this.InsuranceCharge = InsuranceCharge;
	}
}
