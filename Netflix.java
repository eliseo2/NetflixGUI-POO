import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Netflix {

private String paginaWeb;
private String correoSoporte;
private String telefono;
private Contenido contenidos[]=new Contenido[1000];
private Elenco elencos[]=new Elenco[10000];
private Participacion participaciones[]=new Participacion[10000];
private Suscripcion suscripciones[]=new Suscripcion[1000000];
private Proveedor proveedores[]=new Proveedor[100];
private Reproduccion reproducciones[]=new Reproduccion[1000000000];
private int cContenidos,cProveedores,cSuscripciones,cElenco,cParticipaciones,cReproducciones;

private static boolean paraTi = false;
static Scanner dato = new Scanner(System.in);
DateTimeFormatter dateF = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

public Netflix(String paginaWeb, String correoSoporte, String telefono){
this.paginaWeb=paginaWeb;
this.correoSoporte=correoSoporte;
this.telefono=telefono;
inicializaDatos();
}

public Netflix(){
}

public String getPaginaWeb(){
return paginaWeb;
}
public String getCorreoSoporte(){
return correoSoporte;
}
public String getTelefono(){
return telefono;
}
public void setPaginaWeb (String paginaWeb){
this.paginaWeb=paginaWeb;
}
public void setCorreoSoporte (String correoSoporte){
this.correoSoporte=correoSoporte;
}
public void setTelefono(String telefono){
this.telefono=telefono;
}

private void inicializaDatos(){
//CONTENIDOS
contenidos[0] = new Pelicula('A',"Scott Derrickson", "Doctor Strange: Hechicero Supremo", "La vida del famoso neurocirujano Dr. Stephen Strange cambia para siempre cuando un terrible accidente de coche le arrebata el uso de sus manos. Cuando la medicina tradicional le falla, busca la curación en un lugar misterioso llamado Kamar-Ta",
"No tiene",3,false,"4 de noviembre de 2016","00135",200000,266,32,"2 hrs","John Spaihts, Luis Pablo Duran, C. Robert Cargill");

contenidos[1] = new Pelicula('T',"Robert Eggers","El faro","Dos fareros que afrontan un turno de cuatro semanas juntos combaten la constante tentación de dejarse arrastrar por la locura en una isla remota y misteriosa de Nueva Inglaterra",
"Ganador de Cannes 2019",5,false,"19 de mayo de 2019","03502",219483,2346,569,"2 hrs","Robert Eggers, Max Eggers");

contenidos[2] = new Pelicula('D',"Bryan Singer","Bohemian Rhapsody","Biografía inspirada en la vida de Freddie Mercury, de inadaptado a vocalista de la icónica Queen, y en el agitado ascenso a la fama de la banda",
"Oscar, Mejor Actor protagónico",3,false,"24 de octubre de 2018","06403",53298,170,179,"2hrs 20 mins","Anthony McCarten");

contenidos[3] = new Pelicula('D',"Fernando Meirelles","Los dos Papas","En medio de una crisis profunda de la Iglesia católica, el papa Benedicto XVI forja una alianza impensada con el futuro papa Francisco. Basada en hechos reales",
"Premio BAFTA Mejor Actor de Reparto Jonathan Pryce",3,false,"31 de agosto de 2019","04904",18021,194,380,"2 hrs","Anthony McCarten");

contenidos[4]= new Pelicula('T',"Jennifer Kent","The Babadook","Seis años después de la violenta muerte de su marido, Amelia sigue intentando educar a su hijo de seis años, Samuel, que vive aterrorizado por un monstruo que se le aparece en sueños y amenaza con asesinarlos. Un inquietante libro de cuentos, \"The Babadook\", aparece en la casa. Samuel está convencido de que el \"Babadook\" es la criatura que aparece en sus sueños",
"Exhibida en festival Sundace 2014",5,false,"17 de enero de 2014","00945",1380,100,10,"1hr 50min","Jennifer Kent");

contenidos[5]= new Serie('T',"Lee Jae Kyu","Estamos Muertos","Una epidemia mortal estalla en una escuela. Acorralados, los alumnos solo tienen una opción: luchar con todas sus fuerzas para evitar convertirse en zombis.",
"No tiene",5,false,"28 de enero de 2022","18223",1749,183,189,1,13,"23 de marzo del 2022");

contenidos[6]= new Serie('A',"He Xiaofeng","Scissor Seven","Con un par de tijeras de peluquería y la capacidad de disfrazarse, Seven ofrece asesinatos por contrato. El problema es que tiene problemas para completar las tareas.",
"No tiene",2,false,"25 de abril del 2018","42035",1278,181,289,3,34,"3 de octubre del 2021");

contenidos[7] = new Pelicula ('U',"Rob Minkoff", "El rey leon", "Tras la muerte de su padre, Simba debera enfrentarse a su tio para recuperar el trono de Rey de la Selva. Timon y Pumba le acompanaran en su mision",
					"Oscar por mejor banda sonora mejor cancion original", 1,false, "24 de junio de 1994", "03134",127,23,34,"1hr 40 mins","Linda Woolverton, Irene Mecchi");

contenidos[8] = new Pelicula('A', "Brad Bird", "El gigante de hierro", "Un malevolo agente gubernamental amenaza con destruir la amistad entre un chico y un robo alienigena gigante en Maine 1957",
					"Nominada a los Premios Hugo por mejor guion", 2, false, "31 de julio de 1999", "14824",163729,18352,1736,"1hr 30 mins","Brad Bird");

contenidos[9] = new Pelicula ('M',"Taika Waititi", "Jojo Rabbit","Durante la Segunda Guerra Mundial, un nino que pertenece a las Juventudes Hitlerianas descubre que su madre esta ocultando en el atico de su casa a una nina judia. La concepcion del mundo que tienen el pequeno y su amigo imaginario, Hitler, cambia por completo con la irrupcion en sus vidas de la joven hebrea",
					"Oscar por mejor guion", 3, false, "18 de octubre de 2019", "34144",19499,1830,1264, "2 horas", "Taika Waititi");

contenidos[10] = new Pelicula('E', "Reinaldo Marcus Green", "Rey Richard: Una familia ganadora", "Richard Williams ayuda a criar a dos de las deportistas mas extraordinarias de todos los tiempos, dos atletas que acabarian cambiando para siempre el deporte del tenis. Sirviendose de metodos poco convencionales, elaboro un plan que convertiria a Venus y Serena Williams en iconos legendarios",
					"Oscar por mejor actor (Will Smith)",4,false, "19 de noviembre de 2021", "01943",138593,2648,999, "2hrs 30 mins", "Zach Baylin");

contenidos[11] = new Pelicula('C',"Denis Villeneuve", "Blade Runner 2049", "Tras la rebelion de los replicantes creados por bioingenieria para ser utilizados como mano de obra esclava y la prohibicion a Tyrell Corporation de seguir con su fabricacion, el empresario Niander Wallace adquirio lo que quedaba de Tyrell Corp. y creo una nueva linea de replicantes mucho mas obedientes. Ahora, en el ano 2049, los viejos modelos Nexus 8 que continuan con vida estan siendo retirados. Los que les persiguen aun reciben el nombre de Blade Runner","Oscar por mejor fotografia", 4, false, "6 de octubre de 2017", "93414",9916,399,728, "2 horas", "Hampton Fancher");

contenidos[12] = new Serie('M',"Mark Baker", "Peppa Pig", "La protagonista Peppa es una cerdita con las que comparte aventuras y ensenanzas, donde tienen como escenario principal su hogar","Cuenta con 6 premios de la Academia Britanica de Ninos",
				   1,false,"31 de mayo de 2004","94403",12345,1235,1111,6, 319,"Activa");

contenidos[13] = new Serie('A', "Jennifer Coyle, Dave Bullock, Victor Cook, Troy Adomitis y Dan Fausett","El espectacular Hombre-arana","Peter Parker es un adolescente de dieciseis anos que sufre la picadura de una arana que le modifica geneticamente, convirtiendole en un superheroe. Peter tiene que encontrar un equilibrio entre sus alter-ego y la vida entre la escuela y los combates contra villanos como Vulture, Mysterio o el Doctor Octopus",
				   "Sin premios",2, false, "8 de marzo de 2008","31410",96859,4819,2144,2,26,"18 de noviembre de 2009");

contenidos[14] = new Serie('D',"Vince Gilligan, Terry McDonough, Michelle MacLaren, Johan Renck","Breaking Bad","Un profesor de química con cáncer terminal se asocia con un exalumno suyo para fabricar y vender metanfetamina a fin de que su familia no pase apuros económicos",
				   "16 premios Emmy",4,false,"20 de enero de 2008","48750",45687,1235,1234,5,62,"29 de septiembre de 2013");

contenidos[15] = new Serie ('M',"Larry David, Art Wolff, Tom Cherones, David Steinberg, Jason Alexander", "Seinfeld","Jerry Seinfeld es un comediante y monologuista con cierto exito, viviendo en Nueva York y realizando presentaciones nocturnas, muchas veces sobre las circunstancias diarias de su vida que, en la mayoria de las ocasiones, rayan en el extremo, el ridiculo y el absurdo",
				    "1 globo de oro y 1 Emmy como Mejor serie",4,false,"5 de julio de 1989","97510",12749,999,369,9,180,"14 de mayo de 1998");

contenidos[16] = new Serie('C',"Charile Brooker","Black Mirror","Relatos distopicos autoconclusivos que muestran generalmente un sentimiento de tecno-paranoia","1 Emmy Internacional",5,false,
				   "4 de diciembre de 2011", "00403",1999,995,359,5,22,"5 de junio de 2019");

contenidos[17] = new Serie('F',"Pendleton Ward","Midgnight Gospel","Narra la historia de Clancy, un presentador espacial con un simulador de multiversos que funciona bastante mal. Clancy deja la comodidad de su hogar extradimensional en la cinta cromatica para entrevistar a curiosos seres que viven en mundos moribundos",
				   "1 premio Annie",4, false,"20 de abril de 2020","01304",1449,195,259,1,8,"20 de abril de 2020");

contenidos[18]= new Pelicula('D',"Vincent Ward", "Más allá de los sueños","Después de sufrir un accidente, unmédico despierta en el cielo rodeado por el paisaje que solía pintar su esposa, a la que intenta rescatar del inframundo","Ganador al Oscar por mejores efectos visuales"
,3,false,"1998","00018",9949,125,159,"1 h 53 min","Richard Matheson");

contenidos[19]= new Pelicula('A',"Guy Ritchie","Sherlock Holmes","Comienza el juego para un excéntrico detective que, con la ayuda de su inseparable compañero, deberá usar cerebro y músculos para rastrear a un perverso archienemigo", "Nominada al Oscar por mejor música escrita y dirección de arte"
,3, false,"2009","00019",78912,1212,1159,"2 h 8 min","Michael Robert Johnson");

contenidos[20]= new Pelicula('T', "Mike Flanagan", "Silencio", "Una escritora se fue al bosque a vivir sola y en paz, hasta que un asesino enmascarado aparece en la ventana", "Nominada a los premios BloodGuts UK Horror por mejor actriz y mejor guión"
,4, false, "2016", "00020",78212,1222,2159,"1 h 21 min", "Mike Flanagan");

contenidos[21]= new Pelicula('C', "Neill Blomkamp", "Elysium", "Es el año 2154. Los humanos con poder se mudan a una fabulosa estación espacial privada, mientras que la vida en la Tierra es cada vez más cruda", "Ganador de los premios Leo en mejores efectos visuales"
,4, false, "2013", "00021",38212,1232,3159,"1 h 49 min" , "Neill Blomkamp");

contenidos[22]= new Pelicula('M', "Andre Adamson, Vicky Jenson", "Shrek", "En una misión para recuperar a una hermosa princesa de las garras de un dragón feroz, un ogro gruñón forma un equipo con un burro ocurrente", "Ganador al Oscar por mejor película animada y nominación por mejor guión "
,2, false, "2001", "00022",31212,1212,3151,"1 h 30 min", "William Steig");

contenidos[23]= new Pelicula('U', "Lin-Manuel Miranda", "tick, tick…BOOM!", "Poco antes de cumplir 30 años, un prometedor compositor teatral lidia con el amor, la amistad y la presión de crear algo genial antes de que sea demasiado tarde", "Nominación al Oscar por mejor actuación de un actor en un papel principal y mejor logro en edicion de peliculas. "
,3, true, "2021", "00023",91212,1912,3159,"2 h 1 min", "Steven Levenson, Jonathan Larson");

contenidos[24]= new Pelicula('R', "Noah Baumbach", "Historia de un matrimonio", "Mientras el pasado derrama sus huellas, una familia abre el corazón para cerrar las cicatrices del divorcio. ", "Ganador al Oscar por mejor actuación de una actriz en un papel secundario"
,4, true, "2019", "00024",97212,7912,3759,"2 h 16 min", "Noah Baumbach");

contenidos[25] = new Serie('F', "Pacal Charrue, Arnaud Delord", "Arcane", "La tensión entre dos ciudades se exacerba cuando unos inventos ponen en peligro la revolución. ", "Premios por mejor producción animada de televisión, logro destacado por el diseño de personajes en una producción animada, entre otros 10 premios. "
,4, true, "2021", "00025",97282,7982,3789,1, 9, "2021");

contenidos[26] = new Serie('N', "Kunihiko Ikuhara", "Sailor Moon S", "Un grupo de estudiantes de instituto descubren que son las encarnaciones de poderosas princesas alienígenas y usan sus superpoderes para proteger la Tierra", "Nominado a mejor interpretación vocal femenina en una serie de televisión de anime dos veces. "
,2, false, "1994","00026",17282,1982,1789,2, 38, "1997");

contenidos[27] = new Serie('E', "Garrett Bradley", "Naomi Osaka", "Criada para el éxito, Naomi logra sus sueños de gloria en el Abierto de EE. U. de 2018. Pero en su camino a lo más alto, también debe aprender a lidiar con los reveses", "Nominación a los premios PGA a programa sobresaliente de deportes"
,2, true, "2021", "00027",12282,1122,1712,1, 3, "2021");

contenidos[28] = new Pelicula('D',"Andrew Adamson","Las cronicas de Narnia: El leon, la bruja y el armario", "Durante la Segunda Guerra Mundial, cuatro hermanos ingleses son enviados a una casa en el campo donde van a estar a salvo de los bombardeos. Un dia, Lucy, la hermana pequena, descubre un armario que la transporta a un mundo magico llamado Narnia. Despues de volver, pronto vuelve a Narnia con sus hermanos, Peter, Edmund y Susan. Alli, los cuatro se uniran al leon magico Aslan y lucharan contra la Bruja Blanca", "1 Oscar y 1 premio BAFTA",2, false,"9 de diciembre de 2005","88844", 100, 40,10,"2 hrs 30 minutos","Kary Fajer, Cristopher Markus, Stephen McFeely" );

contenidos[29] = new Pelicula('A',"Jeff Fowler","Sonic 2, la pelicula","Despues de establecerse en Green Hills, Sonic quiere demostrar que tiene madera de heroe. La prueba de fuego llega con el retorno del malvado Robotnik, y su nuevo compinche, Knuckles, en busca de una esmeralda que destruye civilizaciones. Sonic forma equipo con su propio companero de fatigas, Tails, y juntos se lanzan a una aventura que les llevara por todo el mundo en busca de la preciada piedra para evitar que caiga en manos equivocadas","No tiene premios",3,false,"8 de abril de 2022","77737",100000,760,123,"2 horas","Patrick Casey, Worn Miller y John Whittington");

contenidos[30] = new Pelicula('T',"Henry Selick","Coraline y la puerta secreta","Una nina descubre una puerta secreta en su nueva casa y entra a una realidad alterna que la refleja fielmente de muchas formas","1 nominacion al Oscar y 1 nominacion al globo de oro",1,false,"6 de febrero de 2009","11100",300,90,20,"1hr 40 minutos","Henry Selick");

contenidos[31] = new Pelicula('C',"Mike Rianda","La familia Mitchell vs. las maquinas","El viaje por carretera de la familia Mitchell, que va a acompanar a uno de sus hijos a su primer dia de universidad, se ve interrumpido por una insurreccion tecnologica que amenaza a la humanidad","1 premio BAFTA y 1 nominacion al Oscar",2,true,"30 de abril de 2021","99300",30000,2000,100,"2 horas","Mike Rianda y Jeff Rowe");

contenidos[32] = new Pelicula('M',"Pierre Coffin y Kyle Balda","Minions","Los minions, ingenuos y torpes ayudantes de villano, llevan buscando, desde el principio de los tiempos, un verdadero malhechor al que servir. A lo largo de una evolucion de millones de anos, los minions se han puesto al servicio de los amos mas despreciables. Kevin, acompanado por el rebelde Stuart y el adorable Bob, emprende un emocionante viaje para conseguir una jefa a quien servir, la terrible Scarlet Overkill","1 premio Kids Choice Awards",1,false,"10 de julio de 2015","99940",500,70,90,"1 hora 30 minutos","Brian Lynch");

contenidos[33] = new Pelicula('U',"Garth Jennings","Sing 2: ¡Ven y canta de nuevo!", "Buster Moon y su elenco de animales artistas se preparan para lanzar un deslumbrante espectaculo escenico en la capital mundial del entretenimiento. Solo hay un problema: debe convencer a la estrella de rock mas solitaria del mundo de unirse a ellos","No tiene premios",1,false,"22 de diciembre de 2021","70032",900,300,30,"1 hora 30 minutos","Brian Lynch");

contenidos[34] = new Pelicula('R',"Wes Anderson","Un reino bajo la luna","Cuenta la historia de una chica y un chico de doce anos que se enamoran, hacen un pacto secreto y se escapan a terrenos selvaticos e inexplorados","No tiene premios",2,false,"25 de mayo de 2012","22290",200,20,9,"1 hr 30 minutos","Wes Anderson y Roman Copoola");

contenidos[35] = new Pelicula('F',"Alfonso Cuaron","Harry Potter y el prisionero de Azkaban","El tercer ano de estudios de Harry en Hogwarts se ve amenazado por la fuga de Sirius Black de la prision de Azkaban. Al parecer, se trata de un peligroso mago que fue complice de Lord Voldemort y que intentara vengarse de Harry Potter","1 premio Teen Choice Awards",1,false,"4 de junio de 2004","10039",30000,28000,590,"2 hrs 30 minutos","Steve Kloves");

contenidos[36] = new Pelicula('N',"Hayao Miyazaki","Mi vecino Totoro","Esta historia animada del director Hayao Miyazaki sigue a las estudiantes y hermanas Satsuke y Mei mientras se establecen en su casa de campo con su padre y esperan a que su madre se recupere de una enfermedad en un hospital del area. Cuando las hermanas exploran su nueva casa, descubren y hacen amistad con unos duendes juguetones, y en el bosque cercano encuentran a una enorme criatura conocida como Totoro","2 premios Kinema Junpo Award",1,false,"16 de abril de 1988","99903",3400,900,20,"1 hora 20 minutos","Hayao Miyazaki");

contenidos[37] = new Pelicula('E',"Joe Pytka","Space Jam: El juego del siglo","Bugs Bunny y sus amigos se enfrentan al partido de baloncesto mas importante de sus vidas: el que determinara su libertad y permanencia en el planeta Tierra","No tiene premios",2,false,"15 de noviembre de 1996","88139",30000,200,20,"1 hr 20 minutos","Leo Benvenuti, Steve Rudnick, Timothy Harris y Herschel Weingrod");

cContenidos=38;

contenidos[5].agregarEpisodio(1,1,"Episodio 1","02467","En el laboratorio de Lee Byeong-chan, una estudiante sufre una mordida aparentemente inofensiva. Luego, se propaga una epidemia que deja a la escuela bañada en sangre.","66 min");
contenidos[5].agregarEpisodio(2,1,"Episodio 2","71903","Los infectados se multiplican rápidamente. Nam On-jo y Lee Cheong-san luchan por sobrevivir y encuentran un aula donde pueden estar seguros..., pero no por mucho tiempo.","70 min");
contenidos[6].agregarEpisodio(1,1,"Como hacerse rico","12324","Corto de dinero, Seven reprueba un curso intensivo de asesinato profesional y monta un salón de belleza como tapadera. Primera encomienda: raparle la cabeza a una novia.","16 min");
contenidos[6].agregarEpisodio(2,1,"Dejarte ciego","56388","Miau, la líder de los gatos, contrata a Seven para que elimine a un viejo amor. Pero tras escuchar una historia de amantes desafortunados, Seven intenta reconciliarlos.","14 min");
contenidos[12].agregarEpisodio(1,1,"Charcos de lodo", "04994","La familia salta en charcos de barro; George pierde su juguete favorito; Peppa no quiere que George juegue con ella y con su amiga","18 minutos");
contenidos[12].agregarEpisodio(4,2,"La capsula de tiempo,Que piedras tan grandes, vamos a reciclar, barquito de juguete","17350","La senora Garcela muestra como hacer una cápsula del tiempo, Peppa y George van a la costa, George y Peppa ayudan a limpiar, Peppa juega con su bote de juguete","18 minutos");
contenidos[12].agregarEpisodio(4,3,"Teddy visita  a Peppa, La fiesta de piratas, Un senor llega a la ciudad, paseo en tren","41000","Peppa cuida a Teddy;Peppa juega a los piratas en el cumpleanos de Danny; el Sr Papa abre un nuevo centro de deportes, y Peppa viaja en tren con sus amigos","18 minutos");
contenidos[12].agregarEpisodio(7,4,"La computadora del abuelo, el faro del abuelo conejo","29302","Mama cerdita les regala su computadora vieja a los abuelos; Peppa, George y Danny Dog visitan el faro del abuelo Conejo", "18 minutos");
contenidos[12].agregarEpisodio(3,6,"Animes Nocturnos, Vacaciones, La casa de verano, Vacaciones en el sol","10378", "Papa y George cazan animales nocturnos;Peppa hace la maleta para irse de viaje, la familia llega a Italia; Peppa come pizza, compra regalos y envia una postal","18 minutos");
contenidos[13].agregarEpisodio(1,1,"Survival of the Fittest","10000", "Mientras es perseguido por los Ejecutores, el Hombre Arana debe proteger a Norman Osborn del vengativo villano buitre","23 minutos");
contenidos[13].agregarEpisodio(2,1,"Interactions","10001","Cuando un accidente de laboratio transforma a Max Dillon en el supervillano Electro, el exige que la Dra. Martha Connor encuentre una cura","23 minutos");
contenidos[13].agregarEpisodio(3,1,"Natural Selection","10002","Cuando el intento de Dr. Curt Connors para regenerar un nuevo brazo accidentalmente lo tranforma en el Lagarto, Peter, Martha, Eddie y Gwen buscaran una cura","23 minutos");
contenidos[13].agregarEpisodio(4,1,"Market Forces","10003", "Siguiendo ordenes de Kingpin, Hammerhead contrata a Montana para robar un traje de alta tecnologia y, como Shocker, destruir al Hombre Arana","23 minutos");
contenidos[13].agregarEpisodio(5,1,"Competition","10004","Mientras Norman Osborn y Hammerhead hacen que Otto Octavius convierta a Flint Marko en el Hombre de Arena, el Hombre Arana y el Hombre Antorcha tienen un enfrentamiento de superheroes","23 minutos");
contenidos[13].agregarEpisodio(6,1,"The Invisible Hand","10005","Mientras Otto crea al Rhino para distraer al Hombre Arana, Peter acepta el consejo de la Tia May y le pide a Mary Jane Watson que lo acompane a la fiesta de fin de ano","23 minutos");
contenidos[13].agregarEpisodio(7,1,"Catalysts","10006","Peter y Mary Jane son todo un exito en el Fall Formal. Mientras tanto, el Hombre Arana debe intervenir en el ataaque del Duende Verde a las Industrias Fisk","23 minutos");
contenidos[13].agregarEpisodio(8,1,"Reaction","10007","Cuando el Duende Verde fusiona los brazos roboticos de Otto a su cuerpo, el recientemente creado Doctor Octopus debe encontrar una nueva fuente de energia","23 minutos");
contenidos[13].agregarEpisodio(9,1,"The Uncertainty Principle","10008", "El Hombre Arana se enfrenta al Duende Verde y Tombstone. En otro lugar, el Coronel John Jameson intenta aterrizar un transbordador espacial averiado","23 minutos");
contenidos[13].agregarEpisodio(10,1,"Persona", "10009", "Disfrazado del Hombre Arana, el Camaleon emprende una cadena de crimenes que solo el Hombre Arana y Black Cat pueden detener juntos","23 minutos");
contenidos[14].agregarEpisodio(1, 1, "Principio del fin","10010", "Un profesor de quimica de escuela secundaria recurre a la venta de drogas para mantener a su familia","58 minutos");
contenidos[14].agregarEpisodio(7,1,"Acuerdo no violento","10011","Tras el encuentro de Jesse con la muerte, Walt acepta producir mas drogas para Tuco, mientras Skyler sospecha que su hermana robo un costoso regalo para bebes","47 minutos");
contenidos[14].agregarEpisodio(1,2,"Siete con treinta y Siete","10012","Cuando preparan los planes para su gran negocio final de drogas, a Walt y Jesse les preocupa que a Tuco se le ocurra matarlos cuando quiera","47 minutos");
contenidos[14].agregarEpisodio(13,2,"ABQ","10013","Walt intenta encaminar su vida y la de Jesse mientras se prepara para la cirugia y pretende esconder la procedencia d esu dinero a Skyler y Walt Jr.","47 minutos");
contenidos[14].agregarEpisodio(1,3,"No mas","10014","Tras el desastre aereo de Albuquerque, Skyler obliga a Walt mudarse, mientras la estadia de Jesse en rehabilitacion lo ayuda a aceptar su rol en el fatal choque aereo","47 kminutos");
contenidos[14].agregarEpisodio(13,3,"Medidas Totales","10015","Luego de liquidar a dos traficantes de su jefe, Walt se da cuenta de que Gus planea matarlo y reemplazarlo con su anterior asistentente","47 minutos");
contenidos[14].agregarEpisodio(1,4,"Navaja","10016","Despues de luchar por sus vidas en una turbulenta situacion, Walt y Jesse esperan con ansiedad la proxima jugada de Gus","47 minutos");
contenidos[14].agregarEpisodio(13,4,"Cara a Cara","10017","Cuando su plan de matar a Gus fracasa, Walt y Jesse deben actuar rapido para cubrir sus rastros y evitar la muerte","50 minutos");
contenidos[14].agregarEpisodio(1,5,"Vive libre o muere","10018","Walt visita a su familia, que aun esta en custodia, mientras debe lidiar con las secuelas de la explosion en Casa Tranquila","43 minutos");
contenidos[14].agregarEpisodio(16,5,"Felina","10019","El final de la serie","55 minutos");
contenidos[15].agregarEpisodio(1,1,"Visitante inesperada","10020","Una mujer que Jerry conocio en Michigan viaja a Nueva York y le pregunta si puede quedarse en su caa, pero el no esta seguro de si su intencion es romantica","23 minutos");
contenidos[15].agregarEpisodio(5,1,"Accion en la bolsa","10021","George convence a Jerry de inventir en la bolsa. El fin de semana de Jerry en Vermont con una mujer nok sale como esperaba. Elaine es alergica a los gatos de su novio","22 minutos");
contenidos[15].agregarEpisodio(5,2,"El departamento","10022","Jerry le dice a Elaine que hay un departamento disponible en su edificio y luego se arrepiente. George usa una alianza para atraer a a las mujeres","23 minutos");
contenidos[15].agregarEpisodio(4,3,"El perro","10023","Un pasajero de avion borracho le pide a Jerry que cuide a su perro. A Elaine y George les parece extrano estar solos sin Jerry","22 minutos");
contenidos[15].agregarEpisodio(8,4,"La opera","10024","George y Kramer intentan vender entradas para la opera en la calle. Elaine y Jerry descubren sus conexiones individuales con Joe Davola","23 minutos");
contenidos[15].agregarEpisodio(3,5,"Las gafas","10025","George provoca un caos con un optometrista adicto al azucar, unas gafas de senora y la novia de Jerry. Elaine cree que la mordida de un perro le provoca rabia","22 minutos");
contenidos[15].agregarEpisodio(4,6,"La mujer china","10026","Jerry sale con una mujer con un apellido confuso que le ofrece consejos a Estelle. Kramer decide usar boxers. El abogado de Frank lleva una capa","22 minutos");
contenidos[15].agregarEpisodio(6,7,"El nazi de la sopa","10027","Las estrictas normas de un puesto de sopa provocan un caos para el grupo. Alguien se roba el armario de Elaine","22 minutos");
contenidos[15].agregarEpisodio(17,8,"El paciente ingles","10028","Elaine odia El paciente ingles. Una atractiva mujer confude a George con su novio. Un hombre mayor desafia a Jerry a una competencia fisica","22 minutos");
contenidos[15].agregarEpisodio(22,9,"El final","10029","Arrestan a Jerry, George, Elaine y Kramer por violar la ley del buen samritano, lo que conduce a un juicio con personajes del pasado","55 minutos");
contenidos[16].agregarEpisodio(1,1,"El himno nacional","10030","El primer ministro de Michael Callow se enfrenta a un perverso y aterrador dilema cuando secuestran a la querida princesa Susannah","44 minutos");
contenidos[16].agregarEpisodio(3,1,"Toda tu historia","10031","En un futuro donde todos llevan un implante que registra sin parar lo que vemos y hacemos, los recuerdos se vuelven una pelicula, y cada detalle, una codena","49 minutos");
contenidos[16].agregarEpisodio(2,2,"Oso Blanco","10032","Victoria despierta y no recurda nada sobre su vida. Cuando intenta preguntar lo que ha sucedido, nadie quiere comunicarse con ella","42 minutos");
contenidos[16].agregarEpisodio(4,2,"Blanca Navidad","10033","Dos hombres en una cabana remota. Afuera, solo nieve. Es navidad. Buen Momento para decir la verdad","1hr 14 minutos");
contenidos[16].agregarEpisodio(3,3,"Callate y baila","10034","Un virus toma el control de su laptop, y ahora tiene dos opciones: una, seguir las ordenes que recibe o exponer sus secretos mas intimos", "52 minutos");
contenidos[16].agregarEpisodio(6,3,"El hombre contra el fuego","10035","El enemigo es escurridizo, y la caceria nunca termina. Es el bautismo de fuego para el, pero su equipo experimenta fallas, y su cuerpo, sensaciones extranas","1 hora");
contenidos[16].agregarEpisodio(1,4,"USS Callister","10036","El capitan Robert Daly dirige su tripulacion con sabiduria y coraje, o al menos eso parecia hasta que llego la nueva recluta","1hr 10 minutos");
contenidos[16].agregarEpisodio(5,4,"Hang the DJ","10037","Frank y Amy se conocen a traves de un programa de citas que pone fecha de caducidad a todas las relaciones. Poco despues, comienzan a dudar de la logica del sistema","52 minutos");
contenidos[16].agregarEpisodio(1,5,"String Vipers","10038","Dos amigos en la universidad se reencuentran en la version para realidad virtual de su videojuego favorito y las trasnoches juntos traen consecuencias inesperadas","1hr 2 minutos");
contenidos[16].agregarEpisodio(2,5,"Smitbereens","10039","Un conductor londinense desata un conflicto internacional al secuestra a un empleado de una empresa especializadas en redes sociales","1hr 10 minutos");
contenidos[17].agregarEpisodio(1,1,"Malditos zombis","10040","El simulador lleva a Clancy a una Tierra azotada por zombis. Alli conoce al presidente, aficionado a las drogas y la meditacion. Con el Dr. Drew Pinsky","22 minutos");
contenidos[17].agregarEpisodio(2,1,"Medita como Cristo","10041","En un planeta habitado por bebes payasos, Clancy escucha la opinion que tiene sobre la muerte una perra cierva mientras van a un matadero. Con Anne Lamott y Raghu Markus","20 minutos");
contenidos[17].agregarEpisodio(3,1,"¿Vomitas helado?","10042","Clancy se teletransporta a un planeta subacuatico, en el cual concide con Darryl: un estudiante de magia ceremonial y el camino a la iluminacion. Con Damien Echols","25 minutos");
contenidos[17].agregarEpisodio(4,1,"Ordenar el cuervito","10043","Un incidente hace que Clancy termine en un planeta medieval, en el cual cabalga con una caballera en una mision para vengar la muerte de su amante. Con Trudy Goodman","26 minutos");
contenidos[17].agregarEpisodio(5,1,"Saca esas cucharas","10044","En una prision para seres simulados que sufren de miedo existencial, Clancy reflexiona sobre la realidad mientras mira a un recluso morir una y otra vez. Con Jason Louv","25 minutos");
contenidos[17].agregarEpisodio(6,1,"El trasero de tu mente","10045","Cuanda falla su simulador, Clancy se ve obligado a afrontar algunos problemas del mundo real. Despues, conoce a un maestro de meditacion. Con David Nichtern", "26 minutos");
contenidos[17].agregarEpisodio(7,1,"Muerte, me encanto conocerte","10046","Un viaje aburrido da un vuelco extraordinario cuando, por accidente, Clancy cae en otro mundo... y se encuentra frente a frente con la Muerte. Con Caitlin Doughty","24 minutos");
contenidos[17].agregarEpisodio(8,1,"Desde adentro","10047","Clancy acompana a su madre en un conmovdeor recorrido por el prodigioso ciclo de nacimiento, la vida y la muerte. Con Deneen Fending, la difunta madre de Duncan Trussell","36 minutos");
contenidos[25].agregarEpisodio(1, 1, "Bienvenidos!", "00001" ,"Las hermanas huérfanas Vi y Powder causan problemas en las calles clandestinas de Zaun tras un robo en la lujosa ciudad de Piltover. ", "43 min");
contenidos[25].agregarEpisodio(2, 1, "Algunos misterios están mejor sin resolver", "00002", "El idealista inventor Jayce intenta dominar la magia con la ciencia, a pesar de los consejos de su mentor. El líder criminal Silco experimenta con una peligrosa sustancia.", "43 min");
contenidos[25].agregarEpisodio(3, 1, "La violencia bruta es necesaria para el cambio", "00003", "Un enfrentamiento épico entre viejos rivales trae graves consecuencias para la localidad de Zaun. Jayce y Viktor lo arriesgan todo por su investigación.", "43 min");
contenidos[25].agregarEpisodio(4, 1, "Feliz Dia del Progreso! ","00004", "Ya que Piltover se esta beneficiando de su tecnología, Jayce y Viktor piensan en el siguiente paso. Una cara familiar de Zaun reaparece y provoca un caos. ", "43 min");
contenidos[25].agregarEpisodio(5, 1, "Todo el mundo quiere ser mi enemigo", "00005", "La rebelde vigilante Caitlyn recorre el distrito suburbano para localizar a Silco. Jayce se convierte en un blanco al intentar erradicar la corrupción en Piltover. ", "43 min");
contenidos[25].agregarEpisodio(6, 1, "Cuando caigan estos muros", "00006", "Un protegido menoscaba a su tutor en el Consejo, mientras una tecnologia magica evoluciona rapidamente. Con las autoridades detras de ella, Jinx debe afrontar su pasado.","43 min");
contenidos[25].agregarEpisodio(7, 1, "El salvador" , "00007", "Caitlyn y Vi se reunen en un callejon de Zaun y se dirigen hacia una frenetica pelea con una enemiga en comun. Viktor toma una complicada decision. ", "43 min");
contenidos[25].agregarEpisodio(8, 1, "Agua y aceite", "00008", "La desterrada heredera Mel y su madre, que esta de visita, intercambian tacticas de combate. Caitlyn y Vi forman una inesperada alianza. Jinx tiene un cambio impactante. ","43 min");
contenidos[25].agregarEpisodio(9, 1, "El monstruo que creaste", "00009", "Cuando la guerra acecha peligrosamente, los lideres de Piltover y Zaun reciben un ultimatum. Pero un enfrentamiento fatídico cambia ambas ciudades para siempre. ","43 min");
contenidos[26].agregarEpisodio(1, 1, "Episodio 1", "00001", "Un nuevo y poderoso enemigo intenta sacar talismanes que se encuentran solo en los humanos de corazon puro. Cuando ataca a Rei Hino, Sailor Moon no puede defenderse. "," 23 min");
contenidos[26].agregarEpisodio(2, 1, "Episodio 2", "00002", "Cuando Serena ya no puede transformarse,Darien intenta animarla. El equipo Sailor debe confiar una vez mas en las dos nuevas guerreras misteriosas.","23 min");
contenidos[26].agregarEpisodio(1, 2, "Episodio 20", "00020", "Cuando se da cuenta de que es la unica Sailor Scout a quien ningun demonio ha atacado, Mina siente celos y trata de probar su pureza", "23 min");
contenidos[27].agregarEpisodio(1, 1, "Ascenso" ,"00001", "Criada para el exito, Naomi logra sus suenos de gloria en el Abierto de EE.UU. de 2018. Pero en su camino a lo mas alto, tambien debe aprender a lidiar con los reveses. ","38 min");
contenidos[27].agregarEpisodio(2, 1, "Mentalidad de campeona", "00004", "Mientras explora otros talentos, Naomi sigue luchando por mantener su bienestar mental y motivacion en pleno duelo por la subita muerte de uno de sus mentores. ","38 min");
contenidos[27].agregarEpisodio(3, 1, "Camino propio", "00003", "Despues de la muerte de George Floyd,Naomi se suma por primera vez a una protesta en Minnesota. Eso la lleva a buscar su voz y a usarla. ", "38 min");

//PROVEEDORES
proveedores[0]=new Proveedor("Fox","2182 1492 22 2436503744","337-146-7958","fox@outlook.com");
proveedores[1]=new Proveedor("Universal","9118 8256 91 8225811764","334-269-2490","universal@outlook.com");
cProveedores=2;

proveedores[0].agregarContrato("2 años",450000,true);
proveedores[0].agregarContrato("5 años",230000,true);
proveedores[1].agregarContrato("1 año",100000,false);
proveedores[1].agregarContrato("3 años",123000,true);

//SUSCRIPCIONES
suscripciones[0] = new Suscripcion ("miguel@gmail.com","miguel2003MEX",true,'O',30,'C');
suscripciones[0].agregarPerfil("Ricardo",false,"miguel@gmail.comRicardo");
suscripciones[0].agregarPerfil("Maria",false,"miguel@gmail.comMaria");

suscripciones[1] = new Suscripcion("alejandro33@outlook.com","ALEJAndro33@p",true,'T',30,'A');
suscripciones[1].agregarPerfil("Luis",false,"alejandro33@outlook.comLuis");

suscripciones[2]= new Suscripcion("fercho@gmail.com","21121508",true,'1',10,'A');
suscripciones[2].agregarPerfil("Fer",false,"fercho@gmail.comFer");
suscripciones[2].agregarPerfil("Sofi",true,"fercho@gmail.comSofi");

suscripciones[3]= new Suscripcion("lofyunognu@vusra.com","KS830DN5",true,'3',24,'A');
suscripciones[3].agregarPerfil("Beto",false,"lofyunognu@vusra.comBeto");
cSuscripciones=4;

//REPRODUCCIONES
reproducciones[0]=new Reproduccion("miguel@gmail.comMaria2020/September/22 15:07:01","miguel@gmail.comRicardo","00024",false,"2020/September/22 15:07:01","00000");
reproducciones[1]=new Reproduccion("miguel@gmail.comMaria2020/September/25 16:10:01","miguel@gmail.comMaria","00027",false,"2020/September/25 16:10:01","00001");
reproducciones[2]=new Reproduccion("alejandro33@outlook.comLuis2021/Nombember/02 16:10:01","alejandro33@outlook.comLuis","00022",false,"2021/Nombember/02 16:10:01","00000");
reproducciones[3]=new Reproduccion("lofyunognu@vusra.comBeto2021/October/03 16:10:01","lofyunognu@vusra.comBeto","00018",false,"2021/October/03 16:10:01","00000");
reproducciones[4]=new Reproduccion("fercho@gmail.comFer2022/September/12 18:07:01","fercho@gmail.comFer","31410",false,"2022/September/12 18:07:01","10000");
reproducciones[5]=new Reproduccion("fercho@gmail.comFer2022/December/22 20:07:01","fercho@gmail.comFer","31410",false,"2022/December/22 20:07:01","10001");
reproducciones[6]=new Reproduccion("fercho@gmail.comFer2021/December/22 20:07:01","fercho@gmail.comFer","00024",true,"2021/December/22 20:07:01","00000");
reproducciones[7]=new Reproduccion("fercho@gmail.comSofi2021/December/25 12:07:01","fercho@gmail.comSofi","00027",false,"2021/December/25 12:07:01","00001");
reproducciones[8]=new Reproduccion("fercho@gmail.comSofi2021/May/25 12:07:01","fercho@gmail.comSofi","00027",false,"2021/May/25 12:07:01","00004");
reproducciones[9]=new Reproduccion("fercho@gmail.comSofi2022/May/25 13:07:01","fercho@gmail.comSofi","00022",true,"2022/May/25 13:07:01","00000");
cReproducciones=10;

//ACTORES
elencos[0]= new Elenco ("Ryan Gosling", "Ryan Thomas Gosling es un actor y musico canadiense nacido el 12 de noviembre de 1980 en Londres, Ontario, Canada. Comenzo su carrera como estrella infantil en El Club de Mickey Mouse en Disney Channel","1 globo de Oro y 2 nominaciones al Oscar","12 de noviembre de 1980");
elencos[1] = new Elenco("Harrison Ford","Harrison Ford es un actor estadounidense de cine y television. Debe su notoriedad a su colaboracion con el guionista, productor y director George Lucas, que fue el primero en darle la posibilidad de ser actor","Premio Saturn a mejor actor","13 de julio de 1942");
elencos[2] = new Elenco("Ana de Armas", "Ana Celia de Armas Caso es una actriz cubano-espanola. Comenzo su carrera cuando era adolescente en su pais de origen, Cuba, y tuvo un papel principal en el drama romantico Una rosa de Francia (2006)","1 nominacion al globo de oro","30 de julio de 1988");

elencos[3] = new Elenco("Jeremy Iron","Jeremy John Irons se formo en la escuela teatral de Bristol Old Victoria. Su primer gran papel en teatro fue en el musical Godspell, en la que representaba a San Juan Bautista. Fue contratado a los dieciocho anos en el Old Vic Theater de Bristol, donde destaco al principio como interprete de obras de Shakespeare, Gogol y Harold Pinter","1 oscar y 2 globos de oro","19 de septiembre de 1948");
elencos[4] = new Elenco("James Earl Jones","James Earl Jones nacido en Arkabutla, Mississipi, desde muy temprana edad, comenzo a tomar clases de teatro por recomendacion medica ya que presentaba un leve tartamudeo. Durante los anos 60 y 70 se convierte en una figura imprescindible en Broadway","1 oscar y 1 globo de oro","17 de enero de 1931");
elencos[5] = new Elenco("Matthew Broderick", "Matthew Alan Broderick, nacido en Nueva York, desde niño, y tras estudiar en la Walden School de Nueva York, Matthew se vio inmerso en el mundo de la cultura y la interpretacion, debutando en su adolescencia en Broadway, en donde represento diversas obras escritas por Neil Simon","2 premios Tony", "21 de marzo de 1962");

elencos[6] = new Elenco("Vin Diesel", "Mark Sinclair Vincent, nacido en California, comenzo su carrera cinematográfica como director y guionista, con la influencia de Sidney Lumet. Su primer trabajo fue en 1994 con el cortometraje Multi-Facial, que fue seleccionado para el prestigioso Festival de Cine de Cannes. El cortometraje trata acerca de la mezcla racial y la propia identidad","1 premio Movie Awards","18 de julio de 1967");
elencos[7] = new Elenco("Eli Marienthal", "Nacido en Santa Monica, California, es conocido poraparecer en American Pie y la serie de TV Tucker. Sus otras películas destacadas incluyen a The Iron Giant y Jack Frost","No cuenta con premios", "6 de marzo de 1986");
elencos[8] = new Elenco("Jennifer Aniston", "Jennifer Joanna Aniston nacida en los Angeles California, de descendencia griega es hija del actor John Aniston y la actriz Nancy Dow. Atraida desde nina por el mundo de la interpretacion, tras asistir a la escuela se gradua en el New York's High School of the Performing Arts","1 globo de oro y 1 Emmy","11 de febrero de 1969");

elencos[9] = new Elenco("Taika Waititi", "Taika David Cohen, miembro de una familia maori de la costa este, Taika estudio arte dramatico en la Victoria University of Wellington, donde entraria a una compania teatral conocida como So You´re a Man, con la cual recorrio todo el pais, con enorme exito a mediados de la decada de los años 90","1 oscar, 1 premio Bafta y 1 grammy","16 de agosto de 1975");
elencos[10] = new Elenco("Scarlett Johansson", "Scarlett Ingrid Johansson, nacida en Nueva York, es una actriz, cantante, directora, productora y empresaria estadounidense. Comenzo a mostrar intereses en la actuacion desde temprana edad, y a lo largo de su infancia y adolescencia se formo en distintos institutos como actriz", "1 premio Bafta y 1 premio Tony", "22 de noviembre de 1984");
elencos[11] = new Elenco("Roman Griffin Davis", "Roman Griffin Davis nacido en Londres, Inglatera, comenzo a audicionar a sus nueve anos e hizo su debut como actor a los once anos en Jojo Rabbit","1 globo de oro", "5 de marzo de 2007");

elencos[12] = new Elenco("Will Smith", "Will Carrlo Smith II, nacido en Filadelfia, Pensilvania, es un actor, cómico, rapero, productor cinematográfico y productor discográfico estadounidense", "1 oscar, 4 Grammys y 1 globo de Oro", "25 de septiembre de 1968");
elencos[13] = new Elenco("Jon Bernthal", "Jonathan Edward Bernthal, nacido en Washington D. C. Es hijo de Joan Marx y Eric Bernthal, un abogado. Su abuelo fue el musico Murray Bernthal. Realizo estudios de actuacion en Estados Unidos y posteriormente en Rusia","No cuenta con premios", "20 de septiembre de 1976");
elencos[14] = new Elenco ("Saniyya Sidney", "Saniyya Sidney nacida en Los Angeles, California, es una actriz estadounidense de cine y television. Hizo su debut en la miniserie Roots del canal History en 2016, y es conocida por sus trabajos en las peliculas nominadas al Oscar Hidden Figures (2016) y Fences (2016)","No cuenta con premios","30 de octubre de 2006");
elencos[15] = new Elenco("Demi Singleton","Demi Singleton nacida en Nueva Orleans, Luisiana, de origen hondureno y dominicano, empezo a aprender danza y teatro desde los 4 años, destacando entre su clase por su talento y carisma natural","No cuenta con premios", "1 de enero de 2007");

elencos[16] = new Elenco("Morwenna Banks","Tamsin Morwenna Banks nacida en Inglaterra, es una actriz de comedia britanica, escritora y productora, conocida por su papel de Mama Cerdita, Senora Gacela, Mama Gatuna y la Dra. Hamster en la serie Peppa Pig","No tiene premios","20 de septiembre de 1961");
elencos[17] = new Elenco("Richard Rindings","Richard Rindings nacido en Inglaterra es un actor britanico y es mejor conocido por su papel de Allan Ashburn en el drama de television ITV Fat Friends, y por interpretar a Bernard Green en la BBC1. Se formo como actor en la Escuela de Teatro Bristol Old Vic. En Peppa Pig, el le da voz a Papa Cerdito durante todas las temporadas","No tiene premios","19 de septiembre de 1958");
elencos[18] = new Elenco("Harley Bird","Harley Bird nacio en Rochdale en Inglaterra, es una actriz y artista de voz inglesa.  A la edad de seis anos firmo con Alphabet Kidz Talent, un mes mas tarde obtuvo el papel de Peppa en la serie de dibujos animados Peppa Pig. Bird reemplazo a las anteriores actrices Lily-Snowden Fine y Cecily Bloom que ponian la voz a Peppa. Bird puso la voz en las temporadas 3 y 4","No tiene premios","13 de diciembre de 2001");

elencos[19] = new Elenco("Josh Keaton","Joshua Luis Wiener, nacido en Hacienda Heights, California, su carrera ha incluido la television, videojuegos y el trabajo cinematografico, con un poco de actuacion en vivo y dar voz a personajes","No tiene premios","8 de febrero de 1979");
elencos[20] = new Elenco("Joshua LeBar","Joshua Matthew LeBar, nacido en Cincinnati, Ohio. Se graduo en la Universidad Butler con un B.A. en Teatro Performance y un B.A. en Telecomunicaciones. LeBar actuo en King Lear, On The Verge, Fool For Love, and Hair mientras asistia a Butler. También paso su primer ano en Butler estudiando en Londres, Inglaterra. Mas tarde, escribio y dirigio su tesis senior llamada Tasting Reality mientras que en Butler. Despues de graduarse, Josh LeBar actuo en el Indiana Repertory Theater en una produccion de Othello","No tiene premios","27 de septiembre de 1977");
elencos[21] = new Elenco("James Arnold Taylor", "James Arnold Taylor, nacido en Santa Barbara, California. Produjo voces como la de Obi-Wan Kenobi en la serie Star Wars: La guerra de los clones y Star Wars: Rebels; Ademas de ser la voz de Ratchet en la saga de videojuegos de Ratchet & Clank, y tambien personajes como Johnny Test y Wooldoor Sockbat (Mueble O' Algo) entre otros","No tiene premios","22 de julio de 1969");

elencos[22] = new Elenco("Bryan Cranston","Bryan Lee Cranston nacio en Los Angeles, es un actor, actor de voz, guionista, productor y director estadounidense, reconocido por su interpretacion de Walter White (en la serie de AMC Breaking Bad), de Hal Wilkerson (el padre de familia de la serie de FOX Malcolm in the middle","6 Emmys, 1 globo de oro y 2 premios Tony","7 de marzo de 1956");
elencos[23] = new Elenco("Aaron Paul", "Aaron Paul Sturtevant nacido en Idaho, es un actor y productor estadounidense conocido por interpretar al personaje de Jesse Pinkman en la serie de AMC Breaking Bad, tambien tuvo un papel recurrente como Scott en la serie de HBO Big Love, ademas de haber protagonizado la pelicula Need for Speed","4 Emmys","27 de agosto de 1979");
elencos[24] = new Elenco("Bob Odenkirk","Rober John Odenkirk, nacido en Berwyn, Illinois, es un actor, comediante, guionista, director y productor estadounidense. Es conocido por haber sido uno de los creadores y el coprotagonista de la comedia Mr.","1 premio SAG","22 de octubre de 1962");

elencos[25] = new Elenco("Jerry Seinfeld","Jerom Allen Seinfeld nacido en Brooklyn, Nueva York. Con 16 anos, paso un tiempo de voluntariado en el Kibbutz Saar en Israel. Despues asistio a la Universidad Estatal de Nueva York en Oswego; en su segundo ano se traslado al Queens College, City University de Nueva York, donde se graduo con una licenciatura en comunicaciones y teatro","1 globo de oro y 1 Emmy","29 de abril de 1954");
elencos[26] = new Elenco("Julia Louis-Dreyfus","Julia Scarlett Elizabeth Lous-Dreyfus, nacida en Nueva York, Estudio interpretacion durante varios anos antes de ingresar en el grupo de improvisacion The Second City, preludio de su fichaje, en 1982, por el legendario Saturday Night Life, en el que permanecio tres fructiferos anos. Casi un lustro despues debuta en la pantalla grande de la mano de Woody Allen en Hannah y sus hermanas. Con todo, sera en la television donde logre sus mayores exitos","11 Emmys, 1 globo de oro y 9 premios SAG", "13 de enero de 1961");
elencos[27] = new Elenco("Jason Alexander", "Jay Scott Greenspan, nacido en Newark, New Jersey. Tomo lecciones de canto y baile fuera del colegio –considero a su Bar Mitzvah como su primer actuacion paga-. A la edad de 17 anos obtuvo su primer trabajo profesional cuando fue contratado en un grupo teatral para chicos y se le pidio que actuara en un programa local para chicos en Nueva York. Dos anos despues, cuando estaba estudiando actuacion en la Universidad de Boston, tuvo su primera participacion en una pelicula, se trababa de The Burning, un film de terror en el que tambien actuan Holly Hunter y Fisher Stevens", "1 premio Tony","23 de septiembre de 1959");

elencos[28] = new Elenco("Bryce Dallas Howard", "Bryce Dallas Howard, nacida en Connectitcut. Es hija de la actriz y escritora Cheryl Howard y del actor y director Ron Howard. Antes de estudiar Interpretacion en ueva York acudiendo a la Tisch School of the Arts. Mas tarde amplio instruccion en el Stella Adler Conservatory","1 premio SAG","2 de marzo de 1981");
elencos[29] = new Elenco("Alex Lawther","Alexander Lawther nacido en Petersfield, Hampshire. Despues de unirse a varios grupos dramaticos diferentes, incluido The National Youth Theatre, el joven Lawther finalmente encontro su gran oportunidad con una obra llamada South Downs a la edad de 16 anos","No tiene premios","4 de mayo de 1995");
elencos[30] = new Elenco("Hayley Atwell", "Hayley Elizabeth Atwell, nacida en Londres, Inglaterra,  es una actriz britanica,​ conocida por su trabajo en producciones teatrales como Panorama desde el puente, en peliculas como El sueno de Casandra o La duquesa","No tiene premios","5 de abril de 1982");

elencos[31] = new Elenco("Duncan Trusell","Charles Duncan Trusell, nacido en Asheville, es un actor, comediante, productor y guionista estadounidense,​​ reconocido principalmente por su participacion en las series animadas Hora de aventura y The Midnight Gospel","No tiene premios","20 de abril de 1974");

elencos[32] = new Elenco("Robin Williams","Nació en Illinois, EE.UU., siendo hijo de una ex-modelo y un executivo de Ford Motor Company. Fue un éxito en la década de los 90’s por sus personajes cómicos en películas para la familia, tales como Aladdín y Papá por siempre. El 11 de agosto de 2014, fue encontrado muerto en su apartamento, con causa de suicidio. ", "Ganador al Oscar por mejor actor en papel secundario, y nominado 3 veces al Oscar por mejor actor en papel principal", "21/07/51");
elencos[33] = new Elenco("Cuba Gooding Jr." , "Nació en Nueva York, EE.UU., siendo hijo de una corista y del cantante principal de distintos grupos. Empezó su carrera con papeles secundarios en El precio del deber y MacGyver, aunque tomó protagonismo en otras producciones tiempo después en Los dueños de la calle, Cuestión de honor y Lightning Jack. ", "Ganador del Oscar por mejor actor en papel secundario", "02/01/68");
elencos[34] = new Elenco("Robert Downey Jr.", "Nació en Nueva York, EE.UU., siendo hijo de un escritor, director y filmógrafo, y de una actriz. Empezó su carrera en la actuación a los 5 años de edad, y la continuó en las décadas de los 80’s y 90’s. En 1996, tuvo serios problemas de alcohol y drogas, las cuales le causaron arrestos, internaciones y pérdida de trabajo, sin embargo, después de su recuperación en 2003, ha mantenido su vida sobria y limpia, consiguiendo así una carrera llena de prestigio hasta la actualidad. ", "Nominado al Oscar por mejor actor en un papel secundario, y mejor actor en papel principal", "04/04/65");
elencos[35] = new Elenco("Jude Law", "Nació en Londres, U.K., siendo ambos profesores de escuela.Empezó su carrera artística en 1992 en obras de teatro por todo Londres, e incluso fue nominado al premio de novato sobresaliente. Su carrera en la pantalla grande empezó en el ‘97, en Gattaca: Experimento genético. Desde entonces, ha estado en teatro y películas, y ha formado parte de varias actividades de caridad. ", "Nominado al Oscar por mejor actor en un papel secundario, y mejor actor en papel principal", "29/12/72");
elencos[36] = new Elenco("John Gallagher Jr.", "Nació en Delaware, EE. UU. Ha aparecido en varios programas de televisión, como La ley y el orden: Unidad de Víctimas Especiales, NYPD Blue, y Love Monkey, y películas como Momentos de perdón y The Heart Machine. ", "Nominado en los premios CinEuphoria a mejor actor en papel secundario", "17/06/84");
elencos[37] = new Elenco("Kate Siegel", "Nació en Maryland, EE. UU. Está casada con Mike Flanagan, con quien colabora en sus filmes de terror, como Oculus (2013) y Hush (2016). Empezó su carrera en 2007 con filmes de terror, siendo estos The Curse of The Black Dahila (2007), y Hacia La Oscuridad (2007).", "Nominada a los premios BloodGuts UK Horror Awards a mejor actriz","09/08/82");
elencos[38] = new Elenco("Matt Damon", "Nació en Massachusetts, EE.UU., siendo hijo de un preparador de impuestos, y una profesora de la universidad Lesley. Estudió en Cambridge Rindge y estuvo en varias obras durante sus estudios. Luego entraría a Harvard, pero faltaría a sus clases en busca de su sueño de la actuación, apareciendo así en películas como Rising Son (1990) y School Ties (1992). No fue hasta 1993 que decidió dejar la universidad oficialmente para dedicarse a la actuación. ", "Ganador al Oscar por mejor película del año", "08/10/70");
elencos[39] = new Elenco("Jodie Foster", "Empezó su carrera a los dos años de edad siendo actriz en comerciales durante 4 años, hasta que obtuvo un papel en la serie de televisión Mayberry R.F.D. (1968). En 1976, actuó de una prostituta en la película Taxi Driver, lo cual le consiguió una nominación al Oscar, dándole un gran empujón en su carrera.", "Dos veces ganadora al Oscar por mejor actriz en un papel principal", "19/11/62");
elencos[40] = new Elenco("Mike Myers", "Nació en Ontario, Canadá, siendo hijo de una supervisora oficial, y de un agente de seguros. Su carrera en la televisión comenzó en 1988, al unirse al programa Saturday Night Live (1975), donde por 6 temporadas, interpretó a varios personajes icónicos. ", "Ganador de un premio Emmy por escritura sobresaliente en un programa musical o de variedades", "25/05/63");
elencos[41] = new Elenco("Eddie Murphy", "Nació en Nueva York, EE. UU., siendo hijo de una operadora de teléfono, y un oficial de tránsito, que también era comediante y actor. Eddie tenía aspiraciones de entrar al mundo del show desde pequeño. Hacía impresiones y stand-up la mayoría de su tiempo, dejando de lado la escuela. Fue juntando fama hasta que fue invitado al Saturday Night Live (1975) en los 80’s, de donde Murphy fue agarrando más fama.", "Nominado al Oscar por mejor actor en papel secundario", "03/04/61");
elencos[42] = new Elenco("Andrew Garfield", "Nació en California, EE. UU., siendo hijo de una británica y un estadounidense. A los 3 años, se mudó a Surrey, U.K., donde empezó su gusto por la actuación al estar en producciones infantiles teatrales en su escuela. Tomó papeles más profesionales en 2005 en series como Sugar Rush y Doctor Who. ", "Nominado dos veces al Oscar por mejor actor en papel principal", "20/08/83");
elencos[43] = new Elenco("Alexandra Shipp", "Nació en Arizona, EE.UU. Es mayormente conocida por ser Storm en X-Men: Apocalipsis (2016) y en X-Men: Dark Phoenix (2019). ", "Ganadora del premio del Brookyn Horror Film Festival a mejor actriz", "16/07/91");
elencos[44] = new Elenco("Adam Driver", "Nació en California, EE. UU. Estudió drama en la escuela Juilliard en Nueva York, donde se graduó en 2009. Actuó en Broadway hasta que entró a la serie Girls (2012), donde obtuvo algo de atención, y así comenzó su carrera en el cine. Su mayor hito fue en la película Star Wars: El despertar de la fuerza (2015). ", "Nominado al Oscar por mejor actor en papel secundario, y mejor actor en papel protagonista", "19/11/83");
elencos[45] = new Elenco("Scarlett Johansson", "Nació en Nueva York, EE. UU. Empezó su carrera a los 8 años cuando su mamá la llevaba a audiciones. A los 9 años, obtuvo su primer papel en una película, siendo la hija del personaje de John Ritter. Seguido de varios papeles diversos, obtuvo nominaciones a mejor actriz en distintos premios. Obtuvo mayor fama en 2010, al interpretar a Black Widow en Iron Man 2 (2010), personaje que interpretaría varias veces a lo largo de la década. ", "Nominada al Oscar por mejor actriz en papel secundario, y mejor actriz en papel principal", "22/11/84");
elencos[46] = new Elenco("Stephanie Sheh", "Nació en Michigan, EE. UU. Es actriz y directora, mayormente conocida por Your Name (2016), Bleach (2004) y Naruto: Shippuden (2007)", "Nominada a los premios Annie por logro sobresaliente por guión en una producción de largometraje animado", "10/04/77");
elencos[47] = new Elenco("Kotono Mitsuishi", "Nació en Tokyo, Japón. Es una actriz conocida por The End of Evangelion (1997), Neon Genesis Evangelion (1995) y EVANGELION: 3.0 + 1.01 TRIPLE (2021). ", "", "08/12/67");
elencos[48] = new Elenco("Hailee Steinfeld", "Nació en California, EE. UU., siendo hija de una diseñadora de interiores y un entrenador personal. Desde joven, ha aparecido en varios filmes cortos para ganar experiencia, tales como Temple de acero y 3 días para matar. Ha mostrado gran interés por estar del otro lado de la cámara como productora o directora", "Nominada al Oscar a mejor actriz en papel secundario", "11/12/96");
elencos[49] = new Elenco("Ella Purnell", "Nació en Londrés, U.K. Es mayormente conocida por sus papeles en Miss Peregrine’s Home For Peculiar Children (2016), y BBC One’s Ordeal By Innocence(2017). ", "Ganadora de los premios Annie por mejor actuación de voz en una producción animada de televisión", "17/09/96");
elencos[50] = new Elenco("Benedict Cumberbatch","Benedict Timothy Carlton Cumberbatch, nacido en Londres, es un actor britanico de television, teatro, cine y voz.​ Accedio a la fama con su interpretacion de Stephen Hawking en la pelicula televisiva Hawking (2004)","1 Emmy","19 de julio de 1976");
elencos[51] = new Elenco("Mads Mikkelsen","Mads Mikkelsen nacido en Dinamarca, es un actor danes. En su infancia se formo como gimnasta y despues estudio baile en la Balettakademien de Gotemburgo (Suecia). Fue bailarin profesional durante ocho anos, hasta que lo dejo para estudiar teatro en la Aarhus Theatre School en su pais natal. Ademas de danes, habla sueco, aleman, ingles, ruso y frances","1 premio SAG","22 de noviembre de 1965");
elencos[52] = new Elenco("Robert Pattinson","Robert Douglas Thomas Pattinson, es un actor inglés, nacido en Londres. Comenzo a actuar a los 15 anos en un club de teatro y obtuvo su primer papel en la franquicia de Harry Potter como Cedric Diggory. Gano aun mas fama por interpretar a Edward Cullen en la Saga de Crepusculo","10 Teen Choice Awards","13 de mayo de 1986");
elencos[53]= new Elenco("Willem Dafoe","William James Dafoe, nacido en Wisconsin,  comenzo sus estudios de Artes Dramaticas en la Universidad de Wisconsin-Milwaukee, pero los dejo tiempo antes de recibir su titulo, para intervenir en diversos grupos teatrales y dedicarse a viajar por los Estados Unidos y Europa, interpretando a varios personajes en varias obras. Se unio con Elizabeth LeCompte, una colega directora teatral, en 1977 y juntos tendrian a su hijo Jack en el ano 1982","1 oscar","22 de julio de 1955");
elencos[54] = new Elenco("Rami Malek","Rami Said Malek, nacido en Los Angeles, California. Estudio la Licenciatura en Bellas Artes, en la Universidad de Evansville en Indiana. Comenzo su carrera como actor, en 2004, como estrella invitada en la serie de television Gilmore Girls y haciendo voces para el videojuego Halo 2","1 oscar, 1 Emmy, 1 premio BAFTA y 1 globo de oro","12 de mayo de 1981");
elencos[55] = new Elenco("Ben Hardy","Ben Jones, nacido en el Reino Unido, es un actor britanico, que interpreto a Peter Beale en la serie EastEnders desde 2013 hasta 2015. En 2018, interpreto al baterista Roger Taylor en la pelicula sobre Queen, Bohemian Rhapsody","No tiene premios","2 de enero de 1991");
elencos[56] = new Elenco("Jonathan Pryce","Jonatha Pryce nacido en Inglaterra. Despues de graduarse se unio a la Compania de Teatro Liverpool Everyman, continuando con una temporada interpretando en el Nottingham Playhouse bajo la direccion de Richard Eye, regresando mas tarde como director artistico al Everyman. En 1975, Pryce interpreto Comedians, dirigido por Sir Eyre, y luego se fue a trabajar a Nueva York","1 premio Tony","1 de junio de 1947");
elencos[57] = new Elenco("Anthony Hopkins","Sir Philip Anthony Hopkins, nacido en el Reino Unido. Tras pasar una infancia bastante aislada del resto de sus companeros de colegio (el mismo se definia como antisocial) Anthony encontro en su adolescencia el rumbo definitivo a su vida: la interpretacion. Para desarrollar profesionalmente esta vocacion estudio en el College Of Music and Drama de Cardiff (Gales) y en la Royal Academic of Dramatic Arts de Londres. Tras concluir sus estudios, Hopkins brillo con sus actuaciones teatrales con el National Theatre en el Old Vic, en especial representando obras de William Shakespeare como Julio Cesar","1 Oscar, 1 globo de oro y 1 premio BAFTA","31 de diciembre de 1937");
elencos[58] = new Elenco("Essie Davis","Essie Davis, nacida en Australia, mejor reconocida por sus papeles de Phryne Fisher en Miss Fisher's Misterios de asesinato y Amelia Vanek en El babadook. Tambien ha participado en numerosas series de television australianas y estadounidenses y continua ascendiendo como uno de los pocos actores australianos que brilla intensamente y prospera en Hollywood","No tiene premios ","7 de enero de 1970");
elencos[59] = new Elenco("Noah Wiseman","Noah Wiseman, nacido en Australia, es un nino actor que se hizo conocido por su escalofriante interpretacion de Samuel en la pelicula de terror australiana The Babadook, aparecio en un corto llamado The Gift","No tiene premios" ,"12 de noviembre de 2008");
//
elencos[60] = new Elenco("William Moseley","William Peter Moseley, nacido en Inglaterra, fue a la escuela primaria en Sheepscombe entre septiembre de 1991 y julio de 1998, y continuo su educacion en la Universidad de Wycliffe, e hizo su ano final en el Downfield 6th Form College en la ciudad de Stroud","1 premio Nickeloden Kids Choice Awards y un Premio Cannie","27 de abril de 1987");

elencos[61] = new Elenco("Anna Popplewell","Anna Katherine Popplewell, nacida en Londres, licenciada en Literatura Inglesa e Ingles de la Universidad de Oxford; es una actriz britanica de cine, televisión y teatro. Es popular por su papel de Susan Pevensie en la serie de Las Cronicas de Narnia desde 2005, de Chyler Silva en Halo 4: Forward Unto Dawn desde 2012 y por su interpretacion de Lady Lola en Reign desde 2013","1 premio Teen Choice","16 de diciembre de 1988");

elencos[62] = new Elenco("Jim Carrey","James Eugene Carrey, nacido en Ontario de nacionalidad canandiense-estadounidense. Empezo a trabajar a fines de la decada de 1970 como comediante en vivo, en el club Yuk Yuk's de Toronto. Despues de obtener cierto prestigio, en 1981 comenzo a trabajar en the Comedy Store de Los Angeles, donde fue visto por el humorista Rodney Dangerfield, quien inmediatamente firmo con el la apertura de sus giras de actuaciones. Interesado en el cine y la television, desarrollo una amistad con Damon Wayans, que le consiguio un papel en el programa de humor In Living Color, en el que interpreto a varios personajes durante los anos noventa","2 globos de oro","17 de enero de 1962");

elencos[63] = new Elenco("James Marsden","James Paul Marsden, nacido en Oklahoma Es reconocido por sus actuaciones en la trilogia X-Men con el rol de Cyclops (Cíclope), por su actuacion en la serie de television Westworld y por sus actuaciones en las peliculas reconocidas Disturbing Behavior, Superman Returns, Hairspray, Enchanted y 27 Dresses. Fue del grupo de modelos de Versace. Anteriormente era conocido como Jimmy Marsden cuando actuaba en la pelicula de Perturbados junto a Katie Holmes","1 premio SAG","18 de septiembre de 1973");

elencos[64] =  new Elenco("Dakota Fanning","Hannah Dakota Fanning, actriz y modelo estadounidense conocida por sus trabajos como actriz infantil en cine y television. Fanning se situa en el puesto numero diez en la lista de VH1 de las 100 mejores estrellas infantiles de todos los tiempos","No tiene premios","23 de febrero de 1994");

elencos[65] = new Elenco("Abbi Jacobson","Abbi Jacobson,es una humorista, escritora, actriz e ilustradora estadounidense. Es conocida por co-crear y co-protagonizar en Comedy Central la serie Broad City con Ilana Glazer, basada en la serie web del mismo nombre","No tiene premios","1 de febrero de 1984");

elencos[66] = new Elenco("Eric Andre","Eric Andre, es un actor, comico y presentador de television estadounidense. Presenta en Adult Swim la serie The Eric Andre Show e interpreta a Mike en la serie de FXX Man Seeking Woman","No tiene premios","4 de abril de 1983");

elencos[67] = new Elenco("Sandra Bullock","Sandra Annette Bullock,es una actriz, directora y productora estadounidense de cine y television. Es conocida por su participacion en peliculas como Speed, Miss Congeniality, The Proposal, Gravity, Oceans 8 y The Blind Side. Segun la publicacion Forbes fue la actriz mejor pagada en 2010 y 2013 con unas ganancias calculadas en 56 millones de dolares y 38 millones de Euros respectivamente","1 Oscar, 1 globo de oro y 1 premio SAG","26 de julio de 1964");

elencos[68] = new Elenco("Jon Hamm","Jonathan Daniel Hamm, es un actor estadounidense especialmente popular por su papel del publicista Don Draper en la serie Mad Men. En 2000 fue escogido para interpretar a un bombero en la serie Providence (NBC) y debuto en el cine con una pelicula dirigida por Clint Eastwood: Cowboys del espacio. Tan solo tenia una frase","2 globos de oro y 1 emmy","10 de marzo de 1971");

elencos[69] = new Elenco("Matthew McConaughey","Matthew David McConaughey, nacido en Texas,  es un actor y productor de cine y television estadounidense. De los papeles televisivos que ha desempenado, es especialmente reconocido y aclamado por su interpretacion de Rustin Rust Cohle en la primera temporada de True Detective. Ademas, en octubre de 2020 publico su libro titulado Greenlights","1 Oscar, 1 globo de oro y 1 premio SAG","4 de noviembre de 1969");

elencos[70] = new Elenco("Edward Norton","Edward Harris Norton,​ es un actor, guionista, director y productor de cine estadounidense. Licenciado en Historia por la Universidad de Yale, Edward Norton se interesa por el Arte Dramatico desde muy temprana edad. Despues de graduarse trabajo en Japon, y a su vuelta era bilingue. Ya en Nueva York se sube al escenario con el elenco de Signature Players, grupo teatral conocido por interpretar obras del dramaturgo Edward Albee","1 globo de oro y 1 premio SAG","18 de agosto de 1969");

elencos[71] = new Elenco("Bill Murray","William James Murray, es un actor y humorista estadounidense. Obtuvo reconocimiento en el programa de humor Saturday Night Live, actuacion que le valio obtener un premio Emmy, y mas tarde protagonizo peliculas comicas como Caddyshack (1980), Los Cazafantasmas (1984) y Groundhog Day (1993)","1 globo de oro, 1 premio BAFTA y 1 premio Emmy","21 de septiembre de 1950");

elencos[72] = new Elenco("Daniel Radcliffe","Daniel Jacob Radcliffe, es un actor britanico, principalmente conocido por haber protagonizado la saga cinematografica de Harry Potter. Sus comienzos profesionales se remontan a 1998, cuando actuo en el telefilme David Copperfield adaptacion de la novela homonima de Charles Dickens. Posteriormente, debuto con El sastre de Panama (2001) y aparecio en otras peliculas como en la independiente December Boys y la televisiva My Boy Jack. En 2007 protagonizo la obra de teatro Equus, del dramaturgo Peter Shaffer, en la que interpretaba al perturbado Alan Strang. Recibio criticas elogiosas, tanto en Inglaterra como en los Estados Unidos, ademas de varios premios y distinciones","1 premio Teen Choice Awards","23 de julio de 1989");

elencos[73] = new Elenco("Emma Watson","Emma Charlotte Duerte Watson, es una actriz, modelo y activista britanica nacida en Francia. Watson fue elegida para interpretar a Hermione a la edad de nueve anos, despues de haber participado anteriormente solo en obras de teatro escolares.​ Protagonizo, junto con Daniel Radcliffe y Rupert Grint, las ocho peliculas de la serie cinematografica. Debido a su trabajo en Harry Potter, ha sido galardonada con varios premios y se estima que ha ganado 26 millones de libras esterlinas","3 premios Teen Choice Awards","15 de abril de 1990");

elencos[74] = new Elenco("Noriko Hidaka","Noriko Hidaka es una actriz de voz en japones. Hidaka es conocida por interpretar las voces de Minami Asakura (Touch), Akane Tendo (Ranma 1/2), Satsuki Kusakabe (Mi vecino Totoro), Near (Death Note), Seta Sojiro (Rurouni Kenshin), Kikyo (InuYasha), y Noriko Takaya (Gunbuster)","No tiene premios","31 de mayo de 1962");

elencos[75] = new Elenco("Michael Jordan","Michael Jeffrey Jordan, es un exjugador de baloncesto estadounidense. Con 1,98 metros de altura, jugaba en la posicion de escolta. Es considerado por la mayoria de aficionados y especialistas como el mejor jugador de baloncesto de todos los tiempos","No tiene premios","17 de febrero de 1963");
cElenco=76;

//PARICIPACIONES
participaciones[0] = new Participacion("93414","Ryan Gosling", "Oficial K");
participaciones[1] = new Participacion("93414","Harrison Ford","Rick Deckard");
participaciones[2] = new Participacion("93414","Ana de Armas","Joi");
participaciones[3] = new Participacion("03134","Jeremy Iron","Scar");
participaciones[4] = new Participacion("03134","James Earl Jones","Mufasa");
participaciones[5] = new Participacion("03134","Matthew Broderick","Simba");
participaciones[6] = new Participacion("14824", "Vin Diesel","Gigante de Hierro");
participaciones[7] = new Participacion("14824","Eli Marienthal","Hogarth Hughes");
participaciones[8] = new Participacion("14824","Jennifer Aniston","Annie Hughes");
participaciones[9] = new Participacion("34144","Taika Waititi","Adolf Hitler");
participaciones[10] = new Participacion("34144","Scarlett Johansson","Rosie Betzler");
participaciones[11] = new Participacion("34144","Roman Griffin Davis","Jojo");
participaciones[12] = new Participacion("01943","Will Smith","Richard Williams");
participaciones[13] = new Participacion("01943","Jon Bernthal","Rick Macci");
participaciones[14] = new Participacion("01943","Saniyya Sidney","Venus Williams");
participaciones[15] = new Participacion("01943","Demi Singleton","Serena Williams");
participaciones[16] = new Participacion("94403","Morwenna Banks","Mama cerdita");
participaciones[17] = new Participacion("94403","Richard Rindings","Papa cerdito");
participaciones[18] = new Participacion("94403","Harley Bird","Peppa la cerdita");
participaciones[19] = new Participacion("31410","Josh Keaton","Hombre arana");
participaciones[20] = new Participacion("31410","Joshua Lebar","Flash Thompson");
participaciones[21] = new Participacion("31410","James Arnold Taylor","Harry Osborn");
participaciones[22] = new Participacion("48750","Bryan Cranston","Walter White");
participaciones[23] = new Participacion("48750","Aaron Paul","Jesse Pinkman");
participaciones[24] = new Participacion("48750","Bob Odenkirk","Saul Goodman");
participaciones[25] = new Participacion("97510","Jerry Seinfeld","Jerry Seinfeld");
participaciones[26] = new Participacion("97510","Julia Louis-Dreyfus","Elaine Benes");
participaciones[27] = new Participacion("97510","Jason Alexander","George Costanza");
participaciones[28] = new Participacion("00403","Bryce Dallas Howard","Lacie");
participaciones[29] = new Participacion("00403","Hayley Atwell","Martha");
participaciones[30] = new Participacion("00403","Alex Lawther","Kenny");
participaciones[31] = new Participacion("10040","Duncan Trussell","Clancy");
participaciones[32] = new Participacion("00018", "Robin Williams", "Chris Nielsen");
participaciones[33] = new Participacion("00018", "Cuba Gooding Jr.", "Albert");
participaciones[34] = new Participacion("00019", "Robert Downey Jr.", "Sherlock Holmes");
participaciones[35] = new Participacion("00019", "Jude Law", "Dr. John Watson");
participaciones[36] = new Participacion("00020", "John Gallagher Jr.", "The Man");
participaciones[37] = new Participacion("00020", "Kate Siegel", "Maddie");
participaciones[38] = new Participacion("00021", "Matt Damon", "Max");
participaciones[39] = new Participacion("00021", "Jodie Foster", "Delacourt");
participaciones[40] = new Participacion("00022", "Mike Myers", "Shrek");
participaciones[41] = new Participacion("00022", "Eddie Murphy", "Dunkey");
participaciones[42] = new Participacion("00023", "Andrew Garfield", "Jonathan Larson");
participaciones[43] = new Participacion("00023", "Alexandra Shipp", "Susan");
participaciones[44] = new Participacion("00024", "Adam Driver", "Charlie Barber");
participaciones[45] = new Participacion("00024", "Scarlett Johansson", "Nicole Barber");
participaciones[46] = new Participacion("00025", "Hailee Steinfeld", "Vi");
participaciones[47] = new Participacion("00025", "Ella Purnell", "Jinx");
participaciones[48] = new Participacion("00026", "Stephanie Sheh", "Sailor Moon");
participaciones[49] = new Participacion("00026", "Kotono Mitsuishi", "Usagi Tsukino");
participaciones[50] = new Participacion ("00135","Benedict Cumberbatch","Dr. Strange");
participaciones[51] = new Participacion ("00135","Mads Mikkelsen","Kaecilius");
participaciones[52] = new Participacion("03502","Robert Pattinson","Thomas Howard");
participaciones[53] = new Participacion("03502","Willem Dafoe","Thomas Wake");
participaciones[54] = new Participacion("06403","Rami Malek","Freddie Mercury");
participaciones[55] = new Participacion("06403","Ben Hardy","Roger Taylor");
participaciones[56] = new Participacion("04904","Jonathan Pryce","Papa Francisco");
participaciones[57] = new Participacion("04904","Anthony Hopkins","Papa Benedicto");
participaciones[58] = new Participacion("00945","Essie Davis","Amelia");
participaciones[59] = new Participacion("00945","Noah Wiseman","Samuel");
participaciones[60] = new Participacion("18223", "Mike Myers", "Actor/Actriz");
participaciones[61] = new Participacion("42035", "Alexandra Shipp", "Actor/Actriz");
participaciones[62] = new Participacion("88844","William Moseley","Peter Pevensie");
participaciones[63] = new Participacion("88844","Anna Popplewell","Susan Pevensie");
participaciones[64] = new Participacion("77737","Jim Carrey","Dr. Ivo Robotnik (Eggman/Super Robtnik)");
participaciones[65] = new Participacion("77737","James Marsden","Tom Wachowski (Lord Dona)");
participaciones[66] = new Participacion("11100","Dakota Fanning","Caroline");
participaciones[67] = new Participacion("99300","Abbi Jacobson","Katie Mitchell");
participaciones[68] = new Participacion("99300","Eric Andre","Mark Bowman");
participaciones[69] = new Participacion("99940","Sandra Bullock","Scarlet Overkill");
participaciones[70] = new Participacion("70032","Matthew McConaughey","Buster Moon");
participaciones[71] = new Participacion("70032","Scarlett Johansson","Ash");
participaciones[72] = new Participacion("22290","Edward Norton","Scout veterano Randy Ward");
participaciones[73] = new Participacion("22290","Bill Murray","Walt Bishop");
participaciones[74] = new Participacion("10039","Daniel Radcliffe","Harry Potter");
participaciones[75] = new Participacion("10039","Emma Watson","Hermione Granger");
participaciones[76] = new Participacion("99903","Noriko Hidaka","Satsuki Kusakabe");
participaciones[77] = new Participacion("88139","Michael Jordan","El mismo");
participaciones[78] = new Participacion("88139","Bill Murray","El mismo");

cParticipaciones=79;

}


public void inicioSesion(){
  int opcion = 1,i=0;
  do{
    i=0;
    System.out.println("Correo:     ");  String idSuscripcion = dato.nextLine();
    System.out.println("Contrasena: ");  String password = dato.nextLine();
    boolean passwordA = false, idA = false;
    for(;i<cSuscripciones;i++){
        if(suscripciones[i].getIdSuscripcion().equals(idSuscripcion)){
          idA = true;
            if (suscripciones[i].getPassword().equals(password)){
            passwordA = true;
            }
        }
        if(passwordA == true && idA== true) break;
        }
        if(passwordA == true && idA == true){
          opcion = 0;
          perfiles(suscripciones[i].getIdSuscripcion());
        }
        else if(passwordA == false && idA == true){
          System.out.println("Contrasena incorrecta");
          System.out.println("1.  Volver a ingresar datos     0. Cancelar");
          opcion = dato.nextInt();
          dato.nextLine();
        }
        else{
          System.out.println("Correo y/o contrasena incorrectos");
          System.out.println("1. Volver a ingresar datos    0. Cancelar");
          opcion=dato.nextInt();
          dato.nextLine();
        }
      }while(opcion == 1);
}


public void registroUsuario(){
suscripciones[cSuscripciones]=new Suscripcion();
suscripciones[cSuscripciones].capturar();
suscripciones[cSuscripciones].capturarPerfil(suscripciones[cSuscripciones].getIdSuscripcion());
visitaUsuarioNuevo(0,cSuscripciones);
cSuscripciones++;
}


public void perfiles(String idSuscripcion){
  int opcion,i=0;
  System.out.println("Escoge tu perfil: ");
    for(;i<cSuscripciones;i++){
        if(suscripciones[i].getIdSuscripcion().contains(idSuscripcion)==true){
            suscripciones[i].mostrarPerfiles();
            break;
        }
    }
  System.out.println("¿Quien esta viendo?  (Elige el perfil)");
  catalogo(opcion=dato.nextInt()-1, i);
}


public void catalogo(int opcion, int suscripcion){
System.out.println("Quizas te guste");
System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<");
parati(opcion, suscripcion);
System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<");
System.out.println("[1. Para ti]  [2. Continuar viendo]  [3.Buscar]  [4. Filtrar]  [5. Mi cuenta]  [6. Cerrar Sesion]  [0. Salir]");
int opcionCatalogo = dato.nextInt();
dato.nextLine();
switch (opcionCatalogo){
  case 1:
	System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<");
    parati(opcion,suscripcion);
		System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<");
    if(paraTi==true){
			System.out.println("");
		System.out.println("Escoge el contenido que mas te agrade: ");
    int opcionVisita = dato.nextInt()-1;
		int continuu=0;
    visitaInicioSesion(opcionVisita,opcion,suscripcion,continuu);
    }
    else{
      System.out.println("No tenemos contenido para recomendarte... ");
      catalogo(opcion, suscripcion);
    }
    break;
  case 2:
    continuarViendo(opcion, suscripcion);
    break;
  case 3:
    buscar(opcion, suscripcion);
    break;
  case 4:
    filtrar(opcion,suscripcion);
    break;
	case 5:
	  miCuenta(opcion,suscripcion);
	    break;
	case 6:
			inicioSesion();
			break;
  case 0:
			break;
}
}


public void parati(int opcion,int suscripcion){
  System.out.println("Para ti   ( U w U )  ");
	String cont="";
	char gen='A';
	int drama=0,accion=0,terror=0,ciencia=0,comedia=0,musical=0,romantica=0,fantasia=0,anime=0,deportes=0,rekok=0;
	boolean yalovi=false;
	if (suscripciones[suscripcion].getPerfilClasificacion(opcion)==true) {
		System.out.println("Filtro para niños activado UwU");
		for (int y=0;y<cReproducciones;y++) {
			//VALIDO SI LA REPRODUCCION ES LA INDICADA
			if ((reproducciones[y].getIdPerfil().equals(suscripciones[suscripcion].mandarIdPerfil(opcion))) && (reproducciones[y].getInconcluso()==false)) {
      //SACO EL ID DEL CONTENIDO Y LUEGO SU GENERO
			cont=reproducciones[y].getIdContenido();
			for (int pss=0;pss<cContenidos;pss++) {
       if (contenidos[pss].getIdContenido().equals(cont)) {
        gen=contenidos[pss].getGenero();
       }
			}
      switch (gen) {
				case 'D':
				  //PARA VALIDAR QUE SOLO ENTRE UNA VEZ POR GENERO
				  if (drama==0) {
											System.out.println("Drama");
           for (int rep=0;rep<cContenidos;rep++) {
						 //FILTRO DE NIÑOS
						 if (contenidos[rep].getClasificacion()<=3) {
							 //GENERO IGUAL A LA REPRODUCCION
						 	if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
                for (int jj=0;jj<cReproducciones;jj++) {
                if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
                 yalovi=true;
                }
                }
               if (yalovi==false) {
								 rekok++;
								 System.out.println("");
                System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
               }
						 	}
						 }
						 yalovi=false;
           }
					drama++;
				  }
					break;
				case 'A':
				  if (accion==0) {
											System.out.println("Accion");
						for (int rep=0;rep<cContenidos;rep++) {
						 //FILTRO DE NIÑOS
						 if (contenidos[rep].getClasificacion()<=3) {
							 //GENERO IGUAL A LA REPRODUCCION
							if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
								 System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
								}
							}
						 }
						 yalovi=false;
						}
					accion++;
				  }
					break;
				case 'T':
				  if (terror==0) {
											System.out.println("Terror");
						for (int rep=0;rep<cContenidos;rep++) {
							//FILTRO DE NIÑOS
							if (contenidos[rep].getClasificacion()<=3) {
								//GENERO IGUAL A LA REPRODUCCION
							 if (contenidos[rep].getGenero()==gen) {
								 //VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
									System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								 System.out.println(contenidos[rep].queSoy());
								 System.out.println("");
								}
							 }
							}
							yalovi=false;
						}
          terror++;
				  }
					break;
				case 'C':
				  if (ciencia==0) {
											System.out.println("Ciencia Ficcion");
						for (int rep=0;rep<cContenidos;rep++) {
						 //FILTRO DE NIÑOS
						 if (contenidos[rep].getClasificacion()<=3) {
							 //GENERO IGUAL A LA REPRODUCCION
							if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
								 System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
								}
							}
						 }
						 yalovi=false;
						}
					ciencia++;
				  }
					break;
				case 'M':
				  if (comedia==0) {
											System.out.println("Comedia");
						for (int rep=0;rep<cContenidos;rep++) {
							//FILTRO DE NIÑOS
							if (contenidos[rep].getClasificacion()<=3) {
								//GENERO IGUAL A LA REPRODUCCION
							 if (contenidos[rep].getGenero()==gen) {
								 //VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
									System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								 System.out.println(contenidos[rep].queSoy());
								 System.out.println("");
								}
							 }
							}
							yalovi=false;
						}
					comedia++;
				  }
					break;
				case 'U':
				  if (musical==0) {
						System.out.println("Musical");
						for (int rep=0;rep<cContenidos;rep++) {
						 //FILTRO DE NIÑOS
						 if (contenidos[rep].getClasificacion()<=3) {
							 //GENERO IGUAL A LA REPRODUCCION
							if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
								 System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
								}
							}
						 }
						 yalovi=false;
						}
					musical++;
				  }
					break;
				case 'R':
				  if (romantica==0) {
											System.out.println("Romantica");
						for (int rep=0;rep<cContenidos;rep++) {
						 //FILTRO DE NIÑOS
						 if (contenidos[rep].getClasificacion()<=3) {
							 //GENERO IGUAL A LA REPRODUCCION
							if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
								 System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
								}
							}
						 }
						 yalovi=false;
						}
					romantica++;
				  }
					break;
				case 'F':
				  if (fantasia==0) {
											System.out.println("Fantasia");
						for (int rep=0;rep<cContenidos;rep++) {
							//FILTRO DE NIÑOS
							if (contenidos[rep].getClasificacion()<=3) {
								//GENERO IGUAL A LA REPRODUCCION
							 if (contenidos[rep].getGenero()==gen) {
								 //VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
									System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								 System.out.println(contenidos[rep].queSoy());
								 System.out.println("");
								}
							 }
							}
							yalovi=false;
						}
					fantasia++;
				  }
					break;
				case 'N':
				  if (anime==0) {
											System.out.println("Anime");
						for (int rep=0;rep<cContenidos;rep++) {
							//FILTRO DE NIÑOS
							if (contenidos[rep].getClasificacion()<=3) {
								//GENERO IGUAL A LA REPRODUCCION
							 if (contenidos[rep].getGenero()==gen) {
								 //VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
									System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								 System.out.println(contenidos[rep].queSoy());
								 System.out.println("");
								}
							 }
							}
							yalovi=false;
						}
					anime++;
				  }
					break;
				case 'E':
				if (deportes==0) {
					for (int rep=0;rep<cContenidos;rep++) {
						//FILTRO DE NIÑOS
						if (contenidos[rep].getClasificacion()<=3) {
							//GENERO IGUAL A LA REPRODUCCION
						 if (contenidos[rep].getGenero()==gen) {
							 //VALIDAR SI EL CONTENIDO YA LO VIO
							 for (int jj=0;jj<cReproducciones;jj++) {
							 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
								yalovi=true;
							 }
							 }
							if (yalovi==false) {
								rekok++;
								System.out.println("");
							 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
							 System.out.println(contenidos[rep].queSoy());
							 System.out.println("");
							}
						 }
						}
						yalovi=false;
					}
					deportes++;
				}
					break;
      }
			}
		}
	}
	else {
		for (int y=0;y<cReproducciones;y++) {
			//VALIDO SI LA REPRODUCCION ES LA INDICADA
			if ((reproducciones[y].getIdPerfil().equals(suscripciones[suscripcion].mandarIdPerfil(opcion))) && (reproducciones[y].getInconcluso()==false)) {
			 //SACO EL ID DEL CONTENIDO Y LUEGO SU GENERO
			cont=reproducciones[y].getIdContenido();
			for (int pss=0;pss<cContenidos;pss++) {
				if (contenidos[pss].getIdContenido().equals(cont)) {
				 gen=contenidos[pss].getGenero();
				}
			}
			 switch (gen) {
				case 'D':
					//PARA VALIDAR QUE SOLO ENTRE UNA VEZ POR GENERO
					if (drama==0) {
											System.out.println("Drama");
						for (int rep=0;rep<cContenidos;rep++) {
							 //GENERO IGUAL A LA REPRODUCCION
							if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
								 System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
								}
							}
						 yalovi=false;
						}
					drama++;
					}
					break;
				case 'A':
					if (accion==0) {
											System.out.println("Accion");
						for (int rep=0;rep<cContenidos;rep++) {
							 //GENERO IGUAL A LA REPRODUCCION
							if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
								 System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
								}
							}
						 yalovi=false;
						}
					accion++;
					}
					break;
				case 'T':
					if (terror==0) {
											System.out.println("Terror");
						for (int rep=0;rep<cContenidos;rep++) {
								//GENERO IGUAL A LA REPRODUCCION
							 if (contenidos[rep].getGenero()==gen) {
								 //VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
									System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								 System.out.println(contenidos[rep].queSoy());
								 System.out.println("");
								}
							 }
							yalovi=false;
						}
					 terror++;
					}
					break;
				case 'C':
					if (ciencia==0) {
											System.out.println("Ciencia Ficcion");
						for (int rep=0;rep<cContenidos;rep++) {
							 //GENERO IGUAL A LA REPRODUCCION
							if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
								 System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
								}
							}
						 yalovi=false;
						}
					ciencia++;
					}
					break;
				case 'M':
					if (comedia==0) {
											System.out.println("Comedia");
						for (int rep=0;rep<cContenidos;rep++) {
								//GENERO IGUAL A LA REPRODUCCION
							 if (contenidos[rep].getGenero()==gen) {
								 //VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
									System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								 System.out.println(contenidos[rep].queSoy());
								 System.out.println("");
								}
							 }
							yalovi=false;
						}
					comedia++;
					}
					break;
				case 'U':
					if (musical==0) {
						System.out.println("Musical");
						for (int rep=0;rep<cContenidos;rep++) {
							 //GENERO IGUAL A LA REPRODUCCION
							if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
								 System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
								}
							}
						 yalovi=false;
						}
					musical++;
					}
					break;
				case 'R':
					if (romantica==0) {
											System.out.println("Romantica");
						for (int rep=0;rep<cContenidos;rep++) {
							 //GENERO IGUAL A LA REPRODUCCION
							if (contenidos[rep].getGenero()==gen) {
								//VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
								 System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								System.out.println(contenidos[rep].queSoy());
								System.out.println("");
								}
							}
						 yalovi=false;
						}
					romantica++;
					}
					break;
				case 'F':
					if (fantasia==0) {
											System.out.println("Fantasia");
						for (int rep=0;rep<cContenidos;rep++) {
								//GENERO IGUAL A LA REPRODUCCION
							 if (contenidos[rep].getGenero()==gen) {
								 //VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
									System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								 System.out.println(contenidos[rep].queSoy());
								 System.out.println("");
								}
							 }
							yalovi=false;
						}
					fantasia++;
					}
					break;
				case 'N':
					if (anime==0) {
											System.out.println("Anime");
						for (int rep=0;rep<cContenidos;rep++) {
								//GENERO IGUAL A LA REPRODUCCION
							 if (contenidos[rep].getGenero()==gen) {
								 //VALIDAR SI EL CONTENIDO YA LO VIO
								 for (int jj=0;jj<cReproducciones;jj++) {
								 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
									yalovi=true;
								 }
								 }
								if (yalovi==false) {
									rekok++;
									System.out.println("");
								 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
								 System.out.println(contenidos[rep].queSoy());
								 System.out.println("");
								}
							 }
							yalovi=false;
						}
					anime++;
					}
					break;
				case 'E':
				if (deportes==0) {
					for (int rep=0;rep<cContenidos;rep++) {
							//GENERO IGUAL A LA REPRODUCCION
						 if (contenidos[rep].getGenero()==gen) {
							 //VALIDAR SI EL CONTENIDO YA LO VIO
							 for (int jj=0;jj<cReproducciones;jj++) {
							 if (reproducciones[jj].getIdContenido().equals(contenidos[rep].getIdContenido())) {
								yalovi=true;
							 }
							 }
							if (yalovi==false) {
								rekok++;
								System.out.println("");
							 System.out.println((rep+1)+". "+contenidos[rep].getTitulo());
							 System.out.println(contenidos[rep].queSoy());
							 System.out.println("");
							}
						 }
						yalovi=false;
					}
					deportes++;
				}
					break;
			 }
			}
		}
	}
	if (rekok!=0) {
		paraTi = true;
	}
	else {
		paraTi = false;
	}
}


