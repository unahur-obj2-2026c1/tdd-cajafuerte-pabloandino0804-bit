package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Integer codigo;
    private Integer limite = 0;
    private Boolean abierta = true;
    private Boolean bloqueado = false;

    public Boolean getEstado(){
        return abierta;
    }

    public void setEstado(Boolean estado){
        this.abierta = estado;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public void cerrar(Integer codigo){
        if (this.estaAbierto()){
            this.codigo = codigo;
            this.abierta = false;
        }
    }
    
    public void abrir(Integer codigoPuesto){
        if (this.codigoCorrecto(codigoPuesto)){
            this.abierta = true;
        }
        else if(this.bloqueado.equals(false)){
            this.limite +=1;
            if(limite == 3){
            this.bloqueado = true;
            }
        }
    }

    public Boolean estaAbierto(){
        return this.abierta.equals(true);
    }

    public Boolean codigoCorrecto(Integer unCodigo){
        return this.codigo.equals(unCodigo);
    }

    public Boolean estaCerrado(){
        return this.abierta.equals(false);
    }

    public Boolean noEstaBloqueado(){
        return this.bloqueado.equals(false);
    }

    public Boolean estaBloqueado(){
        return this.bloqueado.equals(true);
    }
}