# ProyectoRedes
Proyecto Redes BY Antonio

El Readme de este repositorio tendrá una descripción del software que se debe instalar
para ejecutar el proyecto y los pasos detallados. 

# Título del Proyecto
Creacion de un servidor FTP para conexion de N Clientes para transferencia de archivos


# Empezando

Estas instrucciones le proporcionarán una copia del proyecto en funcionamiento en su máquina local para fines de desarrollo y prueba. Consulte la implementación para obtener notas sobre cómo implementar el proyecto en un sistema en vivo.

# Prerrequisitos
Qué cosas necesita para instalar el software y cómo instalarlas

Necesito:
-Gestor de Base de datos
-IDE de desarrollo
-uso de conector de mysql 

Como instalarlos?
Tanto El ID como el gestor de bases de datos se descargan de la web solo es cuestion de instalar,
para poder gestionar el programa se tiene que descargar java el cual se usa para la creacion del programa,
El conector mysql  se usa para la conexion a la BD, se descargan de la web y  los sockets  la cual nos permiten la transferencia de archivos


# Instalando
Una serie de ejemplos paso a paso que le indican cómo ejecutar un entorno de desarrollo

Vaya a la página de descargas de NetBeans IDE.
En la parte superior derecha de la página, seleccione el idioma y la plataforma en la lista desplegable. También puede optar por descargar y utilizar el archivo zip independiente de la plataforma.
Haga clic en el botón Download (Descargar) de la opción de descarga que desee instalar.
Guarde el archivo del instalador en el sistema.


Java

Ve a la pagina de Java
Opcion descargar java
DEscargar e instalar

MySql

Lo primero que tendremos que hacer por supuesto, es instalar la herramienta principal,
 el motor de bases de datos y también vamos a provechar para instalar el cliente para la gestión 
de las bases de datos. Para descargarlo tendremos que dirigirnos a su sitio web oficial,
 y en su página principal, pulsamos sobre “MySQL Comunnity Server”.

En cualquier caso, tendremos que dirigirnos a la zona inferior de la nueva página y
 seleccionar la plataforma en la que deseamos instar MySQL. Por supuesto, será en Windows.
 Luego, tendremos que pulsar sobre la opción principal de “MySQL Installer for Windows”

Conector mysql
Se dirige a la página oficial de mysql, y pueda buscar en la sección de conectores, la versión que se adapte a sus necesidades, para este proyecto de utilizó la 5.1

Otra opción: En el presente proyecto, en la siguiente ruta \\ProyectoRedes\Server\dist\lib
podemos encontrar el conector que se utilizó para el presente proyecto.



# Ejecutando las pruebas
Se menciona cómo ejecutar las pruebas automatizadas para este sistema.

Registrar Clientes
Autenticación de Clientes
Transferencia de archivos
Conexión Cliente-Servidor

# Desglosar en pruebas de extremo a extremo
Se explica qué prueban estas pruebas y por qué.

Prueban  que se pueda registrar "n" cliente para que puedan acceder a el servidor.
Prueban que se pueda autenticar un cliente en el sistema y que no entren personas que no estén autenticadas
Prueba que se  pueda transferir un archivo desde un lugar a otro

# Construido con
Java: Se utulizó como Lenguaje de Programación
Mysql: Se utilizpo como Gestor de Base de datos
Git: Se utulizó como controlador de versiones y tareas
IDE: Se usó como entorno de desarrollo
conector mysq: Se utilizó para establecer la comunicación entre java y el gestor de la base de datos

# Versionado
Version jdk:8
Version Mysql: 8.0
Version IDE: 8.2
Version conectorMsql 5.1

# Autores
Jahanel Rivera Barboza
Karolina Montenegro Guzmán

# Licencia
Este proyecto no está licenciado bajo alguna  Licencia

# Expresiones de gratitud
A guide to java sockets cuyo código ha sido utilizado: https://www.baeldung.com/a-guide-to-java-sockets
Conectarse a un ftp con java cuyo código se ha utilizado : http://lineadecodigo.com/java/conectarse-a-un-ftp-con-java/

etc.
