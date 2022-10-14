import java.util.Scanner;
public class Participacion{
private String idContenido;
private String idActor;
private String papel;


public Participacion(String idContenido, String idActor, String papel){
                    this.idContenido=idContenido;
                    this.idActor=idActor;
                    this.papel=papel;
}

public Participacion(){
}

public String getIdContenido(){
return idContenido;
}

public String getIdActor(){
return idActor;
}

public String getPapel(){
return papel;
}

public void setIdContenido(String idContenido){
this.idContenido=idContenido;
}

public void setIdActor(String idActor){
this.idActor=idActor;
}

public void setPapel(String papel){
this.papel=papel;
}

public void mostrar(){
  System.out.println("");
System.out.println("---DATOS PARTICIPACION---");
System.out.println("ID-Contenido: "+idContenido);
System.out.println("ID-Actor: "+idActor);
System.out.println("Papel: "+papel);
}

public void capturar(){
Scanner leer=new Scanner(System.in);
System.out.println("");
System.out.println("---CAPTURAR DATOS PARTICIPACION---");
System.out.println("ID-Contenido: "); idContenido=leer.nextLine();
System.out.println("ID-Actor: "); idActor=leer.nextLine();
System.out.println("Papel: "); papel=leer.nextLine();

}



}
