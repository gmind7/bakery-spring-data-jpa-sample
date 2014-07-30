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
@EqualsAndHashCode(callSuper=true, exclude={"office","reportsToEmployee", "customers"})
@ToString(callSuper=true, exclude={"office","reportsToEmployee", "customers"})
@Entity
@Table(name = "employees")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "Employees")
@AttributeOverrides(@AttributeOverride(name="id", column = @Column(name = "employeeNumber")))
public class Employees extends AbstractPersistable<Long> {
	
	private static final long serialVersionUID = 1L;
    
    public Employees(Long id) {
        this.setId(id);
    }
    
    private String lastName;
    
    private String firstName;
    
    private String extension;
    
    private String email;
    
    private long officeCode;
    
    private long reportsTo;
    
    private String jobTitle;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="officeCode", insertable=false, updatable=false)
    private Offices office;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="reportsTo", insertable=false, updatable=false)
	private Employees reportsToEmployee;
    
    @OneToMany(mappedBy = "salesRepEmployee")
	private List<Customers> customers;
    
}
