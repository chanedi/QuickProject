package ${config.javaPackageName}${module.name}.service.impl;

import chanedi.service.EntityServiceImpl;
import ${config.javaPackageName}${module.name}.service.${bean.capitalizeName}Service;
import ${config.javaPackageName}${module.name}.dao.${bean.capitalizeName}DAO;
import ${config.javaPackageName}${module.name}.model.${bean.capitalizeName};
import org.springframework.stereotype.Service;

/**
 * Created by QuickProject-Generator on ${now}
 */
@Service
public class ${bean.capitalizeName}ServiceImpl extends EntityServiceImpl<${bean.capitalizeName}> implements ${bean.capitalizeName}Service {

    @Resource
    private ${bean.capitalizeName}DAO ${bean.name}DAO;

}
