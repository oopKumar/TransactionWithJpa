package com.oop.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.oop.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("delete from Student where id = :sid")
	@Modifying
	@Transactional
	public void deleteStudent(Integer sid);

	@Query("update Student set gender= :gender where id= :sid")
	@Modifying
	@Transactional
	public void updateStudent(String gender, Integer sid);

	@Query(value = "insert into student_dtls(student_id,student_name,student_gender,student_rank)values(:id,:name,:gender,:rank)", nativeQuery = true)
	@Modifying
	@Transactional
	public void insertStudent(Integer id, String name, String gender,Long rank);

}
