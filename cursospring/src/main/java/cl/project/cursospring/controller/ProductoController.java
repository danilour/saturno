package cl.project.cursospring.controller;

import cl.project.cursospring.entity.Producto;
import cl.project.cursospring.repository.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductoController {
    @Autowired
    private ProductoRepo productoRepo;

    @GetMapping("/listar") //llamada es http://localhost:8080/listar
    public String listarController(Model model){
        RestTemplate restTemplate = new RestTemplate();
        List<Producto> product =   (List<Producto>) productoRepo.findAll();
        model.addAttribute("listcontrol",product);
        return "formulwwario";
    }
}
