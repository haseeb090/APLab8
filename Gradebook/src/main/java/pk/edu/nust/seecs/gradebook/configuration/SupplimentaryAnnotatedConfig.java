
package pk.edu.nust.seecs.gradebook.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pk.edu.nust.seecs.gradebook.bo.CourseBo;
import pk.edu.nust.seecs.gradebook.bo.CourseBoImpl;
import pk.edu.nust.seecs.gradebook.bo.StudentBo;
import pk.edu.nust.seecs.gradebook.bo.StudentBoImpl;
import pk.edu.nust.seecs.gradebook.bo.CloBo;
import pk.edu.nust.seecs.gradebook.bo.CloBoImpl;
import pk.edu.nust.seecs.gradebook.bo.ContentBo;
import pk.edu.nust.seecs.gradebook.bo.ContentBoImpl;
import pk.edu.nust.seecs.gradebook.bo.GradeBo;
import pk.edu.nust.seecs.gradebook.bo.GradeBoImpl;
import pk.edu.nust.seecs.gradebook.bo.TeacherBo;
import pk.edu.nust.seecs.gradebook.bo.TeacherBoImpl;

@Configuration
@ComponentScan(basePackages={"pk.edu.nust.seecs.springlogaspects"})
public class SupplimentaryAnnotatedConfig {

    @Bean
    public CourseBo courseManager() {
        return new CourseBoImpl();
    }
    
    @Bean
    public StudentBo studentManager() {
        return new StudentBoImpl();
    }
    @Bean
    public CloBo cloManager() {
        return new CloBoImpl();
    }
    
    @Bean
    public ContentBo contentManager() {
        return new ContentBoImpl();
    }
    @Bean
    public GradeBo gradeManager() {
        return new GradeBoImpl();
    }
    
    @Bean
    public TeacherBo teacherManager() {
        return new TeacherBoImpl();
    }
}
