package com.zhiyi.proxy;

import com.zhiyi.massageinterface.interfaces.${bean.capitalizeName}Interface;
import ${config.javaPackageName}${module.name}.service.${bean.capitalizeName}Service;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class ${bean.capitalizeName}Proxy implements ${bean.capitalizeName}Interface {

    @Resource
    private ${bean.capitalizeName}Service ${bean.name}Service;

}