package foodwastemanagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;




interface AuthFun
{
	boolean authenticate(String usrname, String password);
}
class DonateFood {
	String name, foodName;
	int quantity;

	public DonateFood(String name, String foodName, int quantity) {
		super();
		this.name = name;
		this.foodName = foodName;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}

public class FoodWasteManagement {
	public static Scanner sc = new Scanner(System.in);
	public static List<User> userList = new ArrayList<User>();
	public static List<Donor> donorList = new ArrayList<Donor>();
	public static List<Food> foodList = new ArrayList<>();
	public static List<UsedFood> usablefoodList = new ArrayList<>();
	public static List<DonateFood> foodDonorList = new ArrayList<>();
	public static List<WasteFood> wasteFoodList = new ArrayList<>();
	public static List<String> wasteSource = new ArrayList<>();
	public static List<List<Object>> wasteManagement = new ArrayList<>();
	public static List<Object> wasteTransList = new ArrayList<>();

	public static void main(String[] args) {
	
//		System.out.println();
		
//		System.out.println("**********************************************************");
//		System.out.println("|     !! WELLCOME TO FOOD WASTE MANAGEMENT SYSTEM !!     |");
//		System.out.println("**********************************************************");
		
		System.out.println();
		FoodWasteManagement object = new FoodWasteManagement();
		
		Donor newDonor2 = new Donor("Pravin", "Nashik", "pravin@email.com", 89058766, "31-04-2000");
		Donor newDonor3 = new Donor("Sonakshi", "Pune", "sona@email.com", 5567766, "11-11-2010");
		donorList.add(newDonor2);
		donorList.add(newDonor3);
		UsedFood newUsed = new UsedFood("Dal Bhat", 4, "16-12-2024");
		User newUser1 = new User("Reshma", "Pune", "reshma@email.com", 9988766, "24-4-2000");
//		System.out.println("User Added Successfilly .");
		User newUser2 = new User("Abhijit", "Nashik", "abhijit@email.com", 77458766, "01-4-2000");
		User newUser3 = new User("Sonakshi", "Pune", "sona@email.com", 5567766, "11-1-2010");
		User newUser4 = new User("Sonakshi", "Kolhapur", "sona@email.com", 657766, "19-12-2000");

		userList.add(newUser1);
		userList.add(newUser2);
		userList.add(newUser3);
		userList.add(newUser4);
		foodList.add(new Food("Bread", 2, "29-01-2024"));
		foodList.add(new Food("Dal Bhat", 12, "12-12-2024"));
		foodList.add(new Food("Biryani", 6, "12-12-2024"));
		foodList.add(new Food("Pizza", 6, "27-01-2024"));
		foodList.add(new Food("Biryani", 6, "25-01-2024"));
		foodList.add(new Food("Biryani", 2, "25-01-2024"));
		foodList.add(new Food("Pizza", 4, "27-01-2024"));
		foodList.add(new Food("Bhendi", 6, "20-01-2024"));
		foodList.add(new Food("Biryani", 2, "25-01-2024"));
		foodList.add(new Food("Pav Bhaji", 4, "12-01-2024"));
		wasteSource.add("Feed Animal");
		wasteSource.add("Industrial Use");
		wasteSource.add("Composting");
		wasteSource.add("LandFill");
//		int ch = 0;
//		System.out.println("Enter User Name : ");
//		String userName=sc.next();
//		System.out.println("Enter password : ");
//		String password=sc.next();
//		boolean result=object.validate(userName,password);
//		System.out.println(result);
//		if(!result) {
//			System.out.println("Invalid Username And Password. Please Enetr Correct Username And Password.");
//		}
		
			boolean result =object.runAuthentication();
			if(result) {
		int choice;
		System.out.println("!!  Login Successfully  !!");
		System.out.println();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("|    !! WELLCOME TO FOOD WASTE MANAGEMENT SYSTEM !!     |");
		System.out.println("---------------------------------------------------------");
		do {
			
//			System.out.println("!!  Login Successfully  !!");
			System.out.println();
			System.out.println("1. For User \n2. For Donor \n3. For Food \n4. For Donate Food \n5. For Total Waste Food \n6. For Waste Management\n7. For Report\n8. For Exit");
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				int choice1;
				do {
					System.out.println();
					System.out.println("Enter Your Choice : ");
//					System.out.println("PRESS");
					System.out.println("1. For Add Users \n2. For View Users \n3. Search User \n4. For Exit ");
					choice1 = sc.nextInt();
					switch (choice1) {
					case 1:

						object.addUser();

//				System.out.println(userList);
						break;
					case 2:
						object.viewUsers();
//						System.out.println();
						break;
					case 3:

						object.searchUser();
						break;
					case 4 :
						break;
					default:System.out.println("Invalid Choice");
							

					}
					if(choice1==4)
					{
						break;
					}
				} while (choice1 != 0);
//			object.addUser();
//			System.out.println(user);
				break;

			case 2:
				int choice2;
				do {
					System.out.println();
					System.out.println("Enter Your Choice : ");

					System.out.println("1. For Add Donor \n2. For View Donor \n3. Search Donor \n4. For Exit ");
					choice2 = sc.nextInt();
					switch (choice2) {
					case 1:

						object.addDonor();

//				System.out.println(user);
						break;
					case 2:
						object.viewDonor();
						break;
					case 3:

						object.searchDonor();
						break;
					case 4 :
						break;
					default:System.out.println("Invalid Choice");
							

					}
					if(choice2==4)
					{
						break;
					}
				} while (choice2 != 0);
				break;
			case 3:
				int choice3;
				do {
					System.out.println();
					System.out.println("Enter Your Choice : ");

					System.out.println("1. For Add  Food \n2. For View Food \n3. Search  Food \n4. For Exit ");
					choice3 = sc.nextInt();
					switch (choice3) {
					case 1:
						object.addFood();
						break;
					case 2:
						object.viewFood();
						break;
					case 3:

						object.searchFood();
						break;
					case 4 :
						break;
					default:System.out.println("Invalid Choice");
					}
					if(choice3==4)
					{
						break;
					}
					
				} while (choice3 != 0);
//			object.addUser();
//			System.out.println(user);
				break;
			case 4:
				int choice4;
				do {
					System.out.println("Enter Your Choice : ");

					System.out.println("1. For Donate  Food \n2. For View Donated Food \n3. For Exit");
					choice4 = sc.nextInt();
					switch (choice4) {
					case 1:
						object.donateFood();
						break;
					case 2:
						object.viewDonatedFood();
						break;
					case 3:break;
					default:System.out.println("Invalid Choice");
					}
					if(choice4==3)
					{
						break;
				
					}
				} while (choice4 != 0);
				break;
			case 5:
				object.wasteFood();
				break;
			case 6:
				int choice6;
				do {
					System.out.println("!! Waste Management !!");
					System.out.println("Enter Your Choice : ");

					System.out.println("1. For transfer  Food \n2. For View transfer  Food\n3. For Exit ");
					choice6 = sc.nextInt();
					switch (choice6) {
					case 1:
						object.tranferWaste();
						break;
					case 2:
						object.viewWasteManagement();
						break;
					case 3:break;	
					default:System.out.println("Invalid Choice");
					}
					if(choice6==3)
					{
						break;
					}
				} while (choice6 != 0);
				break;
			case 7:
//			System.out.println("View Report");
				int choice7;
				do {
					System.out.println("!! View Report !!");
					System.out.println("Enter Your Choice : ");

					System.out.println("1. For Food Stock Report \n2. For Waste Food Report \n3. For Exit");
					choice7 = sc.nextInt();
					switch (choice7) {
					case 1:
						object.foodStock();
						break;
					case 2:
						object.wasteStock();
						break;
					case 3 :break;
					
					default:
						System.out.println("Invalid Choice");
				}
				if(choice7==3)
				{
					break;
				}
				} while (choice7 != 0);
				break;
			case 8: break;
			default:
				System.out.println("Invalid Choice");
			}
			if(choice==8)
			{
				break;
			}
		} while (choice != 0);
		System.out.println();
		System.out.println("!! THANK YOU FOR USING FOOD WASTE MANAGEMENT SYSTEM !!");
	}
	}
	// Authentication 
	public boolean validate(String username,String password)
	{
	
		AuthFun authFun=(u,p)->u.equals("admin") &&p.equals("admin");
		return authFun.authenticate(username, password);
	}
	  public boolean runAuthentication() {
	        boolean isValid = false;

	        while (!isValid) {
	        	System.out.println("-----------------------------------");
	    		System.out.println("|            ! Login !             |");
	    		System.out.println("-----------------------------------");
	            System.out.println("Enter User Name : ");
	            String userName = sc.next();
	            System.out.println("Enter password : ");
	            String password = sc.next();

	            AuthFun authFun = (u, p) -> u.equals("admin") && p.equals("admin");
	            isValid = authFun.authenticate(userName, password);

	            if (!isValid) {
	                System.out.println("Invalid Username And Password. Please Enetr Valid Username And Password.");
	            }
	        }

//	        System.out.println("Authentication successful. Welcome, admin!");
	      return true;
	    }
	// add User
	public void addUser() {
		System.out.println("Enter User Details : ");
		String name, city, email;
		long phoneNo;

		String dob;
//		dob=new MyDate();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enetr Phone Number : ");
		phoneNo = sc.nextLong();
		System.out.println("Enetr Email : ");
		email = sc.nextLine();
		email = sc.nextLine();
		System.out.println("Enetr City : ");
		city = sc.nextLine();
		System.out.println("Enetr Date Of Birth [DD-MM-YYYY] : ");
		dob = sc.nextLine();

		User newUser = new User(name, city, email, phoneNo, dob);

		userList.add(newUser);
		User newUser1 = new User("Reshma", "Pune", "reshma@email.com", 9988766, "24,4,2000");
		System.out.println("User Added Successfilly .");
//		userList.add(newUser1);
//		for (User user2 : user) {
//			System.out.println(user2);
//		}
	}

