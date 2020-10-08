package com.gestionecole.dao;

import java.util.List;

import com.gestionecole.domaine.Student;

public interface IStudentDao {

	/**
	 * Créer un nouvel étudiant
	 * @param student
	 */
	void create(Student student);

	/**
	 * modifie un étudiant
	 * @param student
	 */
	void update(Student student);

	/**
	 * Supprime un étudiant
	 * @param student
	 */
	void delete(Student student);

	/**
	 * Recherche un étudiant en fonction de son id
	 * @param id
	 * @return student
	 */
	Student findByID(int id);

	/**
	 * recherche tous les étudiants
	 * @return list d'étudiant
	 */
	List<Student> findAll();

}