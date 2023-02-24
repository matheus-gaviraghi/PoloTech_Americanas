package modulo4;

import modulo4.service.TranslateService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/index")
public class Main {

    @Inject
    private TranslateService translateService;

    @Path("/translate")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return translateService.getMessage("en");
    }

    @Path("/json")
    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public Carro hello2() {
        return new Carro("Esportivo", "ISW-1234", "Ferrari");
    }
}

//class Carro{
//    private String modelo;
//    private String placa;
//    private String marca;
//
//    public Carro(String modelo, String placa, String marca) {
//        this.modelo = modelo;
//        this.placa = placa;
//        this.marca = marca;
//    }
//}

record Carro(String modelo, String placa, String marca){}