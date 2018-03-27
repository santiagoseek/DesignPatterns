package com.san.lib.design.commad;

public class ConcreteCommandImpl0 implements ICommand{

	private ReceiverRole receiverRole0;

	public ConcreteCommandImpl0(ReceiverRole receiverRole0) {
		this.receiverRole0 = receiverRole0;
	}

	@Override
	public void execute() {
		this.receiverRole0.actionUpdateAge(101);
	}

	@Override
	public void undo() {
		this.receiverRole0.rollBackAge();
	}

	@Override
	public void redo() {

	}
}

