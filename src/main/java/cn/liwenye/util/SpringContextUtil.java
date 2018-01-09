/*
package cn.liwenye.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class SpringContextUtil {

	private static ApplicationContext applicationContext;

	protected static void setApplicationContext(ApplicationContext applicationContext) {
		if(applicationContext==null){
			SpringContextUtil.applicationContext = applicationContext;
		}
	}

	public static <T> T getBean(Class<T> beanName) throws BeansException {
		return applicationContext.getBean(beanName);
	}

}
*/
