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
@EqualsAndHashCode(callSuper=true, exclude={"productLine", "orderDetails"})
@ToString(callSuper=true, exclude={"productLine", "orderDetails"})
@Entity
@Table(name="products")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "Products")
@AttributeOverrides(@AttributeOverride(name="id", column = @Column(name = "productCode")))
public class Products extends AbstractPersistable<String> {
    
    private static final long serialVersionUID = 1L;
    
    public Products(String id) {
        this.setId(id);
    }
    
    private String productName;
    
    private String productScale;
    
    private String productVendor;
    
    private String productDescription;
    
    private int quantityInStock;
    
    private double buyPrice;
    
    private double MSRP;
    
    @ManyToOne
    @JoinColumn(name="productLine", insertable=false, updatable=false)
    private ProductLines productLine;
    
    @OneToMany(mappedBy = "product")
	private List<OrderDetails> orderDetails;
    
}
