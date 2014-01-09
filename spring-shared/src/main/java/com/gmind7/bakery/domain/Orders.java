package com.gmind7.bakery.domain;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
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
import org.hibernate.annotations.Type;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true, exclude="customer")
@ToString(callSuper=true, exclude="customer")
@Entity
@Table(name="orders")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Orders")
@AttributeOverrides(@AttributeOverride(name="id", column = @Column(name = "orderNumber")))
public class Orders extends AbstractPersistable<Long> {
	
	private static final long serialVersionUID = 1L;
    
    public Orders(Long id) {
        this.setId(id);
    }
    
    @Type(type="java.sql.Timestamp")
    private Date orderDate;
    
    @Type(type="java.sql.Timestamp")
    private Date requiredDate;
    
    @Type(type="java.sql.Timestamp")
    private Date shippedDate;
    
    private String status;
    
    private String comments;
    
    private int customerNumber;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customerNumber", insertable=false, updatable=false)
    private Customers customer;

}
