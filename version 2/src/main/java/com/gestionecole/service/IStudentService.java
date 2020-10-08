package com.gestionecole.service;

import java.util.List;

import com.gestionecole.domaine.Student;

public interface IStudentService {

	/**
	 * Cr�er un nouvel �tudiant en utilisant le dao
	 * @param student
	 */
	void createStudent(Student student);

	/**
	 * Modifie un �tudiant en utilisant le dao
	 * @param student
	 */
	void updateStudent(Student student);

	/**
	 * supprime un �tudiant en utilisant le dao
	 * @param student
	 */
	void deleteStudent(Student student);

	/**
	 * Un �tudiant un �tudiant en fonction de son id en utilisant le dao
	 * @param id
	 * @return Student
	 */
	Student findStudentByID(int id);

	/**
	 * Cr�er un nouvel �tudiant en utilisant le dao
	 * @return Liste d'�tudiant
	 */
	List<Student> findAllStudent();

}