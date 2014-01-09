package com.gmind7.bakery.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.gmind7.bakery.domain.ids.PaymentsIDs;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude="customer")
@ToString(exclude="customer")
@Entity
@Table(name="payments")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Payments")
@AttributeOverrides(@AttributeOverride(name="id", column = @Column(name = "customerNumber")))
public class Payments implements Serializable {
	
	private static final long serialVersionUID = 1L;
    
	@EmbeddedId
	private PaymentsIDs id;
	
	private Date paymentDate;
	
	private double amount;
	
	public boolean isNew() {
		return null == id;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customerNumber", insertable=false, updatable=false)
    private Customers customer;

}
