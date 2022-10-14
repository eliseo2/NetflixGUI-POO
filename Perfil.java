import java.io.Serializable;
public class Perfil implements Serializable, Basica{
	private String nombre;
	private boolean categoria;
	private String idPerfil;

	public void mostrar(){
		System.out.println("----- DATOS DEL PERFIL -----");
		System.out.println("NOMBRE:     " +nombre);
		if (categoria==false)
			System.out.println("FILTRO INFANTIL: DESACTIVADO");
		else
			System.out.println("FILTRO INFANTIL: ACTIVADO");
		System.out.println("");
	}

	public void capturar(){

	}

	public String queSoy(){
		return "Perfil";
	}

	public Perfil(){
	}
	public Perfil(String nombre, boolean categoria,String idPerfil){
		this.nombre = nombre;
		this.categoria = categoria;
		this.idPerfil = idPerfil;
	}


	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setCategoria(boolean categoria){
		this.categoria = categoria;
	}
	public boolean getCategoria(){
		return categoria;
	}
	public void setIdPerfil(String idPerfil){
		this.idPerfil = idPerfil;
	}
	public String getIdPerfil(){
		return idPerfil;
	}
}
