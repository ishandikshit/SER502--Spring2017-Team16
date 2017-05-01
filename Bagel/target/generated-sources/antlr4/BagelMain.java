import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class BagelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// FileInputStream fis = new FileInputStream(args[0]);
		String currDIr = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(currDIr + "/Samples/BagelCode/code_add.bg");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
		// System.out.println("-----------CODE STsART-----------");
		String line = "";
		// while ((line = br.readLine()) != null)
		// System.out.println(line);
		// System.out.println("-------------CODE END------------");
		CharStream input = CharStreams.fromStream(fis);
		BagelLexer lexer = new BagelLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		BagelParser parser = new BagelParser(tokens);
		parser.addParseListener(new NewBagelListener());
		parser.program();
		BagelRuntime.main(args);
		System.out.println("Success!");
	}
}

