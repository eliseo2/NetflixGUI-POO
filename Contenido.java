import java.util.Scanner;
public abstract class Contenido implements Basica{
  protected char genero;
  protected String direccion;
  protected String titulo;
  protected String sinopsis;
  protected String premios;
  protected int clasificacion;
  protected boolean produccionNetflix;
  protected String fechaEstreno;
  protected String idContenido;
  protected int reproducciones;
  protected int likes;
  protected int dislikes;
  protected int cEpisodios;
  protected Episodio episodios []= new Episodio[100];

public Contenido(){
}

public abstract String queSoy();

public Contenido(char genero,String direccion,String titulo,String sinopsis,String premios,int clasificacion,
boolean produccionNetflix,String fechaEstreno,String idContenido,int reproducciones,int likes,int dislikes){
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
}

public void agregarEpisodio(int numeroEpisodio,int temporada,String tituloE,String idEpisodio,String sinopsisE,String duracionE){
if (cEpisodios<100) {
  episodios[cEpisodios++]= new Episodio(numeroEpisodio,temporada,tituloE,idEpisodio,sinopsisE,duracionE);
}
}

public void capturarEpisodio(){
episodios[cEpisodios]=new Episodio();
episodios[cEpisodios].capturar();
cEpisodios++;
}

public void mostrarEpisodio(){
for (int i=0;i<cEpisodios;i++) {
  System.out.println("-------------------------Episodio "+(i+1)+"-----------------------");
  episodios[i].mostrar();
}
}

public String primeraVisitaSerie(){
  return episodios[0].getIdEpisodio();
}

public String mandarIdEpisodio(int num){
  return episodios[num].getIdEpisodio();
}

public int mandarNumCaps(){
 return cEpisodios;
}

public void mostrar(){
  System.out.println("");
  System.out.println("");
  System.out.println("-----------------"+getTitulo()+"-----------------");
  System.out.println("");
  if (genero=='D') {
  System.out.println("Genero: Drama");
  }
  else if (genero=='A') {
  System.out.println("Genero: Accion");
  }
  else if (genero=='T') {
  System.out.println("Genero: Terror");
  }
  else if (genero=='C') {
  System.out.println("Genero: Ciencia Ficcion");
  }
  else if (genero=='M') {
  System.out.println("Genero: Comedia");
  }
  else if (genero=='U') {
  System.out.println("Genero: Musical");
  }
  else if (genero=='R') {
  System.out.println("Genero: Romantica");
  }
  else if (genero=='F') {
  System.out.println("Genero: Fantasia");
  }
  else if (genero=='N') {
  System.out.println("Genero: Anime");
  }
  else if (genero=='E') {
  System.out.println("Genero: Deportes");
  }
  System.out.println("Sinopsis: "+getSinopsis());
  System.out.println("Premios: "+getPremios());
  System.out.println("Direccion: "+getDireccion());
  if (clasificacion==1) {
  System.out.println("Clasificacion: AA");
  }
  else if (clasificacion==2) {
  System.out.println("Clasificacion: A");
  }
  else if (clasificacion==3) {
  System.out.println("Clasificacion: B");
  }
  else if (clasificacion==4) {
  System.out.println("Clasificacion: B15");
  }
  else if (clasificacion==5) {
  System.out.println("Clasificacion: C");
  }
  else if (clasificacion==6) {
  System.out.println("Clasificacion: D");
  }
  if (produccionNetflix==true) {
  System.out.println("Producida por Netflix");
  }
  System.out.println("Fecha de Estreno: "+getFechaEstreno());
}

public void capturar(){
  Scanner dato= new Scanner(System.in);
  System.out.println("Titulo: ");titulo=dato.nextLine();
  System.out.println("Genero: ");
  System.out.println("D:Drama  A:Accion  T:Terror 	C:Ciencia Ficcion ");
  System.out.println("M:Comedia  U:Musical  R:Romantica  F:Fantasia  N:Anime  E:Deportes");genero=dato.next().charAt(0);dato.nextLine();
  System.out.println("Direccion: ");direccion=dato.nextLine();
  System.out.println("Sinopsis: ");sinopsis=dato.nextLine();
  System.out.println("Premios: ");premios=dato.nextLine();
  System.out.println("Clasificacion: ");
  System.out.println("1.-AA=Todo público,menores de 7 años  2.-A=Todo público 3.-B=Mayores de 12 años ");
  System.out.println("4.-B15=Mayores de 15 años en adelante 5.-C=18 años  6.-D=Contenido violento, sexual, mayores de 18");clasificacion=dato.nextInt();
  System.out.println("Produccion de Netflix: 1.-Si 2.-No");
  int var=dato.nextInt();dato.nextLine();
  if (var==1) {
  produccionNetflix=true;
  }
  else{
  produccionNetflix=false;
  }
  System.out.println("Fecha de Estreno: ");fechaEstreno=dato.nextLine();
  System.out.println("ID del Contenido: ");idContenido=dato.nextLine();
  reproducciones=1;
  likes=1;
  dislikes=1;
}

public char getGenero(){
    return genero;
  }
public void setGenero(char genero){
    this.genero=genero;
  }

public String getDireccion(){
    return direccion;
  }
public void setDireccion(String direccion){
    this.direccion=direccion;
  }
public String getTitulo(){
    return titulo;
  }
public void setTitulo(String titulo){
    this.titulo=titulo;
  }
public String getSinopsis(){
    return sinopsis;
  }
public void setSinopsis(String sinopsis){
    this.sinopsis=sinopsis;
  }
public String getPremios(){
    return premios;
  }
public void setPremios(String premios){
    this.premios=premios;
  }
public int getClasificacion(){
    return clasificacion;
  }
public void setClasificacion(int clasificacion){
    this.clasificacion=clasificacion;
  }
public boolean getProduccionNetflix(){
    return produccionNetflix;
  }
public void setProduccionNetflix(boolean produccionNetflix){
    this.produccionNetflix=produccionNetflix;
  }
public String getFechaEstreno(){
    return fechaEstreno;
  }
public void setFechaEstreno(String fechaEstreno){
    this.fechaEstreno=fechaEstreno;
  }
public String getIdContenido(){
    return idContenido;
  }
public void setIdContenido(String idContenido){
    this.idContenido=idContenido;
  }
public int getReproducciones(){
    return reproducciones;
  }
public void setReproducciones(int reproducciones){
    this.reproducciones=reproducciones;
  }
public int getLikes(){
    return likes;
  }
public void setLikes(int likes){
    this.likes=likes;
  }
public int getDislikes(){
    return dislikes;
  }
public void setDislikes(int dislikes){
    this.dislikes=dislikes;
  }
}
