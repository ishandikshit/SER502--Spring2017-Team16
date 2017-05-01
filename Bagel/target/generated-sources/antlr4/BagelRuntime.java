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
		int c = -1;
		String currDIr = System.getProperty("user.dir");
		String fileName = currDIr + "/Samples/IntermediateCode/IntermediateCode.bgi";
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
					if (tokens[1].equals("True"))
						valueStack.push(1);
					else if (tokens[1].equals("False"))
						valueStack.push(0);
					else
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
						result = valueStack.pop() - result;
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
						boolean branch = valueStack.pop() < valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					} else if (tokens[1].equals("LessThan")) {
						boolean branch = valueStack.pop() > valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					} else if (tokens[1].equals("Equals")) {
						boolean branch = valueStack.pop() == valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					}

					else if (tokens[1].equals("LessThanEqual")) {
						boolean branch = (valueStack.pop() >= valueStack.pop());// ||
																				// valueStack.pop()
																				// valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					}

					else if (tokens[1].equals("GreaterThanEqual")) {
						boolean branch = (valueStack.pop() <= valueStack.pop()); // ||
																					// (valueStack.pop()
																					// ==
																					// valueStack.pop()));
						int val = branch ? 1 : 0;
						valueStack.push(val);
					}

					else if (tokens[1].equals("NotEqual")) {
						boolean branch = valueStack.pop() != valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					}
				}

				if (line.startsWith("CONDITIONNOTTRUE") && valueStack.pop() == 0) {
					String[] tokens = line.split(" ");
					String label = tokens[2];
					int fl = 0;
					while ((line = bufferedReader.readLine()) != null && !(line.equals(label) && c == 0)) {
						if (line.equals(label) & fl == 0)
							break;
						else if (line.contains("JUMP " + label)) {
							c = 1;
							fl = 1;
						} else if (line.equals(label))
							c = 0;
					}

					// skip lines
				}

				if (line.startsWith("JUMP ")) {
					String[] tokens = line.split(" ");
					String label = tokens[1];
					while (!(bufferedReader.readLine().contains(label))) {
						// skip lines
					}

				}

				if (line.startsWith("JUMPBACK")) {
					fileReader.close();

					String[] tokens = line.split(" ");
					String label = tokens[1];
					// fileReader.reset();
					fileName = "/Users/ishandikshit/ser_new/SER502--Spring2017-Team16/Bagel/target/generated-sources/antlr4/IntermediateCode.bgi";
					fileReader = null;
					try {
						fileReader = new FileReader(fileName);

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println("Error Reading the Intermediate code file");
						e.printStackTrace();
					}
					bufferedReader = new BufferedReader(fileReader);
					while (!(bufferedReader.readLine().contains(label))) {
						// skip lines
					}
				}

				if (line.startsWith("PRINT ")) {
					String[] tokens = line.split(" ");

					if (map.containsKey(tokens[1]))
						System.out.println(map.get(tokens[1]));
					else if (tokens[1].startsWith("\""))
						System.out.println(tokens[1].replaceAll("\"", ""));
					else {
						System.out.println("Invalid Identifier");
					}

				}

				// System.out.println(map);
				// System.out.println(valueStack);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}import java.io.BufferedReader;
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
		int c = -1;
		String currDIr = System.getProperty("user.dir");
		String fileName = currDIr + "/Samples/IntermediateCode/IntermediateCode.bgi";
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
					if (tokens[1].equals("True"))
						valueStack.push(1);
					else if (tokens[1].equals("False"))
						valueStack.push(0);
					else
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
						result = valueStack.pop() - result;
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
						boolean branch = valueStack.pop() < valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					} else if (tokens[1].equals("LessThan")) {
						boolean branch = valueStack.pop() > valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					} else if (tokens[1].equals("Equals")) {
						boolean branch = valueStack.pop() == valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					}

					else if (tokens[1].equals("LessThanEqual")) {
						boolean branch = (valueStack.pop() >= valueStack.pop());// ||
																				// valueStack.pop()
																				// valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					}

					else if (tokens[1].equals("GreaterThanEqual")) {
						boolean branch = (valueStack.pop() <= valueStack.pop()); // ||
																					// (valueStack.pop()
																					// ==
																					// valueStack.pop()));
						int val = branch ? 1 : 0;
						valueStack.push(val);
					}

					else if (tokens[1].equals("NotEqual")) {
						boolean branch = valueStack.pop() != valueStack.pop();
						int val = branch ? 1 : 0;
						valueStack.push(val);
					}
				}

				if (line.startsWith("CONDITIONNOTTRUE") && valueStack.pop() == 0) {
					String[] tokens = line.split(" ");
					String label = tokens[2];
					int fl = 0;
					while ((line = bufferedReader.readLine()) != null && !(line.equals(label) && c == 0)) {
						if (line.equals(label) & fl == 0)
							break;
						else if (line.contains("JUMP " + label)) {
							c = 1;
							fl = 1;
						} else if (line.equals(label))
							c = 0;
					}

					// skip lines
				}

				if (line.startsWith("JUMP ")) {
					String[] tokens = line.split(" ");
					String label = tokens[1];
					while (!(bufferedReader.readLine().contains(label))) {
						// skip lines
					}

				}

				if (line.startsWith("JUMPBACK")) {
					fileReader.close();

					String[] tokens = line.split(" ");
					String label = tokens[1];
					// fileReader.reset();
					fileName = "/Users/ishandikshit/ser_new/SER502--Spring2017-Team16/Bagel/target/generated-sources/antlr4/IntermediateCode.bgi";
					fileReader = null;
					try {
						fileReader = new FileReader(fileName);

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println("Error Reading the Intermediate code file");
						e.printStackTrace();
					}
					bufferedReader = new BufferedReader(fileReader);
					while (!(bufferedReader.readLine().contains(label))) {
						// skip lines
					}
				}

				if (line.startsWith("PRINT ")) {
					String[] tokens = line.split(" ");

					if (map.containsKey(tokens[1]))
						System.out.println(map.get(tokens[1]));
					else if (tokens[1].startsWith("\""))
						System.out.println(tokens[1].replaceAll("\"", ""));
					else {
						System.out.println("Invalid Identifier");
					}

				}

				

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
