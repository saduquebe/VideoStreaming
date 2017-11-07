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
public class VideoStreaming {
    private ArrayList <Video>videos;

    public VideoStreaming() {
    this.videos= new ArrayList<>();
    }
    public void addVideo(Video video){
        this.videos.add(video);
    }
    public void addSerie(String titulo, int anio,String director,int capitulos,int temporadas)
    {
        Serie serie= new Serie(capitulos,temporadas,titulo,anio,director);
        this.videos.add(serie);
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
    public String listarVideos(){
        String ListarVideos="";
        for (Video video : videos) {
            ListarVideos+=video;
        }
        return ListarVideos;
    }
    public ArrayList<Actor> actores(){
       ArrayList<Actor>actores=new ArrayList<>();
        for (Video video : videos) {
            Pelicula p= (Pelicula)video;
            actores.addAll(actores);
        }
return actores;
    }
}
