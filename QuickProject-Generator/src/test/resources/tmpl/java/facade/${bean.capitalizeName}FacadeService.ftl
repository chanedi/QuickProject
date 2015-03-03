package com.zhiyi.facade;

import com.zhiyi.massage.api.I${bean.capitalizeName}FacadeService;
import ${config.javaPackageName}${module.name}.service.${bean.capitalizeName}Service;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class ${bean.capitalizeName}FacadeService implements I${bean.capitalizeName}FacadeService {

    @Resource
    private ${bean.capitalizeName}Service ${bean.name}Service;

}