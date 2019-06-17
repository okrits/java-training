package de.abas.training.java.lk;

public class Kunde {
	String name;
	String nachname;

	public Kunde(String name, String nachname) {
		super();
		this.name = name;
		this.nachname = nachname;
	}

	public String getName() {
		return name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
}