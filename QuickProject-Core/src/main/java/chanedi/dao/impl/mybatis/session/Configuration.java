/*
 *    Copyright 2009-2013 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package chanedi.dao.impl.mybatis.session;

import org.apache.ibatis.mapping.MappedStatement;

import java.util.Collection;
import java.util.Map;

/**
 * 修改mappedStatements为FirstStrictMap以允许重复的key。
 *
 * @author Chanedi
 */
public class Configuration extends org.apache.ibatis.session.Configuration {

    protected final Map<String, MappedStatement> mappedStatements = new FirstStrictMap<MappedStatement>("Mapped Statements collection");

    public void addMappedStatement(MappedStatement ms) {
        mappedStatements.put(ms.getId(), ms);
    }

    public Collection<String> getMappedStatementNames() {
        buildAllStatements();
        return mappedStatements.keySet();
    }

    public Collection<MappedStatement> getMappedStatements() {
        buildAllStatements();
        return mappedStatements.values();
    }

    public MappedStatement getMappedStatement(String id, boolean validateIncompleteStatements) {
        if (validateIncompleteStatements) {
            buildAllStatements();
        }
        return mappedStatements.get(id);
    }

    public boolean hasStatement(String statementName, boolean validateIncompleteStatements) {
        super.hasStatement(statementName, validateIncompleteStatements);
        return mappedStatements.containsKey(statementName);
    }

}