public void continuarViendo(int perfil, int suscripcion){
	String idPer;
	String megackkPeli="",megackkSeri="";
	int cusar=0;
	idPer=suscripciones[suscripcion].mandarIdPerfil(perfil);
	System.out.println("Peliculas por terminar de ver: ");
	for (int ezz=(cReproducciones-1);ezz>=0;ezz--) {
		 if (reproducciones[ezz].getIdPerfil().equals(idPer)) {
			 if ((reproducciones[ezz].getIdCapitulo().equals("00000"))) {
				 //PELICULA
						if (reproducciones[ezz].getInconcluso()==true) {
						 int arre=0;
							for (int buk=0;buk<cContenidos;buk++) {
							 if (contenidos[buk].getIdContenido().equals(reproducciones[ezz].getIdContenido())) {
								 arre=buk;
							 }
							}
							if (megackkPeli.equals(reproducciones[ezz].getIdContenido())) {
							}
							else {
							megackkPeli=megackkPeli+reproducciones[ezz].getIdContenido();
							System.out.println("");
 						 System.out.println((arre+1)+". "+contenidos[arre].getTitulo());
 						 System.out.println("");
 						 cusar++;
							}
						}
						else {
							megackkPeli=reproducciones[ezz].getIdContenido()+megackkPeli;
						}
			 }
		 }
	}
	System.out.println("Series por terminar de ver: ");
	for (int ezzE=(cReproducciones-1);ezzE>=0;ezzE--) {
		 if (reproducciones[ezzE].getIdPerfil().equals(idPer)) {
				 //SERIE
				 if (reproducciones[ezzE].getIdCapitulo().equals("00000")) {
				 }
				 else {
					 if (megackkSeri.equals(reproducciones[ezzE].getIdContenido())) {
 					}
 					else {
						int numCont=0;
				 for (int yu=0;yu<cContenidos;yu++) {
				 if (contenidos[yu].getIdContenido().equals(reproducciones[ezzE].getIdContenido())) {
					 numCont=yu;
				 }
				 }
					int canti=0,capsVistas=0;
					String idEpds="";
					canti=contenidos[numCont].mandarNumCaps();
				 for (int rp=0;rp<canti;rp++) {
					 idEpds=contenidos[numCont].mandarIdEpisodio(rp);
					 for (int rew=0;rew<cReproducciones;rew++) {
						 if (reproducciones[rew].getIdPerfil().equals(idPer)) {
						 if (reproducciones[rew].getIdContenido().equals(reproducciones[ezzE].getIdContenido())) {
							 if ((reproducciones[rew].getIdCapitulo().equals(idEpds)) && (reproducciones[rew].getInconcluso()==false)) {
								 capsVistas++;
							 }
						 }
						 }
					 }
				 }
				 if (capsVistas==canti) {
				 }
				 else {
					 if (megackkSeri.equals(reproducciones[ezzE].getIdContenido())) {
					 }
					 else {
						 megackkSeri=megackkSeri+reproducciones[ezzE].getIdContenido();
						 System.out.println("");
 						System.out.println((numCont+1)+". "+contenidos[numCont].getTitulo());
 						System.out.println("");
 						cusar++;
					 }
				 }
 					}
				 }
		 }
	}
	if (cusar==0) {
		System.out.println("No tienes contenido pendiente de ver ");
		catalogo(perfil,suscripcion);
	}
	else {
		System.out.println("Escoje el contenido que deseas seguir viendo: ");
    int contAVer=dato.nextInt();
		int cinsass=0;
		visitaInicioSesion(contAVer-1,perfil,suscripcion,cinsass);
	}
}


