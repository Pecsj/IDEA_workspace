package timeTrans;

public class TimeTrans {

	public static void main(String []args){
	int time=208653;
	int day=time/(3600*24);
	int hour=time%(3600*24)/3600;
	int min=time%3600/60;
	int second=time%60;
	System.out.println(day+"   "+hour+"   "+min+"   "+second);
}

}
