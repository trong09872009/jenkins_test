package vn.htcsoftware.demo.test;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
	}

	public static Customer generateRandomCustomer() {
		String[] specificNames = { "Huy", "Long", "Nam", "Trung", "Nguyên", "Vy", "Hùng", "Tùng", "Quang", "Tèo", "Ti",
				"Minh" };
		String[] professions = { "Engineer", "Teacher", "Doctor", "Artist", "Chef" };
		String randomName = specificNames[(int) Math.floor(Math.random() * specificNames.length)];
		int randomAge = (int) (Math.floor(Math.random() * 50) + 20);
		String randomAddress = "Address " + Math.floor(Math.random() * 1000);
		String randomEmail = randomName.toLowerCase() + "@example.com";
		String randomPhoneNumber = "123-456-7890";
		String randomProfession = professions[(int) Math.floor(Math.random() * professions.length)];
		Customer customer = new Customer(randomName, randomAge, randomAddress, randomEmail, randomPhoneNumber,
				randomProfession);
		return customer;
	}
}
