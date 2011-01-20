/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.collections;

import com.mysema.query.types.JavaTemplates;
import com.mysema.query.types.Ops;
import com.mysema.query.types.PathType;

/**
 * ColQueryTemplates extends JavaTemplates to add Java syntax specific operation
 * templates.
 *
 * @author tiwe
 * @version $Id$
 */
public final class ColQueryTemplates extends JavaTemplates {

    public static final ColQueryTemplates DEFAULT = new ColQueryTemplates();

    protected ColQueryTemplates() {
        String functions = ColQueryFunctions.class.getName();
        add(Ops.EQ_OBJECT, "{0}.equals({1})");
        add(Ops.NE_OBJECT, "!{0}.equals({1})");
        add(Ops.INSTANCE_OF, "{1}.isInstance({0})");

        // Comparable
        add(Ops.AFTER, "{0}.compareTo({1}) > 0");
        add(Ops.BEFORE, "{0}.compareTo({1}) < 0");
        add(Ops.AOE, "{0}.compareTo({1}) >= 0");
        add(Ops.BOE, "{0}.compareTo({1}) <= 0");
        add(Ops.BETWEEN, functions + ".between({0},{1},{2})");
        add(Ops.STRING_CAST, "String.valueOf({0})");

        // Number
        add(Ops.DIV, "(double)({0}/{1})");

        // Date and Time
        add(Ops.DateTimeOps.YEAR,         functions + ".getYear({0})");
        add(Ops.DateTimeOps.YEAR_MONTH,   functions + ".getYearMonth({0})");
        add(Ops.DateTimeOps.MONTH,        functions + ".getMonth({0})");
        add(Ops.DateTimeOps.WEEK,         functions + ".getWeek({0})");
        add(Ops.DateTimeOps.DAY_OF_WEEK,  functions + ".getDayOfWeek({0})");
        add(Ops.DateTimeOps.DAY_OF_MONTH, functions + ".getDayOfMonth({0})");
        add(Ops.DateTimeOps.DAY_OF_YEAR,  functions + ".getDayOfYear({0})");
        add(Ops.DateTimeOps.HOUR,         functions + ".getHour({0})");
        add(Ops.DateTimeOps.MINUTE,       functions + ".getMinute({0})");
        add(Ops.DateTimeOps.SECOND,       functions + ".getSecond({0})");
        add(Ops.DateTimeOps.MILLISECOND,  functions + ".getMilliSecond({0})");

        // String
        add(Ops.LIKE, functions + ".like({0},{1})");

        // Path types
        for (PathType type : new PathType[] {
                PathType.LISTVALUE,
                PathType.MAPVALUE,
                PathType.MAPVALUE_CONSTANT }) {
            add(type, "{0}.get({1})");
        }
        add(PathType.LISTVALUE_CONSTANT, "{0}.get({1})");
        add(PathType.ARRAYVALUE, "{0}[{1}]");
        add(PathType.ARRAYVALUE_CONSTANT, "{0}[{1}]");

        // coalesce
        add(Ops.COALESCE, functions + ".coalesce({0})");

    }

}