public void buscar(int perfil, int suscripcion){
  System.out.println("¿Que desea buscar? ");
  String contenido = dato.nextLine(),megaCadena,actors="";
  boolean existe = false;
  Contenido p;
  int opcionBuscar=0,i = 0;
	System.out.println("");
	System.out.println("");
  System.out.println("Resultados de tu busqueda: ");
  for (;i<cContenidos;i++){
      for (int sy=0;sy<cParticipaciones;sy++) {
        if (contenidos[i].getIdContenido().equals(participaciones[sy].getIdContenido())) {
         actors=actors+participaciones[sy].getIdActor();
        }
      }
    p=contenidos[i];

      megaCadena=p.getDireccion()+p.getTitulo()+p.getPremios()+actors;
      if(suscripciones[suscripcion].getPerfilClasificacion(perfil)==false){
        if(megaCadena.contains(contenido)){
					System.out.println((i+1)+" .- "+contenidos[i].getTitulo());
	        existe = true;
				}
      }
      else{
				if(megaCadena.contains(contenido) && contenidos[i].getClasificacion()<=3){
					System.out.println((i+1)+" .- "+contenidos[i].getTitulo());
					existe = true;
				}
			}
      megaCadena="";
			actors="";
  }
  if(existe == false){
    System.out.println("No existen resultados ");
    System.out.println("-----------------------");
    System.out.println("1. Volver a buscar");
    System.out.println("0. Regresar al menu");
    opcionBuscar = dato.nextInt(); dato.nextLine();
    if(opcionBuscar == 1){
      dato.nextLine();
      buscar(perfil, suscripcion);
    }
    else{
      catalogo(perfil, suscripcion);
    }
  }
  System.out.println("-----------------");
  System.out.println("1. Volver a buscar");
  System.out.println("2. Escoger contenido de tu busqueda");
	System.out.println("3. Regresar al menu");
  int ccvv=dato.nextInt(); dato.nextLine();
  if (ccvv==1) {
    buscar(perfil,suscripcion);
  }
	else if (ccvv==2) {
   System.out.println("Escribe el numero del contenido deseado: ");
   opcionBuscar=dato.nextInt();
	 int cinsa=0;
	 visitaInicioSesion(opcionBuscar-1,perfil,suscripcion,cinsa);
	}
	else if(ccvv==3){
		catalogo(perfil,suscripcion);
	}
}


