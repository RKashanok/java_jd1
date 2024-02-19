package pl.roka.it.lesson10.innernested.innerclasses;

import java.util.Date;

// Внутренний класса имеют прямой доступ ко всем полям и методам
// внешнего класса.
public class Outer1 {

	private String str;
	Date   date;
	private static Integer aqwe = 5;

	public Outer1() {
		str = "string in outer";
		date = new Date();
	}
	
	public class Inner {
		public  int b = 10;
		public Inner() {
			super();
		}

		public void method() {
			System.out.println(str);
			System.out.println(date.getTime());
			System.out.println(Outer1.aqwe);
			aqwe = 15;
			System.out.println(Outer1.aqwe);
		}
	}
}
