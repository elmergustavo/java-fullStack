## Índice

- [Índice](#índice)
  - [Introducción](#Introducción)
    - [Instalar IntelliJ IDEA](#Instalar-IntelliJ-IDEA)
    - [Variables](#variable)
    - [Tipos de datos numéricos](#)
    

# Estructuras de Control en Java

En Java, las estructuras de control son bloques de código que permiten controlar el flujo de ejecución de un programa. Estas estructuras permiten tomar decisiones y repetir bloques de código según sea necesario

Este repositorio contiene ejemplos de código en Java relacionados con los diferentes flujos de control disponibles en el lenguaje. Los flujos de control son estructuras que permiten tomar decisiones y repetir acciones en función de ciertas condiciones. Los flujos de control disponibles en Java incluyen:

1. **Estructura "if-else":** Permite ejecutar un bloque de código si se cumple una condición, y otro bloque de código si no se cumple. Se pueden utilizar operadores lógicos y de comparación para definir las condiciones.

2. **Estructura "switch":** Permite evaluar diferentes casos y ejecutar un bloque de código correspondiente al caso que coincide con una expresión. Es una alternativa a la estructura "if-else" cuando se tienen múltiples condiciones.

3. **Estructura "while":** Permite repetir un bloque de código mientras se cumpla una condición especificada. La condición se verifica antes de cada iteración.

4. **Estructura "do-while":** Similar a la estructura "while", pero la condición se verifica después de cada iteración. Esto garantiza que el bloque de código se ejecute al menos una vez, incluso si la condición inicialmente es falsa.

5. **Estructura "for":** Permite ejecutar un bloque de código un número específico de veces. Se utiliza para iterar sobre un rango de valores, como elementos de una lista o índices de un arreglo.



## Condicionales

### if-else

La estructura de control if-else permite ejecutar un bloque de código si se cumple una condición y otro bloque de código si la condición no se cumple.

Ejemplo:
```java
if (condicion) {
    // Código a ejecutar si la condición es verdadera
} else {
    // Código a ejecutar si la condición es falsa
}
```

### Ejemplos:

```java
import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        
        scanner.close();
    }
}

```

```java
int edad = 25;

if (edad < 18) {
    System.out.println("Eres menor de edad");
} else if (edad >= 18 && edad <= 65) {
    System.out.println("Eres adulto");
} else {
    System.out.println("Eres mayor de edad");
}

```

```java
import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu género (Hombre/Mujer): ");
        String genero = scanner.nextLine();
        
        if (genero.equalsIgnoreCase("Hombre")) {
            System.out.println("Bienvenido");
        } else if (genero.equalsIgnoreCase("Mujer")) {
            System.out.println("Bienvenida");
        } else {
            System.out.println("Género no reconocido");
        }
        
        scanner.close();
    }
}

```


```java
import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("¿Tienes un título universitario? (Sí/No): ");
        String titulo = scanner.nextLine();
        
        System.out.print("¿Tienes experiencia laboral? (Sí/No): ");
        String experiencia = scanner.nextLine();
        
        if (edad >= 22 && titulo.equalsIgnoreCase("Sí") && experiencia.equalsIgnoreCase("Sí")) {
            System.out.println("Eres elegible para este empleo de nivel avanzado");
        } else if (edad >= 18 && titulo.equalsIgnoreCase("Sí")) {
            System.out.println("Eres elegible para este empleo de nivel intermedio");
        } else {
            System.out.println("No eres elegible para este empleo");
        }
        
        scanner.close();
    }
}

```


```java
import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número del 1 al 7: ");
        int numero = scanner.nextInt();
        
        if (numero >= 1 && numero <= 7) {
            if (numero == 1) {
                System.out.println("Lunes");
            } else if (numero == 2) {
                System.out.println("Martes");
            } else if (numero == 3) {
                System.out.println("Miércoles");
            } else if (numero == 4) {
                System.out.println("Jueves");
            } else if (numero == 5) {
                System.out.println("Viernes");
            } else if (numero == 6) {
                System.out.println("Sábado");
            } else {
                System.out.println("Domingo");
            }
        } else {
            System.out.println("Número inválido. Debe estar entre 1 y 7");
        }
        
        scanner.close();
    }
}


```


#### 1. `Ejercicio de adivinar un número`: Escribe un programa que genere un número aleatorio entre 1 y 100. Luego, solicita al usuario que adivine el número generado. Utilizando la estructura condicional if-else, muestra un mensaje indicando si el número ingresado por el usuario es mayor o menor que el número generado, y continúa solicitando al usuario que adivine hasta que lo haga correctamente.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroIngresado;

        System.out.println("Adivina el número generado (entre 1 y 100)");

        do {
            System.out.print("Ingresa un número: ");
            numeroIngresado = scanner.nextInt();
            intentos++;

            if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número generado.");
            } else if (numeroIngresado > numeroAleatorio) {
                System.out.println("El número ingresado es mayor que el número generado.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            }
        } while (numeroIngresado != numeroAleatorio);

        scanner.close();
    }
}
```

En este programa, se genera un número aleatorio utilizando la clase `Random` y se almacena en la variable numeroAleatorio. Luego, se solicita al usuario que adivine el número y se utiliza un bucle do-while para continuar solicitando el número hasta que se adivine correctamente.

Dentro del bucle, se compara el número ingresado por el usuario con el número aleatorio utilizando la estructura condicional if-else. Se muestra un mensaje indicando si el número es mayor o menor que el número generado. Si el número ingresado es igual al número generado, se muestra un mensaje de felicitaciones y se termina el bucle.

El programa también lleva un contador de intentos para mostrar cuántos intentos tomó al usuario adivinar el número.

</details>

---


#### 2. `Ejercicio de determinar el día de la semana:` Escribe un programa que solicite al usuario ingresar un número del 1 al 7 que represente un día de la semana. Utilizando la estructura condicional if-else, muestra el nombre del día correspondiente (por ejemplo, 1 para "Lunes", 2 para "Martes", etc.).

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        if (numero == 1) {
            System.out.println("Lunes");
        } else if (numero == 2) {
            System.out.println("Martes");
        } else if (numero == 3) {
            System.out.println("Miércoles");
        } else if (numero == 4) {
            System.out.println("Jueves");
        } else if (numero == 5) {
            System.out.println("Viernes");
        } else if (numero == 6) {
            System.out.println("Sábado");
        } else if (numero == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número inválido");
        }

        scanner.close();
    }
}
```
</details>

---

#### 3. `Ejercicio de cálculo de descuento`: Escribe un programa que solicite al usuario ingresar el precio de un producto. Si el precio supera los $100, aplica un descuento del 10% y muestra el precio final; de lo contrario, muestra el precio sin descuento.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class Descuento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        if (precio > 100) {
            double descuento = precio * 0.1;
            double precioFinal = precio - descuento;
            System.out.println("Precio con descuento: $" + precioFinal);
        } else {
            System.out.println("Precio sin descuento: $" + precio);
        }

        scanner.close();
    }
}

```
</details>

---

#### 4. `Ejercicio de verificación de un triángulo`: Escribe un programa que solicite al usuario ingresar las longitudes de tres lados de un triángulo. Utilizando la estructura condicional if-else, verifica si es posible formar un triángulo con esas longitudes y muestra un mensaje correspondiente.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class VerificarTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Se puede formar un triángulo con esas longitudes");
        } else {
            System.out.println("No se puede formar un triángulo con esas longitudes");
        }

        scanner.close();
    }
}

```
</details>

---


#### 5. `Ejercicio de conversión de temperaturas`: Escribe un programa que solicite al usuario ingresar una temperatura en grados Celsius. Utilizando la estructura condicional if-else, convierte la temperatura a grados Fahrenheit si es mayor o igual a 0, o a grados Kelvin si es menor a 0, y muestra el resultado.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class ConversionTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        if (celsius >= 0) {
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("Temperatura en grados Fahrenheit: " + fahrenheit);
        } else {
            double kelvin = celsius + 273.15;
            System.out.println("Temperatura en grados Kelvin: " + kelvin);
        }

        scanner.close();
    }
}

