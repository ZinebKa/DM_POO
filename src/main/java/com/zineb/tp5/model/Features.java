package com.zineb.tp5.model;

public class Features {
	private String type;
	Geometry GeometryObject;
	Properties PropertiesObject;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Geometry getGeometryObject() {
		return GeometryObject;
	}
	public void setGeometryObject(Geometry geometryObject) {
		GeometryObject = geometryObject;
	}
	public Properties getPropertiesObject() {
		return PropertiesObject;
	}
	public void setPropertiesObject(Properties propertiesObject) {
		PropertiesObject = propertiesObject;
	}


}
