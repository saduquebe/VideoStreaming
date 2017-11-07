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
public class Docuemental extends Video {
    private String genero;

    public Docuemental(String genero, String titulo, int anio, String director) {
        super(titulo, anio, director);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String retornarInformacion() {
return this.genero+" "+super.toString();
        }


    
}
