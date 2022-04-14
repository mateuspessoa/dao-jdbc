package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;    // ATRIBUTO
	private String name;   // ATRIBUTO
	
	public Department() {		// CONSTRUTOR PADRÃO
		
	}

	public Department(Integer id, String name) {		// CONSTRUTOR COM ARGUMENTOS (GENERATE CONSTRUCTORS)
		this.id = id;
		this.name = name;
	}

	public Integer getId() {		// GERAR OS GETERS SETERS (GENERATE GETERS E SETERS)
		return id;
	}

	public void setId(Integer id) {    // GERAR OS GETERS SETERS (GENERATE GETERS E SETERS)
		this.id = id;
	}

	public String getName() {     // GERAR OS GETERS SETERS (GENERATE GETERS E SETERS)
		return name;
	}

	public void setName(String name) {    // GERAR OS GETERS SETERS (GENERATE GETERS E SETERS)
		this.name = name;
	}

	@Override
	public int hashCode() {				// O hascode e o equals serve para fazer comparações, nesse caso apenas por Id
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";  // AQUI FOI GERADO O TO STRING
	}	
}
