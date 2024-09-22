package pe.edu.cibertec.patitasbackendb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.patitasbackendb.dto.LoginRequestDTO;
import pe.edu.cibertec.patitasbackendb.dto.LoginResponseDTO;

/*1*/
@RestController
@RequestMapping("/autenticacion")/*la clase autentificacionController sea el componente padre que habilite un conjunto de path que seran las URL de mis servicios*/
public class AutenticationController {
    @PostMapping("/login")
    /*  public String login(String usuario, String clave) {}*/
  /*4*/  public LoginResponseDTO login (@RequestBody LoginRequestDTO loginRequest) {


        return new LoginResponseDTO("00","","Gusman","gusman@gmail.com");
    }

}
