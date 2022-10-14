import java.util.Scanner;
import java.util.InputMismatchException;
public class Ap{

public static void main(String args[]){
  Scanner leer= new Scanner (System.in);

  Netflix netflix= new Netflix("www.netflix.com.mx", "netflix@help.com.mx", "+521233444");

  int opcion;
  do{
    opcion=mostrarMenu();
    switch(opcion){
    case 11:
    netflix.inicioSesion();
    break;
    case 12:
    netflix.registroUsuario();
    break;
    case 25:
    netflix.estadisticas();
    break;
    case 2111:
    netflix.mostrarPeliculas();
    break;
    case 2112:
    netflix.capturarPelicula();
    break;
    case 2121:
    netflix.mostrarSeries();
    break;
    case 2122:
    netflix.capturarSerie();
    break;
    case 221:
    netflix.mostrarProveedores();
    break;
    case 222:
    netflix.capturarProveedor();
    break;
    case 231:
    netflix.mostrarActores();
    break;
    case 232:
    netflix.capturarActor();
    break;
    case 241:
    netflix.mostrarParticipaciones();
    break;
    case 242:
    netflix.capturarParticipacion();
    break;

  }

  }
  while(opcion!=0);

 }
public static int mostrarMenu(){
  Scanner leer= new Scanner(System.in);
  int opcion=1;

  System.out.println("1. Usuario      2. Admin    0.Salir");
  opcion=leer.nextInt();

  if(opcion  ==  0) return 0;

  if(opcion==1){

    System.out.println("1. Iniciar sesion     2. Registrar    0.Cancelar");
    opcion=opcion*10+leer.nextInt();

  }

  if(opcion==2){

    System.out.println("1. Contenido    2. Proveedor      3. Actor   4.Participacion  5. Estadisticas  0.Cancelar");
    opcion=opcion*10+leer.nextInt();

  }
  if (opcion==25) {
    return opcion;
  }
  if (opcion==21) {
    System.out.println("1. Pelicula  2. Serie");
    opcion=opcion*10+leer.nextInt();

  }

  if(opcion!=11 && opcion!=12 && opcion!=10 && opcion!=20){

    System.out.println("1. Mostrar    2.Capturar    0. Cancelar");
    opcion=opcion*10+leer.nextInt();
  }

  return opcion;
 }
}
