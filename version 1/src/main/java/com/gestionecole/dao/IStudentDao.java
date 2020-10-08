package com.gestionecole.dao;

import java.util.List;

import com.gestionecole.domaine.Student;

public interface IStudentDao {

	/**
	 * Cr�er un nouvel �tudiant
	 * @param student
	 */
	void create(Student student);

	/**
	 * modifie un �tudiant
	 * @param student
	 */
	void update(Student student);

	/**
	 * Supprime un �tudiant
	 * @param student
	 */
	void delete(Student student);

	/**
	 * Recherche un �tudiant en fonction de son id
	 * @param id
	 * @return student
	 */
	Student findByID(int id);

	/**
	 * recherche tous les �tudiants
	 * @return list d'�tudiant
	 */
	List<Student> findAll();

}