package week1.day1;

public class Mobile {
 
	public void makeCall() {
		
		String mobileModel= "oppo";
		float mobileWeight= 100.5f;
		
		System.out.println("mobileModel");
		
		System.out.println(mobileWeight);
	}
	public void sendMsg() {
		
		boolean Charged= true;
		int mobileCost= 9999;
		
		System.out.println(Charged);
		System.out.println(mobileCost);
		
		
	}
	
	public static void main(String[] args) {
	
       Mobile oppo=new Mobile();
		oppo.makeCall();
		oppo.sendMsg();
		System.out.println("This is my mobile");
	}

}
