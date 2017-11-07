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
public class Serie extends Video {
 private int Capitulos;
 private int Temporada;

    public Serie(int Capitulos, int Temporada, String titulo, int anio, String director) {
        super(titulo, anio, director);
        this.Capitulos = Capitulos;
        this.Temporada = Temporada;
    }

    @Override
    public String retornarInformacion() {
return this.Capitulos+this.Temporada+ super.toString();
    }

    public int getCapitulos() {
        return Capitulos;
    }

    public void setCapitulos(int Capitulos) {
        this.Capitulos = Capitulos;
    }

    public int getTemporada() {
        return Temporada;
    }

    public void setTemporada(int Temporada) {
        this.Temporada = Temporada;
    }
 
}
