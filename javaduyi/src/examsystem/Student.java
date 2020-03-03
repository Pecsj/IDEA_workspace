package examsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String uername;
	private String password;
	//考试答案-学生考试(试卷)
	public String[] exam(ArrayList<Question> paper) {
		String[] answers=new String[paper.size()];
		@SuppressWarnings("all")
		Scanner input=new Scanner(System.in);
		for(int i=0;i<paper.size();i++) {
			System.out.println(paper.get(i).getTitle());
			System.out.println("输入你的答案：");
			answers[i]=input.nextLine();
		}
		return answers;
	}
	public Student() {}
	public Student(String username,String password) {
		this.uername=username;
		this.password=password;
	}
	public String getUsername() {
		return uername;
	}
	public String getPassword() {
		return password;
	}
}