```
</details>

---

# Ejercicios de Estructuras de Control en Java

Este repositorio contiene una serie de ejercicios prácticos para practicar y reforzar los conceptos de estructuras de control en Java. Cada ejercicio se enfoca en un aspecto específico de las estructuras de control y tiene como objetivo mejorar tus habilidades de programación en Java.


## Ejercicio 1: Estructuras de control anidadas

**Descripción**: Este ejercicio solicita al usuario que ingrese su edad y género. Utilizando estructuras de control anidadas, el programa verifica si la edad ingresada es mayor o igual a 18 y luego verifica el género para mostrar un mensaje de bienvenida adecuado.

**Objetivo**: Practicar el uso de estructuras de control anidadas y tomar decisiones basadas en múltiples condiciones.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class EstructurasAnidadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su género (M/F): ");
        char genero = scanner.next().charAt(0);

        if (edad >= 18) {
            if (genero == 'M') {
                System.out.println("Bienvenido, caballero");
            } else {
                System.out.println("Bienvenida, señorita");
            }
        } else {
            System.out.println("Lo siento, eres menor de edad");
        }
    }
}

```
</details>

---


## Ejercicio 2: Estructuras de control avanzadas

**Descripción**: En este ejercicio, se solicita al usuario que ingrese la cantidad de números que desea ingresar. Luego, se utiliza un bucle "enhanced" for para permitir que el usuario ingrese los números uno por uno. Finalmente, se muestra en pantalla la lista de números ingresados.

