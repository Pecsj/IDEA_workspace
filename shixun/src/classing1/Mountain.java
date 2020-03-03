package classing1;

public class Mountain {

	public static void main(String[] args) {
		int hight=8848*100;
		int i=0,h=1;
		while(h<hight)
		{
			h*=2;
			i++;
		}
		System.out.println("折叠："+i+"次");
	}

}
