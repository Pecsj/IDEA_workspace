package generic;

import java.util.Scanner;

public class Test<T> {

	private T t;
	
	public static void main(String[] args) {
		Test<String> test=new Test<String>();
		Scanner sc=new Scanner(System.in);
		test.show(test);
	}

	private <M> void show(M m) {
		System.out.println(m);
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
