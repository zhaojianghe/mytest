

public class Account {
	//私有属性
	protected double balance;
	//构造器
	public Account() {
	}
	
	public Account(double init_balance){
		this.balance = init_balance;
	}
	//获取账户余额
	public double getBalance(){
		return balance;
	}
	//存钱
	public boolean deposit(double amt){
		balance +=amt;
		System.out.println("存钱成功");
		return true;
	}
	//取钱：从当前余额中减去金额
	public boolean withdraw(double amt){
		if(balance>=amt){
			  balance -=amt;
			  System.out.println("取钱成功");
			  return true;
		}else{
			System.out.println("余额不足,取钱失败");
			return false;
		}
		
	}
	
	public void test(){
		System.out.println("1111");
	}
	
	
}
