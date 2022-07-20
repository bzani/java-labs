package com.bzani.labs.objs;

import java.util.Objects;

public class SimplePojo {

	//fields
	int rawInteger;
	double rawDouble;
	float rawFloat;
	boolean rawBoolean;
	
	Integer oInteger;
	Double oDouble;
	Float oFloat;
	Boolean oBoolean;
	
	String string;
	Object object;
	
	//constructors
	public SimplePojo() {
		super();
	}
	public SimplePojo(int rawInteger, double rawDouble, float rawFloat, boolean rawBoolean, Integer oInteger, Double oDouble,
			Float oFloat, Boolean oBoolean, String string, Object object) {
		super();
		this.rawInteger = rawInteger;
		this.rawDouble = rawDouble;
		this.rawFloat = rawFloat;
		this.rawBoolean = rawBoolean;
		this.oInteger = oInteger;
		this.oDouble = oDouble;
		this.oFloat = oFloat;
		this.oBoolean = oBoolean;
		this.string = string;
		this.object = object;
	}

	//getters, setters
	public int getRawInteger() {
		return rawInteger;
	}
	public void setRawInteger(int rawInteger) {
		this.rawInteger = rawInteger;
	}
	public double getRawDouble() {
		return rawDouble;
	}
	public void setRawDouble(double rawDouble) {
		this.rawDouble = rawDouble;
	}
	public float getRawFloat() {
		return rawFloat;
	}
	public void setRawFloat(float rawFloat) {
		this.rawFloat = rawFloat;
	}
	public boolean isRawBoolean() {
		return rawBoolean;
	}
	public void setRawBoolean(boolean rawBoolean) {
		this.rawBoolean = rawBoolean;
	}
	public Integer getoInteger() {
		return oInteger;
	}
	public void setoInteger(Integer oInteger) {
		this.oInteger = oInteger;
	}
	public Double getoDouble() {
		return oDouble;
	}
	public void setoDouble(Double oDouble) {
		this.oDouble = oDouble;
	}
	public Float getoFloat() {
		return oFloat;
	}
	public void setoFloat(Float oFloat) {
		this.oFloat = oFloat;
	}
	public Boolean getoBoolean() {
		return oBoolean;
	}
	public void setoBoolean(Boolean oBoolean) {
		this.oBoolean = oBoolean;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	@Override
	public int hashCode() {
		return Objects.hash(oBoolean, oDouble, oFloat, oInteger, object, rawBoolean, rawDouble, rawFloat, rawInteger,
				string);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimplePojo other = (SimplePojo) obj;
		return Objects.equals(oBoolean, other.oBoolean) && Objects.equals(oDouble, other.oDouble)
				&& Objects.equals(oFloat, other.oFloat) && Objects.equals(oInteger, other.oInteger)
				&& Objects.equals(object, other.object) && rawBoolean == other.rawBoolean
				&& Double.doubleToLongBits(rawDouble) == Double.doubleToLongBits(other.rawDouble)
				&& Float.floatToIntBits(rawFloat) == Float.floatToIntBits(other.rawFloat)
				&& rawInteger == other.rawInteger && Objects.equals(string, other.string);
	}
	@Override
	public String toString() {
		return "Pojo [rawInteger=" + rawInteger + ", rawDouble=" + rawDouble + ", rawFloat=" + rawFloat
				+ ", rawBoolean=" + rawBoolean + ", oInteger=" + oInteger + ", oDouble=" + oDouble + ", oFloat="
				+ oFloat + ", oBoolean=" + oBoolean + ", string=" + string + ", object=" + object + "]";
	}
}
