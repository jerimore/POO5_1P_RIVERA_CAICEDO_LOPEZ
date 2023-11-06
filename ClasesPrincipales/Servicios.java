# Jeremy Rivera Moreira
public class Servicios{
private int numeroServicio;
private TipoServicio tipoServicio;
private String origen;
private String destino; //llegada en el diagrama
private String fecha;
private String hora;


public int getNumeroServicio(){
    return numeroServicio;
}
public TipoServicio getTipoServicio(){
    return tipoServicio;
} 
public String getOrigen(){
    return origen;
}
public String getDestino(){
    return destino;
}
public String getFecha(){
    return fecha;
}
public String getHora(){
    return hora;
}

public void setNumeroServicio(int numeroServicio){
    this.numeroServicio = numeroServicio;
}
public void setOrigen(String origen){
    this.origen = origen;
}
public void setDestino(String destino){
    this.destino = destino;
}
public void setFecha (String fecha){
    this.fecha = fecha;
}
public void setHora(String hora){
    this.hora = hora;
}
}