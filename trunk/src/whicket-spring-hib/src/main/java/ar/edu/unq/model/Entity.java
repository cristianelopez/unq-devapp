package ar.edu.unq.model;

import java.io.Serializable;

public abstract class Entity implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}
}
