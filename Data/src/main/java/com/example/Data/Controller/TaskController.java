package com.example.Data.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/getPublic")
public class TaskController {

    // Temporary list to store student details
   static  List<Details> list = new ArrayList<>();

    // POST: Add student to the list
    @PostMapping("/add")
    public String addStudent(
            @RequestParam String stdname,
            @RequestParam int stdid,
            @RequestParam String branch) {

        Details d = new Details(stdname, stdid, branch);
        list.add(d);
        return "Succesfully added student";
    }

    // GET: Get student info by name and branch
   
    
    @GetMapping("/get")
    public List<Details> display(){
    	return list;
    }
    
    @DeleteMapping("/{id}")
    public String  delete(@PathVariable("id") int id) {
    	Iterator<Details> iterator = list.iterator();

        while (iterator.hasNext()) {
            Details d = iterator.next();
            if (d.getStdid() == id) {
                iterator.remove(); // Safely remove using iterator
                return "Student with ID " + id + " deleted successfully.";
            }
        }

        return "Student with ID " + id + " not found.";
    }
    
    @PutMapping("/update/{id}")
    public String update(
    		@PathVariable("id") int id,
    		@RequestParam String newname,required=false,
    		@RequestParam int newid,defaultValue="0",
    		@RequestParam String newbranch,required=false) {
    	Iterator<Details> iterator = list.iterator();
    	
    	 while (iterator.hasNext()) {
             Details d = iterator.next();
             if (d.getStdid() == id) {
                 iterator.remove(); // Safely remove using iterator
                 return "Student with ID " + id + " deleted successfully.";
             }
         }

         return "Student with ID " + id + " not found.";
    }
    
}
