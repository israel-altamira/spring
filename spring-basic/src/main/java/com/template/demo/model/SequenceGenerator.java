package com.template.demo.model;

public class SequenceGenerator {

	private ValueGenerator prefix; // por mapa
	private ValueGenerator suffix; // por lista
	private ValueGenerator valueA; // por Set
	private ValueGenerator valueB; // por arreglo
	private ValueGenerator valueC; // por properties
	private int initial;
	private int counter = 1;

	public SequenceGenerator() {

	}

	public SequenceGenerator(ValueGenerator prefix, ValueGenerator suffix, ValueGenerator valueA, ValueGenerator valueB,
			ValueGenerator valueC) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.valueA = valueA;
		this.valueB = valueB;
		this.valueC = valueC;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.prefix.getValue());
		buffer.append(initial + counter++);
		buffer.append(this.valueA.getValue());
		buffer.append(this.valueB.getValue());
		buffer.append(this.valueC.getValue());
		buffer.append(this.suffix.getValue());
		return buffer.toString();
	}

	public void setPrefix(ValueGenerator prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(ValueGenerator suffix) {
		this.suffix = suffix;
	}

	public void setValueA(ValueGenerator valueA) {
		this.valueA = valueA;
	}

	public void setValueC(ValueGenerator valueC) {
		this.valueC = valueC;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public void setValueB(ValueGenerator valueB) {
		this.valueB = valueB;
	}

}
