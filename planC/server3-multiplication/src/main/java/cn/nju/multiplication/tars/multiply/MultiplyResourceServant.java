// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package cn.nju.multiplication.tars.multiply;

import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.annotation.*;
import com.qq.tars.common.support.Holder;

@Servant
public interface MultiplyResourceServant {

	public Response doMultiply(@TarsHolder Holder<MultiplyData> dataOut);
}