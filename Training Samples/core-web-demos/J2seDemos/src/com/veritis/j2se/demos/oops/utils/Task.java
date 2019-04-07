package com.veritis.j2se.demos.oops.utils;

public class Task {
	int taskid;
	String taskname;
	int duration;
	int overduedays;

	public Task(int taskid, String taskname, int duration, int overduedays) {
		super();
		this.taskid = taskid;
		this.taskname = taskname;
		this.duration = duration;
		this.overduedays = overduedays;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getOverduedays() {
		return overduedays;
	}

	public void setOverduedays(int overduedays) {
		this.overduedays = overduedays;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return taskid+" "+taskname+" "+duration+" "+overduedays;
	}
}
