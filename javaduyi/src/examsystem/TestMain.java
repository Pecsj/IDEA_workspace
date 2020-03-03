package examsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		//考试服务器
		ExamMachine examMachine=new ExamMachine();
		//学生
		Scanner input=new Scanner(System.in);
		System.out.println("输入名字");
		String username=input.nextLine();
		System.out.println("输入密码");
		String password=input.nextLine();
		Student stu=new Student(username,password);
		//老师
		Teacher tea=new Teacher();
		
		//学生登录考试系统
		String login=examMachine.login(stu.getUsername(), stu.getPassword());
		if(login.equals("登录成功")){
			//分配试卷
			ArrayList<Question> paper=examMachine.getPaper();
			//学生开始考试
			String[] answers=stu.exam(paper);
			input.close();
			//老师改卷
			int score=tea.checkPaper(paper, answers);
			//输出成绩
			System.out.println("你的成绩："+score);
		}else System.out.println(login);
	}

}
