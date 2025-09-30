package com.analisisservidores.modelo;

public class Servidor {
    private int id;
    private String nombre;
    private String ip;
    private String sistemaOperativo;
    private String estado;

    public Servidor() {}

    public Servidor(int id, String nombre, String ip, String sistemaOperativo, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.ip = ip;
        this.sistemaOperativo = sistemaOperativo;
        this.estado = estado;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }

    public String getSistemaOperativo() { return sistemaOperativo; }
    public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
