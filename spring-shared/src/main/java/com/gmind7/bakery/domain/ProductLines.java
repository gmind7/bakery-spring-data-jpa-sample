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
@EqualsAndHashCode(callSuper=true, exclude="products")
@ToString(callSuper=true, exclude="products")
@Entity
@Table(name="productlines")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "ProductLines")
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