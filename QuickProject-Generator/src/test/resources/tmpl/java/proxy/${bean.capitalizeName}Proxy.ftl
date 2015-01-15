package com.zhiyi.proxy;

import ${config.javaPackageName}${module.name}.service.${bean.capitalizeName}Service;

import javax.annotation.Resource;

@Component
public class ${bean.capitalizeName}Proxy implements ${bean.capitalizeName}Interface {

    @Resource
    private ${bean.capitalizeName}Service ${bean.name}Service;

}