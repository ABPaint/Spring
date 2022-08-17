package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(101, "Spring Framework", "Pradeep"));
        list.add(new Course(102, "Spring Boot", "Sukvider"));
        list.add(new Course(103, "Web Application", "Adam"));
    }

    @Override
    public List<Course> getAllCourse(){
        return list;
    }

    @Override
    public Course getCourseById(int courseID) {
        Course c=null;

        for (Course course:list)
        {
            if (course.getCourseid()==courseID){
                c = course;
                break;
            }
        }

        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        String title = course.getTitle();
        String instructor = course.getInstructor();
        Course c =null;
        for (Course e:list){
            if (e.getCourseid()== course.getCourseid())
            {
                e.setTitle(title);
                e.setInstructor(instructor);
            }
        }
        return c;
    }

    @Override
    public String deleteCourseById(int courseID) {

        for (Course course:list)
        {
            if (course.getCourseid()==courseID){
                list.remove(course);
                break;
            }
        }
        return "Deleted Successfully";
    }
}
