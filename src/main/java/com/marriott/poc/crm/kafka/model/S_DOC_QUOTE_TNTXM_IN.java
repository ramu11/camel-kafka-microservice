package com.marriott.poc.crm.kafka.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ROW_ID",
"CREATED",
"CREATED_BY",
"LAST_UPD",
"LAST_UPD_BY",
"MODIFICATION_NUM",
"CONFLICT_ID",
"PAR_ROW_ID",
"BILL_APPRVD_FLG",
"BILL_RECVD_FLG",
"CR_REQ_SENT_FLG",
"CR_SUBMITTED_FLG",
"NAME",
"TYPE",
"FOLIO_STATUS_CD",
"AMT_EXCH_DT",
"COMMISION_AMT",
"COMMISION_PCT",
"CR_REQ_AMT",
"CR_REQ_DT",
"DB_LAST_UPD",
"FOLIO_CANCEL_DT",
"INCRMNTL_REV_AMT",
"PMS_SETUP_DT",
"ACCNT_CHARGE_CD",
"AMT_CURCY_CD",
"AUTH_SIGNERS_TXT",
"BILL_MTHD_CD",
"COMMENTS",
"CON_ID",
"COVER_CHRG_TXT",
"CR_REQ_BY_ID",
"CR_REQ_STATUS_CD",
"CR_REQ_TYPE_CD",
"DB_LAST_UPD_SRC",
"DESC_TEXT",
"FOLIO_NUM",
"HSNG_ORG_ID",
"MARKET_CODE",
"OU_NUM",
"PMS_ACCNT_ID",
"PMS_BL_ADDR_ID",
"PMS_CONTACT_ID",
"PMS_PAY_MTHD_CD",
"PMS_STATUS_CD",
"PMS_TYPE_CD",
"QUOTE_RMBLK_ID",
"RESVTN_MTHD_CD",
"RESVTN_TYPE_CD",
"ROOM_TYPE_ID",
"ROW_OP"
})
public class S_DOC_QUOTE_TNTXM_IN {

@JsonProperty("ROW_ID")
private String rOWID;
@JsonProperty("CREATED")
private String cREATED;
@JsonProperty("CREATED_BY")
private String cREATEDBY;
@JsonProperty("LAST_UPD")
private String lASTUPD;
@JsonProperty("LAST_UPD_BY")
private String lASTUPDBY;
@JsonProperty("MODIFICATION_NUM")
private Integer mODIFICATIONNUM;
@JsonProperty("CONFLICT_ID")
private String cONFLICTID;
@JsonProperty("PAR_ROW_ID")
private String pARROWID;
@JsonProperty("BILL_APPRVD_FLG")
private String bILLAPPRVDFLG;
@JsonProperty("BILL_RECVD_FLG")
private String bILLRECVDFLG;
@JsonProperty("CR_REQ_SENT_FLG")
private String cRREQSENTFLG;
@JsonProperty("CR_SUBMITTED_FLG")
private String cRSUBMITTEDFLG;
@JsonProperty("NAME")
private String nAME;
@JsonProperty("TYPE")
private String tYPE;
@JsonProperty("FOLIO_STATUS_CD")
private JsonNode fOLIOSTATUSCD;
@JsonProperty("AMT_EXCH_DT")
private String aMTEXCHDT;
@JsonProperty("COMMISION_AMT")
private String cOMMISIONAMT;
@JsonProperty("COMMISION_PCT")
private String cOMMISIONPCT;
@JsonProperty("CR_REQ_AMT")
private String cRREQAMT;
@JsonProperty("CR_REQ_DT")
private String cRREQDT;
@JsonProperty("DB_LAST_UPD")
private JsonNode dBLASTUPD;
@JsonProperty("FOLIO_CANCEL_DT")
private String fOLIOCANCELDT;
@JsonProperty("INCRMNTL_REV_AMT")
private JsonNode iNCRMNTLREVAMT;
@JsonProperty("PMS_SETUP_DT")
private String pMSSETUPDT;
@JsonProperty("ACCNT_CHARGE_CD")
private String aCCNTCHARGECD;
@JsonProperty("AMT_CURCY_CD")
private String aMTCURCYCD;
@JsonProperty("AUTH_SIGNERS_TXT")
private String aUTHSIGNERSTXT;
@JsonProperty("BILL_MTHD_CD")
private String bILLMTHDCD;
@JsonProperty("COMMENTS")
private String cOMMENTS;
@JsonProperty("CON_ID")
private String cONID;
@JsonProperty("COVER_CHRG_TXT")
private String cOVERCHRGTXT;
@JsonProperty("CR_REQ_BY_ID")
private String cRREQBYID;
@JsonProperty("CR_REQ_STATUS_CD")
private String cRREQSTATUSCD;
@JsonProperty("CR_REQ_TYPE_CD")
private String cRREQTYPECD;
@JsonProperty("DB_LAST_UPD_SRC")
private JsonNode dBLASTUPDSRC;
@JsonProperty("DESC_TEXT")
private String dESCTEXT;
@JsonProperty("FOLIO_NUM")
private String fOLIONUM;
@JsonProperty("HSNG_ORG_ID")
private String hSNGORGID;
@JsonProperty("MARKET_CODE")
private String mARKETCODE;
@JsonProperty("OU_NUM")
private String oUNUM;
@JsonProperty("PMS_ACCNT_ID")
private String pMSACCNTID;
@JsonProperty("PMS_BL_ADDR_ID")
private String pMSBLADDRID;
@JsonProperty("PMS_CONTACT_ID")
private String pMSCONTACTID;
@JsonProperty("PMS_PAY_MTHD_CD")
private String pMSPAYMTHDCD;
@JsonProperty("PMS_STATUS_CD")
private String pMSSTATUSCD;
@JsonProperty("PMS_TYPE_CD")
private String pMSTYPECD;
@JsonProperty("QUOTE_RMBLK_ID")
private String qUOTERMBLKID;
@JsonProperty("RESVTN_MTHD_CD")
private String rESVTNMTHDCD;
@JsonProperty("RESVTN_TYPE_CD")
private String rESVTNTYPECD;
@JsonProperty("ROOM_TYPE_ID")
private String rOOMTYPEID;
@JsonProperty("ROW_OP")
private String rOWOP;
@JsonIgnore
private Map<String, String> additionalProperties = new HashMap<String, String>();

@JsonProperty("ROW_ID")
public String getROWID() {
return rOWID;
 }

@JsonProperty("ROW_ID")
public void setROWID(String rOWID) {
this.rOWID = rOWID;
 }

@JsonProperty("CREATED")
public String getCREATED() {
return cREATED;
 }

@JsonProperty("CREATED")
public void setCREATED(String cREATED) {
this.cREATED = cREATED;
 }

@JsonProperty("CREATED_BY")
public String getCREATEDBY() {
return cREATEDBY;
 }

@JsonProperty("CREATED_BY")
public void setCREATEDBY(String cREATEDBY) {
this.cREATEDBY = cREATEDBY;
 }

@JsonProperty("LAST_UPD")
public String getLASTUPD() {
return lASTUPD;
 }

@JsonProperty("LAST_UPD")
public void setLASTUPD(String lASTUPD) {
this.lASTUPD = lASTUPD;
 }

@JsonProperty("LAST_UPD_BY")
public String getLASTUPDBY() {
return lASTUPDBY;
 }

@JsonProperty("LAST_UPD_BY")
public void setLASTUPDBY(String lASTUPDBY) {
this.lASTUPDBY = lASTUPDBY;
 }

@JsonProperty("MODIFICATION_NUM")
public Integer getMODIFICATIONNUM() {
return mODIFICATIONNUM;
 }

@JsonProperty("MODIFICATION_NUM")
public void setMODIFICATIONNUM(Integer mODIFICATIONNUM) {
this.mODIFICATIONNUM = mODIFICATIONNUM;
 }

@JsonProperty("CONFLICT_ID")
public String getCONFLICTID() {
return cONFLICTID;
 }

@JsonProperty("CONFLICT_ID")
public void setCONFLICTID(String cONFLICTID) {
this.cONFLICTID = cONFLICTID;
 }

@JsonProperty("PAR_ROW_ID")
public String getPARROWID() {
return pARROWID;
 }

@JsonProperty("PAR_ROW_ID")
public void setPARROWID(String pARROWID) {
this.pARROWID = pARROWID;
 }

@JsonProperty("BILL_APPRVD_FLG")
public String getBILLAPPRVDFLG() {
return bILLAPPRVDFLG;
 }

@JsonProperty("BILL_APPRVD_FLG")
public void setBILLAPPRVDFLG(String bILLAPPRVDFLG) {
this.bILLAPPRVDFLG = bILLAPPRVDFLG;
 }

@JsonProperty("BILL_RECVD_FLG")
public String getBILLRECVDFLG() {
return bILLRECVDFLG;
 }

@JsonProperty("BILL_RECVD_FLG")
public void setBILLRECVDFLG(String bILLRECVDFLG) {
this.bILLRECVDFLG = bILLRECVDFLG;
 }

@JsonProperty("CR_REQ_SENT_FLG")
public String getCRREQSENTFLG() {
return cRREQSENTFLG;
 }

@JsonProperty("CR_REQ_SENT_FLG")
public void setCRREQSENTFLG(String cRREQSENTFLG) {
this.cRREQSENTFLG = cRREQSENTFLG;
 }

@JsonProperty("CR_SUBMITTED_FLG")
public String getCRSUBMITTEDFLG() {
return cRSUBMITTEDFLG;
 }

@JsonProperty("CR_SUBMITTED_FLG")
public void setCRSUBMITTEDFLG(String cRSUBMITTEDFLG) {
this.cRSUBMITTEDFLG = cRSUBMITTEDFLG;
 }

@JsonProperty("NAME")
public String getNAME() {
return nAME;
 }

@JsonProperty("NAME")
public void setNAME(String nAME) {
this.nAME = nAME;
 }

@JsonProperty("TYPE")
public String getTYPE() {
return tYPE;
 }

@JsonProperty("TYPE")
public void setTYPE(String tYPE) {
this.tYPE = tYPE;
 }

@JsonProperty("FOLIO_STATUS_CD")
public JsonNode getFOLIOSTATUSCD() {
return fOLIOSTATUSCD;
 }

@JsonProperty("FOLIO_STATUS_CD")
public void setFOLIOSTATUSCD(JsonNode fOLIOSTATUSCD) {
this.fOLIOSTATUSCD = fOLIOSTATUSCD;
 }

@JsonProperty("AMT_EXCH_DT")
public String getAMTEXCHDT() {
return aMTEXCHDT;
 }

@JsonProperty("AMT_EXCH_DT")
public void setAMTEXCHDT(String aMTEXCHDT) {
this.aMTEXCHDT = aMTEXCHDT;
 }

@JsonProperty("COMMISION_AMT")
public String getCOMMISIONAMT() {
return cOMMISIONAMT;
 }

@JsonProperty("COMMISION_AMT")
public void setCOMMISIONAMT(String cOMMISIONAMT) {
this.cOMMISIONAMT = cOMMISIONAMT;
 }

@JsonProperty("COMMISION_PCT")
public String getCOMMISIONPCT() {
return cOMMISIONPCT;
 }

@JsonProperty("COMMISION_PCT")
public void setCOMMISIONPCT(String cOMMISIONPCT) {
this.cOMMISIONPCT = cOMMISIONPCT;
 }

@JsonProperty("CR_REQ_AMT")
public String getCRREQAMT() {
return cRREQAMT;
 }

@JsonProperty("CR_REQ_AMT")
public void setCRREQAMT(String cRREQAMT) {
this.cRREQAMT = cRREQAMT;
 }

@JsonProperty("CR_REQ_DT")
public String getCRREQDT() {
return cRREQDT;
 }

@JsonProperty("CR_REQ_DT")
public void setCRREQDT(String cRREQDT) {
this.cRREQDT = cRREQDT;
 }

@JsonProperty("DB_LAST_UPD")
public JsonNode getDBLASTUPD() {
return dBLASTUPD;
 }

@JsonProperty("DB_LAST_UPD")
public void setDBLASTUPD(JsonNode dBLASTUPD) {
this.dBLASTUPD = dBLASTUPD;
 }

@JsonProperty("FOLIO_CANCEL_DT")
public String getFOLIOCANCELDT() {
return fOLIOCANCELDT;
 }

@JsonProperty("FOLIO_CANCEL_DT")
public void setFOLIOCANCELDT(String fOLIOCANCELDT) {
this.fOLIOCANCELDT = fOLIOCANCELDT;
 }

@JsonProperty("INCRMNTL_REV_AMT")
public JsonNode getINCRMNTLREVAMT() {
return iNCRMNTLREVAMT;
 }

@JsonProperty("INCRMNTL_REV_AMT")
public void setINCRMNTLREVAMT(JsonNode iNCRMNTLREVAMT) {
this.iNCRMNTLREVAMT = iNCRMNTLREVAMT;
 }

@JsonProperty("PMS_SETUP_DT")
public String getPMSSETUPDT() {
return pMSSETUPDT;
 }

@JsonProperty("PMS_SETUP_DT")
public void setPMSSETUPDT(String pMSSETUPDT) {
this.pMSSETUPDT = pMSSETUPDT;
 }

@JsonProperty("ACCNT_CHARGE_CD")
public String getACCNTCHARGECD() {
return aCCNTCHARGECD;
 }

@JsonProperty("ACCNT_CHARGE_CD")
public void setACCNTCHARGECD(String aCCNTCHARGECD) {
this.aCCNTCHARGECD = aCCNTCHARGECD;
 }

@JsonProperty("AMT_CURCY_CD")
public String getAMTCURCYCD() {
return aMTCURCYCD;
 }

@JsonProperty("AMT_CURCY_CD")
public void setAMTCURCYCD(String aMTCURCYCD) {
this.aMTCURCYCD = aMTCURCYCD;
 }

@JsonProperty("AUTH_SIGNERS_TXT")
public String getAUTHSIGNERSTXT() {
return aUTHSIGNERSTXT;
 }

@JsonProperty("AUTH_SIGNERS_TXT")
public void setAUTHSIGNERSTXT(String aUTHSIGNERSTXT) {
this.aUTHSIGNERSTXT = aUTHSIGNERSTXT;
 }

@JsonProperty("BILL_MTHD_CD")
public String getBILLMTHDCD() {
return bILLMTHDCD;
 }

@JsonProperty("BILL_MTHD_CD")
public void setBILLMTHDCD(String bILLMTHDCD) {
this.bILLMTHDCD = bILLMTHDCD;
 }

@JsonProperty("COMMENTS")
public String getCOMMENTS() {
return cOMMENTS;
 }

@JsonProperty("COMMENTS")
public void setCOMMENTS(String cOMMENTS) {
this.cOMMENTS = cOMMENTS;
 }

@JsonProperty("CON_ID")
public String getCONID() {
return cONID;
 }

@JsonProperty("CON_ID")
public void setCONID(String cONID) {
this.cONID = cONID;
 }

@JsonProperty("COVER_CHRG_TXT")
public String getCOVERCHRGTXT() {
return cOVERCHRGTXT;
 }

@JsonProperty("COVER_CHRG_TXT")
public void setCOVERCHRGTXT(String cOVERCHRGTXT) {
this.cOVERCHRGTXT = cOVERCHRGTXT;
 }

@JsonProperty("CR_REQ_BY_ID")
public String getCRREQBYID() {
return cRREQBYID;
 }

@JsonProperty("CR_REQ_BY_ID")
public void setCRREQBYID(String cRREQBYID) {
this.cRREQBYID = cRREQBYID;
 }

@JsonProperty("CR_REQ_STATUS_CD")
public String getCRREQSTATUSCD() {
return cRREQSTATUSCD;
 }

@JsonProperty("CR_REQ_STATUS_CD")
public void setCRREQSTATUSCD(String cRREQSTATUSCD) {
this.cRREQSTATUSCD = cRREQSTATUSCD;
 }

@JsonProperty("CR_REQ_TYPE_CD")
public String getCRREQTYPECD() {
return cRREQTYPECD;
 }

@JsonProperty("CR_REQ_TYPE_CD")
public void setCRREQTYPECD(String cRREQTYPECD) {
this.cRREQTYPECD = cRREQTYPECD;
 }

@JsonProperty("DB_LAST_UPD_SRC")
public JsonNode getDBLASTUPDSRC() {
return dBLASTUPDSRC;
 }

@JsonProperty("DB_LAST_UPD_SRC")
public void setDBLASTUPDSRC(JsonNode dBLASTUPDSRC) {
this.dBLASTUPDSRC = dBLASTUPDSRC;
 }

@JsonProperty("DESC_TEXT")
public String getDESCTEXT() {
return dESCTEXT;
 }

@JsonProperty("DESC_TEXT")
public void setDESCTEXT(String dESCTEXT) {
this.dESCTEXT = dESCTEXT;
 }

@JsonProperty("FOLIO_NUM")
public String getFOLIONUM() {
return fOLIONUM;
 }

@JsonProperty("FOLIO_NUM")
public void setFOLIONUM(String fOLIONUM) {
this.fOLIONUM = fOLIONUM;
 }

@JsonProperty("HSNG_ORG_ID")
public String getHSNGORGID() {
return hSNGORGID;
 }

@JsonProperty("HSNG_ORG_ID")
public void setHSNGORGID(String hSNGORGID) {
this.hSNGORGID = hSNGORGID;
 }

@JsonProperty("MARKET_CODE")
public String getMARKETCODE() {
return mARKETCODE;
 }

@JsonProperty("MARKET_CODE")
public void setMARKETCODE(String mARKETCODE) {
this.mARKETCODE = mARKETCODE;
 }

@JsonProperty("OU_NUM")
public String getOUNUM() {
return oUNUM;
 }

@JsonProperty("OU_NUM")
public void setOUNUM(String oUNUM) {
this.oUNUM = oUNUM;
 }

@JsonProperty("PMS_ACCNT_ID")
public String getPMSACCNTID() {
return pMSACCNTID;
 }

@JsonProperty("PMS_ACCNT_ID")
public void setPMSACCNTID(String pMSACCNTID) {
this.pMSACCNTID = pMSACCNTID;
 }

@JsonProperty("PMS_BL_ADDR_ID")
public String getPMSBLADDRID() {
return pMSBLADDRID;
 }

@JsonProperty("PMS_BL_ADDR_ID")
public void setPMSBLADDRID(String pMSBLADDRID) {
this.pMSBLADDRID = pMSBLADDRID;
 }

@JsonProperty("PMS_CONTACT_ID")
public String getPMSCONTACTID() {
return pMSCONTACTID;
 }

@JsonProperty("PMS_CONTACT_ID")
public void setPMSCONTACTID(String pMSCONTACTID) {
this.pMSCONTACTID = pMSCONTACTID;
 }

@JsonProperty("PMS_PAY_MTHD_CD")
public String getPMSPAYMTHDCD() {
return pMSPAYMTHDCD;
 }

@JsonProperty("PMS_PAY_MTHD_CD")
public void setPMSPAYMTHDCD(String pMSPAYMTHDCD) {
this.pMSPAYMTHDCD = pMSPAYMTHDCD;
 }

@JsonProperty("PMS_STATUS_CD")
public String getPMSSTATUSCD() {
return pMSSTATUSCD;
 }

@JsonProperty("PMS_STATUS_CD")
public void setPMSSTATUSCD(String pMSSTATUSCD) {
this.pMSSTATUSCD = pMSSTATUSCD;
 }

@JsonProperty("PMS_TYPE_CD")
public String getPMSTYPECD() {
return pMSTYPECD;
 }

@JsonProperty("PMS_TYPE_CD")
public void setPMSTYPECD(String pMSTYPECD) {
this.pMSTYPECD = pMSTYPECD;
 }

@JsonProperty("QUOTE_RMBLK_ID")
public String getQUOTERMBLKID() {
return qUOTERMBLKID;
 }

@JsonProperty("QUOTE_RMBLK_ID")
public void setQUOTERMBLKID(String qUOTERMBLKID) {
this.qUOTERMBLKID = qUOTERMBLKID;
 }

@JsonProperty("RESVTN_MTHD_CD")
public String getRESVTNMTHDCD() {
return rESVTNMTHDCD;
 }

@JsonProperty("RESVTN_MTHD_CD")
public void setRESVTNMTHDCD(String rESVTNMTHDCD) {
this.rESVTNMTHDCD = rESVTNMTHDCD;
 }

@JsonProperty("RESVTN_TYPE_CD")
public String getRESVTNTYPECD() {
return rESVTNTYPECD;
 }

@JsonProperty("RESVTN_TYPE_CD")
public void setRESVTNTYPECD(String rESVTNTYPECD) {
this.rESVTNTYPECD = rESVTNTYPECD;
 }

@JsonProperty("ROOM_TYPE_ID")
public String getROOMTYPEID() {
return rOOMTYPEID;
 }

@JsonProperty("ROOM_TYPE_ID")
public void setROOMTYPEID(String rOOMTYPEID) {
this.rOOMTYPEID = rOOMTYPEID;
 }

@JsonProperty("ROW_OP")
public String getROWOP() {
return rOWOP;
 }

@JsonProperty("ROW_OP")
public void setROWOP(String rOWOP) {
this.rOWOP = rOWOP;
 }

@JsonAnyGetter
public Map<String, String> getAdditionalProperties() {
return this.additionalProperties;
 }

@JsonAnySetter
public void setAdditionalProperty(String name, String value) {
this.additionalProperties.put(name, value);
 }


}
