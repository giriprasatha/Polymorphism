package org.base;

public class Client  {
	
	//arguments depends on the datatype count
	
	private void empInfo(String name) {
		System.out.println("employee name is :"+name);
	
		
}
	private void empInfo(String email,int empId) {
		System.out.println("employee e mail is"+email+"\n"+empId);
		
		
}
//Arguments depends on the datatype
	
	private void empInfo(float salary) {
		System.out.println("employee salary is "+salary);
	System.out.println("Emplyee Salary");
	

	}
	private void empInfo(long mobile) {
		System.out.println("emp mobile no is"+mobile);

	}
	//arguments depends on the datatype order
	private void emppInfo(char grade,int lanline) {
	System.out.println(grade+"\t"+lanline);
	
	

	}
	private void empInfo(int lanline,char bloack) {
		System.out.println(lanline+"\t"+bloack);

	}
	public static void main(String[] args) {
	Client  e =new Client();
	
	e.empInfo(21311.65f);
	e.empInfo("ncer");
	e.empInfo("giri1234@gmail.com", 45367865);
	e.empInfo(042526756544);
	e.emppInfo('A',04253456234);
	e.empInfo(4456654, 'D');
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


