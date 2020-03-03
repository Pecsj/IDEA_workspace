package classing;

public class Prime100 {

	public static void main(String[] args) {
		int key=0;int count=0;
		for(int i=2;i<=100;i++) {
			int k=(int)Math.sqrt(i);
			for(int j=2;j<=k;j++){
				if(i%j==0) {
					key=1;
					break;
				}
			}
			if(key==0) {
				count++;
				if(count%5==0)
					System.out.println(i);
				else System.out.print(i+"  ");
			}
			key=0;
		}
	}

}
