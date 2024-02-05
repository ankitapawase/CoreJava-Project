package foodwastemanagement;

public class WasteFood {
	String foodName;
	int quantity;
	String dob;

	public WasteFood(String foodName, int quantity, String dob) {
		super();
		this.foodName = foodName;
		this.quantity = quantity;
		this.dob = dob;
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
	 public int subtractQuantity(int quantityToSubtract) {
	        // Ensure the quantity does not go below zero
	        this.quantity = Math.max(0, this.quantity - quantityToSubtract);
	        return this.quantity;
	    }
}