public void filtrar(int opcion, int suscripcion){
 System.out.println("1. Pelicula   2.Serie ");
 int filtip=dato.nextInt();
 String pelioserie;
 if (filtip==1) {
   pelioserie="Pelicula";
 }
 else {
   pelioserie="Serie";
 }
 System.out.println("1. Por clasificacion   2. Por Genero ");
 int catoge=dato.nextInt();
 int existe=0;
 if (suscripciones[suscripcion].getPerfilClasificacion(opcion)==true) {
	 if (catoge==1) {
	   System.out.println("1. Clasificacion: AA");
	   System.out.println("2. Clasificacion: A");
	   System.out.println("3. Clasificacion: B");
	   System.out.println("Escribe el numero de acuerdo a la clasificacion deseada: ");
	   int selec=dato.nextInt();
	   for (int sp=0;sp<cContenidos;sp++) {
	     if (contenidos[sp].queSoy().equals(pelioserie)) {
	       if (contenidos[sp].getClasificacion()==selec) {
	         System.out.println("-----------------------------------");
	         System.out.println((sp+1)+". "+contenidos[sp].getTitulo());
	         System.out.println("");
					 existe++;
	       }
	     }
	   }
		 if (existe==0) {
		 	System.out.println("Lo sentimos no tenemos contenido con los filtros que especificaste");
			System.out.println("Prueba otro flitro");
			filtrar(opcion,suscripcion);
		 }
	 }
	 else if (catoge==2) {
	   System.out.println("D= Drama");
	   System.out.println("A= Accion");
	   System.out.println("T= Terror");
	   System.out.println("C= Ciencia Ficcion");
	   System.out.println("M= Comedia");
	   System.out.println("U= Musical");
	   System.out.println("R= Romantica");
	   System.out.println("F= Fantasia");
	   System.out.println("N= Anime");
	   System.out.println("E= Deportes");
	   System.out.println("Escribe la letra de acuerdo al genero : ");
	   char slecF=dato.next().charAt(0);dato.nextLine();
	   for (int sp=0;sp<cContenidos;sp++) {
	     if (contenidos[sp].queSoy().equals(pelioserie)) {
	       if (contenidos[sp].getGenero()==slecF) {
					 if (contenidos[sp].getClasificacion()<=3) {
						 System.out.println("-----------------------------------");
  	         System.out.println((sp+1)+". "+contenidos[sp].getTitulo());
  	         System.out.println("");
  					 existe++;
					 }
	       }
	     }
	   }
		 if (existe==0) {
			System.out.println("Lo sentimos no tenemos contenido con los filtros que especificaste");
			System.out.println("Prueba otro flitro");
			filtrar(opcion,suscripcion);
		 }
	 }
	 System.out.println("Escoge la pelicula o serie de tu agrado: ");
	 int opcip=dato.nextInt();
	 int consss=0;
	 visitaInicioSesion(opcip-1, opcion, suscripcion,consss);
 }
 else {
	 if (catoge==1) {
	   System.out.println("1. Clasificacion: AA");
	   System.out.println("2. Clasificacion: A");
	   System.out.println("3. Clasificacion: B");
	   System.out.println("4. Clasificacion: B15");
	   System.out.println("5. Clasificacion: C");
	   System.out.println("6. Clasificacion D");
	   System.out.println("Escribe el numero de acuerdo a la clasificacion deseada: ");
	   int selec=dato.nextInt();
	   for (int sp=0;sp<cContenidos;sp++) {
	     if (contenidos[sp].queSoy().equals(pelioserie)) {
	       if (contenidos[sp].getClasificacion()==selec) {
	         System.out.println("-----------------------------------");
	         System.out.println((sp+1)+". "+contenidos[sp].getTitulo());
	         System.out.println("");
					 existe++;
	       }
	     }
	   }
		 if (existe==0) {
		 	System.out.println("Lo sentimos no tenemos contenido con los filtros que especificaste");
			System.out.println("Prueba otro flitro ");
			filtrar(opcion,suscripcion);
		 }
	 }
	 else if (catoge==2) {
	   System.out.println("D= Drama");
	   System.out.println("A= Accion");
	   System.out.println("T= Terror");
	   System.out.println("C= Ciencia Ficcion");
	   System.out.println("M= Comedia");
	   System.out.println("U= Musical");
	   System.out.println("R= Romantica");
	   System.out.println("F= Fantasia");
	   System.out.println("N= Anime");
	   System.out.println("E= Deportes");
	   System.out.println("Escribe la letra de acuerdo al genero : ");
	   char slecF=dato.next().charAt(0);dato.nextLine();
	   for (int sp=0;sp<cContenidos;sp++) {
	     if (contenidos[sp].queSoy().equals(pelioserie)) {
	       if (contenidos[sp].getGenero()==slecF) {
	         System.out.println("-----------------------------------");
	         System.out.println((sp+1)+". "+contenidos[sp].getTitulo());
	         System.out.println("");
					 existe++;
	       }
	     }
	   }
		 if (existe==0) {
			System.out.println("Lo sentimos no tenemos contenido con los filtros que especificaste");
			System.out.println("Prueba otro flitro");
			filtrar(opcion,suscripcion);
		 }
	 }
	 System.out.println("Escoge la pelicula o serie de tu agrado: ");
	 int opcip=dato.nextInt();
	 int consss=0;
	 visitaInicioSesion(opcip-1, opcion, suscripcion,consss);
 }
}


