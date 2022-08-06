package abhi.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int cId;
	private String cName;
	private String cEid;
	
	
	public Customer() {
		super();
	}
	public Customer(int cId, String cName, String cEid) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEid = cEid;
	}
	
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEid() {
		return cEid;
	}
	public void setcEid(String cEid) {
		this.cEid = cEid;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cEid=" + cEid + "]";
	}
	
	
	
}
