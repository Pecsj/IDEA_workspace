package classing;

public class CircleNest {

	public static void main(String[] args) {
		int all=0;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				all+=j;
			}
		}
		System.out.println(all);
	}
}
