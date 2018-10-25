package cl.project.cursospring.rest;

import cl.project.cursospring.entity.Producto;
import cl.project.cursospring.repository.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductoRest {
    @Autowired
    private ProductoRepo productoRepo;

    @GetMapping("/listaproductos")
    public List<Producto> listarRest(){

        return (List<Producto>) productoRepo.findAll();
    }

}
