package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcMediaRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcMediaRecord extends BaseRecord {
    
    @Column(name="MEDIA_ID", sqlType=java.sql.Types.BIGINT)
    public long mediaId;
    
    @Column(name="ALT_TEXT", sqlType=java.sql.Types.VARCHAR)
    public String altText;
    
    @Column(name="TAGS", sqlType=java.sql.Types.VARCHAR)
    public String tags;
    
    @Column(name="TITLE", sqlType=java.sql.Types.VARCHAR)
    public String title;
    
    @Column(name="URL", sqlType=java.sql.Types.VARCHAR)
    public String url;
}
