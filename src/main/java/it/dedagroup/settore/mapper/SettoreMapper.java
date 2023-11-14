package it.dedagroup.settore.mapper;

import it.dedagroup.settore.DTO.request.SettoreRequest;
import it.dedagroup.settore.DTO.response.SettoreResponse;
import it.dedagroup.settore.model.Settore;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SettoreMapper {

    public Settore toSettoreFromRequest(SettoreRequest request){
        Settore newSettore = new Settore();
        newSettore.setNome(request.getNome());
        newSettore.setPosti(request.getPosti());
        newSettore.setCancellato(false);
        newSettore.setVersion(newSettore.getVersion());
        return newSettore;
    }
    public SettoreResponse toSettoreResponseFromSettore(Settore settore){
        SettoreResponse newResponse = new SettoreResponse();
        newResponse.setNome(settore.getNome());
        newResponse.setPosti(settore.getPosti());
        return newResponse;
    }
}