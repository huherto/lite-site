package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcPageTmpltRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageTmpltRecord extends BaseRecord {
    
    @Column(name="PAGE_TMPLT_ID", sqlType=java.sql.Types.BIGINT)
    public long pageTmpltId;
    
    @Column(name="TMPLT_DESCR", sqlType=java.sql.Types.VARCHAR)
    public String tmpltDescr;
    
    @Column(name="TMPLT_NAME", sqlType=java.sql.Types.VARCHAR)
    public String tmpltName;
    
    @Column(name="TMPLT_PATH", sqlType=java.sql.Types.VARCHAR)
    public String tmpltPath;
    
    @Column(name="LOCALE_CODE", sqlType=java.sql.Types.VARCHAR)
    public String localeCode;
}
