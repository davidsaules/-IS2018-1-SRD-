/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.mapeobd;

import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author david 
 * 
 */
@Entity
@Table (name = "usuario")
public class Usuario {
   @Id@GeneratedValue(strategy =GenerationType.IDENTITY )
   @Column(name = "idusuario")
   private int idusuario;
   @Column(name="nickname")
   private String nickname;
   @Column(name="correo")
   private String correo;
   @Column(name="contrasena")
   private String contrasena; 
   @OneToMany(mappedBy = "usuario")
   private Set<Marcador> marcadores;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Set<Marcador> getMarcadores() {
        return marcadores;
    }

    public void setMarcadores(Set<Marcador> marcadores) {
        this.marcadores = marcadores;
    }
    
    
}
