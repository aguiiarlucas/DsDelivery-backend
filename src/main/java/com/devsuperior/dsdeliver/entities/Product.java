package com.devsuperior.dsdeliver.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//_________________________________Serializable: é uma boa medida para que nossos obejtos do tipo produto possam ser transformados em sequencia de bites___________________________________________________
//________________________________Com a anotação Entity estamos falando que nossos produtos correspondem a uma entidade do meu dominio que será gerenciada pelo meu Jpa_____________________________________________

@Entity 
@Table(name="tb_product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String name;
		private Double price; 
		private String description;
		private String imageUri;


//________________________________________________Construtor sem argumento_____________________________________________________________________	
			
	public Product() {
		
	}

//__________________________________Construtor com argumentos (esses construtores me dão a alternativa de estanciar um produto já utilizando os argumentos a baixo._______________________________________
	
	public Product(Long id, String name, Double price, String description, String imageUri) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUri = imageUri;
	}
//___________________________________________________________________________Gets and Setters___________________________________________________________________________________________

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImageUri() {
		return imageUri;
	}


	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

//_____________________________________________________Equals and HashCode: Implementação padrão para comparar um objeto com o outro____________________________________
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}