public void visitaUsuarioNuevo(int perfil, int suscripcion){
  System.out.println("Que genero de pelicula o serie te gusta?");
	System.out.println("______________________");
  System.out.println("D. Drama ");
  System.out.println("A. Accion ");
  System.out.println("T. Terror ");
  System.out.println("C. Ciencia Ficcion ");
  System.out.println("M. Comedia ");
  System.out.println("U. Musical ");
  System.out.println("R. Romantica ");
  System.out.println("F. Fantasia ");
  System.out.println("N. Anime ");
  System.out.println("E. Deportes");
	System.out.println("______________________");
	System.out.println("Escribe la letra correspondiente: ");
  char genero = dato.next().charAt(0); dato.nextLine();
  int recomendaciones = 0;
	if (suscripciones[suscripcion].getPerfilClasificacion(perfil)==true) {
		System.out.println("Filtro para niños activado UwU");
		for(;recomendaciones<cContenidos;recomendaciones++){
			if(contenidos[recomendaciones].getGenero()==genero && (contenidos[recomendaciones].getClasificacion()<=3))
				System.out.println((recomendaciones+1)+". "+contenidos[recomendaciones].getTitulo());
			}
	}
	else {
		for(;recomendaciones<cContenidos;recomendaciones++){
			if(contenidos[recomendaciones].getGenero()==genero)
				System.out.println((recomendaciones+1)+". "+contenidos[recomendaciones].getTitulo());
			}
	}
		System.out.println("......................................................");
    System.out.println("Escoge una pelicula o serie que te llame la atencion: ");
    recomendaciones=dato.nextInt();
		String fech=dateF.format(LocalDateTime.now());
		String id=suscripciones[suscripcion].mandarIdPerfil(perfil);
		String cad=id+fech;
		String caps="00000";
		if (contenidos[recomendaciones].queSoy().equals("Serie")) {
			caps=contenidos[recomendaciones].primeraVisitaSerie();
		}
    reproducciones[cReproducciones]=new Reproduccion(cad,id,contenidos[recomendaciones-1].getIdContenido(),false,fech,caps);
		cReproducciones++;
    catalogo(perfil, suscripcion);
}


