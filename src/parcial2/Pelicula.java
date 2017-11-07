/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pelicula extends Video{
private ArrayList<Actor>actores;

    public Pelicula( String titulo, int anio, String director) {
        super(titulo, anio, director);
        this.actores = new ArrayList<>();
    }
    public void addActor(Actor actor){
        this.actores.add(actor);
    }

    @Override
    public String retornarInformacion(){
        String informacion="";
        for (Actor actor : actores) {
            informacion+=actor;
        }
        return informacion;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }

}
