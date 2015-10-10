package ${config.javaPackageName}${module.name}.service.impl;

import ${config.javaPackageName}${module.name}.service.${bean.capitalizeName}Service;
import ${config.javaPackageName}${module.name}.dao.${bean.capitalizeName}DAO;
import ${config.javaPackageName}${module.name}.model.${bean.capitalizeName};
import com.zhiyi.pmp.base.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ${bean.capitalizeName}ServiceImpl extends BaseServiceImpl<${bean.capitalizeName}> implements ${bean.capitalizeName}Service {

    @Autowired
    private ${bean.capitalizeName}DAO ${bean.name}DAO;

}
