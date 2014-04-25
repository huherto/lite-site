package com.litesite.dal;

import javax.sql.DataSource;

/**
 * BaseDatabase –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseDatabase {

    private DataSource dataSource;

    private BlcAdditionalOfferInfoTable blcAdditionalOfferInfoTable = null;
    private BlcAddressTable blcAddressTable = null;
    private BlcAdminModuleTable blcAdminModuleTable = null;
    private BlcAdminPasswordTokenTable blcAdminPasswordTokenTable = null;
    private BlcAdminPermissionTable blcAdminPermissionTable = null;
    private BlcAdminPermissionEntityTable blcAdminPermissionEntityTable = null;
    private BlcAdminRoleTable blcAdminRoleTable = null;
    private BlcAdminRolePermissionXrefTable blcAdminRolePermissionXrefTable = null;
    private BlcAdminSecPermXrefTable blcAdminSecPermXrefTable = null;
    private BlcAdminSectionTable blcAdminSectionTable = null;
    private BlcAdminUserTable blcAdminUserTable = null;
    private BlcAdminUserPermissionXrefTable blcAdminUserPermissionXrefTable = null;
    private BlcAdminUserRoleXrefTable blcAdminUserRoleXrefTable = null;
    private BlcAdminUserSandboxTable blcAdminUserSandboxTable = null;
    private BlcAmountItemTable blcAmountItemTable = null;
    private BlcAssetDescMapTable blcAssetDescMapTable = null;
    private BlcBankAccountPaymentTable blcBankAccountPaymentTable = null;
    private BlcBundItemFeePriceTable blcBundItemFeePriceTable = null;
    private BlcBundleOrderItemTable blcBundleOrderItemTable = null;
    private BlcCandidateFgOfferTable blcCandidateFgOfferTable = null;
    private BlcCandidateItemOfferTable blcCandidateItemOfferTable = null;
    private BlcCandidateOrderOfferTable blcCandidateOrderOfferTable = null;
    private BlcCatSearchFacetExclXrefTable blcCatSearchFacetExclXrefTable = null;
    private BlcCatSearchFacetXrefTable blcCatSearchFacetXrefTable = null;
    private BlcCatalogTable blcCatalogTable = null;
    private BlcCategoryTable blcCategoryTable = null;
    private BlcCategoryAttributeTable blcCategoryAttributeTable = null;
    private BlcCategoryImageTable blcCategoryImageTable = null;
    private BlcCategoryMediaMapTable blcCategoryMediaMapTable = null;
    private BlcCategoryProductXrefTable blcCategoryProductXrefTable = null;
    private BlcCategoryXrefTable blcCategoryXrefTable = null;
    private BlcChallengeQuestionTable blcChallengeQuestionTable = null;
    private BlcCodeTypesTable blcCodeTypesTable = null;
    private BlcCountryTable blcCountryTable = null;
    private BlcCreditCardPaymentTable blcCreditCardPaymentTable = null;
    private BlcCurrencyTable blcCurrencyTable = null;
    private BlcCustomerTable blcCustomerTable = null;
    private BlcCustomerAddressTable blcCustomerAddressTable = null;
    private BlcCustomerAttributeTable blcCustomerAttributeTable = null;
    private BlcCustomerOfferXrefTable blcCustomerOfferXrefTable = null;
    private BlcCustomerPasswordTokenTable blcCustomerPasswordTokenTable = null;
    private BlcCustomerPaymentTable blcCustomerPaymentTable = null;
    private BlcCustomerPaymentFieldsTable blcCustomerPaymentFieldsTable = null;
    private BlcCustomerPhoneTable blcCustomerPhoneTable = null;
    private BlcCustomerRoleTable blcCustomerRoleTable = null;
    private BlcDataDrvnEnumTable blcDataDrvnEnumTable = null;
    private BlcDataDrvnEnumValTable blcDataDrvnEnumValTable = null;
    private BlcDiscItemFeePriceTable blcDiscItemFeePriceTable = null;
    private BlcDiscreteOrderItemTable blcDiscreteOrderItemTable = null;
    private BlcDynDiscreteOrderItemTable blcDynDiscreteOrderItemTable = null;
    private BlcEmailTrackingTable blcEmailTrackingTable = null;
    private BlcEmailTrackingClicksTable blcEmailTrackingClicksTable = null;
    private BlcEmailTrackingOpensTable blcEmailTrackingOpensTable = null;
    private BlcFgAdjustmentTable blcFgAdjustmentTable = null;
    private BlcFgFeeTaxXrefTable blcFgFeeTaxXrefTable = null;
    private BlcFgFgTaxXrefTable blcFgFgTaxXrefTable = null;
    private BlcFgItemTaxXrefTable blcFgItemTaxXrefTable = null;
    private BlcFieldTable blcFieldTable = null;
    private BlcFieldSearchTypesTable blcFieldSearchTypesTable = null;
    private BlcFldDefTable blcFldDefTable = null;
    private BlcFldEnumTable blcFldEnumTable = null;
    private BlcFldEnumItemTable blcFldEnumItemTable = null;
    private BlcFldGroupTable blcFldGroupTable = null;
    private BlcFulfillmentGroupTable blcFulfillmentGroupTable = null;
    private BlcFulfillmentGroupFeeTable blcFulfillmentGroupFeeTable = null;
    private BlcFulfillmentGroupItemTable blcFulfillmentGroupItemTable = null;
    private BlcFulfillmentOptBandedPrcTable blcFulfillmentOptBandedPrcTable = null;
    private BlcFulfillmentOptBandedWgtTable blcFulfillmentOptBandedWgtTable = null;
    private BlcFulfillmentOptionTable blcFulfillmentOptionTable = null;
    private BlcFulfillmentOptionFixedTable blcFulfillmentOptionFixedTable = null;
    private BlcFulfillmentPriceBandTable blcFulfillmentPriceBandTable = null;
    private BlcFulfillmentWeightBandTable blcFulfillmentWeightBandTable = null;
    private BlcGiftCardPaymentTable blcGiftCardPaymentTable = null;
    private BlcGiftwrapOrderItemTable blcGiftwrapOrderItemTable = null;
    private BlcIdGenerationTable blcIdGenerationTable = null;
    private BlcImgStaticAssetTable blcImgStaticAssetTable = null;
    private BlcItemOfferQualifierTable blcItemOfferQualifierTable = null;
    private BlcLocaleTable blcLocaleTable = null;
    private BlcMediaTable blcMediaTable = null;
    private BlcModuleConfigurationTable blcModuleConfigurationTable = null;
    private BlcOfferTable blcOfferTable = null;
    private BlcOfferAuditTable blcOfferAuditTable = null;
    private BlcOfferCodeTable blcOfferCodeTable = null;
    private BlcOfferInfoTable blcOfferInfoTable = null;
    private BlcOfferInfoFieldsTable blcOfferInfoFieldsTable = null;
    private BlcOfferItemCriteriaTable blcOfferItemCriteriaTable = null;
    private BlcOfferRuleTable blcOfferRuleTable = null;
    private BlcOfferRuleMapTable blcOfferRuleMapTable = null;
    private BlcOrderTable blcOrderTable = null;
    private BlcOrderAdjustmentTable blcOrderAdjustmentTable = null;
    private BlcOrderAttributeTable blcOrderAttributeTable = null;
    private BlcOrderItemTable blcOrderItemTable = null;
    private BlcOrderItemAddAttrTable blcOrderItemAddAttrTable = null;
    private BlcOrderItemAdjustmentTable blcOrderItemAdjustmentTable = null;
    private BlcOrderItemAttributeTable blcOrderItemAttributeTable = null;
    private BlcOrderItemDtlAdjTable blcOrderItemDtlAdjTable = null;
    private BlcOrderItemPriceDtlTable blcOrderItemPriceDtlTable = null;
    private BlcOrderMultishipOptionTable blcOrderMultishipOptionTable = null;
    private BlcOrderOfferCodeXrefTable blcOrderOfferCodeXrefTable = null;
    private BlcOrderPaymentTable blcOrderPaymentTable = null;
    private BlcOrderPaymentDetailsTable blcOrderPaymentDetailsTable = null;
    private BlcPageTable blcPageTable = null;
    private BlcPageFldTable blcPageFldTable = null;
    private BlcPageFldMapTable blcPageFldMapTable = null;
    private BlcPageItemCriteriaTable blcPageItemCriteriaTable = null;
    private BlcPageRuleTable blcPageRuleTable = null;
    private BlcPageRuleMapTable blcPageRuleMapTable = null;
    private BlcPageTmpltTable blcPageTmpltTable = null;
    private BlcPayinfoAdditionalFieldsTable blcPayinfoAdditionalFieldsTable = null;
    private BlcPaymentAdditionalFieldsTable blcPaymentAdditionalFieldsTable = null;
    private BlcPaymentLogTable blcPaymentLogTable = null;
    private BlcPaymentResponseItemTable blcPaymentResponseItemTable = null;
    private BlcPersonalMessageTable blcPersonalMessageTable = null;
    private BlcPgtmpltFldgrpXrefTable blcPgtmpltFldgrpXrefTable = null;
    private BlcPhoneTable blcPhoneTable = null;
    private BlcProductTable blcProductTable = null;
    private BlcProductAttributeTable blcProductAttributeTable = null;
    private BlcProductBundleTable blcProductBundleTable = null;
    private BlcProductCrossSaleTable blcProductCrossSaleTable = null;
    private BlcProductFeaturedTable blcProductFeaturedTable = null;
    private BlcProductOptionTable blcProductOptionTable = null;
    private BlcProductOptionValueTable blcProductOptionValueTable = null;
    private BlcProductOptionXrefTable blcProductOptionXrefTable = null;
    private BlcProductSkuXrefTable blcProductSkuXrefTable = null;
    private BlcProductUpSaleTable blcProductUpSaleTable = null;
    private BlcQualCritOfferXrefTable blcQualCritOfferXrefTable = null;
    private BlcQualCritPageXrefTable blcQualCritPageXrefTable = null;
    private BlcQualCritScXrefTable blcQualCritScXrefTable = null;
    private BlcRatingDetailTable blcRatingDetailTable = null;
    private BlcRatingSummaryTable blcRatingSummaryTable = null;
    private BlcReviewDetailTable blcReviewDetailTable = null;
    private BlcReviewFeedbackTable blcReviewFeedbackTable = null;
    private BlcRoleTable blcRoleTable = null;
    private BlcSandboxTable blcSandboxTable = null;
    private BlcSandboxActionTable blcSandboxActionTable = null;
    private BlcSandboxItemTable blcSandboxItemTable = null;
    private BlcScTable blcScTable = null;
    private BlcScFldTable blcScFldTable = null;
    private BlcScFldMapTable blcScFldMapTable = null;
    private BlcScFldTmpltTable blcScFldTmpltTable = null;
    private BlcScFldgrpXrefTable blcScFldgrpXrefTable = null;
    private BlcScItemCriteriaTable blcScItemCriteriaTable = null;
    private BlcScRuleTable blcScRuleTable = null;
    private BlcScRuleMapTable blcScRuleMapTable = null;
    private BlcScTypeTable blcScTypeTable = null;
    private BlcSearchFacetTable blcSearchFacetTable = null;
    private BlcSearchFacetRangeTable blcSearchFacetRangeTable = null;
    private BlcSearchFacetXrefTable blcSearchFacetXrefTable = null;
    private BlcSearchInterceptTable blcSearchInterceptTable = null;
    private BlcSearchSynonymTable blcSearchSynonymTable = null;
    private BlcShippingRateTable blcShippingRateTable = null;
    private BlcSiteTable blcSiteTable = null;
    private BlcSiteCatalogTable blcSiteCatalogTable = null;
    private BlcSiteSandboxTable blcSiteSandboxTable = null;
    private BlcSkuTable blcSkuTable = null;
    private BlcSkuAttributeTable blcSkuAttributeTable = null;
    private BlcSkuAvailabilityTable blcSkuAvailabilityTable = null;
    private BlcSkuBundleItemTable blcSkuBundleItemTable = null;
    private BlcSkuFeeTable blcSkuFeeTable = null;
    private BlcSkuFeeXrefTable blcSkuFeeXrefTable = null;
    private BlcSkuFulfillmentExcludedTable blcSkuFulfillmentExcludedTable = null;
    private BlcSkuFulfillmentFlatRatesTable blcSkuFulfillmentFlatRatesTable = null;
    private BlcSkuMediaMapTable blcSkuMediaMapTable = null;
    private BlcSkuOptionValueXrefTable blcSkuOptionValueXrefTable = null;
    private BlcStateTable blcStateTable = null;
    private BlcStaticAssetTable blcStaticAssetTable = null;
    private BlcStaticAssetDescTable blcStaticAssetDescTable = null;
    private BlcStaticAssetStrgTable blcStaticAssetStrgTable = null;
    private BlcStoreTable blcStoreTable = null;
    private BlcSystemPropertyTable blcSystemPropertyTable = null;
    private BlcTarCritOfferXrefTable blcTarCritOfferXrefTable = null;
    private BlcTaxDetailTable blcTaxDetailTable = null;
    private BlcTranslationTable blcTranslationTable = null;
    private BlcUrlHandlerTable blcUrlHandlerTable = null;
    private BlcUserconnectionTable blcUserconnectionTable = null;
    private BlcZipCodeTable blcZipCodeTable = null;
    private SandboxItemActionTable sandboxItemActionTable = null;
    private SequenceGeneratorTable sequenceGeneratorTable = null;

    protected BaseDatabase(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public BlcAdditionalOfferInfoTable getBlcAdditionalOfferInfoTable() {
        if (blcAdditionalOfferInfoTable == null) {
            blcAdditionalOfferInfoTable = new BlcAdditionalOfferInfoTable(dataSource);
        }
        return blcAdditionalOfferInfoTable;
    }

    public BlcAddressTable getBlcAddressTable() {
        if (blcAddressTable == null) {
            blcAddressTable = new BlcAddressTable(dataSource);
        }
        return blcAddressTable;
    }

    public BlcAdminModuleTable getBlcAdminModuleTable() {
        if (blcAdminModuleTable == null) {
            blcAdminModuleTable = new BlcAdminModuleTable(dataSource);
        }
        return blcAdminModuleTable;
    }

    public BlcAdminPasswordTokenTable getBlcAdminPasswordTokenTable() {
        if (blcAdminPasswordTokenTable == null) {
            blcAdminPasswordTokenTable = new BlcAdminPasswordTokenTable(dataSource);
        }
        return blcAdminPasswordTokenTable;
    }

    public BlcAdminPermissionTable getBlcAdminPermissionTable() {
        if (blcAdminPermissionTable == null) {
            blcAdminPermissionTable = new BlcAdminPermissionTable(dataSource);
        }
        return blcAdminPermissionTable;
    }

    public BlcAdminPermissionEntityTable getBlcAdminPermissionEntityTable() {
        if (blcAdminPermissionEntityTable == null) {
            blcAdminPermissionEntityTable = new BlcAdminPermissionEntityTable(dataSource);
        }
        return blcAdminPermissionEntityTable;
    }

    public BlcAdminRoleTable getBlcAdminRoleTable() {
        if (blcAdminRoleTable == null) {
            blcAdminRoleTable = new BlcAdminRoleTable(dataSource);
        }
        return blcAdminRoleTable;
    }

    public BlcAdminRolePermissionXrefTable getBlcAdminRolePermissionXrefTable() {
        if (blcAdminRolePermissionXrefTable == null) {
            blcAdminRolePermissionXrefTable = new BlcAdminRolePermissionXrefTable(dataSource);
        }
        return blcAdminRolePermissionXrefTable;
    }

    public BlcAdminSecPermXrefTable getBlcAdminSecPermXrefTable() {
        if (blcAdminSecPermXrefTable == null) {
            blcAdminSecPermXrefTable = new BlcAdminSecPermXrefTable(dataSource);
        }
        return blcAdminSecPermXrefTable;
    }

    public BlcAdminSectionTable getBlcAdminSectionTable() {
        if (blcAdminSectionTable == null) {
            blcAdminSectionTable = new BlcAdminSectionTable(dataSource);
        }
        return blcAdminSectionTable;
    }

    public BlcAdminUserTable getBlcAdminUserTable() {
        if (blcAdminUserTable == null) {
            blcAdminUserTable = new BlcAdminUserTable(dataSource);
        }
        return blcAdminUserTable;
    }

    public BlcAdminUserPermissionXrefTable getBlcAdminUserPermissionXrefTable() {
        if (blcAdminUserPermissionXrefTable == null) {
            blcAdminUserPermissionXrefTable = new BlcAdminUserPermissionXrefTable(dataSource);
        }
        return blcAdminUserPermissionXrefTable;
    }

    public BlcAdminUserRoleXrefTable getBlcAdminUserRoleXrefTable() {
        if (blcAdminUserRoleXrefTable == null) {
            blcAdminUserRoleXrefTable = new BlcAdminUserRoleXrefTable(dataSource);
        }
        return blcAdminUserRoleXrefTable;
    }

    public BlcAdminUserSandboxTable getBlcAdminUserSandboxTable() {
        if (blcAdminUserSandboxTable == null) {
            blcAdminUserSandboxTable = new BlcAdminUserSandboxTable(dataSource);
        }
        return blcAdminUserSandboxTable;
    }

    public BlcAmountItemTable getBlcAmountItemTable() {
        if (blcAmountItemTable == null) {
            blcAmountItemTable = new BlcAmountItemTable(dataSource);
        }
        return blcAmountItemTable;
    }

    public BlcAssetDescMapTable getBlcAssetDescMapTable() {
        if (blcAssetDescMapTable == null) {
            blcAssetDescMapTable = new BlcAssetDescMapTable(dataSource);
        }
        return blcAssetDescMapTable;
    }

    public BlcBankAccountPaymentTable getBlcBankAccountPaymentTable() {
        if (blcBankAccountPaymentTable == null) {
            blcBankAccountPaymentTable = new BlcBankAccountPaymentTable(dataSource);
        }
        return blcBankAccountPaymentTable;
    }

    public BlcBundItemFeePriceTable getBlcBundItemFeePriceTable() {
        if (blcBundItemFeePriceTable == null) {
            blcBundItemFeePriceTable = new BlcBundItemFeePriceTable(dataSource);
        }
        return blcBundItemFeePriceTable;
    }

    public BlcBundleOrderItemTable getBlcBundleOrderItemTable() {
        if (blcBundleOrderItemTable == null) {
            blcBundleOrderItemTable = new BlcBundleOrderItemTable(dataSource);
        }
        return blcBundleOrderItemTable;
    }

    public BlcCandidateFgOfferTable getBlcCandidateFgOfferTable() {
        if (blcCandidateFgOfferTable == null) {
            blcCandidateFgOfferTable = new BlcCandidateFgOfferTable(dataSource);
        }
        return blcCandidateFgOfferTable;
    }

    public BlcCandidateItemOfferTable getBlcCandidateItemOfferTable() {
        if (blcCandidateItemOfferTable == null) {
            blcCandidateItemOfferTable = new BlcCandidateItemOfferTable(dataSource);
        }
        return blcCandidateItemOfferTable;
    }

    public BlcCandidateOrderOfferTable getBlcCandidateOrderOfferTable() {
        if (blcCandidateOrderOfferTable == null) {
            blcCandidateOrderOfferTable = new BlcCandidateOrderOfferTable(dataSource);
        }
        return blcCandidateOrderOfferTable;
    }

    public BlcCatSearchFacetExclXrefTable getBlcCatSearchFacetExclXrefTable() {
        if (blcCatSearchFacetExclXrefTable == null) {
            blcCatSearchFacetExclXrefTable = new BlcCatSearchFacetExclXrefTable(dataSource);
        }
        return blcCatSearchFacetExclXrefTable;
    }

    public BlcCatSearchFacetXrefTable getBlcCatSearchFacetXrefTable() {
        if (blcCatSearchFacetXrefTable == null) {
            blcCatSearchFacetXrefTable = new BlcCatSearchFacetXrefTable(dataSource);
        }
        return blcCatSearchFacetXrefTable;
    }

    public BlcCatalogTable getBlcCatalogTable() {
        if (blcCatalogTable == null) {
            blcCatalogTable = new BlcCatalogTable(dataSource);
        }
        return blcCatalogTable;
    }

    public BlcCategoryTable getBlcCategoryTable() {
        if (blcCategoryTable == null) {
            blcCategoryTable = new BlcCategoryTable(dataSource);
        }
        return blcCategoryTable;
    }

    public BlcCategoryAttributeTable getBlcCategoryAttributeTable() {
        if (blcCategoryAttributeTable == null) {
            blcCategoryAttributeTable = new BlcCategoryAttributeTable(dataSource);
        }
        return blcCategoryAttributeTable;
    }

    public BlcCategoryImageTable getBlcCategoryImageTable() {
        if (blcCategoryImageTable == null) {
            blcCategoryImageTable = new BlcCategoryImageTable(dataSource);
        }
        return blcCategoryImageTable;
    }

    public BlcCategoryMediaMapTable getBlcCategoryMediaMapTable() {
        if (blcCategoryMediaMapTable == null) {
            blcCategoryMediaMapTable = new BlcCategoryMediaMapTable(dataSource);
        }
        return blcCategoryMediaMapTable;
    }

    public BlcCategoryProductXrefTable getBlcCategoryProductXrefTable() {
        if (blcCategoryProductXrefTable == null) {
            blcCategoryProductXrefTable = new BlcCategoryProductXrefTable(dataSource);
        }
        return blcCategoryProductXrefTable;
    }

    public BlcCategoryXrefTable getBlcCategoryXrefTable() {
        if (blcCategoryXrefTable == null) {
            blcCategoryXrefTable = new BlcCategoryXrefTable(dataSource);
        }
        return blcCategoryXrefTable;
    }

    public BlcChallengeQuestionTable getBlcChallengeQuestionTable() {
        if (blcChallengeQuestionTable == null) {
            blcChallengeQuestionTable = new BlcChallengeQuestionTable(dataSource);
        }
        return blcChallengeQuestionTable;
    }

    public BlcCodeTypesTable getBlcCodeTypesTable() {
        if (blcCodeTypesTable == null) {
            blcCodeTypesTable = new BlcCodeTypesTable(dataSource);
        }
        return blcCodeTypesTable;
    }

    public BlcCountryTable getBlcCountryTable() {
        if (blcCountryTable == null) {
            blcCountryTable = new BlcCountryTable(dataSource);
        }
        return blcCountryTable;
    }

    public BlcCreditCardPaymentTable getBlcCreditCardPaymentTable() {
        if (blcCreditCardPaymentTable == null) {
            blcCreditCardPaymentTable = new BlcCreditCardPaymentTable(dataSource);
        }
        return blcCreditCardPaymentTable;
    }

    public BlcCurrencyTable getBlcCurrencyTable() {
        if (blcCurrencyTable == null) {
            blcCurrencyTable = new BlcCurrencyTable(dataSource);
        }
        return blcCurrencyTable;
    }

    public BlcCustomerTable getBlcCustomerTable() {
        if (blcCustomerTable == null) {
            blcCustomerTable = new BlcCustomerTable(dataSource);
        }
        return blcCustomerTable;
    }

    public BlcCustomerAddressTable getBlcCustomerAddressTable() {
        if (blcCustomerAddressTable == null) {
            blcCustomerAddressTable = new BlcCustomerAddressTable(dataSource);
        }
        return blcCustomerAddressTable;
    }

    public BlcCustomerAttributeTable getBlcCustomerAttributeTable() {
        if (blcCustomerAttributeTable == null) {
            blcCustomerAttributeTable = new BlcCustomerAttributeTable(dataSource);
        }
        return blcCustomerAttributeTable;
    }

    public BlcCustomerOfferXrefTable getBlcCustomerOfferXrefTable() {
        if (blcCustomerOfferXrefTable == null) {
            blcCustomerOfferXrefTable = new BlcCustomerOfferXrefTable(dataSource);
        }
        return blcCustomerOfferXrefTable;
    }

    public BlcCustomerPasswordTokenTable getBlcCustomerPasswordTokenTable() {
        if (blcCustomerPasswordTokenTable == null) {
            blcCustomerPasswordTokenTable = new BlcCustomerPasswordTokenTable(dataSource);
        }
        return blcCustomerPasswordTokenTable;
    }

    public BlcCustomerPaymentTable getBlcCustomerPaymentTable() {
        if (blcCustomerPaymentTable == null) {
            blcCustomerPaymentTable = new BlcCustomerPaymentTable(dataSource);
        }
        return blcCustomerPaymentTable;
    }

    public BlcCustomerPaymentFieldsTable getBlcCustomerPaymentFieldsTable() {
        if (blcCustomerPaymentFieldsTable == null) {
            blcCustomerPaymentFieldsTable = new BlcCustomerPaymentFieldsTable(dataSource);
        }
        return blcCustomerPaymentFieldsTable;
    }

    public BlcCustomerPhoneTable getBlcCustomerPhoneTable() {
        if (blcCustomerPhoneTable == null) {
            blcCustomerPhoneTable = new BlcCustomerPhoneTable(dataSource);
        }
        return blcCustomerPhoneTable;
    }

    public BlcCustomerRoleTable getBlcCustomerRoleTable() {
        if (blcCustomerRoleTable == null) {
            blcCustomerRoleTable = new BlcCustomerRoleTable(dataSource);
        }
        return blcCustomerRoleTable;
    }

    public BlcDataDrvnEnumTable getBlcDataDrvnEnumTable() {
        if (blcDataDrvnEnumTable == null) {
            blcDataDrvnEnumTable = new BlcDataDrvnEnumTable(dataSource);
        }
        return blcDataDrvnEnumTable;
    }

    public BlcDataDrvnEnumValTable getBlcDataDrvnEnumValTable() {
        if (blcDataDrvnEnumValTable == null) {
            blcDataDrvnEnumValTable = new BlcDataDrvnEnumValTable(dataSource);
        }
        return blcDataDrvnEnumValTable;
    }

    public BlcDiscItemFeePriceTable getBlcDiscItemFeePriceTable() {
        if (blcDiscItemFeePriceTable == null) {
            blcDiscItemFeePriceTable = new BlcDiscItemFeePriceTable(dataSource);
        }
        return blcDiscItemFeePriceTable;
    }

    public BlcDiscreteOrderItemTable getBlcDiscreteOrderItemTable() {
        if (blcDiscreteOrderItemTable == null) {
            blcDiscreteOrderItemTable = new BlcDiscreteOrderItemTable(dataSource);
        }
        return blcDiscreteOrderItemTable;
    }

    public BlcDynDiscreteOrderItemTable getBlcDynDiscreteOrderItemTable() {
        if (blcDynDiscreteOrderItemTable == null) {
            blcDynDiscreteOrderItemTable = new BlcDynDiscreteOrderItemTable(dataSource);
        }
        return blcDynDiscreteOrderItemTable;
    }

    public BlcEmailTrackingTable getBlcEmailTrackingTable() {
        if (blcEmailTrackingTable == null) {
            blcEmailTrackingTable = new BlcEmailTrackingTable(dataSource);
        }
        return blcEmailTrackingTable;
    }

    public BlcEmailTrackingClicksTable getBlcEmailTrackingClicksTable() {
        if (blcEmailTrackingClicksTable == null) {
            blcEmailTrackingClicksTable = new BlcEmailTrackingClicksTable(dataSource);
        }
        return blcEmailTrackingClicksTable;
    }

    public BlcEmailTrackingOpensTable getBlcEmailTrackingOpensTable() {
        if (blcEmailTrackingOpensTable == null) {
            blcEmailTrackingOpensTable = new BlcEmailTrackingOpensTable(dataSource);
        }
        return blcEmailTrackingOpensTable;
    }

    public BlcFgAdjustmentTable getBlcFgAdjustmentTable() {
        if (blcFgAdjustmentTable == null) {
            blcFgAdjustmentTable = new BlcFgAdjustmentTable(dataSource);
        }
        return blcFgAdjustmentTable;
    }

    public BlcFgFeeTaxXrefTable getBlcFgFeeTaxXrefTable() {
        if (blcFgFeeTaxXrefTable == null) {
            blcFgFeeTaxXrefTable = new BlcFgFeeTaxXrefTable(dataSource);
        }
        return blcFgFeeTaxXrefTable;
    }

    public BlcFgFgTaxXrefTable getBlcFgFgTaxXrefTable() {
        if (blcFgFgTaxXrefTable == null) {
            blcFgFgTaxXrefTable = new BlcFgFgTaxXrefTable(dataSource);
        }
        return blcFgFgTaxXrefTable;
    }

    public BlcFgItemTaxXrefTable getBlcFgItemTaxXrefTable() {
        if (blcFgItemTaxXrefTable == null) {
            blcFgItemTaxXrefTable = new BlcFgItemTaxXrefTable(dataSource);
        }
        return blcFgItemTaxXrefTable;
    }

    public BlcFieldTable getBlcFieldTable() {
        if (blcFieldTable == null) {
            blcFieldTable = new BlcFieldTable(dataSource);
        }
        return blcFieldTable;
    }

    public BlcFieldSearchTypesTable getBlcFieldSearchTypesTable() {
        if (blcFieldSearchTypesTable == null) {
            blcFieldSearchTypesTable = new BlcFieldSearchTypesTable(dataSource);
        }
        return blcFieldSearchTypesTable;
    }

    public BlcFldDefTable getBlcFldDefTable() {
        if (blcFldDefTable == null) {
            blcFldDefTable = new BlcFldDefTable(dataSource);
        }
        return blcFldDefTable;
    }

    public BlcFldEnumTable getBlcFldEnumTable() {
        if (blcFldEnumTable == null) {
            blcFldEnumTable = new BlcFldEnumTable(dataSource);
        }
        return blcFldEnumTable;
    }

    public BlcFldEnumItemTable getBlcFldEnumItemTable() {
        if (blcFldEnumItemTable == null) {
            blcFldEnumItemTable = new BlcFldEnumItemTable(dataSource);
        }
        return blcFldEnumItemTable;
    }

    public BlcFldGroupTable getBlcFldGroupTable() {
        if (blcFldGroupTable == null) {
            blcFldGroupTable = new BlcFldGroupTable(dataSource);
        }
        return blcFldGroupTable;
    }

    public BlcFulfillmentGroupTable getBlcFulfillmentGroupTable() {
        if (blcFulfillmentGroupTable == null) {
            blcFulfillmentGroupTable = new BlcFulfillmentGroupTable(dataSource);
        }
        return blcFulfillmentGroupTable;
    }

    public BlcFulfillmentGroupFeeTable getBlcFulfillmentGroupFeeTable() {
        if (blcFulfillmentGroupFeeTable == null) {
            blcFulfillmentGroupFeeTable = new BlcFulfillmentGroupFeeTable(dataSource);
        }
        return blcFulfillmentGroupFeeTable;
    }

    public BlcFulfillmentGroupItemTable getBlcFulfillmentGroupItemTable() {
        if (blcFulfillmentGroupItemTable == null) {
            blcFulfillmentGroupItemTable = new BlcFulfillmentGroupItemTable(dataSource);
        }
        return blcFulfillmentGroupItemTable;
    }

    public BlcFulfillmentOptBandedPrcTable getBlcFulfillmentOptBandedPrcTable() {
        if (blcFulfillmentOptBandedPrcTable == null) {
            blcFulfillmentOptBandedPrcTable = new BlcFulfillmentOptBandedPrcTable(dataSource);
        }
        return blcFulfillmentOptBandedPrcTable;
    }

    public BlcFulfillmentOptBandedWgtTable getBlcFulfillmentOptBandedWgtTable() {
        if (blcFulfillmentOptBandedWgtTable == null) {
            blcFulfillmentOptBandedWgtTable = new BlcFulfillmentOptBandedWgtTable(dataSource);
        }
        return blcFulfillmentOptBandedWgtTable;
    }

    public BlcFulfillmentOptionTable getBlcFulfillmentOptionTable() {
        if (blcFulfillmentOptionTable == null) {
            blcFulfillmentOptionTable = new BlcFulfillmentOptionTable(dataSource);
        }
        return blcFulfillmentOptionTable;
    }

    public BlcFulfillmentOptionFixedTable getBlcFulfillmentOptionFixedTable() {
        if (blcFulfillmentOptionFixedTable == null) {
            blcFulfillmentOptionFixedTable = new BlcFulfillmentOptionFixedTable(dataSource);
        }
        return blcFulfillmentOptionFixedTable;
    }

    public BlcFulfillmentPriceBandTable getBlcFulfillmentPriceBandTable() {
        if (blcFulfillmentPriceBandTable == null) {
            blcFulfillmentPriceBandTable = new BlcFulfillmentPriceBandTable(dataSource);
        }
        return blcFulfillmentPriceBandTable;
    }

    public BlcFulfillmentWeightBandTable getBlcFulfillmentWeightBandTable() {
        if (blcFulfillmentWeightBandTable == null) {
            blcFulfillmentWeightBandTable = new BlcFulfillmentWeightBandTable(dataSource);
        }
        return blcFulfillmentWeightBandTable;
    }

    public BlcGiftCardPaymentTable getBlcGiftCardPaymentTable() {
        if (blcGiftCardPaymentTable == null) {
            blcGiftCardPaymentTable = new BlcGiftCardPaymentTable(dataSource);
        }
        return blcGiftCardPaymentTable;
    }

    public BlcGiftwrapOrderItemTable getBlcGiftwrapOrderItemTable() {
        if (blcGiftwrapOrderItemTable == null) {
            blcGiftwrapOrderItemTable = new BlcGiftwrapOrderItemTable(dataSource);
        }
        return blcGiftwrapOrderItemTable;
    }

    public BlcIdGenerationTable getBlcIdGenerationTable() {
        if (blcIdGenerationTable == null) {
            blcIdGenerationTable = new BlcIdGenerationTable(dataSource);
        }
        return blcIdGenerationTable;
    }

    public BlcImgStaticAssetTable getBlcImgStaticAssetTable() {
        if (blcImgStaticAssetTable == null) {
            blcImgStaticAssetTable = new BlcImgStaticAssetTable(dataSource);
        }
        return blcImgStaticAssetTable;
    }

    public BlcItemOfferQualifierTable getBlcItemOfferQualifierTable() {
        if (blcItemOfferQualifierTable == null) {
            blcItemOfferQualifierTable = new BlcItemOfferQualifierTable(dataSource);
        }
        return blcItemOfferQualifierTable;
    }

    public BlcLocaleTable getBlcLocaleTable() {
        if (blcLocaleTable == null) {
            blcLocaleTable = new BlcLocaleTable(dataSource);
        }
        return blcLocaleTable;
    }

    public BlcMediaTable getBlcMediaTable() {
        if (blcMediaTable == null) {
            blcMediaTable = new BlcMediaTable(dataSource);
        }
        return blcMediaTable;
    }

    public BlcModuleConfigurationTable getBlcModuleConfigurationTable() {
        if (blcModuleConfigurationTable == null) {
            blcModuleConfigurationTable = new BlcModuleConfigurationTable(dataSource);
        }
        return blcModuleConfigurationTable;
    }

    public BlcOfferTable getBlcOfferTable() {
        if (blcOfferTable == null) {
            blcOfferTable = new BlcOfferTable(dataSource);
        }
        return blcOfferTable;
    }

    public BlcOfferAuditTable getBlcOfferAuditTable() {
        if (blcOfferAuditTable == null) {
            blcOfferAuditTable = new BlcOfferAuditTable(dataSource);
        }
        return blcOfferAuditTable;
    }

    public BlcOfferCodeTable getBlcOfferCodeTable() {
        if (blcOfferCodeTable == null) {
            blcOfferCodeTable = new BlcOfferCodeTable(dataSource);
        }
        return blcOfferCodeTable;
    }

    public BlcOfferInfoTable getBlcOfferInfoTable() {
        if (blcOfferInfoTable == null) {
            blcOfferInfoTable = new BlcOfferInfoTable(dataSource);
        }
        return blcOfferInfoTable;
    }

    public BlcOfferInfoFieldsTable getBlcOfferInfoFieldsTable() {
        if (blcOfferInfoFieldsTable == null) {
            blcOfferInfoFieldsTable = new BlcOfferInfoFieldsTable(dataSource);
        }
        return blcOfferInfoFieldsTable;
    }

    public BlcOfferItemCriteriaTable getBlcOfferItemCriteriaTable() {
        if (blcOfferItemCriteriaTable == null) {
            blcOfferItemCriteriaTable = new BlcOfferItemCriteriaTable(dataSource);
        }
        return blcOfferItemCriteriaTable;
    }

    public BlcOfferRuleTable getBlcOfferRuleTable() {
        if (blcOfferRuleTable == null) {
            blcOfferRuleTable = new BlcOfferRuleTable(dataSource);
        }
        return blcOfferRuleTable;
    }

    public BlcOfferRuleMapTable getBlcOfferRuleMapTable() {
        if (blcOfferRuleMapTable == null) {
            blcOfferRuleMapTable = new BlcOfferRuleMapTable(dataSource);
        }
        return blcOfferRuleMapTable;
    }

    public BlcOrderTable getBlcOrderTable() {
        if (blcOrderTable == null) {
            blcOrderTable = new BlcOrderTable(dataSource);
        }
        return blcOrderTable;
    }

    public BlcOrderAdjustmentTable getBlcOrderAdjustmentTable() {
        if (blcOrderAdjustmentTable == null) {
            blcOrderAdjustmentTable = new BlcOrderAdjustmentTable(dataSource);
        }
        return blcOrderAdjustmentTable;
    }

    public BlcOrderAttributeTable getBlcOrderAttributeTable() {
        if (blcOrderAttributeTable == null) {
            blcOrderAttributeTable = new BlcOrderAttributeTable(dataSource);
        }
        return blcOrderAttributeTable;
    }

    public BlcOrderItemTable getBlcOrderItemTable() {
        if (blcOrderItemTable == null) {
            blcOrderItemTable = new BlcOrderItemTable(dataSource);
        }
        return blcOrderItemTable;
    }

    public BlcOrderItemAddAttrTable getBlcOrderItemAddAttrTable() {
        if (blcOrderItemAddAttrTable == null) {
            blcOrderItemAddAttrTable = new BlcOrderItemAddAttrTable(dataSource);
        }
        return blcOrderItemAddAttrTable;
    }

    public BlcOrderItemAdjustmentTable getBlcOrderItemAdjustmentTable() {
        if (blcOrderItemAdjustmentTable == null) {
            blcOrderItemAdjustmentTable = new BlcOrderItemAdjustmentTable(dataSource);
        }
        return blcOrderItemAdjustmentTable;
    }

    public BlcOrderItemAttributeTable getBlcOrderItemAttributeTable() {
        if (blcOrderItemAttributeTable == null) {
            blcOrderItemAttributeTable = new BlcOrderItemAttributeTable(dataSource);
        }
        return blcOrderItemAttributeTable;
    }

    public BlcOrderItemDtlAdjTable getBlcOrderItemDtlAdjTable() {
        if (blcOrderItemDtlAdjTable == null) {
            blcOrderItemDtlAdjTable = new BlcOrderItemDtlAdjTable(dataSource);
        }
        return blcOrderItemDtlAdjTable;
    }

    public BlcOrderItemPriceDtlTable getBlcOrderItemPriceDtlTable() {
        if (blcOrderItemPriceDtlTable == null) {
            blcOrderItemPriceDtlTable = new BlcOrderItemPriceDtlTable(dataSource);
        }
        return blcOrderItemPriceDtlTable;
    }

    public BlcOrderMultishipOptionTable getBlcOrderMultishipOptionTable() {
        if (blcOrderMultishipOptionTable == null) {
            blcOrderMultishipOptionTable = new BlcOrderMultishipOptionTable(dataSource);
        }
        return blcOrderMultishipOptionTable;
    }

    public BlcOrderOfferCodeXrefTable getBlcOrderOfferCodeXrefTable() {
        if (blcOrderOfferCodeXrefTable == null) {
            blcOrderOfferCodeXrefTable = new BlcOrderOfferCodeXrefTable(dataSource);
        }
        return blcOrderOfferCodeXrefTable;
    }

    public BlcOrderPaymentTable getBlcOrderPaymentTable() {
        if (blcOrderPaymentTable == null) {
            blcOrderPaymentTable = new BlcOrderPaymentTable(dataSource);
        }
        return blcOrderPaymentTable;
    }

    public BlcOrderPaymentDetailsTable getBlcOrderPaymentDetailsTable() {
        if (blcOrderPaymentDetailsTable == null) {
            blcOrderPaymentDetailsTable = new BlcOrderPaymentDetailsTable(dataSource);
        }
        return blcOrderPaymentDetailsTable;
    }

    public BlcPageTable getBlcPageTable() {
        if (blcPageTable == null) {
            blcPageTable = new BlcPageTable(dataSource);
        }
        return blcPageTable;
    }

    public BlcPageFldTable getBlcPageFldTable() {
        if (blcPageFldTable == null) {
            blcPageFldTable = new BlcPageFldTable(dataSource);
        }
        return blcPageFldTable;
    }

    public BlcPageFldMapTable getBlcPageFldMapTable() {
        if (blcPageFldMapTable == null) {
            blcPageFldMapTable = new BlcPageFldMapTable(dataSource);
        }
        return blcPageFldMapTable;
    }

    public BlcPageItemCriteriaTable getBlcPageItemCriteriaTable() {
        if (blcPageItemCriteriaTable == null) {
            blcPageItemCriteriaTable = new BlcPageItemCriteriaTable(dataSource);
        }
        return blcPageItemCriteriaTable;
    }

    public BlcPageRuleTable getBlcPageRuleTable() {
        if (blcPageRuleTable == null) {
            blcPageRuleTable = new BlcPageRuleTable(dataSource);
        }
        return blcPageRuleTable;
    }

    public BlcPageRuleMapTable getBlcPageRuleMapTable() {
        if (blcPageRuleMapTable == null) {
            blcPageRuleMapTable = new BlcPageRuleMapTable(dataSource);
        }
        return blcPageRuleMapTable;
    }

    public BlcPageTmpltTable getBlcPageTmpltTable() {
        if (blcPageTmpltTable == null) {
            blcPageTmpltTable = new BlcPageTmpltTable(dataSource);
        }
        return blcPageTmpltTable;
    }

    public BlcPayinfoAdditionalFieldsTable getBlcPayinfoAdditionalFieldsTable() {
        if (blcPayinfoAdditionalFieldsTable == null) {
            blcPayinfoAdditionalFieldsTable = new BlcPayinfoAdditionalFieldsTable(dataSource);
        }
        return blcPayinfoAdditionalFieldsTable;
    }

    public BlcPaymentAdditionalFieldsTable getBlcPaymentAdditionalFieldsTable() {
        if (blcPaymentAdditionalFieldsTable == null) {
            blcPaymentAdditionalFieldsTable = new BlcPaymentAdditionalFieldsTable(dataSource);
        }
        return blcPaymentAdditionalFieldsTable;
    }

    public BlcPaymentLogTable getBlcPaymentLogTable() {
        if (blcPaymentLogTable == null) {
            blcPaymentLogTable = new BlcPaymentLogTable(dataSource);
        }
        return blcPaymentLogTable;
    }

    public BlcPaymentResponseItemTable getBlcPaymentResponseItemTable() {
        if (blcPaymentResponseItemTable == null) {
            blcPaymentResponseItemTable = new BlcPaymentResponseItemTable(dataSource);
        }
        return blcPaymentResponseItemTable;
    }

    public BlcPersonalMessageTable getBlcPersonalMessageTable() {
        if (blcPersonalMessageTable == null) {
            blcPersonalMessageTable = new BlcPersonalMessageTable(dataSource);
        }
        return blcPersonalMessageTable;
    }

    public BlcPgtmpltFldgrpXrefTable getBlcPgtmpltFldgrpXrefTable() {
        if (blcPgtmpltFldgrpXrefTable == null) {
            blcPgtmpltFldgrpXrefTable = new BlcPgtmpltFldgrpXrefTable(dataSource);
        }
        return blcPgtmpltFldgrpXrefTable;
    }

    public BlcPhoneTable getBlcPhoneTable() {
        if (blcPhoneTable == null) {
            blcPhoneTable = new BlcPhoneTable(dataSource);
        }
        return blcPhoneTable;
    }

    public BlcProductTable getBlcProductTable() {
        if (blcProductTable == null) {
            blcProductTable = new BlcProductTable(dataSource);
        }
        return blcProductTable;
    }

    public BlcProductAttributeTable getBlcProductAttributeTable() {
        if (blcProductAttributeTable == null) {
            blcProductAttributeTable = new BlcProductAttributeTable(dataSource);
        }
        return blcProductAttributeTable;
    }

    public BlcProductBundleTable getBlcProductBundleTable() {
        if (blcProductBundleTable == null) {
            blcProductBundleTable = new BlcProductBundleTable(dataSource);
        }
        return blcProductBundleTable;
    }

    public BlcProductCrossSaleTable getBlcProductCrossSaleTable() {
        if (blcProductCrossSaleTable == null) {
            blcProductCrossSaleTable = new BlcProductCrossSaleTable(dataSource);
        }
        return blcProductCrossSaleTable;
    }

    public BlcProductFeaturedTable getBlcProductFeaturedTable() {
        if (blcProductFeaturedTable == null) {
            blcProductFeaturedTable = new BlcProductFeaturedTable(dataSource);
        }
        return blcProductFeaturedTable;
    }

    public BlcProductOptionTable getBlcProductOptionTable() {
        if (blcProductOptionTable == null) {
            blcProductOptionTable = new BlcProductOptionTable(dataSource);
        }
        return blcProductOptionTable;
    }

    public BlcProductOptionValueTable getBlcProductOptionValueTable() {
        if (blcProductOptionValueTable == null) {
            blcProductOptionValueTable = new BlcProductOptionValueTable(dataSource);
        }
        return blcProductOptionValueTable;
    }

    public BlcProductOptionXrefTable getBlcProductOptionXrefTable() {
        if (blcProductOptionXrefTable == null) {
            blcProductOptionXrefTable = new BlcProductOptionXrefTable(dataSource);
        }
        return blcProductOptionXrefTable;
    }

    public BlcProductSkuXrefTable getBlcProductSkuXrefTable() {
        if (blcProductSkuXrefTable == null) {
            blcProductSkuXrefTable = new BlcProductSkuXrefTable(dataSource);
        }
        return blcProductSkuXrefTable;
    }

    public BlcProductUpSaleTable getBlcProductUpSaleTable() {
        if (blcProductUpSaleTable == null) {
            blcProductUpSaleTable = new BlcProductUpSaleTable(dataSource);
        }
        return blcProductUpSaleTable;
    }

    public BlcQualCritOfferXrefTable getBlcQualCritOfferXrefTable() {
        if (blcQualCritOfferXrefTable == null) {
            blcQualCritOfferXrefTable = new BlcQualCritOfferXrefTable(dataSource);
        }
        return blcQualCritOfferXrefTable;
    }

    public BlcQualCritPageXrefTable getBlcQualCritPageXrefTable() {
        if (blcQualCritPageXrefTable == null) {
            blcQualCritPageXrefTable = new BlcQualCritPageXrefTable(dataSource);
        }
        return blcQualCritPageXrefTable;
    }

    public BlcQualCritScXrefTable getBlcQualCritScXrefTable() {
        if (blcQualCritScXrefTable == null) {
            blcQualCritScXrefTable = new BlcQualCritScXrefTable(dataSource);
        }
        return blcQualCritScXrefTable;
    }

    public BlcRatingDetailTable getBlcRatingDetailTable() {
        if (blcRatingDetailTable == null) {
            blcRatingDetailTable = new BlcRatingDetailTable(dataSource);
        }
        return blcRatingDetailTable;
    }

    public BlcRatingSummaryTable getBlcRatingSummaryTable() {
        if (blcRatingSummaryTable == null) {
            blcRatingSummaryTable = new BlcRatingSummaryTable(dataSource);
        }
        return blcRatingSummaryTable;
    }

    public BlcReviewDetailTable getBlcReviewDetailTable() {
        if (blcReviewDetailTable == null) {
            blcReviewDetailTable = new BlcReviewDetailTable(dataSource);
        }
        return blcReviewDetailTable;
    }

    public BlcReviewFeedbackTable getBlcReviewFeedbackTable() {
        if (blcReviewFeedbackTable == null) {
            blcReviewFeedbackTable = new BlcReviewFeedbackTable(dataSource);
        }
        return blcReviewFeedbackTable;
    }

    public BlcRoleTable getBlcRoleTable() {
        if (blcRoleTable == null) {
            blcRoleTable = new BlcRoleTable(dataSource);
        }
        return blcRoleTable;
    }

    public BlcSandboxTable getBlcSandboxTable() {
        if (blcSandboxTable == null) {
            blcSandboxTable = new BlcSandboxTable(dataSource);
        }
        return blcSandboxTable;
    }

    public BlcSandboxActionTable getBlcSandboxActionTable() {
        if (blcSandboxActionTable == null) {
            blcSandboxActionTable = new BlcSandboxActionTable(dataSource);
        }
        return blcSandboxActionTable;
    }

    public BlcSandboxItemTable getBlcSandboxItemTable() {
        if (blcSandboxItemTable == null) {
            blcSandboxItemTable = new BlcSandboxItemTable(dataSource);
        }
        return blcSandboxItemTable;
    }

    public BlcScTable getBlcScTable() {
        if (blcScTable == null) {
            blcScTable = new BlcScTable(dataSource);
        }
        return blcScTable;
    }

    public BlcScFldTable getBlcScFldTable() {
        if (blcScFldTable == null) {
            blcScFldTable = new BlcScFldTable(dataSource);
        }
        return blcScFldTable;
    }

    public BlcScFldMapTable getBlcScFldMapTable() {
        if (blcScFldMapTable == null) {
            blcScFldMapTable = new BlcScFldMapTable(dataSource);
        }
        return blcScFldMapTable;
    }

    public BlcScFldTmpltTable getBlcScFldTmpltTable() {
        if (blcScFldTmpltTable == null) {
            blcScFldTmpltTable = new BlcScFldTmpltTable(dataSource);
        }
        return blcScFldTmpltTable;
    }

    public BlcScFldgrpXrefTable getBlcScFldgrpXrefTable() {
        if (blcScFldgrpXrefTable == null) {
            blcScFldgrpXrefTable = new BlcScFldgrpXrefTable(dataSource);
        }
        return blcScFldgrpXrefTable;
    }

    public BlcScItemCriteriaTable getBlcScItemCriteriaTable() {
        if (blcScItemCriteriaTable == null) {
            blcScItemCriteriaTable = new BlcScItemCriteriaTable(dataSource);
        }
        return blcScItemCriteriaTable;
    }

    public BlcScRuleTable getBlcScRuleTable() {
        if (blcScRuleTable == null) {
            blcScRuleTable = new BlcScRuleTable(dataSource);
        }
        return blcScRuleTable;
    }

    public BlcScRuleMapTable getBlcScRuleMapTable() {
        if (blcScRuleMapTable == null) {
            blcScRuleMapTable = new BlcScRuleMapTable(dataSource);
        }
        return blcScRuleMapTable;
    }

    public BlcScTypeTable getBlcScTypeTable() {
        if (blcScTypeTable == null) {
            blcScTypeTable = new BlcScTypeTable(dataSource);
        }
        return blcScTypeTable;
    }

    public BlcSearchFacetTable getBlcSearchFacetTable() {
        if (blcSearchFacetTable == null) {
            blcSearchFacetTable = new BlcSearchFacetTable(dataSource);
        }
        return blcSearchFacetTable;
    }

    public BlcSearchFacetRangeTable getBlcSearchFacetRangeTable() {
        if (blcSearchFacetRangeTable == null) {
            blcSearchFacetRangeTable = new BlcSearchFacetRangeTable(dataSource);
        }
        return blcSearchFacetRangeTable;
    }

    public BlcSearchFacetXrefTable getBlcSearchFacetXrefTable() {
        if (blcSearchFacetXrefTable == null) {
            blcSearchFacetXrefTable = new BlcSearchFacetXrefTable(dataSource);
        }
        return blcSearchFacetXrefTable;
    }

    public BlcSearchInterceptTable getBlcSearchInterceptTable() {
        if (blcSearchInterceptTable == null) {
            blcSearchInterceptTable = new BlcSearchInterceptTable(dataSource);
        }
        return blcSearchInterceptTable;
    }

    public BlcSearchSynonymTable getBlcSearchSynonymTable() {
        if (blcSearchSynonymTable == null) {
            blcSearchSynonymTable = new BlcSearchSynonymTable(dataSource);
        }
        return blcSearchSynonymTable;
    }

    public BlcShippingRateTable getBlcShippingRateTable() {
        if (blcShippingRateTable == null) {
            blcShippingRateTable = new BlcShippingRateTable(dataSource);
        }
        return blcShippingRateTable;
    }

    public BlcSiteTable getBlcSiteTable() {
        if (blcSiteTable == null) {
            blcSiteTable = new BlcSiteTable(dataSource);
        }
        return blcSiteTable;
    }

    public BlcSiteCatalogTable getBlcSiteCatalogTable() {
        if (blcSiteCatalogTable == null) {
            blcSiteCatalogTable = new BlcSiteCatalogTable(dataSource);
        }
        return blcSiteCatalogTable;
    }

    public BlcSiteSandboxTable getBlcSiteSandboxTable() {
        if (blcSiteSandboxTable == null) {
            blcSiteSandboxTable = new BlcSiteSandboxTable(dataSource);
        }
        return blcSiteSandboxTable;
    }

    public BlcSkuTable getBlcSkuTable() {
        if (blcSkuTable == null) {
            blcSkuTable = new BlcSkuTable(dataSource);
        }
        return blcSkuTable;
    }

    public BlcSkuAttributeTable getBlcSkuAttributeTable() {
        if (blcSkuAttributeTable == null) {
            blcSkuAttributeTable = new BlcSkuAttributeTable(dataSource);
        }
        return blcSkuAttributeTable;
    }

    public BlcSkuAvailabilityTable getBlcSkuAvailabilityTable() {
        if (blcSkuAvailabilityTable == null) {
            blcSkuAvailabilityTable = new BlcSkuAvailabilityTable(dataSource);
        }
        return blcSkuAvailabilityTable;
    }

    public BlcSkuBundleItemTable getBlcSkuBundleItemTable() {
        if (blcSkuBundleItemTable == null) {
            blcSkuBundleItemTable = new BlcSkuBundleItemTable(dataSource);
        }
        return blcSkuBundleItemTable;
    }

    public BlcSkuFeeTable getBlcSkuFeeTable() {
        if (blcSkuFeeTable == null) {
            blcSkuFeeTable = new BlcSkuFeeTable(dataSource);
        }
        return blcSkuFeeTable;
    }

    public BlcSkuFeeXrefTable getBlcSkuFeeXrefTable() {
        if (blcSkuFeeXrefTable == null) {
            blcSkuFeeXrefTable = new BlcSkuFeeXrefTable(dataSource);
        }
        return blcSkuFeeXrefTable;
    }

    public BlcSkuFulfillmentExcludedTable getBlcSkuFulfillmentExcludedTable() {
        if (blcSkuFulfillmentExcludedTable == null) {
            blcSkuFulfillmentExcludedTable = new BlcSkuFulfillmentExcludedTable(dataSource);
        }
        return blcSkuFulfillmentExcludedTable;
    }

    public BlcSkuFulfillmentFlatRatesTable getBlcSkuFulfillmentFlatRatesTable() {
        if (blcSkuFulfillmentFlatRatesTable == null) {
            blcSkuFulfillmentFlatRatesTable = new BlcSkuFulfillmentFlatRatesTable(dataSource);
        }
        return blcSkuFulfillmentFlatRatesTable;
    }

    public BlcSkuMediaMapTable getBlcSkuMediaMapTable() {
        if (blcSkuMediaMapTable == null) {
            blcSkuMediaMapTable = new BlcSkuMediaMapTable(dataSource);
        }
        return blcSkuMediaMapTable;
    }

    public BlcSkuOptionValueXrefTable getBlcSkuOptionValueXrefTable() {
        if (blcSkuOptionValueXrefTable == null) {
            blcSkuOptionValueXrefTable = new BlcSkuOptionValueXrefTable(dataSource);
        }
        return blcSkuOptionValueXrefTable;
    }

    public BlcStateTable getBlcStateTable() {
        if (blcStateTable == null) {
            blcStateTable = new BlcStateTable(dataSource);
        }
        return blcStateTable;
    }

    public BlcStaticAssetTable getBlcStaticAssetTable() {
        if (blcStaticAssetTable == null) {
            blcStaticAssetTable = new BlcStaticAssetTable(dataSource);
        }
        return blcStaticAssetTable;
    }

    public BlcStaticAssetDescTable getBlcStaticAssetDescTable() {
        if (blcStaticAssetDescTable == null) {
            blcStaticAssetDescTable = new BlcStaticAssetDescTable(dataSource);
        }
        return blcStaticAssetDescTable;
    }

    public BlcStaticAssetStrgTable getBlcStaticAssetStrgTable() {
        if (blcStaticAssetStrgTable == null) {
            blcStaticAssetStrgTable = new BlcStaticAssetStrgTable(dataSource);
        }
        return blcStaticAssetStrgTable;
    }

    public BlcStoreTable getBlcStoreTable() {
        if (blcStoreTable == null) {
            blcStoreTable = new BlcStoreTable(dataSource);
        }
        return blcStoreTable;
    }

    public BlcSystemPropertyTable getBlcSystemPropertyTable() {
        if (blcSystemPropertyTable == null) {
            blcSystemPropertyTable = new BlcSystemPropertyTable(dataSource);
        }
        return blcSystemPropertyTable;
    }

    public BlcTarCritOfferXrefTable getBlcTarCritOfferXrefTable() {
        if (blcTarCritOfferXrefTable == null) {
            blcTarCritOfferXrefTable = new BlcTarCritOfferXrefTable(dataSource);
        }
        return blcTarCritOfferXrefTable;
    }

    public BlcTaxDetailTable getBlcTaxDetailTable() {
        if (blcTaxDetailTable == null) {
            blcTaxDetailTable = new BlcTaxDetailTable(dataSource);
        }
        return blcTaxDetailTable;
    }

    public BlcTranslationTable getBlcTranslationTable() {
        if (blcTranslationTable == null) {
            blcTranslationTable = new BlcTranslationTable(dataSource);
        }
        return blcTranslationTable;
    }

    public BlcUrlHandlerTable getBlcUrlHandlerTable() {
        if (blcUrlHandlerTable == null) {
            blcUrlHandlerTable = new BlcUrlHandlerTable(dataSource);
        }
        return blcUrlHandlerTable;
    }

    public BlcUserconnectionTable getBlcUserconnectionTable() {
        if (blcUserconnectionTable == null) {
            blcUserconnectionTable = new BlcUserconnectionTable(dataSource);
        }
        return blcUserconnectionTable;
    }

    public BlcZipCodeTable getBlcZipCodeTable() {
        if (blcZipCodeTable == null) {
            blcZipCodeTable = new BlcZipCodeTable(dataSource);
        }
        return blcZipCodeTable;
    }

    public SandboxItemActionTable getSandboxItemActionTable() {
        if (sandboxItemActionTable == null) {
            sandboxItemActionTable = new SandboxItemActionTable(dataSource);
        }
        return sandboxItemActionTable;
    }

    public SequenceGeneratorTable getSequenceGeneratorTable() {
        if (sequenceGeneratorTable == null) {
            sequenceGeneratorTable = new SequenceGeneratorTable(dataSource);
        }
        return sequenceGeneratorTable;
    }

}
