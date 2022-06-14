package ej3Observer;

public class Notificaciones {
    private String publicacionesDeVideos;
    private String imagenes;


    public Notificaciones(String publicacionesDeVideos, String imagenes) {
        this.publicacionesDeVideos = publicacionesDeVideos;
        this.imagenes = imagenes;
    }

    public String getPublicacionesDeVideos() {
        return publicacionesDeVideos;
    }

    public void setPublicacionesDeVideos(String publicacionesDeVideos) {
        this.publicacionesDeVideos = publicacionesDeVideos;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public void showInfo(){
        System.out.println("**** Tiene una nueva notificacion shiuu ***** ");
        System.out.println("Publicaciones de videos: " + publicacionesDeVideos);
        System.out.println("Imagenes:" + imagenes);
        System.out.println();
    }
}
