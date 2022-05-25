class  bankAcc
{
	private int accno;
	private String ifsc;
	private String name;
	private int balance;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
public class encapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAcc b=new bankAcc();
		b.setAccno(12333);
		
	}

}
