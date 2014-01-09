package com.gmind7.bakery.domain;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
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
@EqualsAndHashCode(callSuper=true, exclude="products")
@ToString(callSuper=true, exclude="products")
@Entity
@Table(name="productlines")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "ProductLines")
@AttributeOverrides(@AttributeOverride(name="id", column = @Column(name = "productLine")))
public class ProductLines extends AbstractPersistable<String> {
	
	private static final long serialVersionUID = 1L;
    
    public ProductLines(String id) {
        this.setId(id);
    }
    
    private String textDescription;
    
    @Lob
    @Basic(fetch=FetchType.LAZY)
    private String htmlDescription;
    
    @Lob 
    @Basic(fetch=FetchType.LAZY)
    private String image;
    
    @OneToMany(mappedBy = "productLine")
	private List<Products> products;
    
}