package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {
	private String currency;
	
	private BigDecimal value;
	
	public Money(BigDecimal value){
		this.setValue(value);
	}
	public boolean equals(Object obj) {
		Money other = (Money)obj;
		if(other.getValue() != getValue())
			return false;
		if(other.currency != currency)
			return false;
		return true;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public Money subtract(Money money) {
		return new Money(value.subtract(money.getValue()));
	}
	public Money multiply(Money money) {
		return new Money(value.multiply(money.getValue()));
	}
	
	public int compareTo(Money totalCost) {
		return value.compareTo(totalCost.value);
	}
}
