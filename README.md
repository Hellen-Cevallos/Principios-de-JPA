Para manejar solicitudes GET en la ruta /api/productos/search y buscar productos por nombre utilizando el parámetro de consulta nombre, 
puedes utilizar el siguiente código en un controlador Spring Boot. El método findByNombre llama al servicio correspondiente para realizar la búsqueda:
![image](https://github.com/user-attachments/assets/bf43e871-56b8-4a0c-bb76-d36e4f45b365)
![image](https://github.com/user-attachments/assets/14b3f577-a643-4228-8bfd-a48b23a774c4)
 El código fuente de un controlador de productos en un proyecto de Java, utilizando Spring Boot para manejar las operaciones CRUD. El controlador ProductoController contiene varios métodos que mapean diferentes solicitudes HTTP a operaciones del servicio de productos. Estos métodos incluyen: findAll() para obtener todos los productos, findById() para obtener un producto por su ID, findByNombre() para buscar productos por nombre, findByPrecioBetween() para buscar productos dentro de un rango de precios, save() para guardar un nuevo producto y deleteById() para eliminar un producto por su ID. Cada método utiliza anotaciones como @GetMapping, @PostMapping, y @DeleteMapping para definir las rutas y los parámetros esperados de las solicitudes HTTP correspondientes.
 ![image](https://github.com/user-attachments/assets/2d8a887c-f563-484e-91db-af880442f59d) 
 ![image](https://github.com/user-attachments/assets/edd4923e-cbf0-4e66-9125-01b822927d88)

Model    Clase Producto.java
La clase `Producto` es una entidad JPA que se mapeará a una tabla en la base de datos, representando cada instancia una fila de dicha tabla con columnas correspondientes a los campos `id`, `nombre`, `descripcion` y `precio`. Utiliza las anotaciones `@Entity` para definir la clase como una entidad, `@Id` para marcar el campo `id` como la clave primaria, y `@GeneratedValue(strategy = GenerationType.IDENTITY)` para que el valor de `id` se genere automáticamente. Incluye un constructor predeterminado y otro con parámetros para inicializar los campos, así como métodos getters y setters para acceder y modificar los valores de estos campos.
![image](https://github.com/user-attachments/assets/0807ca34-7804-4046-91ca-ff8dce29b77d)
![image](https://github.com/user-attachments/assets/2f0e1090-e67d-46c8-acff-44c81ed6c817)
La interfaz `ProductoRepository` extiende `JpaRepository` para proporcionar operaciones CRUD automáticas para la entidad `Producto` con clave primaria de tipo `Long`, y está anotada con `@Repository` para que Spring la gestione como un bean de repositorio. Define dos métodos de consulta personalizados: `findByNombreContaining(String nombre)`, que busca productos cuyo nombre contenga la cadena especificada, y `findByPrecioBetween(Double preciomin, Double preciomax)`, que busca productos dentro de un rango de precios. Ambos métodos son implementados automáticamente por Spring Data JPA.
![image](https://github.com/user-attachments/assets/15bf02c1-f080-4a8d-852e-8b1667d318c4)
En service

En la clase LoadDataBase el código proporcionado define una clase de configuración en un proyecto Spring Boot que carga datos iniciales en la base de datos al arrancar la aplicación. La clase LoadDatabase, marcada con la anotación @Configuration, indica que se trata de una clase de configuración.
Dentro de esta clase, se declara el método initDatabase, que devuelve un CommandLineRunner. Esta interfaz de Spring Boot se ejecuta al iniciar la aplicación. El método está anotado con @Bean para que Spring lo registre como un bean en el contexto de la aplicación.
En initDatabase, se utiliza el ProductoRepository para almacenar varios objetos Producto en la base de datos. Se crean y guardan cinco productos con distintos nombres, descripciones y precios
![image](https://github.com/user-attachments/assets/83a74ec7-ba5e-4390-a3b8-af45dd459ff9)
configura una aplicación Spring Boot llamada jpa-tutorial que se ejecutará en el puerto 8080. Utiliza PostgreSQL como base de datos, con la URL de conexión jdbc:postgresql://localhost:5432/jpaBD, y las credenciales de usuario y contraseña (postgres y 123 respectivamente). Además, está configurado para mostrar SQL generado (spring.jpa.show-sql=true), generar DDL automáticamente según las entidades JPA (spring.jpa.generate-ddl=true), y actualizar automáticamente el esquema de la base de datos (spring.jpa.hibernate.ddl-auto=update).
![image](https://github.com/user-attachments/assets/14757220-693b-4297-8ea9-84a8e2500981)

Define una clase de prueba de unidad JpaTutorialApplicationTests en Java utilizando Spring Boot y JUnit 5. Está anotada con @SpringBootTest, lo que indica que se trata de una prueba de contexto de aplicación de Spring Boot. El método contextLoads() está anotado con @Test y se asegura de que el contexto de la aplicación se cargue correctamente sin errores al ejecutar la prueba. Este tipo de prueba es fundamental para verificar la inicialización adecuada de todas las configuraciones y componentes de la aplicación Spring Boot jpa-tutorial.
![image](https://github.com/user-attachments/assets/142cda9b-f870-4729-9e5f-4ccf032ea65e)










