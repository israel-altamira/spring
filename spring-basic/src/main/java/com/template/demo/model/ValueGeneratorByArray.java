package com.template.demo.model;

public class ValueGeneratorByArray implements ValueGenerator {

	public Object[] value;

	public Object getValue() {
		StringBuffer str = new StringBuffer();
		if (this.value.length > 0) {
			str.append("-");
			for (Object x : this.value) {
				if (x != null) {
					str.append(x.toString());
					str.append("-");
				}
			}
		}
		return str.toString();
	}

	public void setValue(Object[] value) {
		this.value = value;
	}
}
