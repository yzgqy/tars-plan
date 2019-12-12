// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.mytars.petclinic.visitsserver.tars.visits;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class Visit {

	@TarsStructProperty(order = 0, isRequire = false)
	public int id = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public String date = "";
	@TarsStructProperty(order = 2, isRequire = false)
	public String description = "";
	@TarsStructProperty(order = 3, isRequire = false)
	public int petId = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public Visit() {
	}

	public Visit(int id, String date, String description, int petId) {
		this.id = id;
		this.date = date;
		this.description = description;
		this.petId = petId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(id);
		result = prime * result + TarsUtil.hashCode(date);
		result = prime * result + TarsUtil.hashCode(description);
		result = prime * result + TarsUtil.hashCode(petId);
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
		if (!(obj instanceof Visit)) {
			return false;
		}
		Visit other = (Visit) obj;
		return (
			TarsUtil.equals(id, other.id) &&
			TarsUtil.equals(date, other.date) &&
			TarsUtil.equals(description, other.description) &&
			TarsUtil.equals(petId, other.petId)
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(id, 0);
		if (null != date) {
			_os.write(date, 1);
		}
		if (null != description) {
			_os.write(description, 2);
		}
		_os.write(petId, 3);
	}


	public void readFrom(TarsInputStream _is) {
		this.id = _is.read(id, 0, false);
		this.date = _is.readString(1, false);
		this.description = _is.readString(2, false);
		this.petId = _is.read(petId, 3, false);
	}

}
