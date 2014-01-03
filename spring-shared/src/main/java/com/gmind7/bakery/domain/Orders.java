package com.gmind7.bakery.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true, exclude="customer")
@ToString(callSuper=true, exclude="customer")
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "bakery")
@AttributeOverrides(@AttributeOverride(name="id", column = @Column(name = "orderNumber")))
public class Orders extends AbstractPersistable<Long> implements Serializable {
	
	private static final long serialVersionUID = 1L;
    
    public Orders(Long id) {
        this.setId(id);
    }
    
    private Date orderDate;
    
    private Date requiredDate;
    
    private Date shippedDate;
    
    private String status;
    
    private String comments;
    
    private int customerNumber;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customerNumber", insertable=false, updatable=false)
    private Customers customer;

}
