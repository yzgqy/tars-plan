// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package cn.nju.multiplication.tars.proxy.random;

import cn.nju.multiplication.tars.multiply.Response;
import com.qq.tars.rpc.protocol.tars.support.TarsAbstractCallback;

public abstract class RandomResourcePrxCallback extends TarsAbstractCallback {

	public abstract void callback_getRandomData(Response ret, RandomData dataOut);

}