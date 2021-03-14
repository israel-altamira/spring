package com.template.demo.model;

import java.util.List;

public class ValueGeneratorByList implements ValueGenerator {

	public List<Object> value;

	public Object getValue() {
		StringBuffer str = new StringBuffer();
		if (!this.value.isEmpty()) {
			str.append("-");
			for (Object x : this.value) {
				if(x != null) {
					str.append(x.toString());
					str.append("-");
				}
			}
		}
		return str.toString();
	}

	public void setValue(List<Object> value) {
		this.value = value;
	}
}
