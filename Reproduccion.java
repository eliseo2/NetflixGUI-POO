import java.util.Scanner;
public class Reproduccion implements Basica{
private String idReproduccion;
private String idPerfil;
private String idContenido;
private boolean inconcluso;
private String idCapitulo="00000";
private String fecha;

public Reproduccion(String idReproduccion,String idPerfil,String idContenido,boolean inconcluso,String fecha,String idCapitulo){
          this.idReproduccion=idReproduccion;
          this.idPerfil=idPerfil;
          this.idContenido=idContenido;
          this.inconcluso=inconcluso;
          this.fecha=fecha;
          this.idCapitulo=idCapitulo;
}

public Reproduccion(){
}

public String queSoy(){
  return "Reproduccion";
}

public String getIdReproduccion(){
return idReproduccion;
}

public String getIdPerfil(){
return idPerfil;
}

public String getIdContenido(){
return idContenido;
}

public boolean getInconcluso(){
return inconcluso;
}

public String getFecha(){
return fecha;
}

public String getIdCapitulo(){
return idCapitulo;
}

private void setIdReproduccion(String idReproduccion){
this.idReproduccion=idReproduccion;
}

private void setIdPerfil(String idPerfil){
this.idPerfil=idPerfil;
}

private void setIdContenido(String idContenido){
this.idContenido=idContenido;
}

private void setInconcluso(boolean inconcluso){
this.inconcluso=inconcluso;
}

private void setFecha(String fecha){
this.fecha=fecha;
}

private void setIdCapitulo(String idCapitulo){
this.idCapitulo=idCapitulo;
}

public void mostrar(){
  System.out.println("");
System.out.println("--------------DATOS REPRODUCCION--------------");
System.out.println("ID Reproduccion: "+idReproduccion);
System.out.println("Contenido:       "+idContenido);
System.out.println("Perfil:          "+idPerfil);
System.out.println("Fecha:           "+fecha);
if (idCapitulo.equals("00000")) {
 System.out.println("Reproduccion de una pelicula");
}
else {
  System.out.print("Reproduccion de capitulo: ID "+idCapitulo);
}
if (inconcluso==true) {
  System.out.println("Contenido: Inconcluso");
}
else {
  System.out.println("Contenido: Terminado");
}
System.out.println("");

}

public void capturar(){
}
}
