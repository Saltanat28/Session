package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.model.Company;
import peaksoft.service.CompanyService;

import java.util.List;

@Controller
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompanyController {
    private  final CompanyService companyService;

    String findAll(Model model){
        List<Company> companies = companyService.findAll();
        model.addAttribute("companies", companies);
        return "companies";
    }
    // get , post
    @PostMapping("/new")
    String  create(@ModelAttribute("newCompany") Company company){
        companyService.save(company);
        return "redirect:_/companies";
    }
    @GetMapping("/savePage")
    String save(Model model){
        model.addAttribute("company", new Company());
        return "savePage";
    }
}
