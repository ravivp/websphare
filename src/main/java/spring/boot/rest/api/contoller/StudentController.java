package spring.boot.rest.api.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.rest.api.entity.Student;
import spring.boot.rest.api.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServices studentServices;
	
	@PostMapping("/create")
	public Student create(@RequestBody Student student) {
		
		return studentServices.save(student);
				
	}
	
	@GetMapping("/{id}")
    public Student getstudent(@PathVariable(name = "id") Long id) {
		
		
		return studentServices.getStudent(id);
	}
	
	
	@GetMapping("/all")
	public List<Student> getAllStudent(){
		
		return studentServices.getAllStudent();
	}
	
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		
		return studentServices.update(student);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id")Long id) {
		
		studentServices.deleteStudent(id);
	}
}
