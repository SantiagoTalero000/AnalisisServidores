package com.analisisservidores.dao;

import com.analisisservidores.modelo.Servidor;
import com.analisisservidores.util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServidorDao {

    public void insertar(Servidor servidor) {
        String sql = "INSERT INTO servidores (nombre, ip, sistema_operativo, estado) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, servidor.getNombre());
            stmt.setString(2, servidor.getIp());
            stmt.setString(3, servidor.getSistemaOperativo());
            stmt.setString(4, servidor.getEstado());
            stmt.executeUpdate();

            System.out.println("✅ Servidor insertado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Servidor> listar() {
        List<Servidor> servidores = new ArrayList<>();
        String sql = "SELECT * FROM servidores";
        try (Connection conn = ConexionBD.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Servidor servidor = new Servidor(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("ip"),
                        rs.getString("sistema_operativo"),
                        rs.getString("estado")
                );
                servidores.add(servidor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return servidores;
    }

    public void actualizar(Servidor servidor) {
        String sql = "UPDATE servidores SET nombre=?, ip=?, sistema_operativo=?, estado=? WHERE id=?";
        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, servidor.getNombre());
            stmt.setString(2, servidor.getIp());
            stmt.setString(3, servidor.getSistemaOperativo());
            stmt.setString(4, servidor.getEstado());
            stmt.setInt(5, servidor.getId());
            stmt.executeUpdate();

            System.out.println("✅ Servidor actualizado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM servidores WHERE id=?";
        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("🗑️ Servidor eliminado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
