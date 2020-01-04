package app.foodapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredient")
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private Float calories;
	@Column
	private Float protein;
	@Column
	private Float fat;
	@Column
	private Float carb;
	@Column
	private String ingredient_type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getCalories() {
		return calories;
	}

	public void setCalories(Float calories) {
		this.calories = calories;
	}

	public Float getProtein() {
		return protein;
	}

	public void setProtein(Float protein) {
		this.protein = protein;
	}

	public Float getFat() {
		return fat;
	}

	public void setFat(Float fat) {
		this.fat = fat;
	}

	public Float getCarb() {
		return carb;
	}

	public void setCarb(Float carb) {
		this.carb = carb;
	}

	public String getIngredient_type() {
		return ingredient_type;
	}

	public void setIngredient_type(String ingredient_type) {
		this.ingredient_type = ingredient_type;
	}

}
