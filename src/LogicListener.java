import org.antlr.v4.runtime.tree.TerminalNode;

public class LogicListener extends LogicLaTeXBaseListener {

	private final StringBuilder builder;
	
	public LogicListener(StringBuilder className) {
		this.builder = className;
	}
	

	@Override public void visitTerminal(TerminalNode node) { 
		String l_txt = node.getText();
		switch (l_txt) {
        case "\\documentclass{article} \\begin{document} $":  
        		break;
        case "$ \\end{document}":
                break;
        case "\\exists!":
        		builder.append("∃!");
                break;
        case "\\exists":
        		builder.append("∃");
        		break;
        case "\\forall":
    			builder.append("∀");
    			break;
        case "\\neg":
    			builder.append("¬");
    			break;
        case "\\Box":
    			builder.append("#");
    			break;
        case "\\Diamond":
    			builder.append("♦");
    			break; 
        case "\\lor":
				builder.append("∨");
				break;
        case "\\land":
				builder.append("∧");
				break;
        case "\\implies":
				builder.append("⇒");
				break;
	    case "\\iff":
				builder.append("⇔");
				break;
	    case "<EOF>":
	    		break;
        default:
        		builder.append(node.getText());
		}
                	
	}

	
	
}