**Objetivo**: Practicar el uso del bucle "enhanced" for y la interacción con el usuario para ingresar datos.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

```
</details>

---

## Ejercicio 3: Uso de operadores lógicos

**Descripción**: En este ejercicio, se pide al usuario que ingrese su edad y si es estudiante o no. Utilizando operadores lógicos (AND, OR, NOT), el programa evalúa diferentes condiciones y muestra mensajes en función de las respuestas ingresadas.

**Objetivo**: Practicar el uso de operadores lógicos en combinación con las estructuras de control para evaluar múltiples condiciones.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("¿Es estudiante? (S/N): ");
        char respuesta = scanner.next().charAt(0);
        boolean esEstudiante = respuesta == 'S' || respuesta == 's';

        if (edad >= 18 && esEstudiante) {
            System.out.println("Eres mayor de edad y eres estudiante");
        }

        if (edad < 18 || esEstudiante) {
            System.out.println("Eres menor de edad o eres estudiante");
        }

        if (!esEstudiante) {
            System.out.println("No eres estudiante");
        }
    }
}

```
</details>

---

## Ejercicio 4: Manejo de excepciones

**Descripción**: En este ejercicio, se solicita al usuario que ingrese un numerador y un denominador. El programa intenta realizar la división y muestra el resultado. Sin embargo, si el denominador es cero, se captura la excepción "ArithmeticException" y se muestra un mensaje de error en su lugar.

**Objetivo**: Practicar el manejo de excepciones y cómo utilizar la estructura try-catch para evitar que el programa se detenga abruptamente por errores.


<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numerador: ");
        int numerador = scanner.nextInt();

        System.out.print("Ingrese el denominador: ");
        int denominador = scanner.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }
    }
}

```
</details>

---

Estos ejercicios están diseñados para ayudarte a practicar diferentes aspectos de las estructuras de control en Java, como la anidación de estructuras, el uso de bucles, la evaluación de condiciones y el manejo de excepciones. Espero que te sean útiles para fortalecer tus habilidades de programación en Java.

¡Diviértete aprendiendo y mejorando tus habilidades de programación! 😎


Este es un breve tutorial que te introduce a la estructura de control switch en el lenguaje de programación Java. El switch es una forma eficiente de evaluar múltiples casos y ejecutar bloques de código según los resultados.

**[⬆ Volver a índice](#índice)**

## ¿Qué es el switch?

El switch es una estructura de control que te permite realizar diferentes acciones según el valor de una expresión o variable. Puedes considerarlo como una serie de comparaciones que dirigen el flujo de ejecución hacia diferentes bloques de código.

## Sintaxis básica

```java
switch (expresion) {
    case valor1:
        // Bloque de código para valor1
        break;
    case valor2:
        // Bloque de código para valor2
        break;
    ...
    default:
        // Bloque de código por defecto
}
```
- La expresión es evaluada y su resultado se compara con los casos definidos.
- Cada caso representa un valor o conjunto de valores que se comparan con la expresión.
- Si hay coincidencia entre la expresión y un caso, se ejecuta el bloque de código correspondiente.
- La palabra clave `break` se utiliza para salir del switch después de ejecutar el bloque de código correspondiente.
- El bloque `default` se ejecuta si no hay coincidencia con ninguno de los casos anteriores.

```java
String mes = "Enero";

