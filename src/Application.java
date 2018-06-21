import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public final class Application {
	
	public static void main(String[] args) throws IOException {
		
		//tutaj należy ustawić plik z kodem źródłowym
		File file = new File("test2.txt");
        String content = FileUtils.readFileToString(file,"UTF-8");
        System.out.println("To jest zawartość pliku:");
        System.out.println(content);

        LogicLaTeXLexer lexer = new LogicLaTeXLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LogicLaTeXParser parser = new LogicLaTeXParser(tokens);
        LogicLaTeXParser.ProgramContext tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();

        StringBuilder builder = new StringBuilder();
        LogicListener listener = new LogicListener(builder);
        walker.walk(listener,tree);
        System.out.println("A to zawartość buildera:");
        System.out.println(builder.toString());
        try (PrintWriter out = new PrintWriter("output.txt")) {
            out.println(builder.toString());
            System.out.println("Zawartość buildera została zapisana do pliku output.txt");
        }
}

    
}
