package com.template.demo.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 	my-faces 2.3.18 >> java.lang.NoClassDefFoundError: javax/websocket/DeploymentException 
	my-faces 2.3.18 >> deprecated @ManagedBeans 
 	my-faces 3.0.0 >> java.lang.ClassNotFoundException: org.apache.myfaces.webapp.StartupServletContextListener 
	my-faces 3.0.0 >> java.lang.ClassNotFoundException: javax.faces.webapp.FacesServlet
 * 
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
