package com.gmind7.bakery.domain;

import java.io.Serializable;

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

import com.gmind7.bakery.domain.ids.OrderDetailsIDs;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude={"order","product"})
@ToString(exclude={"order","product"})
@Entity
@Table(name="orderdetails")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "OrderDetails")
@AttributeOverrides(@AttributeOverride(name="id", column = @Column(name = "orderNumber")))
public class OrderDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
    
	@EmbeddedId
	private OrderDetailsIDs id;
	
	private int quantityOrdered;
	
	private double priceEach;
	
	private int orderLineNumber;

	public boolean isNew() {
		return null == id;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="orderNumber", insertable=false, updatable=false)
    private Orders order;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="productCode", insertable=false, updatable=false)
    private Products product;
	
}
