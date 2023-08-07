package oopMobilePhone;

public class MobilePhone {
	private String brand;
	private String model;
	private String phoneNumber;
	private int storageCap;
	
	public MobilePhone(String brand, String model, String number, int storage) {
		// I ultimately made the phoneNumber a String because an int couldn't store the valid number 9999999999, and a double wouldn't allow the first digit of the phone number to be 0.
		// I figure you could eventually create a lookup table of sorts by converting them into arrays of ints? But that seemed unwieldy to pass into the method itself.
		if (number.length() != 10) {
			System.out.println("This constructor only takes 10-digit phone numbers. Feel free to pick your 10 favorite numbers!");
			return;
		}
		
		if (storage < 0) {
			System.out.println("Negative storage capacity, huh? Can a phone repel data? This constructor can't make phones that do that, sorry. (Please construct a MobilePhone object with nonnegative storage.)");
			return;
		}

		this.brand = brand;
		this.model = model;
		this.phoneNumber = number;		
		this.storageCap = storage;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public int getStorageCap() {
		return storageCap;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPhoneNumber(String number) {
		this.phoneNumber = number;
	}

	public void setStorageCap(int storageCap) {
		this.storageCap = storageCap;
	}
	
	public void makeCall(String numToCall) {
		System.out.printf("We are calling %s from our %s %s phone!\n", numToCall, this.brand, this.model);
	}
	
	public void installApp(String app) {
		System.out.printf("Installing %s on our %s %s phone!\n", app, this.brand, this.model);
	}
	
	public void displayInfo() {
		System.out.printf("Brand: %s\nModel: %s\nPhone Number: %s\nStorage Capacity: %dGB", this.brand, this.model, this.phoneNumber, this.storageCap);		
	}
}
