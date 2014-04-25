package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.Timestamp;

/**
 * BaseBlcOfferRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferRecord extends BaseRecord {
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
    
    @Column(name="APPLIES_WHEN_RULES", sqlType=java.sql.Types.CLOB)
    public Clob appliesWhenRules;
    
    @Column(name="APPLIES_TO_RULES", sqlType=java.sql.Types.CLOB)
    public Clob appliesToRules;
    
    @Column(name="APPLY_OFFER_TO_MARKED_ITEMS", sqlType=java.sql.Types.BOOLEAN)
    public boolean applyOfferToMarkedItems;
    
    @Column(name="APPLY_TO_SALE_PRICE", sqlType=java.sql.Types.BOOLEAN)
    public boolean applyToSalePrice;
    
    @Column(name="ARCHIVED", sqlType=java.sql.Types.CHAR)
    public String archived;
    
    @Column(name="AUTOMATICALLY_ADDED", sqlType=java.sql.Types.BOOLEAN)
    public boolean automaticallyAdded;
    
    @Column(name="COMBINABLE_WITH_OTHER_OFFERS", sqlType=java.sql.Types.BOOLEAN)
    public boolean combinableWithOtherOffers;
    
    @Column(name="OFFER_DELIVERY_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String offerDeliveryType;
    
    @Column(name="OFFER_DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String offerDescription;
    
    @Column(name="OFFER_DISCOUNT_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String offerDiscountType;
    
    @Column(name="END_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp endDate;
    
    @Column(name="MARKETING_MESSASGE", sqlType=java.sql.Types.VARCHAR)
    public String marketingMessasge;
    
    @Column(name="MAX_USES_PER_CUSTOMER", sqlType=java.sql.Types.BIGINT)
    public Long maxUsesPerCustomer;
    
    @Column(name="MAX_USES", sqlType=java.sql.Types.INTEGER)
    public Integer maxUses;
    
    @Column(name="OFFER_NAME", sqlType=java.sql.Types.VARCHAR)
    public String offerName;
    
    @Column(name="OFFER_ITEM_QUALIFIER_RULE", sqlType=java.sql.Types.VARCHAR)
    public String offerItemQualifierRule;
    
    @Column(name="OFFER_ITEM_TARGET_RULE", sqlType=java.sql.Types.VARCHAR)
    public String offerItemTargetRule;
    
    @Column(name="OFFER_PRIORITY", sqlType=java.sql.Types.INTEGER)
    public Integer offerPriority;
    
    @Column(name="QUALIFYING_ITEM_MIN_TOTAL", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal qualifyingItemMinTotal;
    
    @Column(name="STACKABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean stackable;
    
    @Column(name="START_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp startDate;
    
    @Column(name="TARGET_SYSTEM", sqlType=java.sql.Types.VARCHAR)
    public String targetSystem;
    
    @Column(name="TOTALITARIAN_OFFER", sqlType=java.sql.Types.BOOLEAN)
    public boolean totalitarianOffer;
    
    @Column(name="USE_NEW_FORMAT", sqlType=java.sql.Types.BOOLEAN)
    public boolean useNewFormat;
    
    @Column(name="OFFER_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String offerType;
    
    @Column(name="USES", sqlType=java.sql.Types.INTEGER)
    public Integer uses;
    
    @Column(name="OFFER_VALUE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal offerValue;
}
