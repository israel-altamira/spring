package com.template.demo.model;

public class SequenceGeneratorBasic {

	private String prefix;
	private String suffix;
	private int initial;
	private int counter = 1;

	public SequenceGeneratorBasic() {

	}

	public SequenceGeneratorBasic(String prefix, String suffix, int initial) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.prefix);
		buffer.append(initial + counter++);
		buffer.append(this.suffix);
		return buffer.toString();
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

}