public void visitaInicioSesion(int opcionBuscar,int perfil, int suscripcion, int continuar){
  Serie seri;
  Pelicula peli;
	String press="";
	int caps=0;
	String fech,id,cad,capstt;
if (continuar!=1) {
	if (contenidos[opcionBuscar].queSoy().equals("Serie")) {
	  System.out.println("Deseas ver detalles de la serie:  1. Si  2.No");
	  int det=dato.nextInt();dato.nextLine();
	  if (det==1) {
	    seri=(Serie)contenidos[opcionBuscar];
	    seri.mostrar();
	    System.out.println("");
			System.out.println("Presione (1) para seguir viendo la serie:");
			press=dato.nextLine();
	  }
	 contenidos[opcionBuscar].mostrarEpisodio();
	 System.out.println("");
	 System.out.println("Escoge el episodio deseado: ");
	 caps=dato.nextInt();
	 caps=caps-1;
	}
	else if (contenidos[opcionBuscar].queSoy().equals("Pelicula")) {
	  System.out.println("Deseas ver detalles de la pelicula:  1. Si  2.No");
	  int det=dato.nextInt();dato.nextLine();
	  if (det==1) {
	    peli=(Pelicula)contenidos[opcionBuscar];
	    peli.mostrar();
	    System.out.println("");
			System.out.println("Presione (1) para seguir viendo la pelicula:");
			press=dato.nextLine();
	  }
	}
}

System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
System.out.println("[][][][][][][][]REPRODUCIENDO CONTENIDO :D....[][][][][][][][]");
System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
System.out.println("");
System.out.println("1. Finalizar     2. Inconcluso   3.Like    4. Dislike  5. Elenco  ");
int opcionV = dato.nextInt();
switch(opcionV){
  case 1:
	fech=dateF.format(LocalDateTime.now());
	id=suscripciones[suscripcion].mandarIdPerfil(perfil);
	cad=id+fech;
	capstt="00000";
	if (contenidos[opcionBuscar].queSoy().equals("Serie")) {
		capstt=contenidos[opcionBuscar].mandarIdEpisodio(caps);
	}
	reproducciones[cReproducciones]=new Reproduccion(cad,id,contenidos[opcionBuscar].getIdContenido(),false,fech,capstt);
	cReproducciones++;
	int ysys=contenidos[opcionBuscar].getReproducciones();
	ysys++;
	contenidos[opcionBuscar].setReproducciones(ysys);
	catalogo(perfil, suscripcion);
    break;
  case 2:
	fech=dateF.format(LocalDateTime.now());
	id=suscripciones[suscripcion].mandarIdPerfil(perfil);
	cad=id+fech;
	capstt="00000";
	if (contenidos[opcionBuscar].queSoy().equals("Serie")) {
		capstt=contenidos[opcionBuscar].mandarIdEpisodio(caps);
	}
	reproducciones[cReproducciones]=new Reproduccion(cad,id,contenidos[opcionBuscar].getIdContenido(),true,fech,capstt);
	cReproducciones++;
	catalogo(perfil, suscripcion);
    break;
  case 3:
	  int txts=contenidos[opcionBuscar].getLikes();
		txts++;
		contenidos[opcionBuscar].setLikes(txts);
    System.out.println("Le has dado like!");
		int vistaa=1;
    visitaInicioSesion(opcionBuscar,perfil,suscripcion,vistaa);
    break;
  case 5:
  int cicloActor = 1;
do{
  for(int i=0;i<cParticipaciones;i++){
    if(contenidos[opcionBuscar].getIdContenido().equals(participaciones[i].getIdContenido()))
      System.out.println((i+1)+". "+participaciones[i].getIdActor());
  }
  System.out.println("Escoge un actor para ver mas detalles     0. Regresar");
  int actorOpcion = dato.nextInt();
  if(actorOpcion!=0){
		for (int op=0;op<cElenco;op++) {
			if (elencos[op].getIdActor().equals(participaciones[actorOpcion-1].getIdActor())) {
				elencos[op].mostrar();
			}
		}
		System.out.println("");
		System.out.println("");
    System.out.println("¿Quieres escoger otro actor?");
    System.out.println("1. Si    0. No");
    cicloActor = dato.nextInt();
  }
  else{
		vistaa=1;
    visitaInicioSesion(opcionBuscar,perfil,suscripcion,vistaa);
  }
}while(cicloActor == 1);
System.out.println("Seguir viendo tu contenido:   1. Si   2. No");
int verk=dato.nextInt();
if (verk==1) {
	vistaa=1;
	visitaInicioSesion(opcionBuscar, perfil,suscripcion,vistaa);
}
else {
	catalogo(perfil,suscripcion);
}
    break;
		case 4:
		int txtss=contenidos[opcionBuscar].getDislikes();
		txtss++;
		contenidos[opcionBuscar].setDislikes(txtss);
		System.out.println("Le has dado dislike :( ");
		int vistaas=1;
		visitaInicioSesion(opcionBuscar,perfil,suscripcion,vistaas);
			break;
}
}


