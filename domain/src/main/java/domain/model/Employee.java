package domain.model;

public class Employee {
	private int empNo;
	private String empName;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Employee(int empNo, String empName){
		setEmpNo(empNo);
		setEmpName(empName);
	}
	
	public Employee(int empNo){
		setEmpNo(empNo);
	}
	
	public Employee(String empName){
		setEmpName(empName);
	}
	
	public void getEmployeeDetail(String empName){
		
	}
}
