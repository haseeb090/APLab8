
package pk.edu.nust.seecs.gradebook.bo;

import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Grade;
import pk.edu.nust.seecs.gradebook.entity.Student;

public class GradeBoImpl implements GradeBo {
    
    @Autowired
    CourseDao coursePersistor;

    

    @Override
    public Integer addNewGrade(String courseName, String grade) {
        Grade newGrade = new Grade();
        newGrade.setCourseTitle(courseName);
        newGrade.setGrade(grade);
        
        coursePersistor.addCourse(newGrade);
        return newGrade.getCourseId();
    }

}
