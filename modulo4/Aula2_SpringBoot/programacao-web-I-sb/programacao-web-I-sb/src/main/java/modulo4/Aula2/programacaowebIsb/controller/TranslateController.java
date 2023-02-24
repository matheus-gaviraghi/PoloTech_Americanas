package modulo4.Aula2.programacaowebIsb.controller;

import modulo4.Aula2.programacaowebIsb.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/translate")
public class TranslateController {

    @Autowired // injeta o serviço (bean) dentro dessa classe
    private TranslateService translateService;

    // @RequestMapping(path="/", method=RequestMethod.GET) // forma antiga de definir o metodo e caminho
    @GetMapping("/{language}")
    public String getTranslate(@PathVariable("language") String language){
        return translateService.getMessage(language);
    }
}
