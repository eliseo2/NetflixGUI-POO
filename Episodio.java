import java.util.Scanner;
public class Episodio implements Basica{
  private int numeroEpisodio;
  private int temporada;
  private String tituloE;
  private String idEpisodio;
  private String sinopsisE;
  private String duracionE;

  public Episodio(){
  }

  public Episodio(int numeroEpisodio,int temporada,String tituloE,String idEpisodio,String sinopsisE,String duracionE){
    this.numeroEpisodio=numeroEpisodio;
    this.temporada=temporada;
    this.tituloE=tituloE;
    this.idEpisodio=idEpisodio;
    this.sinopsisE=sinopsisE;
    this.duracionE=duracionE;
  }

  @Override
  public String queSoy(){
    return "Episodio";
  }

  public void mostrar(){
  System.out.println("");
  System.out.println("----------------"+getTituloE()+"----------------");
  System.out.println("Temporada: "+getTemporada());
  System.out.println("Episodio Num.: "+getNumeroEpisodio());
  System.out.println("Sinopsis: "+getSinopsisE());
  System.out.println("Duracion: "+getDuracionE());
  System.out.println("");
  }

  public void capturar(){
  Scanner dato= new Scanner(System.in);
  System.out.println("");
  System.out.println("Titulo Episodio: ");tituloE=dato.nextLine();
  System.out.println("ID Episodio: ");idEpisodio=dato.nextLine();
  System.out.println("Temporada: ");temporada=dato.nextInt();
  System.out.println("Num. de Episodio: ");numeroEpisodio=dato.nextInt();dato.nextLine();
  System.out.println("Duracion: ");duracionE=dato.nextLine();
  System.out.println("Sinopsis: ");sinopsisE=dato.nextLine();
  }

public int getNumeroEpisodio(){
      return numeroEpisodio;
    }
public void setNumeroEpisodio(int numeroEpisodio){
      this.numeroEpisodio=numeroEpisodio;
    }
public int getTemporada(){
      return temporada;
    }
public void setTemporada(int temporada){
      this.temporada=temporada;
    }
public String getTituloE(){
      return tituloE;
    }
public void setTituloE(String tituloE){
      this.tituloE=tituloE;
    }
public String getIdEpisodio(){
      return idEpisodio;
    }
public void setIdEpisodio(String idEpisodio){
      this.idEpisodio=idEpisodio;
    }

public String getSinopsisE(){
      return sinopsisE;
    }
public void setSinopsisE(String sinopsisE){
      this.sinopsisE=sinopsisE;
    }

public String getDuracionE(){
      return duracionE;
    }
public void setDuracionE(String duracionE){
      this.duracionE=duracionE;
    }
}
