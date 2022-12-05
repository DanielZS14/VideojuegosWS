/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresariale.ws;

import com.empresariales.bean.Videojuego;
import com.empresariales.service.VideojuegoService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Daniel Zazueta
 */
@WebService(serviceName = "VideojuegoWebService")
public class VideojuegoWebService {
    
    VideojuegoService vjS = new VideojuegoService();

    /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "cargarVideojuegos")
    public List<Videojuego> cargarVideojuegos() {
        return vjS.listaVideojuegos();
    }
}
