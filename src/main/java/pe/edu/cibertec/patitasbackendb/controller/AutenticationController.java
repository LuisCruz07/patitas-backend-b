package pe.edu.cibertec.patitasbackendb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.patitasbackendb.dto.LoginRequestDTO;
import pe.edu.cibertec.patitasbackendb.dto.LoginResponseDTO;
import pe.edu.cibertec.patitasbackendb.service.AutenticacionService;

import java.time.Duration;
import java.util.Arrays;

/*1*/
@RestController
@RequestMapping("/autenticacion")/*la clase autentificacionController sea el componente padre que habilite un conjunto de path que seran las URL de mis servicios*/
public class AutenticationController {
  /*7*/
    @Autowired
    AutenticacionService autenticacionService;

    @PostMapping("/login")
    /*  public String login(String usuario, String clave) {}*/
  /*4*/  public LoginResponseDTO login (@RequestBody LoginRequestDTO loginRequestDTO){

        /*8*/
        try {
            Thread.sleep(Duration.ofSeconds(5));
            String [] datosUsuario = autenticacionService.validarUsuario(loginRequestDTO);
            System.out.println("Respuesta backend : "+ Arrays.toString(datosUsuario));
            if(datosUsuario == null){
                return new LoginResponseDTO("01","Error: Usuario no encontrado","","");
            }
            return new LoginResponseDTO("00","",datosUsuario[0],datosUsuario[1]);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new LoginResponseDTO("99","Error: Ocurrio un problema","","");


        }


    }

}
