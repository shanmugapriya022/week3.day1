package week3.day1.Assignment;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Overriding for Deposit");
		
	}
	
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
	
	}

}