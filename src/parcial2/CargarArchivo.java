/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class CargarArchivo {
    private VideoStreaming videostreaming;
    public void Cargar(String ruta){
        File file= new File(ruta);
    Scanner in= null;
        if(file.exists()){
            try {
                in= new Scanner(file);
                String tipo=null, titulo=null,anio=null,director=null;
                int temporada=0,capitulos=0;
                                while(in.hasNext()){
                    tipo=in.next().trim();
                if(tipo.equals("S")){
                    titulo=in.next().trim();
                    anio=in.next().trim();
                    director=in.next().trim();
                    temporada= in.nextInt();
                    capitulos= in.nextInt();
                    Serie serie= new Serie(capitulos, temporada, titulo,capitulos,director );
                    videostreaming.addSerie(titulo, anio,director,capitulos, temporada);
                }
                else if(tipo.equals("D")){
                    
                }
                else if(tipo.equals("P")){
                    
                }

                }
            } catch (FileNotFoundException ex) {

            }
            }
    
    
    }
}
