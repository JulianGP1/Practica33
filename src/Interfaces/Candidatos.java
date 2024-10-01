package Interfaces;

public class Candidatos {
    int num;
     String nombre;
     int voto ;
    public Candidatos(int num,String nombre,int voto) {
        this.nombre = nombre;
        this.voto = voto;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }
}
