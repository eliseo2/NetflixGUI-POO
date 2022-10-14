import java.util.Scanner;

public class Proveedor {
private String nombre;
private String clabe;
private String telefono;
private String correo;
private Contrato contratos[]=new Contrato[100];
private int cContratos;

public Proveedor(String nombre, String clabe, String telefono, String correo){
this.nombre=nombre;
this.clabe=clabe;
this.telefono=telefono;
this.correo=correo;
}

public Proveedor(){
}

public void agregarContrato(String plazo, int monto, boolean activo){
  contratos[cContratos++]=new Contrato(plazo, monto,activo);
}

public void mostrarContratos(){
  for(int i=0;i<cContratos;i++){
      contratos[i].mostrar();
  }

}

public void capturarContrato(){
  contratos[cContratos] = new Contrato();
  contratos[cContratos].capturar();
  cContratos++;
}



public String getNombre(){
return nombre;
}

public String getClabe(){
return clabe;
}

public String getTelefono(){
return telefono;
}

public String getCorreo(){
return correo;
}

public void setNombre(String nombre){
this.nombre=nombre;
}

public void setClabe(String clabe){
this.clabe=clabe;
}

public void setTelefono(String telefono){
this.telefono=telefono;
}

public void setCorreo(String correo){
this.correo=correo;
}

public void mostrar(){
  System.out.println("");
  System.out.println("");
System.out.println("-----DATOS PROVEEDOR----");
System.out.println("Nombre: "+getNombre());
System.out.println("Clabe: "+getClabe());
System.out.println("Telefono: "+getTelefono());
System.out.println("Correo: "+getCorreo());
}

public void capturar(){
Scanner leer = new Scanner (System.in);
System.out.println("");
System.out.println("---CAPTURA DE DATOS PROVEEDOR---");
System.out.println("Nombre: "); nombre=leer.nextLine();
System.out.println("Clabe: "); clabe=leer.nextLine();
System.out.println("Telefono: "); telefono=leer.nextLine();
System.out.println("Correo: "); correo=leer.nextLine();

}



}
