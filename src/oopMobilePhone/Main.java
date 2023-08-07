package oopMobilePhone;

public class Main {
	public static void main(String[] args) {
		MobilePhone myPhone = new MobilePhone("Apple", "iPhone 10S", "1234567890", 10);
		myPhone.makeCall("0987654321");
		myPhone.installApp("Skype");
		myPhone.displayInfo();
	}
}
