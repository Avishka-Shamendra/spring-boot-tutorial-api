package io.springtutorial.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{
    public List<Course> findByTopicId(String topicId);//auto implemented by spring data JPA
}
