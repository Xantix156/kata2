# Kata 2 - Entrada, salida y carga de datos

## Objetivo

Practicar la lectura de datos mediante `InputStream`, la transformación de filas TSV en objetos `Employee` y la escritura mediante `OutputStream`, separando lectura, modelo y salida.

La aplicación lee empleados desde una URL y desde `employees.tsv`. Muestra los primeros por consola y guarda los del fichero local en `employees-output.txt`.

## Requisitos

- JDK 25.
- Maven para compilar desde terminal, o IntelliJ IDEA con soporte Maven.
- Conexión a Internet para leer el dataset desde GitHub.
- Sin bibliotecas externas: se utiliza la API estándar de Java.

## Estructura del proyecto

- `Employee` y `Gender`: modelo del empleado, con nombre y género.
- `EmployeeReader`: puerto de lectura que devuelve una lista de empleados.
- `FileEmployeeReader`: adaptador de lectura desde fichero mediante `FileInputStream`.
- `UrlEmployeeReader`: adaptador de lectura mediante `URL.openStream()`.
- `EmployeeWriter`: escribe empleados en el `OutputStream` recibido.
- `Main`: conecta los lectores con la consola y el fichero de salida.

Ambos lectores omiten la cabecera y extraen las columnas de nombre y género, separadas por tabuladores. Un género vacío se representa con `null`.

## Compilación y ejecución

### Desde IntelliJ IDEA

1. Abrir `pom.xml` como proyecto Maven y configurar el JDK 25.
2. Usar la raíz del proyecto como directorio de trabajo, donde está `employees.tsv`.
3. Ejecutar `Main.java` sin argumentos.

### Desde terminal

Con Java 25 y Maven disponibles, ejecutar desde la raíz:

```bash
mvn clean compile
java -cp target/classes software.ulpgc.katas.Main
```

El fichero `employees-output.txt` se crea o sobrescribe en el directorio de trabajo.

## Verificación

Al ejecutar, comprobar que aparecen los empleados de la URL por consola y que los del dataset local se escriben en `employees-output.txt`. Con el dataset incluido se esperan 25 empleados.

Ejemplo de salida:

```text
Employee[name=Jitesh, gender=Male]
Employee[name=Sanjit, gender=Male]
```

## Repeticiones y Git

El trabajo se ha realizado en `develop`, `develop2` y `develop3`, repitiendo la implementación con entrada local y remota y salida a consola y fichero. Los commits permiten seguir la creación del modelo, los lectores y el escritor. La rama `develop3` corresponde a la repetición preparada para el vídeo.

## Vídeo explicativo

https://drive.google.com/file/d/1pJ-HtWAhNv-RA3MAyi3onQeiA88TudIj/view?usp=drive_link