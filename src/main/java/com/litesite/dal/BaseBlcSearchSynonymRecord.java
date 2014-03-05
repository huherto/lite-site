package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcSearchSynonymRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchSynonymRecord extends BaseRecord {
    
    @Column(name="SEARCH_SYNONYM_ID", sqlType=java.sql.Types.BIGINT)
    public long searchSynonymId;
    
    @Column(name="SYNONYMS", sqlType=java.sql.Types.VARCHAR)
    public String synonyms;
    
    @Column(name="TERM", sqlType=java.sql.Types.VARCHAR)
    public String term;
}
