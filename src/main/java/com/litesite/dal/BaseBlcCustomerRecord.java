package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcCustomerRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerRecord extends BaseRecord {
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
    
    @Column(name="CREATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long createdBy;
    
    @Column(name="DATE_CREATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateCreated;
    
    @Column(name="DATE_UPDATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateUpdated;
    
    @Column(name="UPDATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long updatedBy;
    
    @Column(name="CHALLENGE_ANSWER", sqlType=java.sql.Types.VARCHAR)
    public String challengeAnswer;
    
    @Column(name="DEACTIVATED", sqlType=java.sql.Types.BOOLEAN)
    public boolean deactivated;
    
    @Column(name="EMAIL_ADDRESS", sqlType=java.sql.Types.VARCHAR)
    public String emailAddress;
    
    @Column(name="FIRST_NAME", sqlType=java.sql.Types.VARCHAR)
    public String firstName;
    
    @Column(name="LAST_NAME", sqlType=java.sql.Types.VARCHAR)
    public String lastName;
    
    @Column(name="PASSWORD", sqlType=java.sql.Types.VARCHAR)
    public String password;
    
    @Column(name="PASSWORD_CHANGE_REQUIRED", sqlType=java.sql.Types.BOOLEAN)
    public boolean passwordChangeRequired;
    
    @Column(name="RECEIVE_EMAIL", sqlType=java.sql.Types.BOOLEAN)
    public boolean receiveEmail;
    
    @Column(name="IS_REGISTERED", sqlType=java.sql.Types.BOOLEAN)
    public boolean isRegistered;
    
    @Column(name="TAX_EXEMPTION_CODE", sqlType=java.sql.Types.VARCHAR)
    public String taxExemptionCode;
    
    @Column(name="USER_NAME", sqlType=java.sql.Types.VARCHAR)
    public String userName;
    
    @Column(name="CHALLENGE_QUESTION_ID", sqlType=java.sql.Types.BIGINT)
    public Long challengeQuestionId;
    
    @Column(name="LOCALE_CODE", sqlType=java.sql.Types.VARCHAR)
    public String localeCode;
}
