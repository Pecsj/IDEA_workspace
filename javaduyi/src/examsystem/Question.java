package examsystem;

public class Question {
	private String title;//存题干
	private String answer;//村答案
	public Question(String title, String answer) {
		this.title = title;
		this.answer = answer;
	}
	//重写方法    改变默认比较规则为：题目题干相同即相同
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Question) {
			Question anotherQuestion=(Question)obj;
			//按照问号截取？之前的题干比较
			String[] thisTitle=title.split("\\?");
			String[] anotherTitle=anotherQuestion.getTitle().split("\\?");
			if(thisTitle[0].equals(anotherTitle[0])) {
				return true;
			}
		}
		return false;
	}
	public int hashCode() {
		String[] thisTitle=title.split("\\?");
		return thisTitle[0].hashCode();
	}
	//get	set
	public String getTitle() {
		return title;
	}
	public String getAnswer() {
		return answer;
	}
}
