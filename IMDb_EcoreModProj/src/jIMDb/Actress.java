package jIMDb;

import blackboard.IdentifiableElement;

import java.io.Serializable;
import java.util.Arrays;

public class Actress extends Person implements Serializable, IdentifiableElement {

	private static final long serialVersionUID = 1L;

	String id;
	
	String trgId;
	
	@Override
	public String getTrgId() {
		return trgId;
	}

	@Override
	public void setTrgId(String trgId) {
		this.trgId = trgId;
	}

	public Actress(String id, String[] moviesID, String name) {

		super(moviesID, name);

		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Actress [id=" + id + ", name=" + name
				+ ", moviesID=" + Arrays.toString(moviesID) + "]";
	}
}
