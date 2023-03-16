package com.example.spring5_IOC.collectionType;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.collectionType
 * @Author: hai
 * @CreateTime: 2023-03-16  15:38
 * @Version: 1.0
 */
public class Course {
    private String CourseName;

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseName='" + CourseName + '\'' +
                '}';
    }
}
