package modulo4.Aula2.programacaowebIsb.service;

import org.springframework.stereotype.Service;

@Service
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
