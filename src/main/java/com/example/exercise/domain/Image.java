package com.example.exercise.domain;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imageId;
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "image")
	private List<Exercise> exercises;

	public Image() {
	}

	public Image(String name) {
		super();
		this.name = name;
	
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@JsonIgnore
	public List<Exercise> getExerises() {
		return exercises;
	}
	
	
	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

}
