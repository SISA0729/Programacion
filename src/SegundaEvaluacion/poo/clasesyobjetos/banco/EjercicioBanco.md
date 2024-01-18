# Banco

Crea un paquete banco y dentro de él:
1. Crea una clase Cuenta, con tres atributos:
   1. 	código, de tipo String
   2. 	balance, de tipo float
   3. propietario, de tipo Usuario
2. Crea una clase Usuario, con tres atributos:
   1. 	login, de tipo String
   2. 	nombre, de tipo String
   3. 	apellidos, de tipo String
   
Ambas clases tienen constructores parametrizados,  los getters y setters correspondientes a cada atributo y un método toString().
3. Crea una clase Main con un método  main dentro del cual debes crear:
   1. 	Una instancia de la clase Usuario llamada propietario ((login: “demo”, nombre: “Ale”, apellidos “Chim Pom”)
   2. 	Una instancia de la clase Cuenta (“123456”, 1000, propietario).
         ii. 	Un método estático mostrarCuenta, que recibe una cuenta y muestra toda la información de la cuenta.
