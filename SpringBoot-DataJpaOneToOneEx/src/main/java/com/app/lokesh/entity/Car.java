package com.app.lokesh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Car {
	@Id
	private Integer cId;
	private String cName;
	private Double cPrice;
	
	@OneToOne
	@JoinColumn(name = "engineFK")
	private Engine engine;
}
