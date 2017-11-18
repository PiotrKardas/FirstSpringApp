package com.example.helloSpring.controller;

import com.example.helloSpring.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    //klasa która obsługuje żądanie HTTP to kontroler,
    //nazwa niezależna od języka programowania, odnosie się do wzorca projektowego MVC

    //żądanie = adres+metoda

    @ResponseBody
    @GetMapping("/hello") //żądanie GET /hello ma obsłużyć metoda hello
    public String hello() {
        return "<b><h1>Hello Spring</h1></b>";
        //standardowo metoda kontrolera zwraca HTML, my chcemy zwrócić stringa
        //dlatego zastosowujemy adnotacje @ResponseBody
    }

    @GetMapping("/person")
    public String list(ModelMap modelMap) {
        modelMap.put("people", Person.getExampleData());
        return "home"; // zwróc mi htmla o nazwie home, który ma się znajdować
        //w katalogu resources templates co oznacza zwróc
        //resources/templates/home.html
    }
}
