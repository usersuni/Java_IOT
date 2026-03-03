package aggregation;

public class patient {
	String pName;
	int pAge;
	String disease,dateOfArrival;
	information info;
	payment pay;
	public patient(String pName, int pAge, String disease, String dateOfArrival,information info,payment pay) {
		super();
		this.pName = pName;
		this.pAge = pAge;
		this.disease = disease;
		this.dateOfArrival = dateOfArrival;
	}
	void patientDatils() {
		System.out.println("Name : " + this.pName);
		System.out.println("Age : " + this.pAge);
		System.out.println("Disease : " + this.disease);
		System.out.println("Date of arrival : " + this.dateOfArrival);
		System.out.println("Block no : " + this.info.blockNo);
		System.out.println("Floor no : " + this.info.floorNo);
		System.out.println("Room no : " + this.info.roomNo);
		System.out.println("Bed no : " + this.info.bedNo);
		System.out.println("Admission fee : " + this.pay.admFees);
		System.out.println("Register fee : " + this.pay.regFees);
		System.out.println("Balance ammount : " + this.pay.balAmt);
	}
	public static void main(String[] args) {
		information i = new information('c',3,302,4);
		
	}
}
