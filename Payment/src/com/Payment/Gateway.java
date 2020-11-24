
package com.Payment;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class Gateway
{
	private long Mobile_No;
	private int Amount;
	private boolean DebitCard = false;
	private boolean CreditCard = false;
	private boolean Wallet = false;
	private boolean UPI = false;

	public Gateway() {}
	
	public long getMobile_No()
	{
		return Mobile_No;
	}
	public void setMobile_No(long Mobile_No)
	{
		this.Mobile_No = Mobile_No;
	}
	
	public int getAmount()
	{
		return Amount;
	}
	public void setAmount(int Amount)
	{
		this.Amount = Amount;
	}
	
	public boolean getDebitCard()
	{
		return DebitCard;
	}
	public void setDebitCard(boolean DebitCard)
	{
		this.DebitCard = DebitCard;
	}
	public boolean getCreditCard()
	{
		return CreditCard;
	}
	public void setCreditCard(boolean CreditCard)
	{
		this.CreditCard = CreditCard;
	}
	public boolean getWallet()
	{
		return Wallet;
	}
	public void setWallet(boolean Wallet)
	{
		this.Wallet = Wallet;
	}
	public boolean getUPI()
	{
		return UPI;
	}
	public void setUPI(boolean UPI)
	{
		this.UPI = UPI;
	}

/*	public boolean Mode_Of_Payment()
	{
		if(DebitCard.equals("DebitCard"))
		{
			return DebitCard;
		}
		else if(CreditCard.equals("CreditCard"))
		{
			return CreditCard;
		}
		else if(Wallet.equals("Wallet"))
		{
			return Wallet;
		}
		else(UPI.equals("UPI"))
		{
			return UPI;
		}
	}*/
}
