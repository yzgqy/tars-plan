// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package cn.nju.myproxy.tars.prime;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class PrimeData {

	@TarsStructProperty(order = 0, isRequire = false)
	public int x = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public int y = 0;
	@TarsStructProperty(order = 2, isRequire = false)
	public int z = 0;
	@TarsStructProperty(order = 3, isRequire = false)
	public int sum = 0;
	@TarsStructProperty(order = 4, isRequire = false)
	public boolean myIsPrime = false;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public boolean getMyIsPrime() {
		return myIsPrime;
	}

	public void setMyIsPrime(boolean myIsPrime) {
		this.myIsPrime = myIsPrime;
	}

	public PrimeData() {
	}

	public PrimeData(int x, int y, int z, int sum, boolean myIsPrime) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.sum = sum;
		this.myIsPrime = myIsPrime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(x);
		result = prime * result + TarsUtil.hashCode(y);
		result = prime * result + TarsUtil.hashCode(z);
		result = prime * result + TarsUtil.hashCode(sum);
		result = prime * result + TarsUtil.hashCode(myIsPrime);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PrimeData)) {
			return false;
		}
		PrimeData other = (PrimeData) obj;
		return (
			TarsUtil.equals(x, other.x) &&
			TarsUtil.equals(y, other.y) &&
			TarsUtil.equals(z, other.z) &&
			TarsUtil.equals(sum, other.sum) &&
			TarsUtil.equals(myIsPrime, other.myIsPrime) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(x, 0);
		_os.write(y, 1);
		_os.write(z, 2);
		_os.write(sum, 3);
		_os.write(myIsPrime, 4);
	}


	public void readFrom(TarsInputStream _is) {
		this.x = _is.read(x, 0, false);
		this.y = _is.read(y, 1, false);
		this.z = _is.read(z, 2, false);
		this.sum = _is.read(sum, 3, false);
		this.myIsPrime = _is.read(myIsPrime, 4, false);
	}

}
