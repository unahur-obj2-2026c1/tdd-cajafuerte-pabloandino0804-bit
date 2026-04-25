package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Integer codigo;
    private Boolean abierta = true;

    public Boolean getEstado(){
        return this.abierta;
    }

    public void setEstado(Boolean estado){
        this.abierta = estado;
    }

    public Integer getCodigo(){
        return this.codigo;
    }

    public void cerrar(Integer codigo){
        this.codigo = codigo;
        this.abierta = false;
    }

    public Boolean estaCerrada(){
        return !this.abierta;
    }
    
    public void abrir(Integer codigoPuesto){
        if (this.codigo.equals(codigoPuesto)){
            this.abierta = true;
        }
    }

    public Boolean estaAbierta(){
        return this.abierta;
    }
}