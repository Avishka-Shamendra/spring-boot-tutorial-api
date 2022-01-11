package io.springtutorial.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.springtutorial.springbootstarter.topic.Topic;

@Entity //to crate a table with properties
public class Course {

    @Id //id variable as primary key
    private String id;
    private String name;
    private String description;

    @ManyToOne //FK mapping many courses to a single topic
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Course() {}
    
    public Course(String id, String name, String description,String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic=new Topic(topicId,"","");
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
