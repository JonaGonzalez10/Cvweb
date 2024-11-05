package com.webjony.form_web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.webjony.form_web.modelo.ContactoModelo;
import com.webjony.form_web.servicio.ContactoServicio;

@CrossOrigin(origins = "http://localhost:63342")
@Controller
public class ContactoControlador {
    @Autowired
    private ContactoServicio contactoServicio;
    @PostMapping("/guardarContacto")
    public ResponseEntity<Object> guardarContacto(@RequestParam String nombre, @RequestParam String correo, @RequestParam String mensaje){
        ContactoModelo contacto = new ContactoModelo();
        contacto.setNombre(nombre);
        contacto.setCorreo(correo);
        contacto.setMensaje(mensaje);
        contactoServicio.guardarContacto(contacto);
        return ResponseEntity.noContent().build();
    }
}
