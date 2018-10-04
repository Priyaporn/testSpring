package com.cfr.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TRN_INVOICE database table.
 * 
 */
@Entity
@Table(name="TRN_INVOICE")
@NamedQuery(name="TrnInvoice.findAll", query="SELECT t FROM TrnInvoice t")
public class TrnInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACTIVE")
	private String active;

	@Column(name="ADMISSION_TYPE_CODE")
	private String admissionTypeCode;

	@Column(name="ALLOCATE_DATE")
	private String allocateDate;

	@Column(name="ALLOCATE_TIME")
	private String allocateTime;

	@Column(name="ALLOCATE_USER_ID")
	private String allocateUserId;

	@Column(name="AMOUNT_AFT_DISCOUNT")
	private BigDecimal amountAftDiscount;

	@Column(name="AMOUNT_BEF_DISCOUNT")
	private BigDecimal amountBefDiscount;

	@Column(name="AMOUNT_OF_DISCOUNT")
	private BigDecimal amountOfDiscount;

	@Column(name="BATCH_NO")
	private String batchNo;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="DOCTOR_CATEGORY_CODE")
	private String doctorCategoryCode;

	@Column(name="DOCTOR_CODE")
	private String doctorCode;

	@Column(name="DOCTOR_NAME_EN")
	private String doctorNameEn;

	@Column(name="DOCTOR_POOL_CODE")
	private String doctorPoolCode;

	@Column(name="DR_AMT")
	private BigDecimal drAmt;

	@Column(name="DR_TAX_AMT")
	private BigDecimal drTaxAmt;

	@Column(name="EPISODE_NO")
	private String episodeNo;

	@Column(name="EXECUTE_DATE")
	private String executeDate;

	@Column(name="EXECUTE_TIME")
	private String executeTime;

	@Column(name="GUARANTEE_AMT")
	private BigDecimal guaranteeAmt;

	@Column(name="GUARANTEE_DLY_CODE")
	private BigDecimal guaranteeDlyCode;

	@Column(name="GUARANTEE_MLY_CODE")
	private BigDecimal guaranteeMlyCode;

	@Column(name="GUARANTEE_NOTE")
	private String guaranteeNote;

	@Column(name="GUARANTEE_PAID_AMT")
	private BigDecimal guaranteePaidAmt;

	@Column(name="HBN_CODE")
	private BigDecimal hbnCode;

	@Column(name="HBN_METHOD_ALLOCATE")
	private BigDecimal hbnMethodAllocate;

	@Column(name="HN_NO")
	private String hnNo;

	@Column(name="HOSPITAL_CODE")
	private String hospitalCode;

	@Column(name="HP_AMT")
	private BigDecimal hpAmt;

	@Column(name="INVOICE_DATE")
	private String invoiceDate;

	@Column(name="INVOICE_NO")
	private String invoiceNo;

	@Column(name="INVOICE_TYPE")
	private String invoiceType;

	@Column(name="IS_GUARANTEE")
	private String isGuarantee;

	@Column(name="IS_GUARANTEE_FROM_ALLOCATE")
	private String isGuaranteeFromAllocate;

	@Column(name="IS_PAID")
	private String isPaid;

	@Column(name="IS_PARTIAL")
	private String isPartial;

	@Column(name="IS_TAX_FROM_ALLOCATE")
	private String isTaxFromAllocate;

	@Column(name="IS_VOID")
	private String isVoid;

	@Column(name="IS_WRITE_OFF")
	private String isWriteOff;

	@Column(name="MM")
	private String mm;

	@Column(name="NATIONALITY_CODE")
	private String nationalityCode;

	@Column(name="NATIONALITY_DESCRIPTION")
	private String nationalityDescription;

	@Column(name="NOR_ALLOCATE_AMT")
	private BigDecimal norAllocateAmt;

	@Column(name="NOR_ALLOCATE_PCT")
	private BigDecimal norAllocatePct;

	@Column(name="NOTE")
	private String note;

	@Column(name="ORDER_ITEM_ACTIVE")
	private String orderItemActive;

	@Column(name="ORDER_ITEM_CODE")
	private String orderItemCode;

	@Column(name="PATIENT_DEPARTMENT_CODE")
	private String patientDepartmentCode;

	@Column(name="PATIENT_LOCATION_CODE")
	private String patientLocationCode;

	@Column(name="PATIENT_NAME")
	private String patientName;

	@Column(name="PAY_BY")
	private String payBy;

	@Column(name="PAYOR_OFFICE_CODE")
	private String payorOfficeCode;

	@Column(name="PRIVATE_DOCTOR_CODE")
	private String privateDoctorCode;

	@Column(name="RECEIPT_DATE")
	private String receiptDate;

	@Column(name="RECEIPT_DEPARTMENT_CODE")
	private String receiptDepartmentCode;

	@Column(name="RECEIPT_LOCATION_CODE")
	private String receiptLocationCode;

	@Column(name="RECEIPT_NO")
	private String receiptNo;

	@Column(name="RECEIPT_TIME")
	private String receiptTime;

	@Column(name="RECEIPT_TYPE_CODE")
	private String receiptTypeCode;

	@Column(name="TAX_RATE")
	private BigDecimal taxRate;

	@Column(name="TAX_TYPE_CODE")
	private String taxTypeCode;

	@Column(name="TOTAL_BILL_AMOUNT")
	private BigDecimal totalBillAmount;

	@Column(name="TRANSACTION_DATE")
	private String transactionDate;

	@Id
	@Column(name="TRANSACTION_NO")
	private String transactionNo;

	@Column(name="UPDATE_DATE")
	private String updateDate;

	@Column(name="UPDATE_TIME")
	private String updateTime;

	@Column(name="UPDATE_USER_CODE")
	private String updateUserCode;

	@Column(name="YYYY")
	private String yyyy;

	public TrnInvoice() {
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getAdmissionTypeCode() {
		return this.admissionTypeCode;
	}

	public void setAdmissionTypeCode(String admissionTypeCode) {
		this.admissionTypeCode = admissionTypeCode;
	}

	public String getAllocateDate() {
		return this.allocateDate;
	}

	public void setAllocateDate(String allocateDate) {
		this.allocateDate = allocateDate;
	}

	public String getAllocateTime() {
		return this.allocateTime;
	}

	public void setAllocateTime(String allocateTime) {
		this.allocateTime = allocateTime;
	}

	public String getAllocateUserId() {
		return this.allocateUserId;
	}

	public void setAllocateUserId(String allocateUserId) {
		this.allocateUserId = allocateUserId;
	}

	public BigDecimal getAmountAftDiscount() {
		return this.amountAftDiscount;
	}

	public void setAmountAftDiscount(BigDecimal amountAftDiscount) {
		this.amountAftDiscount = amountAftDiscount;
	}

	public BigDecimal getAmountBefDiscount() {
		return this.amountBefDiscount;
	}

	public void setAmountBefDiscount(BigDecimal amountBefDiscount) {
		this.amountBefDiscount = amountBefDiscount;
	}

	public BigDecimal getAmountOfDiscount() {
		return this.amountOfDiscount;
	}

	public void setAmountOfDiscount(BigDecimal amountOfDiscount) {
		this.amountOfDiscount = amountOfDiscount;
	}

	public String getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDoctorCategoryCode() {
		return this.doctorCategoryCode;
	}

	public void setDoctorCategoryCode(String doctorCategoryCode) {
		this.doctorCategoryCode = doctorCategoryCode;
	}

	public String getDoctorCode() {
		return this.doctorCode;
	}

	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getDoctorNameEn() {
		return this.doctorNameEn;
	}

	public void setDoctorNameEn(String doctorNameEn) {
		this.doctorNameEn = doctorNameEn;
	}

	public String getDoctorPoolCode() {
		return this.doctorPoolCode;
	}

	public void setDoctorPoolCode(String doctorPoolCode) {
		this.doctorPoolCode = doctorPoolCode;
	}

	public BigDecimal getDrAmt() {
		return this.drAmt;
	}

	public void setDrAmt(BigDecimal drAmt) {
		this.drAmt = drAmt;
	}

	public BigDecimal getDrTaxAmt() {
		return this.drTaxAmt;
	}

	public void setDrTaxAmt(BigDecimal drTaxAmt) {
		this.drTaxAmt = drTaxAmt;
	}

	public String getEpisodeNo() {
		return this.episodeNo;
	}

	public void setEpisodeNo(String episodeNo) {
		this.episodeNo = episodeNo;
	}

	public String getExecuteDate() {
		return this.executeDate;
	}

	public void setExecuteDate(String executeDate) {
		this.executeDate = executeDate;
	}

	public String getExecuteTime() {
		return this.executeTime;
	}

	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}

	public BigDecimal getGuaranteeAmt() {
		return this.guaranteeAmt;
	}

	public void setGuaranteeAmt(BigDecimal guaranteeAmt) {
		this.guaranteeAmt = guaranteeAmt;
	}

	public BigDecimal getGuaranteeDlyCode() {
		return this.guaranteeDlyCode;
	}

	public void setGuaranteeDlyCode(BigDecimal guaranteeDlyCode) {
		this.guaranteeDlyCode = guaranteeDlyCode;
	}

	public BigDecimal getGuaranteeMlyCode() {
		return this.guaranteeMlyCode;
	}

	public void setGuaranteeMlyCode(BigDecimal guaranteeMlyCode) {
		this.guaranteeMlyCode = guaranteeMlyCode;
	}

	public String getGuaranteeNote() {
		return this.guaranteeNote;
	}

	public void setGuaranteeNote(String guaranteeNote) {
		this.guaranteeNote = guaranteeNote;
	}

	public BigDecimal getGuaranteePaidAmt() {
		return this.guaranteePaidAmt;
	}

	public void setGuaranteePaidAmt(BigDecimal guaranteePaidAmt) {
		this.guaranteePaidAmt = guaranteePaidAmt;
	}

	public BigDecimal getHbnCode() {
		return this.hbnCode;
	}

	public void setHbnCode(BigDecimal hbnCode) {
		this.hbnCode = hbnCode;
	}

	public BigDecimal getHbnMethodAllocate() {
		return this.hbnMethodAllocate;
	}

	public void setHbnMethodAllocate(BigDecimal hbnMethodAllocate) {
		this.hbnMethodAllocate = hbnMethodAllocate;
	}

	public String getHnNo() {
		return this.hnNo;
	}

	public void setHnNo(String hnNo) {
		this.hnNo = hnNo;
	}

	public String getHospitalCode() {
		return this.hospitalCode;
	}

	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public BigDecimal getHpAmt() {
		return this.hpAmt;
	}

	public void setHpAmt(BigDecimal hpAmt) {
		this.hpAmt = hpAmt;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getIsGuarantee() {
		return this.isGuarantee;
	}

	public void setIsGuarantee(String isGuarantee) {
		this.isGuarantee = isGuarantee;
	}

	public String getIsGuaranteeFromAllocate() {
		return this.isGuaranteeFromAllocate;
	}

	public void setIsGuaranteeFromAllocate(String isGuaranteeFromAllocate) {
		this.isGuaranteeFromAllocate = isGuaranteeFromAllocate;
	}

	public String getIsPaid() {
		return this.isPaid;
	}

	public void setIsPaid(String isPaid) {
		this.isPaid = isPaid;
	}

	public String getIsPartial() {
		return this.isPartial;
	}

	public void setIsPartial(String isPartial) {
		this.isPartial = isPartial;
	}

	public String getIsTaxFromAllocate() {
		return this.isTaxFromAllocate;
	}

	public void setIsTaxFromAllocate(String isTaxFromAllocate) {
		this.isTaxFromAllocate = isTaxFromAllocate;
	}

	public String getIsVoid() {
		return this.isVoid;
	}

	public void setIsVoid(String isVoid) {
		this.isVoid = isVoid;
	}

	public String getIsWriteOff() {
		return this.isWriteOff;
	}

	public void setIsWriteOff(String isWriteOff) {
		this.isWriteOff = isWriteOff;
	}

	public String getMm() {
		return this.mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public String getNationalityCode() {
		return this.nationalityCode;
	}

	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
	}

	public String getNationalityDescription() {
		return this.nationalityDescription;
	}

	public void setNationalityDescription(String nationalityDescription) {
		this.nationalityDescription = nationalityDescription;
	}

	public BigDecimal getNorAllocateAmt() {
		return this.norAllocateAmt;
	}

	public void setNorAllocateAmt(BigDecimal norAllocateAmt) {
		this.norAllocateAmt = norAllocateAmt;
	}

	public BigDecimal getNorAllocatePct() {
		return this.norAllocatePct;
	}

	public void setNorAllocatePct(BigDecimal norAllocatePct) {
		this.norAllocatePct = norAllocatePct;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getOrderItemActive() {
		return this.orderItemActive;
	}

	public void setOrderItemActive(String orderItemActive) {
		this.orderItemActive = orderItemActive;
	}

	public String getOrderItemCode() {
		return this.orderItemCode;
	}

	public void setOrderItemCode(String orderItemCode) {
		this.orderItemCode = orderItemCode;
	}

	public String getPatientDepartmentCode() {
		return this.patientDepartmentCode;
	}

	public void setPatientDepartmentCode(String patientDepartmentCode) {
		this.patientDepartmentCode = patientDepartmentCode;
	}

	public String getPatientLocationCode() {
		return this.patientLocationCode;
	}

	public void setPatientLocationCode(String patientLocationCode) {
		this.patientLocationCode = patientLocationCode;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPayBy() {
		return this.payBy;
	}

	public void setPayBy(String payBy) {
		this.payBy = payBy;
	}

	public String getPayorOfficeCode() {
		return this.payorOfficeCode;
	}

	public void setPayorOfficeCode(String payorOfficeCode) {
		this.payorOfficeCode = payorOfficeCode;
	}

	public String getPrivateDoctorCode() {
		return this.privateDoctorCode;
	}

	public void setPrivateDoctorCode(String privateDoctorCode) {
		this.privateDoctorCode = privateDoctorCode;
	}

	public String getReceiptDate() {
		return this.receiptDate;
	}

	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getReceiptDepartmentCode() {
		return this.receiptDepartmentCode;
	}

	public void setReceiptDepartmentCode(String receiptDepartmentCode) {
		this.receiptDepartmentCode = receiptDepartmentCode;
	}

	public String getReceiptLocationCode() {
		return this.receiptLocationCode;
	}

	public void setReceiptLocationCode(String receiptLocationCode) {
		this.receiptLocationCode = receiptLocationCode;
	}

	public String getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getReceiptTime() {
		return this.receiptTime;
	}

	public void setReceiptTime(String receiptTime) {
		this.receiptTime = receiptTime;
	}

	public String getReceiptTypeCode() {
		return this.receiptTypeCode;
	}

	public void setReceiptTypeCode(String receiptTypeCode) {
		this.receiptTypeCode = receiptTypeCode;
	}

	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxTypeCode() {
		return this.taxTypeCode;
	}

	public void setTaxTypeCode(String taxTypeCode) {
		this.taxTypeCode = taxTypeCode;
	}

	public BigDecimal getTotalBillAmount() {
		return this.totalBillAmount;
	}

	public void setTotalBillAmount(BigDecimal totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public String getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionNo() {
		return this.transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUserCode() {
		return this.updateUserCode;
	}

	public void setUpdateUserCode(String updateUserCode) {
		this.updateUserCode = updateUserCode;
	}

	public String getYyyy() {
		return this.yyyy;
	}

	public void setYyyy(String yyyy) {
		this.yyyy = yyyy;
	}

}