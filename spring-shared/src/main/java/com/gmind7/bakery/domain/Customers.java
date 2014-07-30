package com.gmind7.bakery.domain;

import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true, exclude={"salesRepEmployee", "orders", "payments"})
@ToString(callSuper=true, exclude={"salesRepEmployee", "orders", "payments"})
@Entity
@Table(name = "customers")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "Customers")
@AttributeOverrides(@AttributeOverride(name="id", column = @Column(name = "customerNumber")))
public class Customers extends AbstractPersistable<Long> {
    
    private static final long serialVersionUID = 1L;
    
    public Customers(Long id) {
        this.setId(id);
    }
    
    private String customerName;
    
    private String contactLastName;
    
    private String contactFirstName;
    
    private String phone;
    
    private String addressLine1;
    
    private String addressLine2;
    
    private String city;
    
    private String state;
    
    private String postalCode;
    
    private String country;
    
    private int salesRepEmployeeNumber;
    
    private double creditLimit;
    
    @ManyToOne(fetch=FetchType.LAZY, optional=true)
    @JoinColumn(name="salesRepEmployeeNumber", insertable=false, updatable=false)
    private Employees salesRepEmployee;

    @OneToMany(mappedBy = "customer")
	private List<Orders> orders;

    @OneToMany(mappedBy = "customer")
	private List<Payments> payments;
}
