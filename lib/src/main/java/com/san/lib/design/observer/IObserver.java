package com.san.lib.design.observer;

/**
 * Created by test on 18/3/26.
 */

public interface IObserver<T> {
	void onUpdate(Observable<T> observable, T data);
}
