package exception;

@SuppressWarnings("all")
public class TestException {
	
	public String testException(){

        try{
            System.out.println("try开始执行");
            String str = null;
            str.length();//空指针异常
            System.out.println("try执行完毕");
            return "try中的返回值";//事先约定好 返回值
        }catch(Exception e){
            //e.printStackTrace();//打印输出异常的名字
            System.out.println("捕获到了异常");
        }finally {
            System.out.println("finally块执行啦");
        }
        return "yicahng";
    }
	
    public static void main(String[] args){//JVM
    	TestException te=new TestException();
    	System.out.println(te.testException());
//    	int[][] array = new int[3][];
//		array[0][0] =10;
    	

    }
}
	
    
