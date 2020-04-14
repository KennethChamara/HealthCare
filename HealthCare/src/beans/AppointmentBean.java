package beans;

public class AppointmentBean {
	private int AppointmentID ;
	private int d_ID  ;
	private int SheduleID;
	private int HospitalID;
	private String CheckedStatus;  
	private int TokenNumber ;	
	private String AnotherPatientStatus ;
	private String AnotherPatientNIC  ;
	private String AnotherPatientName  ;
	private String AnotherPatientEmail ; 
	private String AnotherPatientContactNumber ;
	private String BookedDate;
	private String AddedDate;
	private String PaymentType;
	
	
	public String getBookedDate() {
		return BookedDate;
	}
	public void setBookedDate(String bookedDate) {
		BookedDate = bookedDate;
	}
	public String getAddedDate() {
		return AddedDate;
	}
	public void setAddedDate(String addedDate) {
		AddedDate = addedDate;
	}
	public int getAppointmentID() {
		return AppointmentID;
	}
	public void setAppointmentID(int appointmentID) {
		AppointmentID = appointmentID;
	}
	public int getD_ID() {
		return d_ID;
	}
	public void setD_ID(int d_ID) {
		this.d_ID = d_ID;
	}
	public int getSheduleID() {
		return SheduleID;
	}
	public void setSheduleID(int sheduleID) {
		SheduleID = sheduleID;
	}
	public int getHospitalID() {
		return HospitalID;
	}
	public void setHospitalID(int hospitalID) {
		HospitalID = hospitalID;
	}
	public String getCheckedStatus() {
		return CheckedStatus;
	}
	public void setCheckedStatus(String checkedStatus) {
		CheckedStatus = checkedStatus;
	}
	public int getTokenNumber() {
		return TokenNumber;
	}
	public void setTokenNumber(int tokenNumber) {
		TokenNumber = tokenNumber;
	}
	
	public String getAnotherPatientStatus() {
		return AnotherPatientStatus;
	}
	public void setAnotherPatientStatus(String anotherPatientStatus) {
		AnotherPatientStatus = anotherPatientStatus;
	}
	public String getAnotherPatientNIC() {
		return AnotherPatientNIC;
	}
	public void setAnotherPatientNIC(String anotherPatientNIC) {
		AnotherPatientNIC = anotherPatientNIC;
	}
	public String getAnotherPatientName() {
		return AnotherPatientName;
	}
	public void setAnotherPatientName(String anotherPatientName) {
		AnotherPatientName = anotherPatientName;
	}
	public String getAnotherPatientEmail() {
		return AnotherPatientEmail;
	}
	public void setAnotherPatientEmail(String anotherPatientEmail) {
		AnotherPatientEmail = anotherPatientEmail;
	}
	public String getAnotherPatientContactNumber() {
		return AnotherPatientContactNumber;
	}
	public void setAnotherPatientContactNumber(String anotherPatientContactNumber) {
		AnotherPatientContactNumber = anotherPatientContactNumber;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	} 

	




}
