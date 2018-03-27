package com.san.lib.design.commad;

/**
 * Created by test on 18/3/27.
 */

public interface ICommand {
	public void execute();
	public void undo();
	public void redo();
}

