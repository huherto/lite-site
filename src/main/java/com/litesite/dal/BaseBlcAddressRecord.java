package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcAddressRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAddressRecord extends BaseRecord {
    
    @Column(name="ADDRESS_ID", sqlType=java.sql.Types.BIGINT)
    public long addressId;
    
    @Column(name="ADDRESS_LINE1", sqlType=java.sql.Types.VARCHAR)
    public String addressLine1;
    
    @Column(name="ADDRESS_LINE2", sqlType=java.sql.Types.VARCHAR)
    public String addressLine2;
    
    @Column(name="ADDRESS_LINE3", sqlType=java.sql.Types.VARCHAR)
    public String addressLine3;
    
    @Column(name="CITY", sqlType=java.sql.Types.VARCHAR)
    public String city;
    
    @Column(name="COMPANY_NAME", sqlType=java.sql.Types.VARCHAR)
    public String companyName;
    
    @Column(name="COUNTY", sqlType=java.sql.Types.VARCHAR)
    public String county;
    
    @Column(name="EMAIL_ADDRESS", sqlType=java.sql.Types.VARCHAR)
    public String emailAddress;
    
    @Column(name="FAX", sqlType=java.sql.Types.VARCHAR)
    public String fax;
    
    @Column(name="FIRST_NAME", sqlType=java.sql.Types.VARCHAR)
    public String firstName;
    
    @Column(name="IS_ACTIVE", sqlType=java.sql.Types.BOOLEAN)
    public boolean isActive;
    
    @Column(name="IS_BUSINESS", sqlType=java.sql.Types.BOOLEAN)
    public boolean isBusiness;
    
    @Column(name="IS_DEFAULT", sqlType=java.sql.Types.BOOLEAN)
    public boolean isDefault;
    
    @Column(name="LAST_NAME", sqlType=java.sql.Types.VARCHAR)
    public String lastName;
    
    @Column(name="POSTAL_CODE", sqlType=java.sql.Types.VARCHAR)
    public String postalCode;
    
    @Column(name="PRIMARY_PHONE", sqlType=java.sql.Types.VARCHAR)
    public String primaryPhone;
    
    @Column(name="SECONDARY_PHONE", sqlType=java.sql.Types.VARCHAR)
    public String secondaryPhone;
    
    @Column(name="STANDARDIZED", sqlType=java.sql.Types.BOOLEAN)
    public boolean standardized;
    
    @Column(name="TOKENIZED_ADDRESS", sqlType=java.sql.Types.VARCHAR)
    public String tokenizedAddress;
    
    @Column(name="VERIFICATION_LEVEL", sqlType=java.sql.Types.VARCHAR)
    public String verificationLevel;
    
    @Column(name="ZIP_FOUR", sqlType=java.sql.Types.VARCHAR)
    public String zipFour;
    
    @Column(name="COUNTRY", sqlType=java.sql.Types.VARCHAR)
    public String country;
    
    @Column(name="PHONE_FAX_ID", sqlType=java.sql.Types.BIGINT)
    public Long phoneFaxId;
    
    @Column(name="PHONE_PRIMARY_ID", sqlType=java.sql.Types.BIGINT)
    public Long phonePrimaryId;
    
    @Column(name="PHONE_SECONDARY_ID", sqlType=java.sql.Types.BIGINT)
    public Long phoneSecondaryId;
    
    @Column(name="STATE_PROV_REGION", sqlType=java.sql.Types.VARCHAR)
    public String stateProvRegion;
}