	// view Users
	public void viewUsers() {
		if (userList.isEmpty()) {
			System.out.println("Their is No User. Please First Add User. ");
		} else {
			System.out.println("Users Details : ");
			System.out.printf("%-15s | %-10s | %-30s | %-10s | %-10s%n", "Name", "Phone No", "Email", "City", "DOB");
			System.out
					.println("--------------------------------------------------------------------------------------");

			for (User details : userList) {
				System.out.printf("%-15s | %-10s | %-30s | %-10s | %-10s%n", details.name, details.phone_no,
						details.email, details.city, details.dob);
			}
		}
	}

	// search By Its name
	public void searchUser() {
		String searchName;
		int count = 0;

		System.out.println("Enter Name : ");
		searchName = sc.nextLine();
		searchName = sc.nextLine();
		boolean nameFound = false;
//	    User newUser1 =new User("Reshma", "Pune", "reshma@email.com", 9988766, new MyDate(24,4,2000));
		for (User search : userList) {
			if (search.name.equalsIgnoreCase(searchName)) {
				if (count == 0) {

					System.out.printf("%-15s | %-10s | %-30s | %-10s | %-10s%n", "Name", "Phone No", "Email", "City",
							"DOB");
					System.out.println(
							"--------------------------------------------------------------------------------------");
				}
				System.out.printf("%-15s | %-10s | %-30s | %-10s | %-10s%n", search.name, search.phone_no, search.email,
						search.city, search.dob);
				count++;
				nameFound = true;
			}
		}
		if (!nameFound) {
			System.out.println("No user with the name " + searchName + ".  Please check your username.");
		}
	}

