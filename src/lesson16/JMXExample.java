package lesson16;

import java.io.IOException;
import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class JMXExample {
	public static void main(String[] args) throws MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException, IOException, InstanceNotFoundException {
	    final ObjectName 	objectName = new ObjectName("test:type=basic,name=example");
	    final MBeanServer 	server = ManagementFactory.getPlatformMBeanServer();
	    
	    server.registerMBean(new Test(), objectName);
	    
	    System.in.read();
	    server.unregisterMBean(objectName);
	}
}