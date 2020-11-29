package com.design.usecases;

import java.time.Instant;

public class Organization {

	enum Role {
		SECRETARY, MANAGER, DIRECTOR
	}

	class Call {
		String from;
		Role to;
		boolean answered = false;
		Instant date = null;
	}

	abstract class Receiver {
		String name;
		Role role;
		Receiver receiver;

		void escalate(Call call) throws Exception {
			if (this.receiver != null) {
				this.receiver.answer(call);
			} else {
				throw new Exception("Call cannot be answered");
			}
		}

		void setReceiver(Receiver receiver) {
			this.receiver = receiver;
		}

		abstract void answer(Call call) throws Exception;
	}

	class Secretary extends Receiver {

		public Secretary(String name) {
			this.name = name;
			this.role = Role.SECRETARY;
		}

		@Override
		void answer(Call call) throws Exception {
			if (this.role.equals(call.to)) {
				call.answered = true;
			} else {
				escalate(call);
			}
		}
	}

}
