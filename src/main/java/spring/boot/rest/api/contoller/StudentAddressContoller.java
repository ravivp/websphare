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

import spring.boot.rest.api.entity.StudentAddress;
import spring.boot.rest.api.services.StudentAddressServices;

@RestController
@RequestMapping("/address")
public class StudentAddressContoller {
	
	@Autowired
	private StudentAddressServices services;
	
	
	@GetMapping("/{id}")
	public StudentAddress getStudentAddress(@PathVariable final Long id) {
		
		return services.getStudentAddress(id);
		
		
	}
	
	
	@GetMapping("/all")
	public List<StudentAddress> getAllStudentAddress(){
		
		
		return services.getAllStudentAddress();
	}
	
	
	@PutMapping("/update")
	
	public StudentAddress update( @RequestBody StudentAddress Address) {
		
		return services.updateStudentAddress(Address);
	}
	
	@PostMapping("/create")
	
   public StudentAddress create( @RequestBody StudentAddress Address) {
		
		return services.save(Address);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteAddress(@PathVariable(name = "id") Long id) {
		
		services.deletStudentAddress(id);
	}
}
