package com.analisisservidores;

import com.analisisservidores.dao.ServidorDao;
import com.analisisservidores.modelo.Servidor;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ServidorDao dao = new ServidorDao();

        Servidor s1 = new Servidor(0, "Servidor Principal", "192.168.1.10", "Linux", "Activo");
        dao.insertar(s1);

        Servidor s2 = new Servidor(0, "Servidor Respaldo", "192.168.1.11", "Windows Server", "En mantenimiento");
        dao.insertar(s2);

        System.out.println("\n📋 Lista de servidores:");
        List<Servidor> lista = dao.listar();
        for (Servidor s : lista) {
            System.out.println(s.getId() + " - " + s.getNombre() + " - " + s.getIp() + " - " + s.getSistemaOperativo() + " - " + s.getEstado());
        }

        if (!lista.isEmpty()) {
            Servidor primero = lista.get(0);
            primero.setEstado("Inactivo");
            dao.actualizar(primero);
        }

        if (lista.size() > 1) {
            dao.eliminar(lista.get(1).getId());
        }

        System.out.println("\n📋 Lista actualizada de servidores:");
        lista = dao.listar();
        for (Servidor s : lista) {
            System.out.println(s.getId() + " - " + s.getNombre() + " - " + s.getIp() + " - " + s.getSistemaOperativo() + " - " + s.getEstado());
        }
    }
}
