package com.webjony.form_web.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webjony.form_web.modelo.ContactoModelo;
import com.webjony.form_web.repositorio.ContactoRepositorio;
//import com.webjony.form_web.repositorio.CorreoServicio;

@Service
public class ContactoServicio {
    @Autowired
    private ContactoRepositorio contactoRepositorio;

    //@Autowired
    //private CorreoServicio correoServicio;
    public void guardarContacto(ContactoModelo contacto){

        contactoRepositorio.save(contacto);
        //correoServicio.enviarCorreo(contacto);
    }
}
