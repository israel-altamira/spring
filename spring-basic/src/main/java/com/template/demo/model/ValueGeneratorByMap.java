package com.template.demo.model;

import java.util.Map;
import java.util.Map.Entry;

public class ValueGeneratorByMap implements ValueGenerator {

	public Map<Object, Object> value;
	private Map<Object, Object> nullable;

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
		if (nullable.isEmpty()) {
			System.out.println("Nullable as expected.");
		}
		return str.toString();
	}

	public void setValue(Map<Object, Object> value) {
		this.value = value;
	}

	public void setNullable(Map<Object, Object> nullable) {
		this.nullable = nullable;
	}
}
