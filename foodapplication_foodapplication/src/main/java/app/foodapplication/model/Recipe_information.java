package app.foodapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe_information")
public class Recipe_information {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String vegeterian;
	@Column
	private String prepare_method;
	@Column
	private String prepare_time;
	@Column
	private Integer id_recipe;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(String vegeterian) {
		this.vegeterian = vegeterian;
	}

	public String getPrepare_method() {
		return prepare_method;
	}

	public void setPrepare_method(String prepare_method) {
		this.prepare_method = prepare_method;
	}

	public String getPrepare_time() {
		return prepare_time;
	}

	public void setPrepare_time(String prepare_time) {
		this.prepare_time = prepare_time;
	}

	public Integer getId_recipe() {
		return id_recipe;
	}

	public void setId_recipe(Integer id_recipe) {
		this.id_recipe = id_recipe;
	}

}