public void miCuenta(int opcion, int suscripcion){
System.out.println("Datos de tu cuenta:");
suscripciones[suscripcion].mostrar();
int cuentaOp = 1;
do{
  System.out.println("1. Agregar perfil    0. Regresar");
   cuentaOp = dato.nextInt();

  if(cuentaOp == 1){
    suscripciones[suscripcion].capturarPerfil(suscripciones[suscripcion].getIdSuscripcion());
  }
    else if(cuentaOp == 0){
      catalogo(opcion,suscripcion);
    }
  }while(cuentaOp == 1);
}


//HERRAMIENTAS DE ADMINISTRADOR
public void menuParaAdmin(){
System.out.println("1. Contenido    2. Proveedor      3. Actor   4.Participacion  5. Estadisticas  0.Cancelar");
int yy=dato.nextInt();
if (yy!=0) {
	if (yy==1) {
  System.out.println("1. Pelicula  2. Serie");
  yy=yy*10+dato.nextInt();
  }
  if (yy!=5) {
  	System.out.println("1. Mostrar    2.Capturar    0. Cancelar");
  	yy=yy*10+dato.nextInt();
  }
}
switch (yy) {
	case 5:
 	 estadisticas();
 	 break;
	case 111:
    mostrarPeliculas();
    break;
	case 112:
    capturarPelicula();
    break;
	case 121:
    mostrarSeries();
    break;
	case 122:
    capturarSerie();
    break;
	case 21:
    mostrarProveedores();
    break;
	case 22:
    capturarProveedor();
    break;
	case 31:
    mostrarActores();
    break;
	case 32:
    capturarActor();
    break;
	case 41:
    mostrarParticipaciones();
    break;
	case 42:
    capturarParticipacion();
    break;
}
}

public void capturarPelicula(){
  for (int io=1;io==1;) {
    contenidos[cContenidos]= new Pelicula();
    contenidos[cContenidos].capturar();
    int six=1;
    do {
    System.out.println("Desea capturar un actor nuevo para la pelicula  1.Si  2.No ");
    int ci=dato.nextInt();
    if (ci==1) {
    elencos[cElenco]=new Elenco();
    elencos[cElenco].capturar();
    System.out.println("Escribe la participacion de ese actor en esta pelicula:");
    String osu=dato.nextLine();
    participaciones[cParticipaciones]=new Participacion(contenidos[cContenidos].getIdContenido(),elencos[cElenco].getIdActor(),osu);
    cElenco++;
    }
    else if (ci==2) {
      for (int cv=0;cv<cElenco;cv++) {
        System.out.println((cv+1)+". "+elencos[cv].getIdActor());
      }
      System.out.println("Escoja el actor participante de la Pelicula: ");
      int acto=dato.nextInt();dato.nextLine();
      System.out.println("Escribe la participacion de ese actor en esta Pelicula:");
      String part=dato.nextLine();
      participaciones[cParticipaciones]=new Participacion(contenidos[cContenidos].getIdContenido(),elencos[acto-1].getIdActor(),part);
    }
    System.out.println("Vas a registrar otro actor para la Pelicula?  1.Si  2.No");
    six=dato.nextInt();
    } while (six!=2);
    cContenidos++;
    System.out.println("Deseas capturar otra pelicula: 1.-Si  2.-No");
    io=dato.nextInt();
  }
	menuParaAdmin();
}


