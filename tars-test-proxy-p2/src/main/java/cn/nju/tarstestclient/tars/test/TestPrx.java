// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package cn.nju.tarstestclient.tars.test;

import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.annotation.*;
import com.qq.tars.common.support.Holder;

@Servant
public interface TestPrx {

	public String testString(String msg);

	public String testString(String msg, @TarsContext java.util.Map<String, String> ctx);

	public void async_testString(@TarsCallback TestPrxCallback callback, String msg);

	public void async_testString(@TarsCallback TestPrxCallback callback, String msg, @TarsContext java.util.Map<String, String> ctx);

	public String testB2S(String msg);

	public String testB2S(String msg, @TarsContext java.util.Map<String, String> ctx);

	public void async_testB2S(@TarsCallback TestPrxCallback callback, String msg);

	public void async_testB2S(@TarsCallback TestPrxCallback callback, String msg, @TarsContext java.util.Map<String, String> ctx);

	public String testS2B(String msg);

	public String testS2B(String msg, @TarsContext java.util.Map<String, String> ctx);

	public void async_testS2B(@TarsCallback TestPrxCallback callback, String msg);

	public void async_testS2B(@TarsCallback TestPrxCallback callback, String msg, @TarsContext java.util.Map<String, String> ctx);
}
