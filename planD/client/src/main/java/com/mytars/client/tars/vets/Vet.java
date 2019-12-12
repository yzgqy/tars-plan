// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.mytars.client.tars.vets;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class Vet {

	@TarsStructProperty(order = 0, isRequire = false)
	public int id = 0;
	@TarsStructProperty(order = 1, isRequire = false)
	public String firstName = "";
	@TarsStructProperty(order = 2, isRequire = false)
	public String lastName = "";
	@TarsStructProperty(order = 3, isRequire = false)
	public java.util.List<Specialty> specialties = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public java.util.List<Specialty> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(java.util.List<Specialty> specialties) {
		this.specialties = specialties;
	}

	public Vet() {
	}

	public Vet(int id, String firstName, String lastName, java.util.List<Specialty> specialties) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialties = specialties;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(id);
		result = prime * result + TarsUtil.hashCode(firstName);
		result = prime * result + TarsUtil.hashCode(lastName);
		result = prime * result + TarsUtil.hashCode(specialties);
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
		if (!(obj instanceof Vet)) {
			return false;
		}
		Vet other = (Vet) obj;
		return (
			TarsUtil.equals(id, other.id) &&
			TarsUtil.equals(firstName, other.firstName) &&
			TarsUtil.equals(lastName, other.lastName) &&
			TarsUtil.equals(specialties, other.specialties) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(id, 0);
		if (null != firstName) {
			_os.write(firstName, 1);
		}
		if (null != lastName) {
			_os.write(lastName, 2);
		}
		if (null != specialties) {
			_os.write(specialties, 3);
		}
	}

	static java.util.List<Specialty> cache_specialties;
	static { 
		cache_specialties = new java.util.ArrayList<Specialty>();
		Specialty var_1 = new Specialty();
		cache_specialties.add(var_1);
	}

	public void readFrom(TarsInputStream _is) {
		this.id = _is.read(id, 0, false);
		this.firstName = _is.readString(1, false);
		this.lastName = _is.readString(2, false);
		this.specialties = (java.util.List<Specialty>) _is.read(cache_specialties, 3, false);
	}

}
