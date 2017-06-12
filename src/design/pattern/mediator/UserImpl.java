package design.pattern.mediator;

public class UserImpl extends User {

	public UserImpl(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(this.name + ": Sending Message :" + message);
		this.chatMediator.sendMessage(message, this);

	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(this.name + ": Received Message:" + message);
	}

}
