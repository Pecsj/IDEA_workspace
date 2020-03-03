package classing;

public class Chicken {

	public static void main(String[] args) {
		int n=1,i,j,k;
		for(i=0;i<=100;i++) {
			for(j=0;j<=100-i;j++) {
				k=100-j-i;
				if(k%3==0)
				{
					if(i*5+3*j+(k/3)==100) {
						 System.out.println("结果"+n+":"+"公鸡"+i+"母鸡"+j+"小鸡"+k);
						 n++;
					}
				}
			}
		}
	}
}
