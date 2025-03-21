package lv.venta.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import lv.venta.model.Course;
import lv.venta.model.Grade;
import lv.venta.model.Student;
import lv.venta.repo.ICourseRepo;
import lv.venta.repo.IGradeRepo;
import lv.venta.repo.IStudentRepo;

public class StudentServiceImpl {

	@Autowired
	private IStudentRepo studentRepo;
	
	@Autowired
	private IGradeRepo grRepo;
	
	@Autowired
	private ICourseRepo coRepo;
	
	@Override
	public ArrayList<Grade> selectGradesByStudents(long ID) throws Exception {
		if (ID <= 0) {
			throw new Exception("ID should be positive");
		}
		
		if(!studentRepo.existsById(ID)) {
			throw new Exception("Student with id: " + ID + " doesn't exist");
		}
		ArrayList<Grade> result = grRepo.findStudentStId(ID);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public ArrayList<Course> selectCoursesByProfessor(long ID) throws Exception {
		if (ID <= 0) {
			throw new Exception("ID SHOULD BE POSITIVE");
		}
		
		if (!coRepo.existsById(ID)) {
			throw new Exception("Course with professor id" + ID + "doesn't exist");
		}
		
		ArrayList<Course> result = coRepo.findProfessorProfID(ID);
		
		
	}
}
