/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.hql;

import org.junit.Test;

import com.mysema.query.types.expr.EDate;
import com.mysema.query.types.expr.EDateTime;
import com.mysema.query.types.expr.ETime;

public class DateTimeTest extends AbstractQueryTest {

    @Test
    public void testDateOperations() {
        // current_date(), current_time(), current_timestamp()
        assertToString("current_date()", EDate.currentDate());
        assertToString("current_date()", EDateTime.currentDate());
        assertToString("current_time()", ETime.currentTime());
        assertToString("current_timestamp()", EDateTime.currentTimestamp());
        // second(...), minute(...), hour(...), day(...), month(...), year(...),
        catalog.effectiveDate.second();
        catalog.effectiveDate.minute();
        catalog.effectiveDate.hour();
        catalog.effectiveDate.dayOfMonth();
        catalog.effectiveDate.month();
        catalog.effectiveDate.year();
    }

}