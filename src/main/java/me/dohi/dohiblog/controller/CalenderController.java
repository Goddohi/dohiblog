package me.dohi.dohiblog.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class CalenderController {

    @GetMapping("/Calender")
    public String thymeleafExample(Model model) {
        CalenderController.Date examplePerson = new CalenderController.Date();
        examplePerson.setId(1L);
        examplePerson.setName("홍길동");
        examplePerson.setAge(11);
        examplePerson.setHobbies(List.of("운동", "독서"));

        model.addAttribute("person", examplePerson);
        model.addAttribute("today", LocalDate.now());

        return "calendar/calendar";
    }

    @Setter
    @Getter
    class Date {
        private Long id;
        private String name;
        private int age;
        private List<String> hobbies;
    }
}
