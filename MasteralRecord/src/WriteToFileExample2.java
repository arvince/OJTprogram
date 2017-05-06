import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileExample2 {

	private static final String FILENAME = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\Test.txt";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {

			String content = input.nextLine();

			bw.newLine();
                        bw.write(content);

			// no need to close it.
			//bw.close();

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}