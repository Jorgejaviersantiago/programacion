Desarrollar un minijuego RPG llamado "Demonio" donde se van a simular torneos. El juego introduce tu nombre por consola al ejecutar el progarma , y éste lee un archivo con los monstruos rivales, que desordenarapara hacerlo enfrentarse al héroe de la 
aventura simulando los combates. Todo el registro de batalla irá guardando en un  nuevo archivo 

Como se invoca al programa ?
java Demonio bestia.txt <nombre_hero>

si no hay exactamente tres parametros el programa emitirá un error juto con la auyda y se detendra 
Vamos a utilizar POO , colleciones y líne de comados.

¿Que estructutura tendrá el archivo de bestia?
<nombre_enemigo> <vida-maxima> <puntos_de_ataque>

¿Como funciona el programa?
Si los arguemtos son correctos:
1 se carga el conteido del archivo de enemigos a una colleciuon apropiada 
[INFO] Cargando 3 monstruos del bestiario 

2 Se mostrara el mensaje de batalla 
[INFO]¡Comienza la batalla el torneo para heroe (Vida: 100, Ataque: 15)!

3. Acontinuacion, la aplicacion irá enfrentando en batallas por ronda a cada enemigo con el héroe.
--Ronda 1 ---
Heroe se enfrenta a Goblin 
Heroe ataca a goblin y le quita 15 de vida .Goblin se queda con 5 .
Goblin ataca al heroe y le quita 5 de vida. Heroe se queda con 95.
Heroe ataca a goblin y le quita 15 de vida ¡Gobli a muerto!

Reglas de ataque 
1. Hereoe siempre ataca primero 
2. El daño inflingido por el heroe oscilara entre 1 y el ataque maximo de enemigo 
3. Ataca el enemigo
4. El daño inflingido oscile entre 0 y el maximo ataque del enemigo 
5. Evaluar la vida tanto del heroe como del enemigo 
    a. Si el héroe esta muerto se acaba la partida 
    b. Si el heroe esta vivo tambien repetimos todo lo anterior
    c. Si el heroe esta vivo el enemigo . gana el héroe y pasamos a la siguiente ronda donde atacamos al siguiente monstuo 

6. Se registra toda la evolucion de la ronda en el archivo de salida 
Hacer en casa 
1. Crea una clase llamada personaje con atributos nombres , vida y ataque
2. Crear metodos 
    a. estaVivo decuelve si el enemigo tiene puntos de vida o no 
    b. atacar (DEJAR CUERPO DEL METODO VACIO)