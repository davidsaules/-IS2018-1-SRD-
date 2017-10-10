/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;

import javax.servlet.http.HttpServletRequest;
import mx.unam.ciencias.is.mapeobd.Usuario;
import mx.unam.ciencias.is.modelo.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author david
 */
@Controller
public class ControladorUsuario {
    @Autowired
    private UsuarioDAO usuario_bd;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String newInicio(){
        return "newInicio";
    }
    
    @RequestMapping(value =  "/guardaUsuario", method = RequestMethod.GET)
    public String guardaUsuario(HttpServletRequest request){
        String nickname = request.getParameter("nickname");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");
        Usuario u = usuario_bd.getUsuario(correo);
        if(u ==null){
            u = new Usuario();
            u.setNickname(nickname);
            u.setCorreo(correo);
            u.setContrasena(contrasena);
            usuario_bd.guardar(u);
        }
        
        return "redirect:/";
    }   
    
}
