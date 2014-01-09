package com.gmind7.bakery.domain;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true, exclude="employees")
@ToString(callSuper=true, exclude="employees")
@Entity
@Table(name = "offices")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Offices")
@AttributeOverrides(@AttributeOverride(name="id", column = @Column(name = "officeCode")))
public class Offices extends AbstractPersistable<Long> {
	
	private static final long serialVersionUID = 1L;
    
    public Offices(Long id) {
        this.setId(id);
    }
    
    private String city;
    
    private String phone;
    
    private String addressLine1;
    
    private String addressLine2;
    
    private String state;
    
    private String country;
    
    private String postalCode;
    
    private String territory;
    
	@OneToMany(mappedBy = "office")
	private List<Employees> employees;

}
