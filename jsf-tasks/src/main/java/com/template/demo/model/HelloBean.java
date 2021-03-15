package com.template.demo.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author israel altamira
 *
 */
@ManagedBean(name = "helloBean")
@SessionScoped()
public class HelloBean implements Serializable {

	private static final long serialVersionUID = -5721112286525164440L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
