package com.example.onlineshopping_d3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.onlineshopping_d3.Model.productmodel;
import com.example.onlineshopping_d3.Service.productservice;

@Controller
public class productcontroller {

    @Autowired
    private productservice service;

    // Display all products
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("listname", service.getAllproductmodel());
        return "index"; // index.html
    }

    // Show form for adding new product
    @GetMapping("/shownewmodelleaf")
    public String showNewproductmodel(Model model) {
        model.addAttribute("model", new productmodel());
        return "addname"; // addname.html
    }

    // Save product
    @PostMapping("/savemodelleaf")
    public String saveModelLeaf(@ModelAttribute("model") productmodel product) {
        service.saveproductmodel(product);
        return "redirect:/";
    }

    // Show form for update
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
        productmodel product = service.getproductmodelById(id);
        model.addAttribute("model", product);
        return "editmodel"; // editmodel.html
    }

    // Delete record
    @GetMapping("/deletemodel/{id}")
    public String deleteproductmodel(@PathVariable(value = "id") int id) {
        service.deleteproductmodel(id);
        return "redirect:/";
    }
}
