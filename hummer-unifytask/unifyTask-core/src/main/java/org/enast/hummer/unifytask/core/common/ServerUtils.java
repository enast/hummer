package org.enast.hummer.unifytask.core.common;


import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.ServletContext;
/**
 * 获取服务信息工具类
 *
 * @author zhujinming6
 * @create 2019-10-12 16:47
 * @update 2019-10-12 16:47
 **/
public class ServerUtils{

    @Autowired
    private ServletContext servletContext;

    public String getContextPath() {
        return servletContext.getContextPath().replace("/", "");
    }
}
