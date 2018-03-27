package com.san.lib.design.proxy.test;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/**
 * Created by test on 18/3/27.
 */

public interface IBank extends IInterface {
	static final String DESCRIPTOR = "com.san.lib.design.proxy.test.IBank";
	static final int TRANSACTION_queryMoney = (IBinder.FIRST_CALL_TRANSACTION + 0);
	public long queryMoney(int uid) throws RemoteException;
}

