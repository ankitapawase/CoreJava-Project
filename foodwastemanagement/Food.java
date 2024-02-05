package foodwastemanagement;

public class Food {
	String foodName;
	int quantity;
	String dob;
	public Food(String foodName, int quantity, String dob) {
		super();
		this.foodName = foodName;
		this.quantity = quantity;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", quantity=" + quantity + ", dob=" + dob + "]";
	}
	 public int subtractQuantity(int quantityToSubtract) {
	        // Ensure the quantity does not go below zero
	        this.quantity = Math.max(0, this.quantity - quantityToSubtract);
	        return this.quantity;
	    }
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	 	
	 
}

 class UsedFood {
	String foodName;
	int quantity;
	String dob;
	public UsedFood(String foodName, int quantity, String dob) {
		super();
		this.foodName = foodName;
		this.quantity = quantity;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", quantity=" + quantity + ", dob=" + dob + "]";
	}

	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	 	
	 
}
