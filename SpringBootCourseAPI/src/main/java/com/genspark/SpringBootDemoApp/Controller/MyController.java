package com.genspark.SpringBootDemoApp.Controller;

import com.genspark.SpringBootDemoApp.Entity.Course;
import com.genspark.SpringBootDemoApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("home")
    public String home(@RequestParam(value = "name", defaultValue = "World")String name, @RequestParam(value = "msg", defaultValue = "Good Morning") String msg)
    {
        return "Hello " +name+ "! " +msg;
//        return "<HTML><H1>Welcome to my First Boot Application</H1></HTML>";
    }

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseService.getAllCourse();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable String courseID)
    {
        return this.courseService.getCourseById(Integer.parseInt(courseID));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteCourse(@PathVariable String courseID)
    {
        return this.courseService.deleteCourseById(Integer.parseInt(courseID));
    }


}
