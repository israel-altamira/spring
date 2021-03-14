package com.template.demo.model;

import java.util.Map.Entry;
import java.util.Properties;

public class ValueGeneratorByProperties implements ValueGenerator {

	public Properties value;

	public Object getValue() {
		StringBuffer str = new StringBuffer();
		if (!this.value.isEmpty()) {
			str.append("-");
			for (Entry<Object, Object> x : this.value.entrySet()) {
				if (x != null) {
					str.append(x.getKey());
					str.append("@");
					str.append(x.getValue());
					str.append("-");
				}
			}
		}
		return str.toString();
	}

	public void setValue(Properties value) {
		this.value = value;
	}
}
