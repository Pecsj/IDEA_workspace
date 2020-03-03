package examsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class ExamMachine {
	//帐号密码键值对--HashMap
	private HashMap<String,String> userBox=new HashMap<String,String>();
	{
		userBox.put("常胜杰","123");
		userBox.put("甄德中","123");
		userBox.put("丁丽虎","123");
		userBox.put("aaa","123");
	}
	//使用set集合去重复，如果还需要排序功能，使用TreeSet并Compareable
	private HashSet<Question> questionBank=new HashSet<Question>();
	//利用块初始化HashSet集合内的Question对象
	{
		questionBank.add(new Question("以下选项哪个是Java基本数据类型?\n\tA.String\n\tB.Integer\n\tC.boolean\n\tD.Math","C"));
        questionBank.add(new Question("以下选项哪个不是Java基本数据类型?\n\tA.String\n\tB.int\n\tC.boolean\n\tD.double","A"));
        questionBank.add(new Question("以下选项哪个是Java引用数据类型?\n\tA.String\n\tB.int\n\tC.boolean\n\tD.char","A"));
        questionBank.add(new Question("以下选项哪个不是Java引用数据类型?\n\tA.String\n\tB.Integer\n\tC.boolean\n\tD.Math","C"));
        questionBank.add(new Question("以下选项哪个是java.util包中的类?\n\tA.String\n\tB.Integer\n\tC.Scanner\n\tD.Math","C"));
        questionBank.add(new Question("以下选项哪个不是java.util包中的类?\n\tA.Date\n\tB.Integer\n\tC.Calendar\n\tD.Random","B"));
        questionBank.add(new Question("以下选项哪个不是String类中的方法?\n\tA.compareTo\n\tB.append\n\tC.substring\n\tD.concat","B"));
        questionBank.add(new Question("以下选项哪个是String类中方法?\n\tA.append\n\tB.delete\n\tC.insert\n\tD.concat","D"));
        questionBank.add(new Question("以下选项哪个不是接口中属性的修饰符?\n\tA.public\n\tB.static\n\tC.final\n\tD.abstract","D"));
        questionBank.add(new Question("以下选项哪个不是Set集合的方法?\n\tA.set\n\tB.add\n\tC.remove\n\tD.iterator","A"));
	}
	//用题库随机生成试卷（5个题目）需要遍历--ArrayList
	public ArrayList<Question> getPaper(){
		System.out.println("考试系统正在随机生成试卷，请稍候！");
		//用set保证随机抽取的试卷不重复
		HashSet<Question> paper=new HashSet<Question>();
		//用ArrayList使其有序
		ArrayList<Question> questionBank=new ArrayList<Question>(this.questionBank);
		//随机获取试卷
		while(paper.size()!=5) {
			int index=new Random().nextInt(questionBank.size());
			//加入试卷集合中
			paper.add(questionBank.get(index));
		}
		return new ArrayList<Question>(paper);
	}
	//学生登录验证
	public String login(String username,String password) {
		String realPassword=userBox.get(username);
		if(realPassword.equals(password)) {
			return "登录成功";
		}else return "登录失败";
	}
	//增加题库中的试卷
//	public boolean addQuestion(Object obj) {
//		if(obj instanceof Teacher) {
//			//添加一道题目
//			Scanner input=new Scanner(System.in);
//			System.out.println("输入题目：");
//			String title=input.nextLine();
//			System.out.println("输入答案：");
//			String answer=input.nextLine();
//			Question q=new Question(title, answer);
//			input.close();
//			questionBank.add(q);
//			System.out.println("添加成功");
//			return true;
//		}else {
//			System.out.println("权限不足");
//			return false;
//		}
//	}
	//增加学生到集合中
}

