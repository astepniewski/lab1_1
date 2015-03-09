package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class ProductSnapeshot {
	// product
	private String Id;

	private BigDecimal Price;

	private String Name;

	private Date SnapshotDate;

	private String Type;
	
	private String currency;

	public ProductSnapeshot(String productId, BigDecimal productPrice,
			String productName, Date productSnapshotDate, String productType) {
		this.Id = productId;
		this.Price = productPrice;
		this.Name = productName;
		this.SnapshotDate = productSnapshotDate;
		this.Type = productType;
	}

	public String getProductId() {
		return Id;
	}

	public BigDecimal getProductPrice() {
		return Price;
	}

	public String getProductName() {
		return Name;
	}

	public Date getProductSnapshotDate() {
		return SnapshotDate;
	}

	public String getProductType() {
		return Type;
	}

	@Override
	public boolean equals(Object obj) {
		ProductSnapeshot other = (ProductSnapeshot) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Price == null) {
			if (other.Price != null)
				return false;
		} else if (!Price.equals(other.Price))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Type != other.Type)
			return false;
		return true;
	}

}
