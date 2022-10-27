/*
package com.example.rest.web;

import com.example.rest.entities.Compte;
import com.example.rest.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
@Component
@WebService(serviceName = "BanqueWS")
public class CompteSoapService {
    @Autowired
    private CompteRepository compteRepository;
    @WebMethod
    public List<Compte> compteList(){

        return compteRepository.findAll();
    }

    @WebMethod
    public Compte getOne(@WebParam(name = "id") Long id)
    {
        return compteRepository.findById(id).get();
    }


}
*/