	public void addDonor() {
		System.out.println("Enter Donor Details : ");
		String name, city, email;
		long phoneNo;
		int dd = 0, mm = 0, yy = 0;
		String dob;
//		dob=new MyDate();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enetr Phone Number : ");
		phoneNo = sc.nextLong();
		System.out.println("Enetr Email : ");
		email = sc.nextLine();
		email = sc.nextLine();
		System.out.println("Enetr City : ");
		city = sc.nextLine();
		System.out.println("Enetr Date Of Birth [DD-MM-YYYY] : ");
		dob = sc.nextLine();

		Donor newDonor = new Donor(name, city, email, phoneNo, dob);

		donorList.add(newDonor);
//		donorList.add(newDonor);
		System.out.println("Donor Added Successfilly .");

//		for (User user2 : donorList) {
//			System.out.println(user2);
//		}
	}

	// view Donor
	public void viewDonor() {
		if (donorList.isEmpty()) {
			System.out.println("Their is No Donor. Please First Add Donor. ");
		} else {
			System.out.println("Donor Details : ");
			System.out.printf("%-15s | %-10s | %-30s | %-10s | %-10s%n", "Name", "Phone No", "Email", "City", "DOB");
			System.out
					.println("--------------------------------------------------------------------------------------");

			for (Donor details : donorList) {
				System.out.printf("%-15s | %-10s | %-30s | %-10s | %-10s%n", details.name, details.phone_no,
						details.email, details.city, details.dob);
			}
		}
	}