switch (mes) {
    case "Enero":
        System.out.println("Es el primer mes del año");
        break;
    case "Febrero":
        System.out.println("Es el segundo mes del año");
        break;
    case "Marzo":
        System.out.println("Es el tercer mes del año");
        break;
    default:
        System.out.println("Mes desconocido");
}
```

## Ejercicios:

#### 1. `Ejercicio de días de la semana`: Escribe un programa que solicite al usuario un número del 1 al 7 y muestre el día de la semana correspondiente.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        String diaSemana;
        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número inválido";
        }
        System.out.println("El día de la semana correspondiente es: " + diaSemana);
    }
}

```
</details>

---

#### 2. **Ejercicio de categorías de edad:**: Crea un programa que pida al usuario ingresar su edad y muestre un mensaje indicando en qué categoría de edad se encuentra (por ejemplo, "niño", "adolescente", "adulto").

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class CategoriasEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        String categoria;
        switch (edad) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                categoria = "Niño";
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                categoria = "Adolescente";
                break;
            default:
                categoria = "Adulto";
        }
        System.out.println("Usted se encuentra en la categoría: " + categoria);
    }
}

```
</details>

---


#### 3. **Ejercicio de conversión de unidades:**: Desarrolla un programa que convierta una temperatura ingresada por el usuario en grados Celsius a una escala seleccionada (por ejemplo, Celsius a Fahrenheit o Celsius a Kelvin). Utiliza una estructura de control switch para manejar las diferentes opciones de conversión.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Elige la opción de conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("%.2f grados Celsius equivalen a %.2f grados Fahrenheit.", celsius, fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.printf("%.2f grados Celsius equivalen a %.2f grados Kelvin.", celsius, kelvin);
                break;
            default:
                System.out.println("Opción inválida. Por favor, selecciona 1 o 2.");
        }

        scanner.close();
    }
}

```
</details>

---

**[⬆ Volver a índice](#índice)**

# Ciclo `while` en Java

El ciclo `while` es una estructura de control en Java que permite repetir un bloque de código mientras se cumpla una condición específica. En cada iteración del ciclo, se evalúa la condición y si es verdadera, se ejecuta el bloque de código. Si la condición es falsa, se sale del ciclo y se continúa con la ejecución del programa.

## Sintaxis

La sintaxis básica del ciclo `while` es la siguiente:

```java
while (condicion) {
    // Bloque de código a repetir
}
```

La condicion es una expresión booleana que se evalúa antes de cada iteración. Si la condición es true, el bloque de código se ejecuta. Si la condición es false, se sale del ciclo.

Es importante tener en cuenta que si la condición inicialmente es false, el bloque de código no se ejecutará nunca.

### Contador ascendente:
Este código imprimirá los números del 1 al 10 en orden ascendente.

```java
int contador = 1;
while (contador <= 10) {
    System.out.println(contador);
    contador++;
}

```
### Contador descendente:
Este código imprimirá los números del 10 al 1 en orden descendente.

```java
int contador = 10;
while (contador >= 1) {
    System.out.println(contador);
    contador--;
}

```

### Suma de números
Este código calcula la suma de los números del 1 al 10 utilizando el ciclo `while`.
```java
int numero = 1;
int suma = 0;
while (numero <= 10) {
    suma += numero;
    numero++;
}
System.out.println("La suma de los números del 1 al 10 es: " + suma);

```
### Lectura de entrada hasta que se ingrese un valor específico:
Este código calcula la suma de los números del 1 al 10 utilizando el ciclo `while`.
```java
Scanner scanner = new Scanner(System.in);
String input = "";
while (!input.equalsIgnoreCase("salir")) {
    System.out.print("Ingresa un valor (escribe 'salir' para terminar): ");
    input = scanner.nextLine();
    System.out.println("Ingresaste: " + input);
}
scanner.close();

```

Este código solicita al usuario ingresar valores y muestra cada valor ingresado. El ciclo `while` continúa hasta que se ingresa la palabra "salir".

Recuerda que la condición en el ciclo while debe ser evaluada cuidadosamente para evitar bucles infinitos. Asegúrate de que la condición eventualmente se vuelva falsa para que el ciclo se detenga.


## Bucle Do-While

El bucle do-while es una estructura de control utilizada en muchos lenguajes de programación. A diferencia del bucle while tradicional, el bucle do-while garantiza que se ejecute al menos una vez, ya que la condición se evalúa al final del bucle.

## Sintaxis

La sintaxis general del bucle do-while es la siguiente:

```java
do {
  // Código a ejecutar
} while (condición);
```

### ejemplo

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int contador = 1;

        do {
            System.out.println("El valor del contador es: " + contador);
            contador++;
        } while (contador <= 5);
    }
}
```

En este ejemplo, el bucle "do-while" imprimirá el valor del contador mientras sea menor o igual a 5. La condición se verifica al final del bucle, lo que significa que el bucle se ejecutará al menos una vez antes de comprobar la condición.

---

En este ejemplo, el programa solicita al usuario que ingrese números hasta que se ingrese el número 0 para salir. Luego, calcula la suma de los números ingresados utilizando el bucle "do-while".

```java
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        int suma = 0;
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingresa un número (ingresa 0 para salir): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}


