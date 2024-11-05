package com.webjony.form_web.repositorio;
import com.webjony.form_web.modelo.ContactoModelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositorio extends JpaRepository<ContactoModelo, Integer> {

}
