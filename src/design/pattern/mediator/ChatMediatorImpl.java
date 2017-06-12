package design.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	List<User> users;

	public ChatMediatorImpl() {
		users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User u : this.users) {
			if (u != user) {
				u.receiveMessage(message);
			}
		}

	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

}
