package beans;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class PaymentAppointmentBean {	
	private int AppointmentID ;
	private String appointPaydetails;
	private String Paymethod;
	private double Amount;
	
	public PaymentAppointmentBean(String appointPaydetails) {
		this.appointPaydetails =  appointPaydetails;
	}

	public void ConvertStringToJSON() {
		JsonObject  AppointmentObject = new JsonParser().parse(appointPaydetails).getAsJsonObject(); 
		
		//get values into variables in PaymentAppointmentBean 
		setAppointmentID(AppointmentObject.get("AppointmentID").getAsInt());
		setPaymethod(AppointmentObject.get("PaymentType").getAsString());
		setAmount(AppointmentObject.get("Amount").getAsDouble());
	}
	
	public void ConvertStringToJSONdelete() {
		JsonObject  AppointmentObject = new JsonParser().parse(appointPaydetails).getAsJsonObject(); 		
		//get values into variables in PaymentAppointmentBean 
		setAppointmentID(AppointmentObject.get("AppointmentID").getAsInt());		
	}
	
	public int getAppointmentID() {
		return AppointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		AppointmentID = appointmentID;
	}

	public String getPaymethod() {
		return Paymethod;
	}

	public void setPaymethod(String paymethod) {
		Paymethod = paymethod;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}	
	
	
}
