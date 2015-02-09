import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass implements MyInterface {
	MyInterface my;
	String text = "";
	public MyClass() {
		this.my = new FakeClass();
		text = my.readFromKeyboard();
	}
	public MyClass(MyInterface my) {
		this.my = my;
	}

	public class FakeClass implements MyInterface {
		@Override
		public String readFromKeyboard() {
			return "test";
		}
	}
	public class ValidReader implements MyInterface {
		public String readFromKeyboard() {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			try {
				text = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return text;
		}
	}

	@Override
	public String readFromKeyboard() {
		// TODO Auto-generated method stub
		return null;
	}
}
