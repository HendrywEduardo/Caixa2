package com.castelo.caixa_escola.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
    
    @GetMapping (value = "/")
    public String imprimir(){
        System.out.println("Foi?");

        return "éh, acho que foi sim...";
        }

    @PostMapping (value = "api/professor")
    public void create ( ProfessorDTO professorDto){
        Professor professor = professorDTO.Newprofessor();

        System.out.println(professor.toString());
    }    
}
