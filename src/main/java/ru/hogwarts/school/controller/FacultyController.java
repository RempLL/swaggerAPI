package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.FacultyService;

import java.util.Collection;

@RestController
@RequestMapping("faculty")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @DeleteMapping("delete/{id}")
    public Faculty delStudent(@PathVariable long id){
        return facultyService.deleteFaculty(id);
    }

    @GetMapping("get/{id}")
    public Faculty getStudent(@PathVariable long id){
        return facultyService.getFaculty(id);
    }

    @PutMapping("set")
    public Faculty setStudent(@RequestBody Faculty faculty){
        return facultyService.setFaculty(faculty);
    }

    @PostMapping("add")
    public Faculty addStudent(@RequestBody Faculty faculty){
        return facultyService.addFaculty(faculty);
    }

    @GetMapping("collect")
    public Collection<Faculty> facultyCollection(String color){
        return facultyService.facultyCollection(color);
    }

}
