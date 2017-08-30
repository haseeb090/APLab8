
package pk.edu.nust.seecs.gradebook.bo;

import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;
import pk.edu.nust.seecs.gradebook.entity.Student;

public class CloBoImpl implements CloBo {
    
    @Autowired
    CloDao cloPersistor;


    @Override
    public Integer addNewClo(String courseName, String cloName) {
        Clo newClo = new Clo();
        newClo.setCourseTitle(courseName);
        newClo.setCloName(cloName);
        
        cloPersistor.addCourse(newClo);
        return newClo.getCourseId();
    
    }

}
