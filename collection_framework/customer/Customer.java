package collection_framework.customer;

import java.util.Objects;

public class Customer implements Comparable<Customer>{

	public int id;
	public String name;
	public int productQuantity;
	public Customer(int id, String name, int productQuantity) {
		this.id = id;
		this.name = name;
		this.productQuantity = productQuantity;
	}

	/**
	 * @return the id
	 */
	public int getProductQuantity() {
		return productQuantity;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", productQuantity=" + productQuantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, productQuantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id && Objects.equals(name, other.name) && productQuantity == other.productQuantity;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		if(this.productQuantity==o.productQuantity)
		return 0;
		else if(this.productQuantity>o.productQuantity)
			return 1;
		else return -1;
	}

	
	
	
}