	// search By Its name
	public void searchDonor() {
		String searchName;
		int count = 0;
		boolean nameFound = false;
		System.out.println("Enter Name : ");
		searchName = sc.nextLine();
		searchName = sc.nextLine();
		for (Donor search : donorList) {
			if (search.name.equalsIgnoreCase(searchName)) {
				if (count == 0) {

					System.out.printf("%-15s | %-10s | %-30s | %-10s | %-10s%n", "Name", "Phone No", "Email", "City",
							"DOB");
					System.out.println(
							"--------------------------------------------------------------------------------------");
				}
				System.out.printf("%-15s | %-10s | %-30s | %-10s | %-10s%n", search.name, search.phone_no, search.email,
						search.city, search.dob);
				count++;
				nameFound = true;
			}
		}
		if (!nameFound) {
			System.out.println("No user with the name " + searchName + ". Please check your username.");
		}
	}

	public void addFood() {
		String foodName;
		int quantity, dd = 0, mm = 0, yy = 0;
		String date;
		System.out.println("Enetr Food Name : ");
		foodName = sc.nextLine();
		foodName = sc.nextLine();
		System.out.println("Enetr Food Quantity : ");
		quantity = sc.nextInt();
		System.out.println("Enetr Expiry Date [DD-MM-YYYY] : ");
		date = sc.nextLine();
		date = sc.nextLine();

//		donorList.add(newDonor);
		Food newFood = new Food(foodName, quantity, date);
		foodList.add(newFood);
//		System.out.println(foodList);
		System.out.println("Add Successfully.");

	}

	public void viewFood() {
		if (foodList.isEmpty()) {
			System.out.println("Their is No Food. Please First Add Food. ");
		} else { // "%-15s | %-10s | %-30s | %-10s | %-10s%n"
			System.out.println("Food Details : ");
			System.out.printf("%-15s | %-10s | %-10s%n", "Name", "Quantity", "Expiry Date");
			System.out.println("-------------------------------------------------------");

			for (Food details : foodList) {
				System.out.printf("%-15s | %-10s | %-10s%n", details.foodName, details.quantity, details.dob);
			}
		}
	}

	// search By Its name
	public void searchFood() {
		String searchName;
		int count = 0;
		boolean nameFound = false;
		System.out.println("Enter Name : ");
		searchName = sc.nextLine();
		searchName = sc.nextLine();
		for (Food search : foodList) {
			if (search.foodName.equalsIgnoreCase(searchName)) {
				if (count == 0) {

					System.out.printf("%-15s | %-10s | %-10s%n", "Name", "Quantity", "Expiry Date");
					System.out.println("-------------------------------------------------------");
				}
				System.out.printf("%-15s | %-10s | %-10s%n", search.foodName, search.quantity, search.dob);
				count++;
				nameFound = true;
			}
		}
		if (!nameFound) {
			System.out.println("No Food with the name " + searchName + ". Please check your Food Name.");
		}
	}

