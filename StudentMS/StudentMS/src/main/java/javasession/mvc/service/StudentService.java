package javasession.mvc.service;

import java.util.List;


import javasession.mvc.entities.Student;

public interface StudentService {
	
	public void add (Student student);

    public void update (Student student);

    public Student getEmployeeById (Integer sid);

    public void delete (Integer sid);

    public List<Student> list();

}
