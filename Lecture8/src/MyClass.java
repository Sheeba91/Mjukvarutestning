import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MyClass {
	public void readFromKeyboard(){
		String text;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			text = br.readLine();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
