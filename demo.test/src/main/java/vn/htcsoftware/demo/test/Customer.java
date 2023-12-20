package vn.htcsoftware.demo.test;

public class Customer {
	private String name;
	private int age;
	private String address;
	private String email;
	private String phoneNumber;
	private String profession;

	public Customer() {
		super();
	}

	public Customer(String name, int age, String address, String email, String phoneNumber, String profession) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.profession = profession;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
