package com.devhabit.java.sorting;
/**
 * @author bhavesh bhatt
 *
 */
public class Player {
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((runs == null) ? 0 : runs.hashCode());
		result = prime * result + ((wickets == null) ? 0 : wickets.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (runs == null) {
			if (other.runs != null)
				return false;
		} else if (!runs.equals(other.runs))
			return false;
		if (wickets == null) {
			if (other.wickets != null)
				return false;
		} else if (!wickets.equals(other.wickets))
			return false;
		return true;
	}
	public Player(String name, Integer wickets, Integer runs) {
		super();
		this.name = name;
		this.wickets = wickets;
		this.runs = runs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWickets() {
		return wickets;
	}
	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}
	public Integer getRuns() {
		return runs;
	}
	public void setRuns(Integer runs) {
		this.runs = runs;
	}
	String name;
	Integer wickets;
	Integer runs;
	
}
