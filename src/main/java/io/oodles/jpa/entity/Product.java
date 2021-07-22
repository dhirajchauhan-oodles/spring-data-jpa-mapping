package io.oodles.jpa.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Product {

	@Id
	@GeneratedValue
	private int pid;
	private String productName;
	private int qty;
	private int price;

}
