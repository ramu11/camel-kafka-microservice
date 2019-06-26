package com.marriott.poc.crm.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marriott.poc.crm.model.kafka.submodel.STRING_TYPE;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class S_DOC_QUOTE_IN {

	@JsonProperty
	private String ROW_ID;
	@JsonProperty
	private String CREATED;
	@JsonProperty
	private String CREATED_BY;
	@JsonProperty
	private String LAST_UPD;
	@JsonProperty
	private String LAST_UPD_BY;
	@JsonProperty
	private STRING_TYPE DCKING_NUM;
	@JsonProperty
	private float MODIFICATION_NUM;
	@JsonProperty
	private String CONFLICT_ID;
	@JsonProperty
	private String ACTIVE_CFG_FLG;
	@JsonProperty
	private String BU_ID;
	@JsonProperty
	private String CRDT_CHK_PASSD_FLG;
	@JsonProperty
	private String NAME;
	@JsonProperty
	private String OPEN_ORDER_FLG;
	@JsonProperty
	private String QUOTE_NUM;
	@JsonProperty
	private String REV_NUM;
	@JsonProperty
	private String TEMPLATE_FLG;
	@JsonProperty
	private String TEST_QUOTE_FLG;
	@JsonProperty
	private STRING_TYPE CURCY_CD;
	@JsonProperty
	private String ACTIVE_FLG;
	@JsonProperty
	private String ACTL_AMT;
	@JsonProperty
	private String ACTL_AMT_DT;
	@JsonProperty
	private String ACTL_UNITS;
	@JsonProperty
	private String APPROVED_FLG;
	@JsonProperty
	private String CG_FCST_AMT;
	@JsonProperty
	private String CG_FCST_DT;
	@JsonProperty
	private String CG_FCST_UNITS;
	@JsonProperty
	private STRING_TYPE DB_LAST_UPD;
	@JsonProperty
	private String DISCNT_AMT;
	@JsonProperty
	private String DISCNT_AMT_RC;
	@JsonProperty
	private String DISCNT_PERCENT;
	@JsonProperty
	private String DISCNT_RC_PCT;
	@JsonProperty
	private String DUE_DT;
	@JsonProperty
	private String EAI_SYNC_DT;
	@JsonProperty
	private String EFF_BILL_DT;
	@JsonProperty
	private String EFF_END_DT;
	@JsonProperty
	private String EFF_START_DT;
	@JsonProperty
	private String EXCH_DT;
	@JsonProperty
	private String HIST_AMT;
	@JsonProperty
	private String HIST_AMT_DT;
	@JsonProperty
	private String HIST_UNITS;
	@JsonProperty
	private String OUT_DUE_DT;
	@JsonProperty
	private String PRICING_DT;
	@JsonProperty
	private String QUOTE_EXCH_DT;
	@JsonProperty
	private String REV_DT;
	@JsonProperty
	private String SENT_TO_CUST_FLG;
	@JsonProperty
	private String STATUS_DT;
	@JsonProperty
	private String TGT_AMT;
	@JsonProperty
	private String TGT_AMT_DT;
	@JsonProperty
	private String TGT_UNITS;
	@JsonProperty
	private String USAGE_DISCNT_AMT;
	@JsonProperty
	private String VERIFY_DT;
	@JsonProperty
	private String XFER_EFFECTIVE_DT;
	@JsonProperty
	private String ACTIVITY_ID;
	@JsonProperty
	private String ADDR_1_CON_ID;
	@JsonProperty
	private String ADDR_1_ID;
	@JsonProperty
	private String ADDR_2_CON_ID;
	@JsonProperty
	private String ADDR_2_ID;
	@JsonProperty
	private String ADDR_3_CON_ID;
	@JsonProperty
	private String ADDR_3_ID;
	@JsonProperty
	private String ADDR_4_CON_ID;
	@JsonProperty
	private String ADDR_4_ID;
	@JsonProperty
	private String AGREE_SD_ID;
	@JsonProperty
	private String AMT_CURCY_CD;
	@JsonProperty
	private String APPR_BY_EMP_ID;
	@JsonProperty
	private String BILL_PERIOD_CD;
	@JsonProperty
	private String BL_ACCT_ID;
	@JsonProperty
	private String BL_ADDR_ID;
	@JsonProperty
	private String BL_CON_ID;
	@JsonProperty
	private String BL_OU_ID;
	@JsonProperty
	private String BL_PER_ADDR_ID;
	@JsonProperty
	private String CASE_ID;
	@JsonProperty
	private String CG_DLVRSPRD_TYP_CD;
	@JsonProperty
	private String CG_DLVR_PERIOD_CD;
	@JsonProperty
	private String CG_RETAILPRILST_ID;
	@JsonProperty
	private String CMPND_PROD_NUM;
	@JsonProperty
	private String CON_PER_ID;
	@JsonProperty
	private String CTLG_ID;
	@JsonProperty
	private String CUSTOMER_ID;
	@JsonProperty
	private String CUST_ACCNT_ID;
	@JsonProperty
	private STRING_TYPE DB_LAST_UPD_SRC;
	@JsonProperty
	private String DESC_TEXT;
	@JsonProperty
	private String DISCNT_REASON;
	@JsonProperty
	private String DISCNT_REASON_RC;
	@JsonProperty
	private String DISCON_RSN_CD;
	@JsonProperty
	private String DISPLAY_TYPE_CD;
	@JsonProperty
	private String DLVRY_SPRD_ID;
	@JsonProperty
	private String ENTLMNT_ID;
	@JsonProperty
	private String FILE_CD;
	@JsonProperty
	private String FILE_NAME;
	@JsonProperty
	private String HOLD_REASON;
	@JsonProperty
	private String INTEGRATION_ID;
	@JsonProperty
	private String LOY_MEMBER_ID;
	@JsonProperty
	private String OPTY_ID;
	@JsonProperty
	private String PAR_SD_ID;
	@JsonProperty
	private String PAYMENT_TERM_ID;
	@JsonProperty
	private String PAY_OU_ID;
	@JsonProperty
	private String PEC_WF_PROC_NAME;
	@JsonProperty
	private String PERIOD_ID;
	@JsonProperty
	private String PRDINT_ID;
	@JsonProperty
	private String PRI_BY_PER_ID;
	@JsonProperty
	private String PRI_LST_ID;
	@JsonProperty
	private String PRI_WF_PROC_NAME;
	@JsonProperty
	private String PROJ_ID;
	@JsonProperty
	private String PROMO_DCP_ID;
	@JsonProperty
	private String PROMO_ID;
	@JsonProperty
	private String PRSP_CONTACT_ID;
	@JsonProperty
	private String PR_PAYMENT_ID;
	@JsonProperty
	private String PR_QUOTE_SOLN_ID;
	@JsonProperty
	private String PR_REP_PER_ID;
	@JsonProperty
	private String QUOTE_SUB_TYPE_CD;
	@JsonProperty
	private STRING_TYPE QUOTE_TYPE;
	@JsonProperty
	private String RATE_LST_ID;
	@JsonProperty
	private String REGION_ID;
	@JsonProperty
	private String SALES_REP_POSTN_ID;
	@JsonProperty
	private String SEASON_ID;
	@JsonProperty
	private String SERV_ACCNT_ID;
	@JsonProperty
	private String SHIP_ADDR_ID;
	@JsonProperty
	private String SHIP_CON_ID;
	@JsonProperty
	private String SHIP_OU_ID;
	@JsonProperty
	private String SHIP_PER_ADDR_ID;
	@JsonProperty
	private String SRC_INVLOC_ID;
	@JsonProperty
	private String SRV_REQ_ID;
	@JsonProperty
	private String STAT_CD;
	@JsonProperty
	private String SUBTYPE_CD;
	@JsonProperty
	private String TARGET_OU_ID;
	@JsonProperty
	private String TARGET_POSTN_ID;
	@JsonProperty
	private String WAREHOUSE_CD;
	@JsonProperty
	private String CMT_ARCHIVE_CD;
	@JsonProperty
	private String X_FN_PROJ_REVIEWED_BY;
	@JsonProperty
	private String X_FN_PROJ_REVIEWED_DATE;
	@JsonProperty
	private String X_RB_PROJ_UPDATED_BY;
	@JsonProperty
	private String X_RB_PROJ_UPDATED_DATE;
	@JsonProperty
	private String X_BILLING_COMMENTS_TEXT;
	@JsonProperty
	private String ROW_OP;
}