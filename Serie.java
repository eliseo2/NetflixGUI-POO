import java.util.Scanner;
public class Serie extends Contenido{
   private int temporadas;
   private int numEpisodios;
   private String ultimaEmision;

public Serie(){
}

public Serie(char genero,String direccion,String titulo,String sinopsis,String premios,
int clasificacion,boolean produccionNetflix,String fechaEstreno,String idContenido,int reproducciones,int likes,int dislikes,
int temporadas,int numEpisodios,String ultimaEmision){
  super(genero,direccion,titulo,sinopsis,premios,clasificacion,produccionNetflix,fechaEstreno,idContenido,reproducciones,likes,dislikes);
  this.genero=genero;
  this.direccion=direccion;
  this.titulo=titulo;
  this.sinopsis=sinopsis;
  this.premios=premios;
  this.clasificacion=clasificacion;
  this.produccionNetflix=produccionNetflix;
  this.fechaEstreno=fechaEstreno;
  this.idContenido=idContenido;
  this.reproducciones=reproducciones;
  this.likes=likes;
  this.dislikes=dislikes;
  this.temporadas=temporadas;
  this.numEpisodios=numEpisodios;
  this.ultimaEmision=ultimaEmision;
}

@Override
public String queSoy(){
  return "Serie";
}

@Override
public void mostrar(){
 super.mostrar();
 System.out.println("Tempordas: "+getTemporadas());
 System.out.println("Episodios: "+getNumEpisodios());
 System.out.println("Ultima Emision: "+getUltimaEmision());
 System.out.println("-------------------------------------------------");
}

@Override
public void capturar(){
  super.capturar();
  Scanner dato= new Scanner(System.in);
  System.out.println("Temporadas: ");temporadas=dato.nextInt();
  System.out.println("Episodios: ");numEpisodios=dato.nextInt();dato.nextLine();
  System.out.println("Ultima Emision: ");ultimaEmision=dato.nextLine();
}


public int getTemporadas(){
    return temporadas;
  }
public void setTemporadas(int temporadas){
    this.temporadas=temporadas;
  }

public int getNumEpisodios(){
    return numEpisodios;
  }
public void setNumEpisodios(int numEpisodios){
    this.numEpisodios=numEpisodios;
  }

public String getUltimaEmision(){
    return ultimaEmision;
  }
public void setUltimaEdicion(String ultimaEmision){
    this.ultimaEmision=ultimaEmision;
  }
}