	// donate food
	public void donateFood() {
//			System.out.println("Choose the food to donate");
		int i, j;
		int number;
		String foodName1, userName1;
		int quantity1;
		if (foodList.isEmpty()) {
			System.out.println("No Food Available to donate.");
		} else {
			System.out.println("Choose the food to donate");

			System.out.println();
			for (j = 0; j < foodList.size(); j++) {
				System.out.println((j + 1) + ". " + foodList.get(j).foodName + " " + foodList.get(j).quantity);
			}
			System.out.println("Enetr Number To Donate Food : ");
			number = sc.nextInt();
//				System.out.println("Choose  User to donate Food");
			if (userList.isEmpty()) {
				System.out.println("No User Available to food donate.");
			} else {
				System.out.println("Choose the User to donate food");

				for (i = 0; i < userList.size(); i++) {
					System.out.println((i + 1) + ". " + userList.get(i).name);

				}
				System.out.println("Enetr Number For User : ");
				int number1 = sc.nextInt();
				if (number >= 1 && number <= foodList.size()) { // foodDonorList
					if (number1 >= 1 && number1 <= userList.size()) {
						// foodName1,userName1
						userName1 = userList.get(number1 - 1).name;
						foodName1 = foodList.get(number - 1).foodName;
						quantity1 = foodList.get(number - 1).quantity;
						System.out.println("Enetr " + foodName1 + " Food Quantity");
						int q = sc.nextInt();
						if (q > quantity1) {
							System.out.println(" Not Sufficent food Quantity Available.");
						} else {
							int newQuantity = quantity1 - q;
//							update new quantity
							for (Food food : foodList) {
								if (food.getFoodName().equals(foodName1)) {
									int updatedQuantity = food.subtractQuantity(q);

									break; // Assuming each food item has a unique name
								}
							}
//						Food newFood =new Food(foodName, quantity, date);
							DonateFood food = new DonateFood(userName1, foodName1, q);
							foodDonorList.add(food);
							System.out.println("Donate Successfully");
						}
					}
				} else {
					System.out.println("Invalid choice. No Food Donate.");
				}
			}
		}
	}

	public void viewDonatedFood() {
		if (foodDonorList.isEmpty()) {
			System.out.println("Their is No Food Donate Yet. ");
		} else { // "%-15s | %-10s | %-30s | %-10s | %-10s%n"
			System.out.println("Donated Food Details : ");
			System.out.printf("%-15s | %-10s | %-10s%n", "User Name", "Food Name", "Quantity");
			System.out.println("-------------------------------------------------------");

			for (DonateFood details : foodDonorList) {
				System.out.printf("%-15s | %-10s | %-10s%n", details.name, details.foodName, details.quantity);
			}
		}
	}

	public void wasteFood() { // wasteFoodList
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate currentDate = LocalDate.now();
//		        boolean found = false;
		int operationStatus = 0;
		int dd = 0, mm = 0, yy = 0, count = 0;
		for (Food food : foodList) {
			String date = food.getDob();
			String[] splitDate = date.split("-");
			if (splitDate.length == 3) {

				dd = Integer.parseInt(splitDate[0]);
				mm = Integer.parseInt(splitDate[1]);
				yy = Integer.parseInt(splitDate[2]);
			}

			LocalDate anotherDate = LocalDate.of(yy, mm, dd);
			// if (food.getFoodName().equals(foodName1)) {
			// int updatedQuantity = food.subtractQuantity(q);
			if (anotherDate.isBefore(currentDate)) {
				boolean found = false;

				// Check if the food already exists in wasteFoodList
				for (WasteFood wasteFood : wasteFoodList) {
					if (wasteFood.foodName.equals(food.foodName)) {
						// Update the quantity
						wasteFood.quantity += food.quantity;
						found = true;
						operationStatus++;
						break;

					}

				}
//		                System.out.println(found);
				if (!found) {
					// Add the food to wasteFoodList
					wasteFoodList.add(new WasteFood(food.foodName, food.quantity, food.dob));
//		                     found=true;
				}
				count++;

//		            }

			}

		}
		if (count == 0) {
			System.out.println("No Waste Food Available");
		}

		if (count != 0) {

			System.out.println("Waste Food Details : ");
			System.out.println();
			System.out.printf("%-15s | %-10s | %-10s%n", "Name", "Quantity", "Expiry Date");
			System.out.println("-------------------------------------------------------");

			for (WasteFood details : wasteFoodList) {
				System.out.printf("%-15s | %-10s | %-10s%n", details.foodName, details.quantity, details.dob);
			}
		}

	}

