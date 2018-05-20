package br.com.listavip.controller;


import br.com.listavip.model.Convidado;
import br.com.listavip.service.ConvidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadoController {

    @Autowired
    private ConvidadoService convidadoService;

    @RequestMapping("listaconvidados")
    public String listaConvidados(Model model) {
        Iterable<Convidado> convidados = this.convidadoService.findAll();
        model.addAttribute("convidados", convidados);
        return "listaconvidados";
    }

}
