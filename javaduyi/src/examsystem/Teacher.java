package examsystem;

import java.util.ArrayList;

public class Teacher {
	//int分数=老师改试卷(试卷，学生答案)
	public int checkPaper(ArrayList<Question> paper, String[] answers) {
		int score=0;
		for(int i=0;i<paper.size();i++) {
			if(paper.get(i).getAnswer().equalsIgnoreCase(answers[i])) {
				//添加题目分值属性
				score+=20;
			}
		}
		return score;
	}
}
