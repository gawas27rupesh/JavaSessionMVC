package javasession.mvc.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javasession.mvc.dbconnect.JDBCConnection;
import javasession.mvc.entities.Student;
import javasession.mvc.service.StudentService;

public class StudentServiceImpl implements StudentService {

	
	public void update(Student student) {
		// TODO Auto-generated method stub
		
	}

	public Student getEmployeeById(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Integer sid) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> list() {
		List<Student> studentList =new ArrayList<Student>();
		try {
			Connection connection=null;
			connection=JDBCConnection.getConnection();
			PreparedStatement preparedStatement =connection.prepareStatement("SELECT * FROM student");
			ResultSet rs=preparedStatement.executeQuery();
			while (rs.next()) {
				Student student =new Student();
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return studentList;
	}

	public void add(Student student) {
		
	}

	
}
