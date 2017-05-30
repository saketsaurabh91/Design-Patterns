package design.pattern.proxy;

import java.io.IOException;

public class ProxyPatternDemo {
	public static void main(String[] args) {

		CommandExecutorProxy cproxy = new CommandExecutorProxy("Saket", "dmin001");
		try {
			cproxy.runCommand("ls -ltr");
			cproxy.runCommand("rm -rf test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
