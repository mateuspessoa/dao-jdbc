package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);  //OBJETIVO DE CONSULTAR NO BANCO DE DADOS UM OBJETO COM ESSE ID.
	List<Department> findAll();		//PROCURAR E RETORNAR UMA LISTA
	
}
