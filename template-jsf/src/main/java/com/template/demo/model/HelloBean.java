package com.template.demo.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 1) Take JRE from JDK an set as predefined:
 * 	https://www.baeldung.com/maven-eclipse-jdk-configuration
 * 2) Jetty Eclipse plugin 6.1.26 was running but it didn't find my managed beans
 *	https://stackoverflow.com/questions/30128395/identifying-and-solving-javax-el-propertynotfoundexception-target-unreachable 
 * 3) in another tutorial says it was needed to include
 * this context param org.apache.myfaces.annotation.SCAN_PACKAGES
 * <description>Defines which packages to scan for beans, separated by commas.
 * Useful for when using maven and jetty:run (version 6) or tomcat:run</description>
 * as it seems Jetty dont look in proper target/classes folder
 * https://mkyong.com/jsf2/jsf-2-0-hello-world-example/
 * 4) I investigate what about that param and found some more steps (param + listener + myfaces instead mojarra)
 * 	https://stackoverflow.com/questions/21673480/maven-jsf-2-0-doesnt-work-on-embedded-tomcat  
 * 
 * 5) I tested to upgrade MyFaces version but didn't work
 * 	my-faces 2.3.18 >> java.lang.NoClassDefFoundError: javax/websocket/DeploymentException 
 *	my-faces 2.3.18 >> deprecated @ManagedBeans 
 *	my-faces 3.0.0 >> java.lang.ClassNotFoundException: org.apache.myfaces.webapp.StartupServletContextListener 
 *	my-faces 3.0.0 >> java.lang.ClassNotFoundException: javax.faces.webapp.FacesServlet
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
