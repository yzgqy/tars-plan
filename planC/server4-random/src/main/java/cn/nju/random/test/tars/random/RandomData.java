// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package cn.nju.random.test.tars.random;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class RandomData {

	@TarsStructProperty(order = 0, isRequire = false)
	public int x = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public int y = 0;

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

	public RandomData() {
	}

	public RandomData(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(x);
		result = prime * result + TarsUtil.hashCode(y);
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
		if (!(obj instanceof RandomData)) {
			return false;
		}
		RandomData other = (RandomData) obj;
		return (
			TarsUtil.equals(x, other.x) &&
			TarsUtil.equals(y, other.y) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(x, 0);
		_os.write(y, 1);
	}


	public void readFrom(TarsInputStream _is) {
		this.x = _is.read(x, 0, false);
		this.y = _is.read(y, 1, false);
	}

}