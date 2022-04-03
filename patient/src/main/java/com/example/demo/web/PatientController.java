package com.example.demo.web;

import com.example.demo.entities.Patient;
import com.example.demo.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Data @AllArgsConstructor @NoArgsConstructor
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping(path  = "/index")
    public String patients (Model model,
                            @RequestParam(name = "page", defaultValue = "0") int page,
                            @RequestParam (name = "size", defaultValue = "4") int size,
                            @RequestParam (name = "key", defaultValue = "") String key){
        Page<Patient> pagePatients=patientRepository.findByNomLike("%"+key+"%",PageRequest.of(page, size));
        model.addAttribute(  "listPatients", pagePatients.getContent ());
        model.addAttribute( "pages", new int[pagePatients.getTotalPages ()]);
        model.addAttribute(  "currentPage", page);
        model.addAttribute(  "key", key);
        return "patient";
    }
    @GetMapping("/delete")
    public String delete(Long id,String key,int page){
        patientRepository.deleteById(id);
        return "redirect:/index?page="+page+"&key="+key;
    }
}
