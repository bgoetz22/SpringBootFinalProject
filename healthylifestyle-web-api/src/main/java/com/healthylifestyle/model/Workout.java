package com.healthylifestyle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "workout")
public class Workout {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int  id;
	
	@Column(name="app_user_id")
	private int appUserId;
	
	@Column(name="sets_qty")
	private int setsQty;
	
	@Column(name="reps_qty")
	private int repsQty;
	
	@Column(name="date_completed")
	private java.sql.Date dateCompleted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(int appUserId) {
		this.appUserId = appUserId;
	}

	public int getSetsQty() {
		return setsQty;
	}

	public void setSetsQty(int setsQty) {
		this.setsQty = setsQty;
	}

	public int getRepsQty() {
		return repsQty;
	}

	public void setRepsQty(int repsQty) {
		this.repsQty = repsQty;
	}

	public java.sql.Date getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(java.sql.Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

}
