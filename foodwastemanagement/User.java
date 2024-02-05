package foodwastemanagement;

//class User
class User{
	String name,city,email;
	long phone_no;
	String dob;
	public User(String name, String city, String email, long phone_no, String dob) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
//		this.dob = dob;
		this.phone_no = phone_no;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", city=" + city + ", email=" + email + ", phone_no=" + phone_no + ", dob=" + dob
				+ "]";
	}
	
}