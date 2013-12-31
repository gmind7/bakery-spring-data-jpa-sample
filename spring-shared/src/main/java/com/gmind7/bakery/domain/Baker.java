package com.gmind7.bakery.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "baker")
public class Baker extends AbstractPersistable<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

	public Baker(Long id) {
        this.setId(id);
    }
    
    @Column(unique = true)
    private String username;

    private String firstname;
    private String lastname;
    
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Bakery bakery;
    
}