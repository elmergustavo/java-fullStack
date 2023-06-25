# Estructuras de Control en Java

Este repositorio contiene ejemplos de estructuras de control en Java, incluyendo condicionales (if-else, switch), bucles (for, while, do-while) y otras estructuras de control adicionales.

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


