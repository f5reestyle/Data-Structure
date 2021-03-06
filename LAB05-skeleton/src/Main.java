import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
		MyQueue<String> queue = new MyQueue<>();
		String inputFilePath;
		if(System.getProperty("file.separator").equals("\\"))
			inputFilePath = Paths.get("testinput", "input.txt").toString();
		else
			inputFilePath = "testinput/input.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
			String line = null;
			System.out.println("Operate Value\tQueue");
			System.out.println("---------------------");
			while ((line = reader.readLine()) != null) {
				System.out.print(line + "\t");
				if (line.startsWith("ENQUEUE")) {
					String value = line.split(" ")[1];
					queue.enqueue(value);
					System.out.println(queue);
				} else if (line.equals("DEQUEUE")) {
					System.out.print(queue.dequeue());
					System.out.print("\t");
					System.out.println(queue);
				} else if (line.equals("POP")) {
					System.out.print(queue.pop());
					System.out.print("\t");
					System.out.println(queue);
				}
				else if (line.equals("SIZE")) {
					System.out.println(queue.size() + "\t" + queue);
				} else if (line.equals("CLEAR")) {
					queue.clear();
					System.out.println("-\t" + queue);
				} else if (line.equals("PRINT")) {
					System.out.println("-\t" + queue);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}