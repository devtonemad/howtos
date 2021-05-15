import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaGrep{

	public static void main(String args[]) {

		String regex = args[0];
		String filename = args[1];
		Pattern pattern = Pattern.compile(regex);

		try {

			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
			
				Matcher matcher = pattern.matcher(line);
				
				if (matcher.find()) {
					System.out.println(line);
				}
			}

			bufferedReader.close();
			
		} catch (IOException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
		
	}

}
