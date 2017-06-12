package design.pattern.mediator;

public abstract class User {

	public ChatMediator chatMediator;
	public String name;

	public User(ChatMediator chatMediator, String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}

	public abstract void sendMessage(String message);

	public abstract void receiveMessage(String message);

}
