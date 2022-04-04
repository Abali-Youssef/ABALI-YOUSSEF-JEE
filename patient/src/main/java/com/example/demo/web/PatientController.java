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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.Binding;
import javax.validation.Valid;
import java.util.List;

@Controller
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping(path = "/index")
    public String patients(Model model,
                           @RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name = "size", defaultValue = "4") int size,
                           @RequestParam(name = "key", defaultValue = "") String key) {
        Page<Patient> pagePatients = patientRepository.findByNomLike("%" + key + "%", PageRequest.of(page, size));
        model.addAttribute("listPatients", pagePatients.getContent());
        model.addAttribute("pages", new int[pagePatients.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("key", key);
        return "patient";
    }

    @GetMapping("/delete")
    public String delete(Long id, String key, int page) {
        patientRepository.deleteById(id);
        return "redirect:/index?page=" + page + "&key=" + key;
    }

    @GetMapping("/formpatient")
    public String formpatient(Model model) {
        model.addAttribute("patient", new Patient());
        return "formpatients";
    }
    @PostMapping("/save")
    public String save(Model model, @Valid Patient patient, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) return "formpatients";
        patientRepository.save(patient);
        return "formpatients";
    }
    @GetMapping("/edit")
    public String edit(Model model,Long id) {
       Patient patient = patientRepository.findById(id).orElse(null);
        if(patient==null) throw new RuntimeException("Patient introuvable");
        model.addAttribute(  "patient", patient);
        return "editpatients";


    }
}
