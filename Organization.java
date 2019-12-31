public class Organization extends User {
	private String bankAccount;
	private String phone;
	private String tax;
	private String mailing;


    public Organization(String name, String email, String username, String password, String bio, String mailing, String phone, String tax, String bankAccount) {
        super(name, email, username, password, bio, "Organization");
        this.mailing = mailing;
        this.phone = phone;
        this.tax = tax;
        this.bankAccount = bankAccount;
    }

    public String getMailing() {
        return mailing;
    }

    public String getPhone() {
        return phone;
    }

    public String getTax() {
        return tax;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return  super.toString() + "mailing='" + mailing + '\'' + ", phone='" + phone + '\'' + ", tax='" + tax + '\'' + ", bankAccount='" + bankAccount + '\'';
    }
    
    public void display(){
        super.display();
        String mailing = getMailing();
        String phone = getPhone();
        String tax = getTax();
        String bankAccount = getBankAccount();
        System.out.println( ", mailing='" + mailing + '\'' + ", phone='" + phone + '\'' + ", tax='" + tax + '\'' + ", bankAccount='" + bankAccount + '\'' + " ");

    }

}
