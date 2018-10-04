package com.cfr.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MST_TAX_TYPE database table.
 * 
 */
@Entity
@Table(name="MST_TAX_TYPE")
@NamedQuery(name="MstTaxType.findAll", query="SELECT m FROM MstTaxType m")
public class MstTaxType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TAX_TYPE_CODE")
	private String taxTypeCode;

	@Column(name="ACTIVE")
	private String active;

	@Column(name="CREATE_DATE")
	private String createDate;

	@Column(name="CREATE_TIME")
	private String createTime;

	@Column(name="CREATE_USER_CODE")
	private String createUserCode;

	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="UPDATE_DATE")
	private String updateDate;

	@Column(name="UPDATE_TIME")
	private String updateTime;

	@Column(name="UPDATE_USER_CODE")
	private String updateUserCode;

	public MstTaxType() {
	}

	public String getTaxTypeCode() {
		return this.taxTypeCode;
	}

	public void setTaxTypeCode(String taxTypeCode) {
		this.taxTypeCode = taxTypeCode;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateUserCode() {
		return this.createUserCode;
	}

	public void setCreateUserCode(String createUserCode) {
		this.createUserCode = createUserCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

}