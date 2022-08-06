package abhi.java8.stream;

public class Employee {

	private int eId;
	private String eName;
	private String eGrade;
	private int eSal;

	public Employee() {
		super();
	}

	public Employee(int eId, String eName, String eGrade, int eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eGrade = eGrade;
		this.eSal = eSal;
	}

	public String geteGrade() {
		return eGrade;
	}

	public void seteGrade(String eGrade) {
		this.eGrade = eGrade;
	}

	public int geteSal() {
		return eSal;
	}

	public void seteSal(int eSal) {
		this.eSal = eSal;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}



	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eGrade=" + eGrade + ", eSal=" + eSal + "]";
	}

}
