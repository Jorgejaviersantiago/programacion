package Coleccion;

 
// 1 Crea una clase DISCO con los siguientes atributos privados: codigo (string), titulo, artista, genero, duración (int).
// 2 La clase debe incluir:
// - Constructor con parametros
// - Constructor vacio
// - Getters y setters necesarios
// - Método tostring que muestre información del disco

// Crea una clase COLECCIONDISCOS que gestione la colección de discos utilizando un ArrayList.
// La clase debe incluir:
// - Constructor que inicialice la colección a vacío.
// - Metodo para anadir disco
// - Metodo para mostrar todos los discos

// Crea clase principal MAIN para probar la aplicación mostrando un menú con tres opciones: añadir disco, mostrar disco y salir.


    public class Disco {
        
        private String codigo;
        private String titulo;
        private String artista;
        private String genero;
        private int duracion;
        
    

        public Disco(String codigo,String titulo,String artista,String genero,int numero){
            this.codigo = codigo ;
            this.titulo = titulo;
            this.artista = artista ;
            this.genero = genero ;
            this.duracion = numero;


        }

        public Disco(){

        }

        public String getCodigo() {
            return codigo;
        }


        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }


        public String getTitulo() {
            return titulo;
        }


        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }


        public String getArtista() {
            return artista;
        }


        public void setArtista(String artista) {
            this.artista = artista;
        }


        public String getGenero() {
            return genero;
        }


        public void setGenero(String genero) {
            this.genero = genero;
        }


        public int getDuracion() {
            return duracion;
        }


        public void setDuracion(int numero) {
            this.duracion = duracion;
        }

    }

