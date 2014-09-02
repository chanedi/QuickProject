package chanedi.${module.name}.service.impl;

import chanedi.service.EntityServiceImpl;
import chanedi.${module.name}.service.${bean.capitalizeName}Service;
import chanedi.${module.name}.model.${bean.capitalizeName};
import org.springframework.stereotype.Service;

@Service
public class ${bean.capitalizeName}ServiceImpl extends EntityServiceImpl<${bean.capitalizeName}> implements ${bean.capitalizeName}Service {
}