```


## Ejercicios ciclo  `while`

#### 1. **Validación de contraseña**: Escribe un programa que solicite al usuario ingresar una contraseña y valide que cumpla con ciertos criterios, como tener al menos 8 caracteres, incluir letras mayúsculas, minúsculas y números.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean contraseñaValida = false;

        while (!contraseñaValida) {
            System.out.print("Ingresa una contraseña: ");
            String contraseña = scanner.nextLine();

            if (contraseña.length() >= 8 && contraseña.matches(".*[A-Z].*") && contraseña.matches(".*[a-z].*") && contraseña.matches(".*\\d.*")) {
                System.out.println("Contraseña válida");
                contraseñaValida = true;
            } else {
                System.out.println("La contraseña no cumple los requisitos. Intenta nuevamente.");
            }
        }

        scanner.close();
    }
}

```
</details>

---

#### 2. **Calculadora avanzada**: Crea una calculadora que realice operaciones matemáticas avanzadas, como potenciación, raíz cuadrada y logaritmo. Permite al usuario elegir la operación y solicita los valores de entrada.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class CalculadoraAvanzada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (!salir) {
            System.out.println("Calculadora Avanzada");
            System.out.println("1. Potenciación");
            System.out.println("2. Raíz cuadrada");
            System.out.println("3. Logaritmo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa el exponente: ");
                    double exponente = scanner.nextDouble();
                    double resultadoPotencia = Math.pow(base, exponente);
                    System.out.println("El resultado de la potencia es: " + resultadoPotencia);
                    break;
                case 2:
                    System.out.print("Ingresa un número: ");
                    double numeroRaiz = scanner.nextDouble();
                    double resultadoRaiz = Math.sqrt(numeroRaiz);
                    System.out.println("El resultado de la raíz cuadrada es: " + resultadoRaiz);
                    break;
                case 3:
                    System.out.print("Ingresa un número: ");
                    double numeroLogaritmo = scanner.nextDouble();
                    double resultadoLogaritmo = Math.log(numeroLogaritmo);
                    System.out.println("El resultado del logaritmo es: " + resultadoLogaritmo);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    break;
            }
        }

        scanner.close();
    }
}

```
</details>

---

#### 3. **Generación de contraseñas aleatorias**: Escribe un programa que genere contraseñas aleatorias de cierta longitud y complejidad. Permite al usuario elegir la longitud y los tipos de caracteres permitidos (letras mayúsculas, minúsculas, números y caracteres especiales).

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;
import java.util.Random;

public class GeneracionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa la longitud de la contraseña: ");
        int longitud = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Elige los tipos de caracteres permitidos:");
        System.out.println("1. Letras mayúsculas");
        System.out.println("2. Letras minúsculas");
        System.out.println("3. Números");
        System.out.println("4. Caracteres especiales");
        System.out.println("5. Todos los anteriores");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        String caracteresPermitidos = "";

        switch (opcion) {
            case 1:
                caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                break;
            case 2:
                caracteresPermitidos = "abcdefghijklmnopqrstuvwxyz";
                break;
            case 3:
                caracteresPermitidos = "0123456789";
                break;
            case 4:
                caracteresPermitidos = "!@#$%^&*()";
                break;
            case 5:
                caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
                break;
            default:
                System.out.println("Opción inválida. Se generará una contraseña con letras mayúsculas y números.");
                caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                break;
        }

        String contraseñaGenerada = generarContraseña(longitud, caracteresPermitidos);
        System.out.println("Contraseña generada: " + contraseñaGenerada);

        scanner.close();
    }

    public static String generarContraseña(int longitud, String caracteresPermitidos) {
        Random random = new Random();
        StringBuilder contraseña = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteresPermitidos.length());
            contraseña.append(caracteresPermitidos.charAt(indice));
        }

        return contraseña.toString();
    }
}

```
</details>

