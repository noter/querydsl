package com.mysema.query.sql.dml;

import com.google.common.collect.ImmutableList;
import com.mysema.query.sql.KeyAccessorsTest.QEmployee;
import com.mysema.query.sql.SQLBindings;
import com.mysema.query.sql.SQLTemplates;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SQLInsertClauseTest {

    @Test
    public void GetSQL() {
        QEmployee emp1 = new QEmployee("emp1");
        SQLInsertClause insert = new SQLInsertClause(null, SQLTemplates.DEFAULT, emp1);
        insert.set(emp1.id, 1);

        SQLBindings sql = insert.getSQL().get(0);
        assertEquals("insert into EMPLOYEE (ID)\nvalues (?)", sql.getSQL());
        assertEquals(ImmutableList.of(1), sql.getBindings());
    }

}
