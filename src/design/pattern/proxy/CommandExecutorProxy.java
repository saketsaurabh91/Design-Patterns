package design.pattern.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {

	boolean isAdmin;
	CommandExecutor cmdExec;

	// constructor
	public CommandExecutorProxy(String username, String password) {
		if ("Saket".equalsIgnoreCase(username) && "admin001".equalsIgnoreCase(password)) {
			isAdmin = true;
		}
		// was worried for null pointer here
		cmdExec = new ExceutorImpl();

	}

	@Override
	public void runCommand(String cmd) throws IOException {
		// has limited privileges
		if (isAdmin) {
			cmdExec.runCommand(cmd);
		} else {
			if (cmd.startsWith("rm")) {
				throw new IOException("Non admin users not allowed to delete");
			} else {
				cmdExec.runCommand(cmd);
			}
		}

	}

}
