/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.sql.domain;

import com.mysema.query.sql.Table;
import com.mysema.query.types.Expr;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.PString;
import com.mysema.query.types.path.PathMetadataFactory;

@Table("TEST")
public class QTest_ extends EntityPathBase<Object> {

    private static final long serialVersionUID = -8421112749591552595L;

    public final PString name = createString("NAME");

    private final Expr<?>[] all = new Expr[]{name};

    public Expr<?>[] all() {
        return all;
    }
        
    public QTest_(String path) {
        super(Object.class, PathMetadataFactory.forVariable(path));
    }

    public QTest_(PathMetadata<?> metadata) {
        super(Object.class, metadata);
    }
}