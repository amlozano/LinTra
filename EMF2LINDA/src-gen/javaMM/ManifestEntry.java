package javaMM;

import java.io.Serializable;

public class ManifestEntry implements Serializable {

	private static final long serialVersionUID = 1L;

	String id;

	String name;

	String[] attributesID;
	Boolean attributesIsComposed = true;

	public ManifestEntry() {
	}

	public ManifestEntry(String id, String name, String[] attributesID) {
		super();

		this.id = id;

		this.name = name;

		this.attributesID = attributesID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAttributes(String[] attributesID) {
		this.attributesID = attributesID;
	}

	public String[] getAttributes() {
		return attributesID;
	}

}