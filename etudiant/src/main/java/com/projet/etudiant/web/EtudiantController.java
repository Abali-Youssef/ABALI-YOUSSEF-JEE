package com.projet.etudiant.web;

import com.projet.etudiant.entities.Etudiant;
import com.projet.etudiant.repositories.EtudiantRepository;
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

import javax.validation.Valid;

@Controller
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping(path = "/index")
    public String etudiants(Model model,
                           @RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name = "size", defaultValue = "4") int size,
                           @RequestParam(name = "key", defaultValue = "") String key) {
        Page<Etudiant> pageEtudiants = etudiantRepository.findByNomLike("%" + key + "%", PageRequest.of(page, size));
        model.addAttribute("listEtudiants", pageEtudiants.getContent());
        model.addAttribute("pages", new int[pageEtudiants.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("key", key);
        return "etudiant";
    }

    @GetMapping("/admin/delete")
    public String delete(Long id, String key, int page) {
        etudiantRepository.deleteById(id);
        return "redirect:/index?page=" + page + "&key=" + key;
    }
    @GetMapping("/")
    public String home() {

        return "home";
    }
    @GetMapping("/admin/formetudiant")
    public String formetudiant(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        return "formetudiants";
    }
    @PostMapping("/admin/save")
    public String save(Model model, @Valid Etudiant etudiant, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) return "formetudiants";
        etudiantRepository.save(etudiant);
        return "etudiant";
        //return "redirect:/index?page=" + page + "&key=" + key;
    }
    @GetMapping("/admin/edit")
    public String edit(Model model,Long id) {
        Etudiant etudiant = etudiantRepository.findById(id).orElse(null);
        if(etudiant==null) throw new RuntimeException("etudiant introuvable");
        model.addAttribute(  "etudiant", etudiant);
        return "editetudiants";
}
}
