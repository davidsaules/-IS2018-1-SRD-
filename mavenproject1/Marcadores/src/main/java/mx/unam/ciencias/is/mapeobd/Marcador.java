/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.mapeobd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Clase que modela un marcador apartir de la tabla marcador
 * @author jonathan
 */
@Entity
@Table(name="marcador")
public class Marcador {
    @Id@GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name = "idmarcador")
    private int marcador_id;
    @Column(name = "nombreM")
    private String nombreM;
    @Column(name = "latitud")
    private double latitud;
    @Column(name = "longitud")
    private double longitud;
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "usuarioid")
    private Usuario usuario;

    
    
    
    //Aqui va tu codigo
    
    /**Nos da el id del marcador
     * @return el id del marcador 
    */
    public int getMarcador_id() {
        return marcador_id;
    }
    
    /** Pone el id del marcador.
      @param marcador_id 
    */
    public void setMarcador_id(int marcador_id) {
        this.marcador_id = marcador_id;
    }

    /**
     * Nos da el nombre del marcador
     * @return el nombre del marcador
     */
    public String getNombreM() {
        return nombreM;
    }

    /**
     * Pone el nombre del marcador
     * @param nombreM 
     */
    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    /**
     * Nos da la latitud
     * @return la latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Asigna la  latitud
     * @param latitud 
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * Nos da la longitud
     * @return la longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Asigna la longitud
     * @param longitud 
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Nos da la descripcion
     * @return la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna una descripcion
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
