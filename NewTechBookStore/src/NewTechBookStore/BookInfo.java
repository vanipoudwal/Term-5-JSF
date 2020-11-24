
package NewTechBookStore;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

@RequestScoped
@ManagedBean

public class BookInfo
{
	private String BookName;
	private HtmlOutputText BookID, BookCategory, BookAuthor, BookPrice;
		
	public BookInfo() {}
		
	public void BookInfoAction(ValueChangeEvent vce)
	{
		String oBookName = vce.getNewValue().toString();
		String oBookID = "", oBookCategory="", oBookAuthor="", oBookPrice = "";
			
		if(oBookName.compareTo("I Wish I Could Say !!")==0)
		{
			oBookID = "A-1477";
			oBookCategory="Novel";
			oBookAuthor="Durjoy Dutta";
			oBookPrice = "Rs. 1000";
		}
		else if(oBookName.compareTo("Three Men In A Boat !!")==0)
		{
			oBookID = "B-2588";
			oBookCategory="Novel";
			oBookAuthor="Jerome K. Jerome";
			oBookPrice = "Rs. 1100";
		}
		else if(oBookName.compareTo("Diary Of A Young Girl !!")==0)
		{
			oBookID = "C-3699";
			oBookCategory="Novel";
			oBookAuthor="Anne Frank";
			oBookPrice = "Rs. 1200";
		}
		else if(oBookName.compareTo("Chacha Choudhary !!")==0)
		{
			oBookID = "D-1233";
			oBookCategory="Novel";
			oBookAuthor="Pran Kumar Sharma";
			oBookPrice = "Rs. 1300";
		}
		else if(oBookName.compareTo("The Invisible Man !!")==0)
		{
			oBookID = "E-4566";
			oBookCategory="Novel";
			oBookAuthor="H. G. Wells";
			oBookPrice = "Rs. 1400";
		}
		else if(oBookName.compareTo("The Canterville Ghost !!")==0)
		{
			oBookID = "F-7899";
			oBookCategory="Novel";
			oBookAuthor="Oscar Wilde";
			oBookPrice = "Rs. 1500";
		}
		else if(oBookName.compareTo("The Story Of My Life !!")==0)
		{
			oBookID = "G-0159";
			oBookCategory="Novel";
			oBookAuthor="Helen Keller";
			oBookPrice = "Rs. 1600";
		}
		else if(oBookName.compareTo("The Fault In Our Stars !!")==0)
		{
			oBookID = "H-0357";
			oBookCategory="Novel";
			oBookAuthor="";
			oBookPrice = "Rs. 1700";
		}
		else if(oBookName.compareTo("The Hate You Give !!")==0)
		{
			oBookID = "I-2486";
			oBookCategory="Novel";
			oBookAuthor="Angie Thomas";
			oBookPrice = "Rs. 1800";
		}
		else if(oBookName.compareTo("The Book Thief !!")==0)
		{
			oBookID = "J-6842";
			oBookCategory="Novel";
			oBookAuthor="Markus Zusak";
			oBookPrice = "Rs. 1900";
		}
		BookID.setValue(oBookID);
		BookCategory.setValue(oBookCategory);
		BookAuthor.setValue(oBookAuthor);
		BookPrice.setValue(oBookPrice);
	}
		
	public String BookName()
	{
		return BookName;
	}
	public void setBookName(String BookName)
	{
		this.BookName = BookName;
	}
		
	public HtmlOutputText BookID()
	{
		return BookID;
	}
	public void setBookID(HtmlOutputText BookID)
	{
		this.BookID = BookID;
	}

	public HtmlOutputText BookCategory()
	{
		return BookCategory;
	}
	public void setBookCategory(HtmlOutputText BookCategory)
	{
		this.BookCategory = BookCategory;
	}
		
	public HtmlOutputText BookAuthor()
	{
		return BookAuthor;
	}
	public void setBookAuthor(HtmlOutputText BookAuthor)
	{
		this.BookAuthor = BookAuthor;
	}
		
	public HtmlOutputText BookPrice()
	{
		return BookPrice;
	}
	public void setBookPrice(HtmlOutputText BookPrice)
	{
		this.BookPrice = BookPrice;
	}
}
