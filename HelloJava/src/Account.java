

public class Account {
	//˽������
	protected double balance;
	//������
	public Account() {
	}
	
	public Account(double init_balance){
		this.balance = init_balance;
	}
	//��ȡ�˻����
	public double getBalance(){
		return balance;
	}
	//��Ǯ
	public boolean deposit(double amt){
		balance +=amt;
		System.out.println("��Ǯ�ɹ�");
		return true;
	}
	//ȡǮ���ӵ�ǰ����м�ȥ���
	public boolean withdraw(double amt){
		if(balance>=amt){
			  balance -=amt;
			  System.out.println("ȡǮ�ɹ�");
			  return true;
		}else{
			System.out.println("����,ȡǮʧ��");
			return false;
		}
		
	}
	
	public void test(){
		System.out.println("1111");
	}
	
	
}
