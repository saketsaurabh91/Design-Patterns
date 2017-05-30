package design.pattern.proxy;

import java.io.IOException;

public class ExceutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException {

		// Assume critical operation here

		Runtime run = Runtime.getRuntime();
		run.exec(cmd);
        System.out.println("'" + cmd + "'" + " executed");
	}

}
