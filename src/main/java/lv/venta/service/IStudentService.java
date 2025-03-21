package lv.venta.service;

import java.util.ArrayList;

import lv.venta.model.Course;
import lv.venta.model.Grade;
import lv.venta.model.Student;

public interface IStudentService {

	
	public abstract ArrayList<Grade> selectGradesByStudents(long ID) throws Exception;
	
	public abstract ArrayList<Course> selectCoursesByStudent(long ID) throws Exception;
	
	public abstract ArrayList<Course> selectCoursesByProfessor(long ID) throws Exception;
	
	public abstract float calculateAVGGradeInCourse(long ID) throws Exception;
}
