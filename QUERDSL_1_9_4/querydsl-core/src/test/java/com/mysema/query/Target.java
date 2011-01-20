/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query;

/**
 * @author tiwe
 *
 */
public enum Target{
    /**
     * Derby
     */
    DERBY,
    /**
     *
     */
    H2,
    /**
     * HSSQLDB
     */
    HSQLDB,
    /**
     * Memory (querydsl-collection)
     */
    MEM,
    /**
     * MySQL
     */
    MYSQL,
    /**
     * Oracle
     */
    ORACLE,
    /**
     * Postgres
     */
    POSTGRES,
    /**
     * Microsoft SQL Server
     */
    SQLSERVER,
    /**
     *
     */
    LUCENE;

}