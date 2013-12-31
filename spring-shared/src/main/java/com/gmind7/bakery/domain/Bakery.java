package com.gmind7.bakery.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.jpa.domain.AbstractPersistable;

import com.google.common.collect.Lists;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper=true, exclude="baker")
@ToString(callSuper=true, exclude="baker")
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "baker")
public class Bakery extends AbstractPersistable<Long> implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public Bakery(Long id) {
        this.setId(id);
    }
    
    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="bakery", orphanRemoval=true)
    private List<Baker> baker = Lists.newArrayList();
	
	@Column(unique = true)
    private String bakeryname;
	
	
	public void addBaker(Baker baker) {
		this.baker.add(baker);
	}

}
