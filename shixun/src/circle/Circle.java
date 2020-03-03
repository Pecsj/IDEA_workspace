package circle;

import java.io.IOException;

/*
 * @author:常胜杰
 * @data:12.26
 * @modify:
 */


import java.util.*;

public class Circle {

	public static void main(String[] args) throws IOException{
		Scanner input=new Scanner(System.in);
		System.out.print("输入圆的半径：");
		int r=input.nextInt();
		System.out.println("圆的面积"+Math.PI*r*r);
		input.close();
	}

}
