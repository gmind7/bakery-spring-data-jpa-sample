package com.gmind7.bakery.domain.ids;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class OrderDetailsIDs implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long orderNumber;
	
	private String productCode;
	
}
