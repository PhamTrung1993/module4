package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

//    @RequestMapping("/hello")
//    public String hello(ModelMap map) {
//        String helloWorldMessage = "Hello world!";
//        String welcomeMessage = "Welcome!";
//        map.addAttribute("helloMessage", helloWorldMessage);
//        map.addAttribute("welcomeMessage", welcomeMessage);
//        return "hello";
//    }
@GetMapping("/greeting")
//@RequestParam: là annotation để đánh dấu rằng name là tham số được truyền vào
//model: là đối tượng để truyền dữ liệu từ controller sang view
//model.addAttribute(): là phương thức để truyền một dữ liệu từ controller sang view
public String greeting(@RequestParam String name, Model model) {
    model.addAttribute("name",name);
    return "hello";
}
}
