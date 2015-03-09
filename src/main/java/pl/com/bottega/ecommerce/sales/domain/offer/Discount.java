package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
	private String cause;

	private BigDecimal value;
	
	private String currency;

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		Discount other = (Discount)obj;
		if(other.value != value)
			return false;
		if(other.cause != cause)
			return false;
		if(other.currency != currency)
			return false;
		return true;
	}
}
