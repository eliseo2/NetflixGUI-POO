import java.util.Scanner;

public class Elenco{
private String idActor;
private String biografia;
private String premios;
private String nacimiento;

public Elenco(String idActor, String biografia, String premios, String nacimiento){
              this.idActor=idActor;
              this.biografia=biografia;
              this.premios=premios;
              this.nacimiento=nacimiento;
}

public Elenco(){

}

public String getIdActor(){
return idActor;

}

public String getBiografia(){
return biografia;

}

public String getPremios(){
return premios;

}

public String getNacimiento(){
return nacimiento;

}

public void setIdActor(String idActor){
this.idActor=idActor;

}

public void setBiografia(String biografia){
this.biografia=biografia;

}

public void setPremios(String premios){
this.premios=premios;

}

public void setNacimiento(String nacimiento){
this.nacimiento=nacimiento;

}

public void mostrar(){
System.out.println("");
System.out.println("---DATOS ELENCO---");
System.out.println("Nombre: "+idActor);
System.out.println("Biografia: "+biografia);
System.out.println("Premios: "+premios);
System.out.println("Nacimiento: "+nacimiento);

}

public void capturar(){
  Scanner leer = new Scanner(System.in);
  System.out.println("");
  System.out.println("---CAPTURAR DATOS ELENCO---");
  System.out.println("ID-Actor: "); idActor=leer. nextLine();
  System.out.println("Biografia: "); biografia=leer.nextLine();
  System.out.println("Premios: "); premios=leer.nextLine();
  System.out.println("Nacimiento: "); nacimiento=leer.nextLine();

}

}
