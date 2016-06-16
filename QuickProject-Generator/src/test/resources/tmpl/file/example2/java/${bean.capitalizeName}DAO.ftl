package ${config.javaPackageName}.dao;

@Repository
public class ${bean.capitalizeName}DAO extends BusdataBaseDAO {

    public Object insert(${bean.capitalizeName}DTO ${bean.name}DTO) {
        Object insert = super.insert("${bean.capitalizeName}.insert", ${bean.name}DTO);
        return insert;
    }

    public int update(${bean.capitalizeName}DTO ${bean.name}DTO) {
        int i =  super.update("${bean.capitalizeName}.update", ${bean.name}DTO);
        if(i != 1){
            throw new OptimisticLockingFailureException("update optimistic lock failed ");
        }
        return i;
    }

    public ${bean.capitalizeName}DTO getById(Long id) {
        return super.queryForObject("${bean.capitalizeName}.getById", id);
    }

}
