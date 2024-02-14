package com.bhavya.springboot.learnspringboot;


// http://localhost:8080/courses
//[
//        {
//        "id": 1,
//        "name": "Learn AWS",
//        "author": "in28minutes"
//        } ]

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class CourseController {

    // / Courses
    // Course : id, name, author
    @RequestMapping("/courses")
    public List<Course> retriveAllCourse() {
        return Arrays.asList(
                new Course(1,"Learn AWS", "Bhavya"),
                new Course(2, "Learn Java", "Sonu"),
                new Course(3, "Learn NodeJS", "Antiya"),
                new Course(3, "Learn JS", "Bhavya")
        );
    }
}
