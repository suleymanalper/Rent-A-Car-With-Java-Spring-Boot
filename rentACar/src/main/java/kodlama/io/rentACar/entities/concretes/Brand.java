package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Brand {

	//primary key
	@Id
	//otomatik id arttırma
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")//kolon ismi
	private int id;
	
	@Column(name="name")
	private String name;

	@OneToMany(mappedBy = "brand")
	private List<Model> models;


}
