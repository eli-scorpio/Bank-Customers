
public class BankCustomer {
	
	private int accountNumber;
	private String customerName;
	private String customerAddress;
	private String customerDateOfBirth;
	
	public void setAccountNumber(int customerAccountNumber) {
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setCustomerName(int name) {
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerAddress(int address) {
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerDateOfBirth(int dateOfBirth) {
	}
	public String getCustomerDateOfBirth() {
		return customerDateOfBirth;
	}
	
	public static void main(String[] args) {
		BankCustomer[] bankCustomerArray = new BankCustomer[10];
	
		for(int i = 0; i < bankCustomerArray.length; i++)
		{
			
			bankCustomerArray[i] = new BankCustomer();
		}

	}

}
