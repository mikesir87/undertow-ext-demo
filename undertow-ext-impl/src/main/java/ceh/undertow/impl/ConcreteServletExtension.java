package ceh.undertow.impl;
import io.undertow.servlet.ServletExtension;
import io.undertow.servlet.api.DeploymentInfo;

import javax.servlet.ServletContext;


public class ConcreteServletExtension implements ServletExtension {

  @Override
  public void handleDeployment(DeploymentInfo info, ServletContext context) {
    System.out.println("HOORAY!!!!!! handling deployment for " + context.getContextPath());
  }

}
