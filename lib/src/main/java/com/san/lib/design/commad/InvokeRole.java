package com.san.lib.design.commad;

public class InvokeRole{
	private ICommand command0;
	private ICommand command1;

	public void setCommand0(ICommand command0) {
		this.command0 = command0;
	}

	public void setCommand1(ICommand command1) {
		this.command1 = command1;
	}

	public void invoke(int args){
		if(args == 0){
			command0.execute();
			command1.execute();
		}else{
			command0.undo();
			command1.undo();
		}
	}
}

