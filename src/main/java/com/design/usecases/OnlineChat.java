package com.design.usecases;

import java.time.Instant;
import java.util.List;

public class OnlineChat {

	enum Status {
		ONLINE, OFFLINE
	}

	enum MessageType {
		TEXT, VIDEO
	}

	class Group {
		String name;
	}

	class User {
		long id;
		String username;
		String fullName;
		Group group;
		Status status;
	}

	class Message {
		String id;
		int chatId;
		User from;
		User to;
		Instant date;
	}

	class TextMessage extends Message {
		String text;
	}

	class VideoMessage extends Message {
		String videoURL;
	}

	class Conversation {
		int chatId;
		String topic;
	}

	interface Repository<T> {
		List<T> find(Criteria<T> criteria);

		T save(T t);
	}

	interface Criteria<T> {

	}

	interface Mediator {
		boolean register(User user);

		void sendMessage(Message message);

		List<Message> getMessages(Criteria<Message> criteria);
	}

	class ChatMediator implements Mediator {

		Repository<Message> messageRepository;

		@Override
		public boolean register(User user) {
			return false;
		}

		@Override
		public void sendMessage(Message message) {
		}

		@Override
		public List<Message> getMessages(Criteria<Message> criteria) {
			return messageRepository.find(criteria);
		}

	}

}
