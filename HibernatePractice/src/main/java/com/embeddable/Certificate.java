package com.embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String duration;
	private String courseName;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Certificate [duration=" + duration + ", courseName=" + courseName + "]";
	}
}