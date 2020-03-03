package classing;

public class LeapYear {

	public static void main(String[] args) {
		for(int year=1900;year<=2050;year++) {
			if(year%4==0) {
				if(year%400==0)
					System.out.println(year);
				else if(year%100!=0)
					System.out.println(year);
			}
		}
	}
}
