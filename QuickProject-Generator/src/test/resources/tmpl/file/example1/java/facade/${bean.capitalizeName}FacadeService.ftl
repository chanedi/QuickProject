package com.zhiyi.facade;

import com.zhiyi.massage.api.I${bean.capitalizeName}FacadeService;
import ${config.javaPackageName}${module.name}.service.${bean.capitalizeName}Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class ${bean.capitalizeName}FacadeService implements I${bean.capitalizeName}FacadeService {

    @Autowired
    private ${bean.capitalizeName}Service ${bean.name}Service;

}