package com.san.lib.design.commad;

public class ConcreteCommandImpl1 implements ICommand{
	private ReceiverRole receiverRole;

	public ConcreteCommandImpl1(ReceiverRole receiverRole) {
		this.receiverRole = receiverRole;
	}

	@Override
	public void execute() {
		this.receiverRole.actionUpdateName("xinmingzi");
	}

	@Override
	public void undo() {
		this.receiverRole.rollBackName();
	}

	@Override
	public void redo() {

	}
}
