package cc.bean.deom;

public class Customers {

	private String name;
	private String age;
	private String address;
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Customers() {
		System.out.println("Coutomer's coutomer..");
		//System.out.println(getAge());
	}
	public Customers(String name, String age, String address, String mobile) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobile = mobile;
	}
	
	
}
