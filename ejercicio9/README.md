#Ejercicio 9

1.- Crear una clase llamada Serializador que deberá:
- Pedir los datos de una persona por consola. Debe guardar correspondencia con los atributos de la clase Persona que hicimos en ejercicios anteriores.
- Llenar una instancia de Persona con los atributos capturados de consola.
- Serializar el objeto en disco en un archivo llamado Persona.byte
- Recuperar el objeto del disco y mostrar su contenido por consola.

IMPORTANTE: La clase Persona debe implementar la interfaz java.io.Serializable!!

2.- Modificar los métodos utilizados para serializar y deserializar (apartado anterior) para que ahora escriban y lean utilizando el método Files.write de la API NIO. Puede valerse de las clases ByteArrayInputStream y ByteArrayOutputStream.

NOTA: Esta opción no tiene mucho sentido realmente, es sólo para practicar la API NIO
