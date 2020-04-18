package com.coviddata.model;

public class StateCovidVO {
	public int active;
	public int confirmed;
	public int deaths;
	public int deltaconfirmed;
	public int deltadeaths;
	public int deltarecovered;
	public int recovered;
	public String state;
	public String statecode;
	public String lastupdatedtime;
	
	public StateCovidVO() {
		// TODO Auto-generated constructor stub
	}
	
	public StateCovidVO(int active, int confirmed, int deaths, int deltaconfirmed, int deltadeaths, int deltarecovered,
			int recovered, String state, String statecode, String lastupdatedtime) {
		super();
		this.active = active;
		this.confirmed = confirmed;
		this.deaths = deaths;
		this.deltaconfirmed = deltaconfirmed;
		this.deltadeaths = deltadeaths;
		this.deltarecovered = deltarecovered;
		this.recovered = recovered;
		this.state = state;
		this.statecode = statecode;
		this.lastupdatedtime = lastupdatedtime;
	}



	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getDeltaconfirmed() {
		return deltaconfirmed;
	}

	public void setDeltaconfirmed(int deltaconfirmed) {
		this.deltaconfirmed = deltaconfirmed;
	}

	public int getDeltadeaths() {
		return deltadeaths;
	}

	public void setDeltadeaths(int deltadeaths) {
		this.deltadeaths = deltadeaths;
	}

	public int getDeltarecovered() {
		return deltarecovered;
	}

	public void setDeltarecovered(int deltarecovered) {
		this.deltarecovered = deltarecovered;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getLastupdatedtime() {
		return lastupdatedtime;
	}

	public void setLastupdatedtime(String lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}

}
