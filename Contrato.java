import java.util.Scanner;

public class Contrato{
private String plazo;
private int monto;
private boolean activo;

public Contrato(String plazo, int monto, boolean activo){
            this.plazo=plazo;
            this.monto=monto;
            this.activo=activo;
}

public Contrato(){
}
public String getPlazo(){
return plazo;
}
public int getMonto(){
return monto;
}
public boolean getActivo(){
return activo;
}
public void setPlazo(String plazo){
this.plazo=plazo;
}

public void setMonto(int monto){
this.monto=monto;
}
public void setActivo(boolean activo){
this.activo=activo;
}

public void mostrar(){
  System.out.println("");
  System.out.println("");
System.out.println("----DATOS CONTRATO----");
System.out.println("Plazo: "+getPlazo());
System.out.println("Monto: $"+getMonto());
if (getActivo()==true) {
  System.out.println("Activo: Si");
}
else if (getActivo()==false) {
  System.out.println("Activo: No");
}
}

public void capturar(){
  Scanner leer = new Scanner(System.in);
  System.out.println("");
  System.out.println("----CAPTURA DE DATOS CONTRATO----");
  System.out.println("Plazo: "); plazo=leer.nextLine();
  System.out.println("Monto: ");
  System.out.print("$");monto=leer.nextInt();
  System.out.println("Activo: ");activo=leer.nextBoolean();

}

}