---

#### 4. **Cálculo del factorial**:  Pide al usuario que ingrese un número y calcula su factorial utilizando un ciclo while. Asegúrate de manejar los casos de números negativos y cero.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El factorial solo se puede calcular para números no negativos.");
        } else {
            int factorial = 1;
            int contador = 1;

            while (contador <= numero) {
                factorial *= contador;
                contador++;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}

```
</details>

---

#### 5. **Juego de adivinar palabras**:  Crea un juego en el que el programa elige una palabra al azar de una lista predefinida y el usuario debe adivinarla ingresando letras. Lleva un registro de los intentos y muestra las letras correctas a medida que se adivinan.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] palabras = { "manzana", "pera", "banana", "naranja", "uva" };
        String palabraAleatoria = palabras[random.nextInt(palabras.length)];
        int intentos = 0;
        boolean adivinado = false;
        StringBuilder palabraAdivinada = new StringBuilder();

        for (int i = 0; i < palabraAleatoria.length(); i++) {
            palabraAdivinada.append("_");
        }

        System.out.println("¡Adivina la palabra!");

        while (!adivinado) {
            System.out.println("Palabra: " + palabraAdivinada);
            System.out.print("Ingresa una letra: ");
            char letra = scanner.nextLine().charAt(0);
            intentos++;

            for (int i = 0; i < palabraAleatoria.length(); i++) {
                if (palabraAleatoria.charAt(i) == letra) {
                    palabraAdivinada.setCharAt(i, letra);
                }
            }

            if (palabraAdivinada.toString().equals(palabraAleatoria)) {
                adivinado = true;
            }
        }

        System.out.println("¡Felicidades! Adivinaste la palabra '" + palabraAleatoria + "' en " + intentos + " intentos.");

        scanner.close();
    }
}


```
</details>

---

#### 6. **Ordenamiento de números**:  Solicita al usuario que ingrese una serie de números y luego ordénalos en forma ascendente utilizando el algoritmo de ordenamiento de burbuja.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class OrdenamientoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de elementos: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        boolean intercambio = true;

        while (intercambio) {
            intercambio = false;

            for (int i = 0; i < n - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;
                    intercambio = true;
                }
            }
        }

        System.out.println("Números ordenados:");

        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}

```
</details>

---

#### 7. **Conversión de números decimales a binarios**:  Pide al usuario que ingrese un número decimal y conviértelo a su representación binaria utilizando un ciclo while.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class ConversionDecimalBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número decimal: ");
        int numeroDecimal = scanner.nextInt();

        StringBuilder numeroBinario = new StringBuilder();

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;
            numeroBinario.insert(0, residuo);
            numeroDecimal /= 2;
        }

        System.out.println("El número en binario es: " + numeroBinario);

        scanner.close();
    }
}

```
</details>

---

#### 8. **Validación de entrada numérica**:  Escribe un programa que solicite al usuario que ingrese una serie de números y valide que sean enteros positivos. Continúa solicitando números hasta que se ingrese un número negativo.
<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class ValidacionEntradaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        boolean salir = false;

        while (!salir) {
            System.out.print("Ingresa un número entero positivo: ");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();

                if (numero >= 0) {
                    salir = true;
                    System.out.println("Número válido: " + numero);
                } else {
                    System.out.println("El número debe ser positivo. Intenta nuevamente.");
                }
            } else {
                System.out.println("Entrada inválida. Debe ser un número entero. Intenta nuevamente.");
                scanner.next(); // Consumir la entrada inválida
            }
        }

        scanner.close();
    }
}


```
</details>

---

#### 9. **Generación de un patrón de asteriscos**:   Solicita al usuario que ingrese un número y muestra un patrón de asteriscos en forma de triángulo, utilizando un ciclo while para generar cada línea.

<details><summary><b>Solución</b></summary>
    
```java
import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();

        int sumaDigitos = 0;

        while (numero > 0) {
            int digito = numero % 10;
            sumaDigitos += digito;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos es: " + sumaDigitos);

        scanner.close();
    }
}


```
</details>

---


