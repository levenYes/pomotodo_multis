package cn.liwenye.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.annotation.PostConstruct;


@Configuration
public class FreeMarkerConfig {

	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;
	
	@PostConstruct
	public void setCustomTag(){
//		freeMarkerConfigurer.getConfiguration().setSharedVariable("shiro", new ShiroTags());
	}
}
