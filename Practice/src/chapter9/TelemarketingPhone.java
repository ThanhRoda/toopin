package chapter9;

public class TelemarketingPhone {

	public static void main(String[] args) {
		getPhoneNumber("Y");
	}
	public static void getPhoneNumber(String st) {
		String[] name = {"Thanh Roda","Phi Nguyen", "Y Linh"};
		String[] phone = {"0363","01235","9985"} ;
		int i=-1;
		for(String n : name) {
			i++;
			if (n.indexOf(st)>=0){
				System.out.print(n +" :");
				System.out.println(phone[i]);
			}
		}
	}

}
