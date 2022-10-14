import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;
public class Suscripcion implements Serializable, Basica{
	private String idSuscripcion;
	private String password;
	private boolean estadoSuscripcion;
	private char metodoPago;
	private int diasSuscripcion;
	private char tipoPlan;

	private int cPerfiles;
  private Perfil perfiles[] = new Perfil[5];

	static Random ale=new Random();
	static Scanner leer = new Scanner(System.in);

	public void mostrar(){
		System.out.println("---------   DATOS DEL USUARIO   ---------");
		System.out.println("Correo o Telefono          : " + getIdSuscripcion());
		System.out.println("Contraseña                 : " + getPassword());
    if (estadoSuscripcion==true) {
 	    System.out.println("Su Suscripcion esta activa");
    }
		else {
	    System.out.println("Su Suscripcion esta inactiva");
		}
		if (metodoPago=='1') {
      System.out.println("Su pago se realizo con tarjeta");
		}
		else if (metodoPago=='2') {
      System.out.println("Su pago se realizo con una tarjeta de regalo ");
		}
		else if (metodoPago=='3') {
      System.out.println("Su pago se realizo con una tranferencia Oxxopay");
		}
		System.out.println("Dias de la Suscripcion     : " + getDiasSuscripcion());
		if (tipoPlan=='1') {
			System.out.println("Plan Basico");
		}
		else if (tipoPlan=='2') {
			System.out.println("Plan Estandar");
		}
		else if (tipoPlan=='3') {
			System.out.println("Plan Premium");
		}
		System.out.println("Perfiles Activos             : ");
		for (int i=0; i<cPerfiles; i++){
			System.out.println(perfiles[i].getNombre());
		}
		System.out.println("");
		System.out.println("Desea ver los detalles de algun perfil: 1.-Si     0.-No");
		int op=leer.nextInt();
		if(op==1)
		mostrarPerfiles();
	}

	public void capturar(){
		System.out.println("");
		System.out.println("---------   REGISTRO DE DATOS   ---------");
		System.out.println("Correo o Numero de telefono: "); idSuscripcion=leer.nextLine();
		System.out.println("Contraseña: "); password=leer.nextLine();
		System.out.println("Metodo de pago:   1.-Tarjeta 2.-Tarjeta de regalo  3.-Oxxopay "); metodoPago=leer.next().charAt(0);leer.nextLine();
    if (metodoPago=='1') {
	  String tar,cvv,nom,fech;
    System.out.println("Ingresa tu tarjeta de Credito o Debito: ");
		tar=leer.nextLine();
		System.out.println("Ingresa tu CVV: ");
    cvv=leer.nextLine();
		System.out.println("Nombre: ");
    nom=leer.nextLine();
		System.out.println("Fecha de vencimiento: ");
		fech=leer.nextLine();
    }
		else if (metodoPago=='2') {
	  String cod;
    System.out.println("Ingresa el codigo de regalo: ");
		cod=leer.nextLine();
		}
		else if (metodoPago=='3') {
    int ref=ale.nextInt(98999999)+1000000;
		System.out.println("Tu codigo de referencia para el pago es: ");
		System.out.println("FG"+ref+"OD");
		System.out.println("Paga en tu Oxxo mas cercano  1.Confirmacion");
		int pag=leer.nextInt();
		System.out.println("Pago realizado");
		}
		System.out.println("");
		System.out.println("1. BASICO: ");
		System.out.println("Pantallas en las que se puede ver al mismo tiempo: 1 ");
		System.out.println("");
		System.out.println("2. ESTANDAR: ");
		System.out.println("Pantallas en las que se puede ver al mismo tiempo:  2");
    System.out.println("HD dsiponible ");
		System.out.println("");
		System.out.println("3. PREMIUM: ");
		System.out.println("Pantallas en las que se puede ver al mismo tiempo:  4");
    System.out.println("Ultra HD disponible");
		System.out.println("");
		System.out.println("Elige el plan (De acuerdo a su numero): ");tipoPlan=leer.next().charAt(0);leer.nextLine();
    estadoSuscripcion=true;
		diasSuscripcion=30;
	}

	public String queSoy(){
		return "Suscripcion";
	}

	public void mostrarPerfiles(){
    int ass=1;
			System.out.println("1. Ver perfiles   2. Ver detalles de perfiles");
			int op=leer.nextInt();
			if (op==1) {
				for (int i=0; i<cPerfiles; i++){
					System.out.println((i+1)+". "+perfiles[i].getNombre());
				}
			}
			else if (op==2) {
				for (int i=0; i<cPerfiles; i++){
					System.out.println("--------------"+(i+1)+"--------------");
					perfiles[i].mostrar();
				}
			}
	 }

	public void capturarPerfil(String idSuscripcion){

		String nombre;
		boolean categoria;
		int cont=0,i=0;
		System.out.println("-----   DATOS DEL NUEVO PERFIL   -----");
		do {
			System.out.println("Escribe el nombre: ");
			nombre=leer.nextLine();
			for (int y=0;y<cPerfiles;y++) {
        if (perfiles[y].getNombre().equals(nombre)) {
         cont++;
        }
			}
			if (cont>0) {
       System.out.println("Porfa ingresa otro nombre ese ya existe");
			 i=1;
			}
			else {
				i=0;
			}
		} while (i==1);
		System.out.println("Filtro Infantil:  1.-Activado     2.-Desactivado   ");
		int res=leer.nextInt();
		if(res==1)
			categoria=true;
		else
			categoria=false;
    idSuscripcion=idSuscripcion+nombre;
		agregarPerfil(nombre, categoria,idSuscripcion);
	}

	public void agregarPerfil(String nombre, boolean edad, String idPerfil){
		perfiles[cPerfiles] = new Perfil(nombre,edad,idPerfil);
		cPerfiles++;
	}

	public String mandarIdPerfil(int perfil){
		return perfiles[perfil].getIdPerfil();
	}

	public boolean getPerfilClasificacion(int perfil){
	 return perfiles[perfil].getCategoria();
 }


	public Suscripcion(){
	}
	public Suscripcion(String idSuscripcion, String password, boolean estadoSuscripcion, char metodoPago,
  int diasSuscripcion, char tipoPlan){
		this.idSuscripcion = idSuscripcion;
		this.password = password;
	  this.estadoSuscripcion = estadoSuscripcion;
		this.metodoPago = metodoPago;
		this.diasSuscripcion = diasSuscripcion;
		this.tipoPlan = tipoPlan;
}

	public void setIdSuscripcion(String idSuscripcion){
		this.idSuscripcion = idSuscripcion;
	}
	public String getIdSuscripcion(){
		return idSuscripcion;
	}

	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return password;
	}

	public void setEstadoSuscripcion(boolean estadoSuscripcion){
		this.estadoSuscripcion = estadoSuscripcion;
	}
	public boolean getEstadoSuscripcion(){
		return estadoSuscripcion;
	}

	public void setMetodoPago(char metodoPago){
		this.metodoPago = metodoPago;
	}
	public char getMetodoPago(){
		return metodoPago;
	}

	public void setDiasSuscripcion(int diasSuscripcion){
		this.diasSuscripcion = diasSuscripcion;
	}
	public int getDiasSuscripcion(){
		return diasSuscripcion;
	}

	public void setTipoPlan(char tipoPlan){
		this.tipoPlan = tipoPlan;
	}
	public char getTipoPlan(){
		return tipoPlan;
	}
}
