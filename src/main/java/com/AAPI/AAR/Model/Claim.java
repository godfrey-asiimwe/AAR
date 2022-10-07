package com.AAPI.AAR.Model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FSPPO_AND_REFUNDS")
public class Claim {
	private int DOCUMENTID;
	private String F_REFERENCE_NUMBER;
    private String F_CLAIM_NUMBER;
	private String F_PROVIDER_NAME;
	private BigDecimal F_AMOUNT;
    private Date DATE_OF_SERVICE;
    private String INVOICE_NUMBER;
    
    public Claim() {
    }

	public Claim(String F_REFERENCE_NUMBER,int DOCUMENTID,String F_CLAIM_NUMBER,String F_PROVIDER_NAME,BigDecimal F_AMOUNT, Date DATE_OF_SERVICE,String INVOICE_NUMBER) {
		// TODO Auto-generated constructor stub
		this.DOCUMENTID=DOCUMENTID;
		this.F_REFERENCE_NUMBER=F_REFERENCE_NUMBER;
		this.F_CLAIM_NUMBER=F_CLAIM_NUMBER;
		this.F_PROVIDER_NAME=F_PROVIDER_NAME;
		this.F_AMOUNT=F_AMOUNT;
		this.DATE_OF_SERVICE=DATE_OF_SERVICE;
		this.INVOICE_NUMBER=INVOICE_NUMBER;	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOCUMENTID")
	public int getDOCUMENTID() {
		return DOCUMENTID;
	}

	public String getF_REFERENCE_NUMBER() {
		return F_REFERENCE_NUMBER;
	}

	public void setF_REFERENCE_NUMBER(String f_REFERENCE_NUMBER) {
		F_REFERENCE_NUMBER = f_REFERENCE_NUMBER;
	}

	public String getF_CLAIM_NUMBER() {
		return F_CLAIM_NUMBER;
	}

	public void setF_CLAIM_NUMBER(String f_CLAIM_NUMBER) {
		F_CLAIM_NUMBER = f_CLAIM_NUMBER;
	}

	public String getF_PROVIDER_NAME() {
		return F_PROVIDER_NAME;
	}

	public void setF_PROVIDER_NAME(String f_PROVIDER_NAME) {
		F_PROVIDER_NAME = f_PROVIDER_NAME;
	}

	@Column(nullable=true, name="F_AMOUNT")
	public BigDecimal getF_AMOUNT() {
		return F_AMOUNT;
	}

	public void setF_AMOUNT(BigDecimal f_AMOUNT) {
		F_AMOUNT = f_AMOUNT;
	}

	public Date getDATE_OF_SERVICE() {
		return DATE_OF_SERVICE;
	}

	public void setDATE_OF_SERVICE(Date dATE_OF_SERVICE) {
		DATE_OF_SERVICE = dATE_OF_SERVICE;
	}

	public String getINVOICE_NUMBER() {
		return INVOICE_NUMBER;
	}

	public void setINVOICE_NUMBER(String iNVOICE_NUMBER) {
		INVOICE_NUMBER = iNVOICE_NUMBER;
	}

	public void setDOCUMENTID(int dOCUMENTID) {
		DOCUMENTID = dOCUMENTID;
	}


}
