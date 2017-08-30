
package pk.edu.nust.seecs.gradebook.bo;

import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.nust.seecs.gradebook.dao.ContentDao;
import pk.edu.nust.seecs.gradebook.entity.Content;
import pk.edu.nust.seecs.gradebook.entity.Student;

public class ContentBoImpl implements ContentBo {
    
    @Autowired
    ContentDao contentPersistor;

    @Override
    public Integer addNewContent(String courseName, String content) {
        Content newContent = new Content();
        newContent.setCourseName(courseName);
        newContent.setContent(content);
        
        contentPersistor.addContent(newContent);
        return newContent.getCourseId();
    }
}
