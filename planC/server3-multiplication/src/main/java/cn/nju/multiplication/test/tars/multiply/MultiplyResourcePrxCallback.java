// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package cn.nju.multiplication.test.tars.multiply;

import cn.nju.multiplication.tars.multiply.MultiplyData;
import cn.nju.multiplication.tars.multiply.Response;
import com.qq.tars.rpc.protocol.tars.support.TarsAbstractCallback;

public abstract class MultiplyResourcePrxCallback extends TarsAbstractCallback {

	public abstract void callback_doMultiply(Response ret, MultiplyData dataOut);

}