public void mostrarPeliculas(){
System.out.println("1.-Ver todo el catalogo  2.-Filtrar");
int op=dato.nextInt();
Pelicula peli=(Pelicula)contenidos[0];
if (op==1) {
  for (int r=0;r<cContenidos;r++) {
  if (contenidos[r].queSoy().equals("Pelicula")){
		peli=(Pelicula)contenidos[r];
	  peli.mostrar();
	}
   }
}
if (op==2) {
  System.out.println("1.-Genero  2.-Clasificacion ");
  int op1=dato.nextInt();
  if (op1==1) {
      System.out.println("Elige el genero de acuerdo a la letra:");
      System.out.println("D:Drama A:Accion T:Terror	C:Ciencia Ficcion ");
      System.out.println("M:Comedia U:Musical R:Romantica F:Fantasia N:Anime E:Deportes");
      char gen=dato.next().charAt(0);dato.nextLine();
      for (int sa=0;sa<cContenidos;sa++) {
        if (contenidos[sa].getGenero()==gen && contenidos[sa].queSoy().equals("Pelicula")) {
         peli=(Pelicula)contenidos[sa];
         peli.mostrar();
        }
      }
  }
  else if (op1==2) {
       System.out.println("Elige el genero de acuerdo al numero:");
       System.out.println("1.-AA=Todo público,menores de 7 años  2.-A=Todo público 3.-B=Mayores de 12 años ");
       System.out.println("4.-B15=Mayores de 15 años en adelante 5.-C=18 años  6.-D=Contenido violento, sexual, mayores de 18");
        int gen=dato.nextInt();
        for (int sa=0;sa<cContenidos;sa++) {
          if (contenidos[sa].getClasificacion()==gen && contenidos[sa].queSoy().equals("Pelicula")) {
            peli=(Pelicula)contenidos[sa];
            peli.mostrar();
          }
        }
  }
}
menuParaAdmin();
}


public void capturarSerie(){
  System.out.println("Capturar serie o capitulo de serie:  1.-Serie  2.-Capitulo");
  int cap=dato.nextInt();dato.nextLine();
  int ts;
  if (cap==1) {
    int six=1;
    do {
      contenidos[cContenidos]= new Serie();
      contenidos[cContenidos].capturar();
      System.out.println("Captura un capitulo para la serie: ");
      contenidos[cContenidos].capturarEpisodio();
      do {
      System.out.println("Desea capturar un actor nuevo para la serie   1.Si  2.No ");
      int ci=dato.nextInt();
      if (ci==1) {
      elencos[cElenco]=new Elenco();
      elencos[cElenco].capturar();
      System.out.println("Escribe la participacion de ese actor en esta serie:");
      String osu=dato.nextLine();
      participaciones[cParticipaciones]=new Participacion(contenidos[cContenidos].getIdContenido(),elencos[cElenco].getIdActor(),osu);
      cElenco++;
      }
      else if (ci==2) {
        for (int cv=0;cv<cElenco;cv++) {
          System.out.println((cv+1)+". "+elencos[cv].getIdActor());
        }
        System.out.println("Escoja el actor participante de la Serie: ");
        int acto=dato.nextInt();dato.nextLine();
        System.out.println("Escribe la participacion de ese actor en esta serie:");
        String part=dato.nextLine();
        participaciones[cParticipaciones]=new Participacion(contenidos[cContenidos].getIdContenido(),elencos[acto-1].getIdActor(),part);
      }
      System.out.println("Vas a registrar otro actor para la serie?  1.Si  2.No");
      six=dato.nextInt();
      } while (six!=2);
      cContenidos++;
      System.out.println("Deseas capturar otra serie:  1.-Si  2.-No");
      ts=dato.nextInt();
    } while (ts==1);
  }
  else if (cap==2) {
    do {
      for (int r=0;r<cContenidos;r++) {
      if (contenidos[r].queSoy().equals("Serie"))
      System.out.println((r+1)+") "+contenidos[r].getTitulo());
      }
      System.out.println("De que serie vas a capturar el episodio (Escribe el numero): ");
      int ep=dato.nextInt();
      contenidos[ep-1].capturarEpisodio();
      System.out.println("Deseas capturar otro capitulo:  1.-Si  2.-No");
      ts=dato.nextInt();
    } while (ts==1);
  }
	menuParaAdmin();
}


public void mostrarSeries(){
  System.out.println("Ver serie o capitulo de serie: 1.-Serie  2.-Capitulo ");
  int su=dato.nextInt();
  Serie seri=(Serie)contenidos[5];
  if (su==1) {
    System.out.println("1.-Ver todo el catalogo  2.-Filtrar");
    int op=dato.nextInt();
    if (op==1) {
      for (int r=0;r<cContenidos;r++) {
      if (contenidos[r].queSoy().equals("Serie"))
      seri=(Serie)contenidos[r];
      seri.mostrar();
       }
    }
    if (op==2) {
      System.out.println("1.-Genero  2.-Clasificacion  ");
      int op1=dato.nextInt();
      if (op1==1) {
          System.out.println("Elige el genero de acuerdo a la letra:");
          System.out.println("D:Drama A:Accion T:Terror	C:Ciencia Ficcion M:Comedia");
          System.out.println("U:Musical R:Romantica F:Fantasia N:Anime E:Deportes");
          char gen=dato.next().charAt(0);dato.nextLine();
          for (int sa=0;sa<cContenidos;sa++) {
            if (contenidos[sa].getGenero()==gen && contenidos[sa].queSoy().equals("Serie")) {
              seri=(Serie)contenidos[sa];
              seri.mostrar();
            }
          }
      }
      else if (op1==2) {
           System.out.println("Elige el genero de acuerdo al numero:");
           System.out.println("1.-AA=Todo público,menores de 7 años  2.-A=Todo público 3.-B=Mayores de 12 años ");
           System.out.println("4.-B15=Mayores de 15 años en adelante 5.-C=18 años  6.-D=Contenido violento, sexual, mayores de 18");
           int gen=dato.nextInt();
           for (int sa=0;sa<cContenidos;sa++) {
             if (contenidos[sa].getClasificacion()==gen && contenidos[sa].queSoy().equals("Serie")) {
               seri=(Serie)contenidos[sa];
               seri.mostrar();
             }
           }
      }
    }
  }
  else if (su==2) {
    for (int ci=1;ci==1;) {
      for (int r=0;r<cContenidos;r++) {
      if (contenidos[r].queSoy().equals("Serie"))
      System.out.println((r+1)+") "+contenidos[r].getTitulo());
      }
      System.out.println("De que serie vas a ver los detalles de episodios (Escribe el numero): ");
      int ep=dato.nextInt();
      contenidos[ep-1].mostrarEpisodio();
      System.out.println("Deseas ver mas detalles de episodios: 1.-Si  2.-No ");
      ci=dato.nextInt();
    }
  }
	menuParaAdmin();
}


public void capturarProveedor(){
  System.out.println("Capturar Proveedor o contrato de proveedor: 1.-Proveedor  2.-Contrato ");
  int op=dato.nextInt();
  int ts;
  if (op==1) {
    for (int io=1;io==1;) {
      proveedores[cProveedores]= new Proveedor();
      proveedores[cProveedores].capturar();
      System.out.println("Captura un contrato para este proveedor: ");
      proveedores[cProveedores].capturarContrato();
      cProveedores++;
      System.out.println("Deseas capturar otro proveedor: 1.-Si  2.-No");
      io=dato.nextInt();
    }
  }
  else if (op==2) {
    do {
      for (int r=0;r<cProveedores;r++) {
      System.out.println("-----Socio Num. "+(r+1)+" : "+proveedores[r].getNombre()+"-----");
      }
      System.out.println("De que proveedor vas a capturar el contrato (Escribe el Numero): ");
      int ep=dato.nextInt();
      proveedores[ep-1].capturarContrato();
      System.out.println("Deseas capturar otro contrato:  1.-Si  2.-No");
      ts=dato.nextInt();dato.nextLine();
    } while (ts==1);
  }
	menuParaAdmin();
}


public void mostrarProveedores(){
  System.out.println("Deseas ver:  1.-Proveedores  2.-Contratos ");
  int op=dato.nextInt();
  if (op==1) {
    for (int r=0;r<cProveedores;r++) {
		System.out.println("---------"+(r+1)+"---------");
    proveedores[r].mostrar();
    }
  }
  else if (op==2) {
    int ly=1;
    do {
    for (int r=0;r<cProveedores;r++) {
    System.out.println("Socio Num. "+(r+1)+" : "+proveedores[r].getNombre());
    }
    System.out.println("De que proveedor quieres ver los contratos (Escribe el numero): ");
    int uc=dato.nextInt();
    proveedores[uc-1].mostrarContratos();
    System.out.println("Deseas ver mas contratos:  1.-Si  2.-No");
    ly=dato.nextInt();
  } while (ly==1);
  }
	menuParaAdmin();
}


public void estadisticas(){
  System.out.println("¿Que deseas ver?  1.Contenido    2.Todos los contenidos de mayor a menor");
  int op=dato.nextInt();dato.nextLine();
  if (op==1) {
    int res=1;
    do {
      for (int i=0;i<cContenidos;i++) {
      System.out.println((i+1)+") "+contenidos[i].getTitulo());
      }
      System.out.println("Escribe el numero del contenido: ");
      int usi=dato.nextInt();
			usi=usi-1;
      System.out.println("REPRODUCCIONES: "+contenidos[usi].getReproducciones());
			System.out.println("LIKES: "+contenidos[usi].getLikes());
			System.out.println("DISLIKES: "+contenidos[usi].getDislikes());
      System.out.println("Ver otro Contenido  1.Si  2.No");
      res=dato.nextInt();
    } while (res==1);
  }
  else if (op==2) {
    System.out.println("1. Mas Reproducciones  2. Mas likes 3. Mas dislikes");
    int ps=dato.nextInt();
    if (ps==1) {
    int aux;
    String auxS;
     int temp[]=new int[cContenidos];
     for (int e=0;e<cContenidos;e++) {
       temp[e]=(contenidos[e].getReproducciones());
     }
     String tempS[]=new String[cContenidos];
     for (int y=0;y<cContenidos;y++) {
       tempS[y]=(contenidos[y].getIdContenido());
     }
     for (int o=0;o<(cContenidos-1);o++) {
        for (int p=0;p<(cContenidos-1);p++) {
          if (temp[p]>=temp[p+1]) {
            aux=temp[p];
            auxS=tempS[p];
            temp[p]=temp[p+1];
            temp[p+1]=aux;
            tempS[p]=tempS[p+1];
            tempS[p+1]=auxS;
          }
        }
     }
    for (int supp=cContenidos;supp>=1;supp--) {
     for (int ye=0;ye<cContenidos;ye++) {
       String xx,xy;
       xx=contenidos[ye].getIdContenido();
       xy=tempS[supp-1];
       if (xx.equals(xy)){
         System.out.println("ID "+tempS[supp-1]+" "+contenidos[ye].getTitulo()+" ("+contenidos[ye].queSoy()+") = "+temp[supp-1]);
       }
     }
    }
    }
    else if (ps==2) {
			int aux;
			String auxS;
			 int temp[]=new int[cContenidos];
			 for (int e=0;e<cContenidos;e++) {
				 temp[e]=(contenidos[e].getLikes());
			 }
			 String tempS[]=new String[cContenidos];
			 for (int y=0;y<cContenidos;y++) {
				 tempS[y]=(contenidos[y].getIdContenido());
			 }
			 for (int o=0;o<(cContenidos-1);o++) {
					for (int p=0;p<(cContenidos-1);p++) {
						if (temp[p]>=temp[p+1]) {
							aux=temp[p];
							auxS=tempS[p];
							temp[p]=temp[p+1];
							temp[p+1]=aux;
							tempS[p]=tempS[p+1];
							tempS[p+1]=auxS;
						}
					}
			 }
			for (int supp=cContenidos;supp>=1;supp--) {
			 for (int ye=0;ye<cContenidos;ye++) {
				 String xx,xy;
				 xx=contenidos[ye].getIdContenido();
				 xy=tempS[supp-1];
				 if (xx.equals(xy)){
					 System.out.println("ID "+tempS[supp-1]+" "+contenidos[ye].getTitulo()+" ("+contenidos[ye].queSoy()+") = "+temp[supp-1]);
				 }
			 }
			}
    }
		else if (ps==3) {
			int aux;
	    String auxS;
	     int temp[]=new int[cContenidos];
	     for (int e=0;e<cContenidos;e++) {
	       temp[e]=(contenidos[e].getDislikes());
	     }
	     String tempS[]=new String[cContenidos];
	     for (int y=0;y<cContenidos;y++) {
	       tempS[y]=(contenidos[y].getIdContenido());
	     }
	     for (int o=0;o<(cContenidos-1);o++) {
	        for (int p=0;p<(cContenidos-1);p++) {
	          if (temp[p]>=temp[p+1]) {
	            aux=temp[p];
	            auxS=tempS[p];
	            temp[p]=temp[p+1];
	            temp[p+1]=aux;
	            tempS[p]=tempS[p+1];
	            tempS[p+1]=auxS;
	          }
	        }
	     }
	    for (int supp=cContenidos;supp>=1;supp--) {
	     for (int ye=0;ye<cContenidos;ye++) {
	       String xx,xy;
	       xx=contenidos[ye].getIdContenido();
	       xy=tempS[supp-1];
	       if (xx.equals(xy)){
	         System.out.println("ID "+tempS[supp-1]+" "+contenidos[ye].getTitulo()+" ("+contenidos[ye].queSoy()+") = "+temp[supp-1]);
	       }
	     }
	    }
		}

  }
	menuParaAdmin();
}


public void mostrarActores(){
  Scanner dato= new Scanner(System.in);
  boolean continuarCiclo = true;
  System.out.println("0.- Salir");
  for (int i=0; i<cElenco; i++)
    System.out.println((i+1) + ".- " + elencos[i].getIdActor());
  do{
      System.out.println("Para ver mas datos, ingrese No. del actor que desee: ");
      int noElenco = dato.nextInt();
      if (noElenco==0){
        continuarCiclo = false;
        break;
      }
      else{
        elencos[noElenco-1].mostrar();
        continuarCiclo = false;
      }
  } while (continuarCiclo);
	menuParaAdmin();
}


public void capturarActor(){
  Scanner dato= new Scanner(System.in);
  boolean continuarCiclo = true;
  int otro;
  do{
    elencos[cElenco]= new Elenco();
    elencos[cElenco].capturar();
    cElenco++;
      System.out.println("Deseas capturar otro actor? 1.-Si  0.-No");
      otro=dato.nextInt();
      if (otro==0)
        continuarCiclo = false;
  }while (continuarCiclo);
	menuParaAdmin();
}


public void mostrarParticipaciones(){
  Scanner dato = new Scanner(System.in);
  int i, opcion,uzi;
  String cont;
  boolean continuarCiclo = true;
  do{
      System.out.println("Elija el contenido para ver sus participaciones: ");
      for (i=0; i<cContenidos; i++)
      System.out.println((i+1) + ".- " + contenidos[i].getTitulo());
      opcion = dato.nextInt();
      cont = contenidos[opcion - 1].getIdContenido();
      for(i=0; i<cParticipaciones; i++){
        if(participaciones[i].getIdContenido() == cont)
          participaciones[i].mostrar();
      }
			System.out.println("Desea ver otra participacion:    1. Si  2. No");
       uzi=dato.nextInt();
			if (uzi==1) {
			}
			else {
      continuarCiclo = false;
			}
  }while(continuarCiclo);
	menuParaAdmin();
}

public void capturarParticipacion(){
  Scanner dato= new Scanner(System.in);
  int act, cont, i;
  String contenido, actor, papel;
  boolean continuarCiclo = true;
  do{
      for (i=0; i<cContenidos; i++){
				System.out.println((i+1) + ".- " + contenidos[i].getTitulo());
			}
			System.out.println("");
			System.out.print("Elige el contenido :");
      cont = dato.nextInt();
      for (i=0; i<cElenco; i++){
			 System.out.println((i+1) + ".- " + elencos[i].getIdActor());
			}
			System.out.println("");
			System.out.println("Elige el actor :");
      act = dato.nextInt();dato.nextLine();
      System.out.println("Ingrese papel del actor/actriz: ");
      papel = dato.nextLine();
      contenido = contenidos[cont - 1].getTitulo();
      actor = elencos[act - 1].getIdActor();
      participaciones[cParticipaciones] = new Participacion(contenido, actor, papel);
      cParticipaciones++;
      System.out.println("Desea agregar otra participacion? 1.-Si  0.-No");
      if (dato.nextInt() == 0)
      continuarCiclo = false;
  }while (continuarCiclo);
	menuParaAdmin();
  }

}
