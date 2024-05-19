package com.udaylearning.Spring.Boot.CRUD;

import com.udaylearning.Spring.Boot.CRUD.Dao.StudentDao;
import com.udaylearning.Spring.Boot.CRUD.pojo.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner (StudentDao studentdao){

		return runner ->{
			//createStudent(studentdao);

			readStudent(studentdao);
		};
	}

	private void readStudent(StudentDao studentdao) {
		Student fromDB = studentdao.getStudent(1);
		System.out.println("The student in DB is " + studentdao.getStudent(1));
		System.out.println(fromDB.getFirstName()+ "  "+ fromDB.getLastName());

	}

	void createStudent(StudentDao studentdao){

		Student newstudent = new Student("Uday","Neel","Adiuday@gmail.com");

		studentdao.saveStudent(newstudent);

		System.out.println("Saved student in DB is :"+ newstudent.getId());

	}


}
