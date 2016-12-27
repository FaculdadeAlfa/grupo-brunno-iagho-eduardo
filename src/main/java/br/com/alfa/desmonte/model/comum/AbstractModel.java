package br.com.alfa.desmonte.model.comum;

import java.io.Serializable;

public abstract class AbstractModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public abstract Long getId();
}