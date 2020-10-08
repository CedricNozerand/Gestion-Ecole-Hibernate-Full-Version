package com.gestionecole.service;

import java.util.List;

import com.gestionecole.domaine.Student;

public interface IStudentService {

	/**
	 * Créer un nouvel étudiant en utilisant le dao
	 * @param student
	 */
	void createStudent(Student student);

	/**
	 * Modifie un étudiant en utilisant le dao
	 * @param student
	 */
	void updateStudent(Student student);

	/**
	 * supprime un étudiant en utilisant le dao
	 * @param student
	 */
	void deleteStudent(Student student);

	/**
	 * Un étudiant un étudiant en fonction de son id en utilisant le dao
	 * @param id
	 * @return Student
	 */
	Student findStudentByID(int id);

	/**
	 * Créer un nouvel étudiant en utilisant le dao
	 * @return Liste d'étudiant
	 */
	List<Student> findAllStudent();

}