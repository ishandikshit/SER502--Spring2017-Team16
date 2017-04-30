import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

class BagelRuntime {
	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		Stack<Integer> valueStack = new Stack<Integer>();
		String line = "";
		String fileName = "/Users/ishandikshit/ser_new/SER502--Spring2017-Team16/Bagel/target/generated-sources/antlr4/IntermediateCode.bgi";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Reading the Intermediate code file");
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			while ((line = bufferedReader.readLine()) != null) {
				if (line.startsWith("DECLARE")) {
					String[] tokens = line.split(" ");
					if (tokens[1].equals("Integer"))
						map.put(tokens[2], null);
					else if (tokens[1].equals("Bolean"))
						map.put(tokens[2], null);
				}

				if (line.startsWith("STORE")) {
					String[] tokens = line.split(" ");
					valueStack.push(Integer.parseInt(tokens[1]));
				}

				if (line.startsWith("PUSH")) {
					String[] tokens = line.split(" ");
					map.put(tokens[1], valueStack.pop().toString());

				}

				if (line.startsWith("GET")) {
					String[] tokens = line.split(" ");
					valueStack.push(Integer.parseInt(map.get(tokens[1])));
				}

				if (line.startsWith("OPERATOR")) {
					String[] tokens = line.split(" ");
					if (tokens[1].equals("+")) {
						int result = valueStack.pop();
						result = result + valueStack.pop();
						valueStack.push(result);
					}

					else if (tokens[1].equals("-")) {
						int result = valueStack.pop();
						result = result - valueStack.pop();
						valueStack.push(result);
					}

					else if (tokens[1].equals("*")) {
						int result = valueStack.pop();
						result = result * valueStack.pop();
						valueStack.push(result);
					}

					else if (tokens[1].equals("/")) {
						int result = valueStack.pop();
						result = result / valueStack.pop();
						valueStack.push(result);
					}
				}
				if (line.startsWith("COMPARE")) {
					String[] tokens = line.split(" ");
					if (tokens[1].equals("GreaterThan")) {
						boolean branch = valueStack.pop() > valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					}
				}

				if (line.startsWith("CONDITIONNOTTRUE") && valueStack.pop() == 0) {
					String[] tokens = line.split(" ");
					String label = tokens[2];
					while (!(bufferedReader.readLine().contains(label))) {
						// skip lines
					}

				}

				if (line.startsWith("JUMP")) {
					String[] tokens = line.split(" ");
					String label = tokens[1];
					while (!(bufferedReader.readLine().contains(label))) {
						// skip lines
					}

				}

				System.out.println(map);
				System.out.println(valueStack);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}