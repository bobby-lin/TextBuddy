import java.io.IOException;

/**
 * This is a client class for TextBuddy program.
 * @author Lin Jiahao Bobby, Group F10-1J
 */

public class TextBuddy {

	public static void main(String[] args) throws IOException  {
		TextBuddyService session = new TextBuddyService(args);
		while(true) {
			session.runProgram();
		}
	}

}