package com.natwest.homedecor.persistence;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FurnitureDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	private String type;
		
	private String material;
		
	private double cost;

		
	public FurnitureDomain() {
		super();
	}
		
	public FurnitureDomain(long id, String type, String material, double cost) {
		super();
		this.id = id;
		this.type = type;
		this.material = material;
		this.cost = cost;
	}

	public FurnitureDomain(String type, String material, double cost) {
		super();
		this.type = type;
		this.material = material;
		this.cost = cost;
	}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String colour) {
			this.material = colour;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		@Override
		public int hashCode() {
			return Objects.hash(material, cost, id, type);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			FurnitureDomain other = (FurnitureDomain) obj;
			return Objects.equals(material, other.material)
					&& Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
					&& Objects.equals(type, other.type);
		}

		@Override
		public String toString() {
			return "FurnitureDomain [id=" + id + ", type=" + type + ", material=" + material + ", cost=" + cost + "]";
		}

		
}
