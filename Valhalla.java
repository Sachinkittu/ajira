import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Valhalla {

	public static void main(String[] args) {
		StringBuilder input = new StringBuilder();
		try (FileReader inputFileReader = new FileReader(args[0]);
				BufferedReader inputFileStream = new BufferedReader(inputFileReader);) {
			String CurrentLine = inputFileStream.readLine();
			while ((CurrentLine = inputFileStream.readLine()) != null) {
				input.append(CurrentLine + Delimeter.days_Delim);
			}
			Battle battle = new Battle();
			System.out.println("Input Data is ");
			System.out.println(input.toString());
			if (battle.initialize(input.toString())) {
				System.out.println("Total Number Of Successful Attacks by Tribe = "+ battle.StartTheBattle());
			}else {
				System.out.println("Invalid Test Case");
			}
		} catch (IOException e) {
			System.out.println("Unable to read/process the Input Data File.");
		}		
	}

}