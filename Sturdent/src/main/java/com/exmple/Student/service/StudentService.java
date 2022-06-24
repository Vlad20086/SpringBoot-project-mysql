package com.exmple.Student.service;

import org.springframework.stereotype.Service;
 @Service
public class StudentService {

         @Autowired
         private Student Rapository repo;
         public List<Student> listAll(){
             return repo.findAll();
         }
         public void save(Stuednt std){
             repo.save(std);
         }

         public Student get(long id){
             return repo.findbyId(id);
         }
         public void delete(long id){
             repo deleteById(id);
         }


}
