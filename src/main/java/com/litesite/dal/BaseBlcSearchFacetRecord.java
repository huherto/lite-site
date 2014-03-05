package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcSearchFacetRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchFacetRecord extends BaseRecord {
    
    @Column(name="SEARCH_FACET_ID", sqlType=java.sql.Types.BIGINT)
    public long searchFacetId;
    
    @Column(name="MULTISELECT", sqlType=java.sql.Types.BOOLEAN)
    public boolean multiselect;
    
    @Column(name="LABEL", sqlType=java.sql.Types.VARCHAR)
    public String label;
    
    @Column(name="REQUIRES_ALL_DEPENDENT", sqlType=java.sql.Types.BOOLEAN)
    public boolean requiresAllDependent;
    
    @Column(name="SEARCH_DISPLAY_PRIORITY", sqlType=java.sql.Types.INTEGER)
    public Integer searchDisplayPriority;
    
    @Column(name="SHOW_ON_SEARCH", sqlType=java.sql.Types.BOOLEAN)
    public boolean showOnSearch;
    
    @Column(name="FIELD_ID", sqlType=java.sql.Types.BIGINT)
    public long fieldId;
}
