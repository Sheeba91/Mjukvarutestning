import static org.junit.Assert.*;

import org.junit.Test;


public class myClassTest {
	
	@Test
	public void readFromKeyboard_none_valid(){
		MyClass myclass = new MyClass();
		assertTrue(myclass.text.equals("test"));
	}
	@Test
	public void Hello(){
		System.out.println("Hello");
	}
}
