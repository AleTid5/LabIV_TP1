# LabIV_TP1
###### Ejercicio
· Todas las clases pertenecientes a este ejercicio se crearán dentro del paquete llamado **Ejercicio1**

· Crear una clase Empleado con las siguientes propiedades:
```java
int id;
String nombre;
int edad;
```

· Aplicar el concepto de **encapsulación** dentro de la clase Empleado

· El Id del Empleado debe ser generado automáticamente a partir de la clase, el primer ID será el número **1000** e irá incrementando en 1 por cada nuevo empleado agregado. El ID del empleado deberá ser generado en el constructor de la clase. Una vez que se le asigne un ID del Empleado, este no podrá ser modificado, por lo que el ID debe ser una **variable constante** *(usar final para crear la constante)* Ejemplo: A continuación, creamos un empleado y como verán no asignamos su ID, este ID se deberá crear de manera interna a través del constructor.
```java
Empleado x = new Empleado();
x.setNombre("Jose");
x.setEdad(30);
System.out.println(x.toString());
// Output: "Empleado Jose, edad: 30, legajo: 1000";
```

· La clase tendrá dos constructores:
- El primer constructor será vacío y cargará por defecto *Nombre:* **"Sin nombre"** - *Edad:* **99**.
- El segundo constructor recibirá como parámetros el *Nombre* y la *edad* para ser asignados

· Crear un método estático que devuelva el próximo ID a ser generado: **int devuelveProximoID()**. Por ejemplo, si el último ID fue el número 1444, el método devolverá el siguiente cartel 'El próximo ID será el 1445'.

· Sobreescribir el método **toString()** dentro de la clase Empleado.

· Crear una clase llamada **Principal** y dentro de ésta crear el *main()*:
En el main se deberán crear **5 empleados** y mostrar su información correspondiente utilizando el método toString(). Algunos empleados crearlos con el constructor vacio y otros con el constructor con parámetros. También deberán mostrar la información que devuelve el método devuelveProximoId().
