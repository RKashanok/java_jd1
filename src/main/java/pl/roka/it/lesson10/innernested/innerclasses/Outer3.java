package pl.roka.it.lesson10.innernested.innerclasses;


import java.util.Date;

//Внутренние классы МОГУТ!!! содержать static-поля и методы.
public class Outer3 {
	private Inner inner;
	private String str;
	private Date date;

	public static void main(String[] args) {
		Inner.static_pole = 10;
		Outer3 outer = new Outer3();
		outer.inner = outer.new Inner();
		outer.str = "string in outer";
		outer.date = new Date();
		outer.callMethodInInner();

	}

	public void callMethodInInner() {
		inner.method();
		System.out.println(Inner.prfsi_pole);
		System.out.println(Inner.pubfsi_pole);
		System.out.println(Inner.static_pole);
	}

	public class Inner {
		private int i;
		public static int static_pole = 5;
		public final static int pubfsi_pole = 22;

		private final static int prfsi_pole = 33;

		public Inner() {
			System.out.println("Expected static_pole value is 5, actual value is " + static_pole);
		}
		public void method() {
			System.out.println(str);
			System.out.println(date.getTime());
		}

	}
}