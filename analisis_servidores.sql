CREATE DATABASE IF NOT EXISTS analisis_servidores;
USE analisis_servidores;

CREATE TABLE servidores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    ip VARCHAR(50) NOT NULL,
    sistema_operativo VARCHAR(100),
    estado VARCHAR(50)
);


INSERT INTO servidores (nombre, ip, sistema_operativo, estado) VALUES
('Servidor Principal', '192.168.1.10', 'Linux Ubuntu 22.04', 'Activo'),
('Servidor Respaldo', '192.168.1.11', 'Windows Server 2019', 'En mantenimiento'),
('Servidor de Pruebas', '192.168.1.12', 'Debian 11', 'Inactivo'),
('Servidor Web', '192.168.1.20', 'CentOS 8', 'Activo'),
('Servidor Base de Datos', '192.168.1.30', 'MySQL 8.0 en Linux', 'Activo'),
('Servidor de Correo', '192.168.1.40', 'Red Hat Enterprise Linux 9', 'Activo'),
('Servidor de Aplicaciones', '192.168.1.50', 'Windows Server 2022', 'En mantenimiento'),
('Servidor de Seguridad', '192.168.1.60', 'Linux Kali', 'Inactivo');
