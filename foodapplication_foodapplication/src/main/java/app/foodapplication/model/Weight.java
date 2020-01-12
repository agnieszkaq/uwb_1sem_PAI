package app.foodapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weight")
public class Weight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String weight;
	@Column
	private Integer id_ingredient;
	@Column
	private Integer id_recipe;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Integer getId_ingredient() {
		return id_ingredient;
	}

	public void setId_ingredient(Integer id_ingredient) {
		this.id_ingredient = id_ingredient;
	}

	public Integer getId_recipe() {
		return id_recipe;
	}

	public void setId_recipe(Integer id_recipe) {
		this.id_recipe = id_recipe;
	}

}
