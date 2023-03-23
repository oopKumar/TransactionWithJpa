package com.oop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "STUDENT_DTLS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "student_Id")
	private Integer id;
	@Column(name = "student_Name")
	private String name;
	@Column(name = "student_rank")
	private Long rank;
	@Column(name = "student_gender")
	private String gender;

	}
