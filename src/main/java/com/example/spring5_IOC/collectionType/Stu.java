package com.example.spring5_IOC.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @BelongsProject: spring5_demo
 * @BelongsPackage: com.example.spring5_demo.colectionType
 * @Author: hai
 * @CreateTime: 2023-03-16  15:17
 * @Version: 1.0
 */
public class Stu {
    private String[] courses;

    private List<String> list;
    private Map<String, String> maps;
    private Set<String> set;

    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }


    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }


    public void setCourses(String[] courses) {
        this.courses = courses;
    }


    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(set);
        System.out.println(courseList);
    }
}
