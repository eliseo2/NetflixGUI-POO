import java.util.Scanner;
public class Pelicula extends Contenido{
   private String duracionP;
   private String guion;

public Pelicula(){
}

public Pelicula(char genero,String direccion,String titulo,String sinopsis,String premios,
int clasificacion,boolean produccionNetflix,String fechaEstreno,String idContenido,int reproducciones,int likes,int dislikes,
String duracionP,String guion){
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
  this.duracionP=duracionP;
  this.guion=guion;
}

@Override
public String queSoy(){
  return "Pelicula";
}

@Override
public void mostrar(){
 super.mostrar();
 System.out.println("Duracion: "+getDuracionP());
 System.out.println("Guion: "+getGuion());
 System.out.println("-------------------------------------------------");
}

@Override
public void capturar(){
  super.capturar();
  Scanner dato= new Scanner(System.in);
  System.out.println("Duracion: ");duracionP=dato.nextLine();
  System.out.println("Guion: ");guion=dato.nextLine();
}

public String getDuracionP(){
    return duracionP;
  }
public void setDuracionP(String duracionP){
    this.duracionP=duracionP;
  }

public String getGuion(){
    return guion;
  }
public void setGuion(String guion){
    this.guion=guion;
  }
}
