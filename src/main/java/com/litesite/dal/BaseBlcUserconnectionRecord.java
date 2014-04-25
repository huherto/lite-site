package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcUserconnectionRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcUserconnectionRecord extends BaseRecord {
    
    @Column(name="PROVIDERID", sqlType=java.sql.Types.VARCHAR)
    public String providerid;
    
    @Column(name="PROVIDERUSERID", sqlType=java.sql.Types.VARCHAR)
    public String provideruserid;
    
    @Column(name="USERID", sqlType=java.sql.Types.VARCHAR)
    public String userid;
    
    @Column(name="ACCESSTOKEN", sqlType=java.sql.Types.VARCHAR)
    public String accesstoken;
    
    @Column(name="DISPLAYNAME", sqlType=java.sql.Types.VARCHAR)
    public String displayname;
    
    @Column(name="EXPIRETIME", sqlType=java.sql.Types.BIGINT)
    public Long expiretime;
    
    @Column(name="IMAGEURL", sqlType=java.sql.Types.VARCHAR)
    public String imageurl;
    
    @Column(name="PROFILEURL", sqlType=java.sql.Types.VARCHAR)
    public String profileurl;
    
    @Column(name="RANK", sqlType=java.sql.Types.INTEGER)
    public int rank;
    
    @Column(name="REFRESHTOKEN", sqlType=java.sql.Types.VARCHAR)
    public String refreshtoken;
    
    @Column(name="SECRET", sqlType=java.sql.Types.VARCHAR)
    public String secret;
}