	public void tranferWaste() {

		System.out.println("Choose the food to donate");
		int i, j;

		String foodName1, userName1;
		int quantity1;
		if (wasteFoodList.isEmpty()) {
			System.out.println("No Food Available to transfer.");
		} else {
			System.out.println("Choose the food to transfer");

			System.out.println();
			for (j = 0; j < wasteFoodList.size(); j++) {
				System.out
						.println((j + 1) + ". " + wasteFoodList.get(j).foodName + " " + wasteFoodList.get(j).quantity);
			}
			System.out.println("Enetr Number To transfer Food : ");
			int foodIndex = sc.nextInt();
//				System.out.println("Choose  User to donate Food");
			if (wasteSource.isEmpty()) {
				System.out.println("No Source Available to food To Transfer.");
			} else {
				System.out.println("Choose the Source to Transfer food");

				for (i = 0; i < wasteSource.size(); i++) {
					System.out.println((i + 1) + ". " + wasteSource.get(i));

				}
				System.out.println("Enetr Number For Source : ");
				int sourceIndex = sc.nextInt();
				if (foodIndex >= 1 && foodIndex <= wasteFoodList.size()) { // foodDonorList
					if (sourceIndex >= 1 && sourceIndex <= wasteSource.size()) {
						// foodName1,userName1
						String userName = wasteSource.get(sourceIndex - 1);
						WasteFood selectedFood = wasteFoodList.get(foodIndex - 1);
						userName1 = wasteSource.get(sourceIndex - 1);
						foodName1 = wasteFoodList.get(foodIndex - 1).foodName;
						quantity1 = wasteFoodList.get(foodIndex - 1).quantity;
						System.out.println("Enetr " + foodName1 + " Food Quantity");
						int q = sc.nextInt();
						if (q > quantity1) {
							System.out.println(" Not Sufficent food Quantity Available.");
						} else {
							int newQuantity = quantity1 - q;
//							update new quantity
							// foodList= wasteFoodList userList= wasteSource wasteManagement wasteTransList
							for (WasteFood food : wasteFoodList) {
								if (food.getFoodName().equals(foodName1)) {
									int updatedQuantity = food.subtractQuantity(q);

									break; // Assuming each food item has a unique name
								}
							} // WasteFood selectedFood = wasteFoodList.get(foodIndex - 1);
//							System.out.println(userName1);
//						Food newFood =new Food(foodName, quantity, date);
//						DonateFood food=new DonateFood(userName1, foodName1, q);
//						foodDonorList.add(food);
							List<Object> transferInfo = new ArrayList<>();
							transferInfo.add(userName1);
							transferInfo.add(selectedFood.getFoodName());
							transferInfo.add(q);
							wasteManagement.add(transferInfo);

							System.out.println("Transfer Successful");
//							System.out.println("Transfer Successfully");
//						 System.out.println("Waste Transfer Information:");
//					        System.out.printf("%-15s | %-15s | %-10s%n", "User", "Food", "Quantity");
//					        System.out.println("--------------------------------------");
//
//					        for (List<Object> record : wasteManagement) {
//					            System.out.printf("%-15s | %-15s | %-10s%n",
//					                    record.get(0), record.get(1), record.get(2));
//					        }
						}
					}
				} else {
					System.out.println("Invalid choice. No Food Donate.");
				}
			}
		}
	}

	public void viewWasteManagement() {
		System.out.println("Waste Transfer Information:");
		System.out.printf("%-15s | %-15s | %-10s%n", "Source Name", "Food", "Quantity");
		System.out.println("--------------------------------------");

		for (List<Object> record : wasteManagement) {
			System.out.printf("%-15s | %-15s | %-10s%n", record.get(0), record.get(1), record.get(2));
		}

	}

