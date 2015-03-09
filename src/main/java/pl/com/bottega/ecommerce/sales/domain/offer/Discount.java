package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
	private String cause;

	private Money value;

	public Money getValue() {
		return value;
	}

	public void setValue(Money value) {
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		Discount other = (Discount)obj;
		if(other.value != value)
			return false;
		if(other.cause != cause)
			return false;
		return true;
	}
}
