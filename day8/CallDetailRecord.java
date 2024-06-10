package com.ey.day8;

import java.io.Serializable;

public class CallDetailRecord implements Serializable {
	int fnumber;
	int tnumber;
	float duration;
	float charge;
	public CallDetailRecord(int fnumber, int tnumber, float duration, float charge) {
		super();
		this.fnumber = fnumber;
		this.tnumber = tnumber;
		this.duration = duration;
		this.charge = charge;
	}
	public int getFnumber() {
		return fnumber;
	}
	public void setFnumber(int fnumber) {
		this.fnumber = fnumber;
	}
	public int getTnumber() {
		return tnumber;
	}
	public void setTnumber(int tnumber) {
		this.tnumber = tnumber;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public float getCharge() {
		return charge;
	}
	public void setCharge(float charge) {
		this.charge = charge;
	}
	@Override
	public String toString() {
		return "CallDetailRecord [fnumber=" + fnumber + ", tnumber=" + tnumber + ", duration=" + duration + ", charge="
				+ charge + "]";
	}
	

}
