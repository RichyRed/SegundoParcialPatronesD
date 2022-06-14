package ej3Observer;

public class Client {
    public static void main(String[] args){
        PaginaWeb paginaWeb = new PaginaWeb();
        paginaWeb.attach(new UserPagina("Publicaciones e imagenes ", new Persona("1111", "Steve")));
        paginaWeb.attach(new UserPagina("Publicaciones e imagenes ", new Persona("2222", "Clint")));
        paginaWeb.attach(new UserPagina("Publicaciones e imagenes ", new Persona("3333", "Natasha")));
        paginaWeb.attach(new UserPagina("Publicaciones e imagenes ", new Persona("4444", "Tony")));
        paginaWeb.attach(new UserPagina("Publicaciones e imagenes ", new Persona("5555", "Bruce")));

        paginaWeb.noti(new Notificaciones("Nuevo videooooo",
                " 7 imagenes"));
    }
}
