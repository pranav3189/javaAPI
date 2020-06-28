package com.xxiris.payer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXIRIS_OM_ADJ_NON_PAYER_TBL")
public class Payer {

	   private Integer id;
	    private String bin;
	    private String pcn;
	    private String pGroup;
	    private String remark;
	    private Integer created_by;
	    private String creation_date;
	    private Integer last_Updated_By;
	    private Date  last_updated_date;
	    private Integer last_updated_login;
	    
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		
		
		@Column(name = "BIN", nullable = true)
		public String getBin() {
			return bin;
		}
		
		public void setBin(String bin) {
			this.bin = bin;
		}
		@Column(name = "PCN", nullable = true)
		public String getPcn() {
			return pcn;
		}
		public void setPcn(String pcn) {
			this.pcn = pcn;
		}
		
		@Column(name = "P_GROUP", nullable = true)
		public String getpGroup() {
			return pGroup;
		}
		public void setpGroup(String pGroup) {
			this.pGroup = pGroup;
		}
		
		@Column(name = "REMARKS", nullable = true)
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		
		@Column(name = "CREATED_BY", nullable = true)
		public Integer getCreated_by() {
			return created_by;
		}
		public void setCreated_by(Integer created_by) {
			this.created_by = created_by;
		}
		
		@Column(name = "CREATION_DATE", nullable = true)
		public String getCreation_date() {
			return creation_date;
		}
		public void setCreation_date(String creation_date) {
			this.creation_date = creation_date;
		}
		
		@Column(name = "LAST_UPDATED_BY", nullable = true)
		public Integer getLast_Updated_By() {
			return last_Updated_By;
		}
		public void setLast_Updated_By(Integer last_Updated_By) {
			this.last_Updated_By = last_Updated_By;
		}
		
		@Column(name = "LAST_UPDATE_DATE ", nullable = true)
		public Date getLast_updated_date() {
			return last_updated_date;
		}
		public void setLast_updated_date(Date last_updated_date) {
			this.last_updated_date = last_updated_date;
		}
		
		@Column(name = "LAST_UPDATE_LOGIN", nullable = true)
		public Integer getLast_updated_login() {
			return last_updated_login;
		}
		public void setLast_updated_login(Integer last_updated_login) {
			this.last_updated_login = last_updated_login;
		}
	    
	    
	
	    
	    
	    
	   
}
