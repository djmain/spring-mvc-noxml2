package com.mvc.init;

import com.mvc.config.RootConfig;
import com.mvc.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * created by Jay on 2019/6/17
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };        //ָ指定Web配置类
    }

    @Override
    protected String[] getServletMappings() {    //将DispatcherServlet映射到"/"
        return new String[] { "/" };
    }

}
