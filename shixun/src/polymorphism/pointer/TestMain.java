package polymorphism.pointer;

public class TestMain {
	public void starpoint(Pointer p) {
		if(p instanceof ColourPointer) {
			p=(ColourPointer)p;
		}else p=(BlackPrinter)p;
		p.point();
	}
	public static void main(String[] args) {
		Pointer p=new BlackPrinter();
		TestMain t=new TestMain();
		t.starpoint(p);
	}

}
