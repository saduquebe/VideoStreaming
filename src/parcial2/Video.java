/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Estudiante
 */
public abstract class Video {
    protected String titulo;
    protected int anio;
    protected String director;

    public Video(String titulo, int anio, String director) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
    }
    public abstract String retornarInformacion();

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", anio=" + anio + ", director=" + director + '}';
    }
    
}
