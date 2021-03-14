package com.template.demo.model;

import java.util.Set;

public class ValueGeneratorBySet implements ValueGenerator {

	public Set<Object> value;

	public Object getValue() {
		StringBuffer str = new StringBuffer();
		if (!this.value.isEmpty()) {
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

	public void setValue(Set<Object> value) {
		this.value = value;
	}
}