	  public void foodStock() {
		  System.out.println("Enter From Date (dd-MM-yyyy): ");
	        String date1 = sc.next();
	        System.out.println("Enter To Date (dd-MM-yyyy): ");
	        String date2 = sc.next();

	        int dd1 = 0, mm1 = 0, yy1 = 0, count1 = 0;
	        int dd2 = 0, mm2 = 0, yy2 = 0, count2 = 0;

	        // Parse From Date
	        String[] fromDate = date1.split("-");
	        try {
	            if (fromDate.length == 3) {
	                dd1 = Integer.parseInt(fromDate[0]);
	                mm1 = Integer.parseInt(fromDate[1]);
	                yy1 = Integer.parseInt(fromDate[2]);
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid date format for From Date.");
	            return;
	        }

	        // Parse To Date
	        String[] toDate = date2.split("-"); // Corrected variable name to date2
	        try {
	            if (toDate.length == 3) {
	                dd2 = Integer.parseInt(toDate[0]);
	                mm2 = Integer.parseInt(toDate[1]);
	                yy2 = Integer.parseInt(toDate[2]);
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid date format for To Date.");
	            return;
	        }

	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate dateFrom = LocalDate.of(yy1, mm1, dd1);
	        LocalDate dateTo = LocalDate.of(yy2, mm2, dd2);
	     
	       
	      
	        System.out.printf("%-15s | %-10s | %-10s%n", "Food Name", "Quantity", "Expiry Date");
	        for (Food food : foodList) {
	            String date = food.getDob();
	            String[] splitDate = date.split("-");
	            if (splitDate.length == 3) {
	                int dd = Integer.parseInt(splitDate[0]);
	                int mm = Integer.parseInt(splitDate[1]);
	                int yy = Integer.parseInt(splitDate[2]);

	                LocalDate anotherDate = LocalDate.of(yy, mm, dd);

	                // Check if the date is within the specified range
//	                if (anotherDate.isAfter(dateFrom)) {
//	                e for (Food food : foodList) {
	                LocalDate foodDate = LocalDate.parse(food.dob, dateFormatter);

	                if (!foodDate.isBefore(dateFrom) && !foodDate.isAfter(dateTo)) {
	                    System.out.printf("%-15s | %-10s | %-10s%n", food.foodName, food.quantity, food.dob);
	                }
	            }
	            }
	        
	  }
	  
	  public void wasteStock()
	  {// WasteFood food : wasteFoodList
		  System.out.println("Enter From Date (dd-MM-yyyy): ");
	        String date1 = sc.next();
	        System.out.println("Enter To Date (dd-MM-yyyy): ");
	        String date2 = sc.next();

	        int dd1 = 0, mm1 = 0, yy1 = 0, count1 = 0;
	        int dd2 = 0, mm2 = 0, yy2 = 0, count2 = 0;

	        // Parse From Date
	        String[] fromDate = date1.split("-");
	        try {
	            if (fromDate.length == 3) {
	                dd1 = Integer.parseInt(fromDate[0]);
	                mm1 = Integer.parseInt(fromDate[1]);
	                yy1 = Integer.parseInt(fromDate[2]);
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid date format for From Date.");
	            return;
	        }

	        // Parse To Date
	        String[] toDate = date2.split("-"); // Corrected variable name to date2
	        try {
	            if (toDate.length == 3) {
	                dd2 = Integer.parseInt(toDate[0]);
	                mm2 = Integer.parseInt(toDate[1]);
	                yy2 = Integer.parseInt(toDate[2]);
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid date format for To Date.");
	            return;
	        }

	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate dateFrom = LocalDate.of(yy1, mm1, dd1);
	        LocalDate dateTo = LocalDate.of(yy2, mm2, dd2);
	     
	       
	      //// WasteFood food : wasteFoodList
	        System.out.printf("%-15s | %-10s | %-10s%n", "Food Name", "Quantity", "Expiry Date");
	        for (WasteFood food : wasteFoodList) {
	            String date = food.getDob();
	            String[] splitDate = date.split("-");
	            if (splitDate.length == 3) {
	                int dd = Integer.parseInt(splitDate[0]);
	                int mm = Integer.parseInt(splitDate[1]);
	                int yy = Integer.parseInt(splitDate[2]);

	                LocalDate anotherDate = LocalDate.of(yy, mm, dd);

	                // Check if the date is within the specified range
//	                if (anotherDate.isAfter(dateFrom)) {
//	                e for (Food food : foodList) {
	                LocalDate foodDate = LocalDate.parse(food.dob, dateFormatter);

	                if (!foodDate.isBefore(dateFrom) && !foodDate.isAfter(dateTo)) {
	                    System.out.printf("%-15s | %-10s | %-10s%n", food.foodName, food.quantity, food.dob);
	                }
	            }
	            }
	  }
}

