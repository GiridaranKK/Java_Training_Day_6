import java.io.IOException;
import java.io.StringReader;
public class ReverseTheString {

	public static void main(String[] args) throws IOException {
		String s = "hello";
		StringReader reader = new StringReader(s);
	    int k = 0;
	    int i = 0;
	    char[] output = new char[s.length()];
	    while ((k = reader.read()) != -1) {
	        output[i] = ((char) k);
	        i++;
	    }
		//System.out.println(output);
		for(int j=output.length-1 ; j >=0 ; j--) {
			System.out.print(output[j]);
		}
	}

}

//Output : olleh
