package com.san.lib.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by test on 18/3/26.
 */

public class Observable<T> {
	List<IObserver<T>> mIObservers = new ArrayList<IObserver<T>>();

	public void register(IObserver<T> IObserver){
		if(IObserver == null){
			throw new NullPointerException("observer == null");
		}
		synchronized (this){
			if(!mIObservers.contains(IObserver)){
				mIObservers.add(IObserver);
			}
		}
	}

	public synchronized void unregister(IObserver<T> IObserver){
		mIObservers.remove(IObserver);
	}

	public void notifyObservers(T data){
		for(IObserver<T> IObserver : mIObservers){
			IObserver.onUpdate(this,data);
		}
	}
}
