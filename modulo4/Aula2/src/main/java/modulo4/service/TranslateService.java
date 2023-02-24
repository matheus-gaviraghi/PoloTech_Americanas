package modulo4.service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;

@RequestScoped  // definindo que o escopo sera da aplicacao
public class TranslateService {
    public String getMessage(String language) {
        String result = "";
        switch (language) {
            case "fr" : result = "Bonjour"; break;
            case "de" : result = "Willkommen"; break;
            case "en" : result = "Good Morning"; break;
        }

        return result;
    }
}
