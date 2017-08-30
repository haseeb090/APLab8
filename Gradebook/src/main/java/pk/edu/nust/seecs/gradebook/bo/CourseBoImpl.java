
package pk.edu.nust.seecs.gradebook.bo;

import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Student;

public class CourseBoImpl implements CourseBo {
    
    @Autowired
    CourseDao coursePersistor;

    @Override
    public Integer addNewCourse(String courseName, int creditHours) {
        Course newCourse = new Course();
        newCourse.setCourseTitle(courseName);
        newCourse.setCreditHours(creditHours);
        
        coursePersistor.addCourse(newCourse);
        return newCourse.getCourseId();
    }

}
