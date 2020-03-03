package polymorphism.dog;

public class TestMain {

	public void play(Animal a) {
		if(a instanceof Dog) {
			((Dog) a).catchingFlyDisc();
		}
		else { 
			((Penguin)a).swimming();
		}
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		Penguin p=new Penguin();
		Animal a=new Animal();
		TestMain t=new TestMain();
		//测试方法
		a=p;
		t.play(a);
		a=d;
		t.play(a);
	}

}
