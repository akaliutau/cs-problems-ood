package com.design.patterns.responsibilities;

public class LevelOne implements Receiver {
	
	private Receiver next;
	private boolean busy;
	
	public LevelOne(Receiver next) {
		this.next = next;
	}

	@Override
	public boolean handle(Issue issue) {
		if (!busy) {
			issue.setResolved(true);
			return true;
		}
		return next.handle(issue);
	}


}
