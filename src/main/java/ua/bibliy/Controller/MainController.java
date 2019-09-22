package ua.bibliy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.bibliy.Model.Student;

import java.util.ArrayList;
import java.util.List;


@Controller
//@RequestMapping("/ok")
public class MainController {
    List<Student> studentList = new ArrayList<>();

    @RequestMapping(value = "/view{id}")
    public String view(@PathVariable ("id") String id, Model model) {
        model.addAttribute("hello", "Hello " + " " + id);
        return "hello";
    }
    //Добавляет в модель список студентов и перенаправляет запрос на страницу student.jsp
    @RequestMapping("/student")
    public String getStudent(Model model) {
       model.addAttribute("student", studentList);
        return "student";
    }
    //Перенаправляет запрос на страницу addStudent.jsp.
    //Нет смысла что-либо обрабатывать, поскольку данные еще не получены
    @RequestMapping("/student/add")
    public String addStudent() {
        return "addStudent";
    }

    //Добавление данных со страницы addStudent.jsp в модель, перенаправление на запрос "/student"
    @RequestMapping("/add")
    public String add(@RequestParam("name") String name,@RequestParam("lastName") String lastName) {
        studentList.add(new Student(name,lastName));
        System.out.println(studentList);
//            @RequestParam("name") String name,
//            @RequestParam("lastName") String lastName) {
//        studentList.add(new Student(name, lastName));
        return "redirect:student";
    }
}


