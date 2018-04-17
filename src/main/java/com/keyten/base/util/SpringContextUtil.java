package com.keyten.base.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextUtil implements ApplicationContextAware {  
	  private ApplicationContext applicationContext;     //Spring应用上下文环境  
	   
	  /** 
	  * 实现ApplicationContextAware接口的回调方法，设置上下文环境    
	  * @param applicationContext 
	  * @throws BeansException 
	  */  
	  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {  
	    this.applicationContext = applicationContext;  
	  }  
	   
	  /** 
	  * @return ApplicationContext 
	  */  
	  public ApplicationContext getApplicationContext() {  
	    return this.applicationContext;  
	  }  
	   
	  /** 
	  * 获取对象    
	  * @param name 
	  * @return Object 一个以所给名字注册的bean的实例 
	  * @throws BeansException 
	  */  
	  public Object getBean(String name) throws BeansException {  
	    return this.applicationContext.getBean(name);  
	  }
	}
