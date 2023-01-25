![](https://github.com/elmergustavo/Curso-java-youtube/blob/master/assets/portada.png)
<div align='center'>
  <img height="100" src="https://www.vectorlogo.zone/logos/java/java-icon.svg">

  <i>De cero a experto</i>

  <sup>Deja tu :star: si te gusta el proyecto.</sup>
  <div align='center' style="display: flex; flex-wrap: wrap; justify-content: center; align-items: flex-start; column-gap: 20px;">
  <a margin='0 0.8rem' style="margin: 0 0.8rem; outline: none;" href="https://twitter.com/elmergustavo79" target="_blank"><img src="./assets/social-media/twitter.svg" alt="lolesuncrak" width="30"  /></a>
  <a margin='0 0.8rem' style="margin: 0 0.8rem; outline: none;" href="https://www.linkedin.com/in/elmer-gustavo-p%C3%BA-769b60201/" target="blank"><img src="./assets/social-media/linkedin.svg" alt="Elmer Gustavo Pú" width="30" /></a>
  <a margin='0 0.8rem' style="margin: 0 0.8rem; outline: none;" href='mailto:elmergustavo79@gmail.com' target='_blank'><img src="./assets/social-media/gmail.svg" width="30" alt="Elmer Gustavo Pú" /></a>
  <a margin='0 0.8rem' style="margin: 0 0.8rem; outline: none;" href='https://www.facebook.com/elmer.gustavo.79/' target='_blank'><img src='./assets/social-media/facebook.svg' alt='Elmer Gustavo Pú' width='30'/></a>
  <a margin='0 0.8rem' style="margin: 0 0.8rem; outline: none;" href="https://discord.gg/4FtdXrVzeS" target="_blank" ><img src="./assets/social-media/discord.svg" alt="discord" width='30'></a>
</div>
</div>


---

#### Puedes apoyar mi trabajo haciendo "☆ Star" en el repo o nominarme a "GitHub Star". ¡Gracias!

[![GitHub Star](https://img.shields.io/badge/GitHub-Nominar_a_star-yellow?style=for-the-badge&logo=github&logoColor=white&labelColor=101010)](https://stars.github.com/nominate/)

Si quieres unirte a nuestra comunidad de desarrollo, aprender programación de Apps, mejorar tus habilidades y ayudar a la continuidad del proyecto, puedes encontrarnos en:

[![YouTube Channel Subscribers](https://img.shields.io/youtube/channel/subscribers/UCzoC8FXE62AInx6V4bxrxBQ?style=social)](https://youtube.com/@tavcode?sub_confirmation=1)
[![Twitch Status](https://img.shields.io/twitch/status/mouredev?style=social)](https://twitch.com/gustavo_dev_)
[![Discord](https://img.shields.io/discord/750600400717086812?style=social&label=Discord&logo=discord)](https://discord.gg/2Qnhu8cQaD)
[![Twitter Follow](https://img.shields.io/twitter/follow/gustavo_dev_?style=social)](https://twitter.com/gustavo_dev_)
![GitHub Followers](https://img.shields.io/github/followers/elmergustavo?style=social)
![GitHub Followers](https://img.shields.io/github/stars/elmergustavo?style=social)

## Índice

- [Índice](#índice)
  - [Introducción](#Introducción)
    - [Instalar IntelliJ IDEA](#Instalar-IntelliJ-IDEA)
    - [Variables](#variable)
    - [Tipos de datos numéricos](#)
    

---

### Introducción

#### Instalar IntelliJ IDEA

- [Instalar IntelliJ IDEA](https://www.youtube.com/watch?v=aoW2gsmYBHQ&t=10s)

**[⬆ Volver a índice](#índice)**

---

#### Variable

- Una variable es un espacio de memoria (RAM) que contiene un dato de tipo numérico, booleano, de texto u otros tipos de datos un poco más complejos.

- Las variables en Java se componen de un nombre único y un valor que puede cambiar a lo largo de la ejecución del programa. Al declarar las variables debemos definir el tipo de dato que vamos a usar y un punto y coma al final:

```java
// Variables.java

public class Variables {
  public static void main(String[] args) {
    // Declarar la variable edad de tipo int (números enteros)
    int edad;

    // Actualizar el contenido de la variable edad:
    edad = 10; // si ya habías declarado la variable

    // Declarar una variable y asignarle un valor al mismo tiempo:
    int salario = 1000;

    // Crear una variable de tipo String:
    String nombre = "Gustavo";
  }
}
```

- Java nos permite actualizar nuestras variables reutilizando los valores que tenían anteriormente, de esta forma evitamos errores o inconsistencias en nuestro código:

```java
public class Example {
  public static void main(String[] args) {
    // Actualizar datos numéricos:
    int salario = 1000;
    salario = salario + 200;
    System.out.println(salario); // 1200

    salario += 300;
    System.out.println(salario); // 1500

    // Actualizar variables de tipo String:
    String nombre = "Santiago";
    nombre = nombre + " Castillo";
    System.out.println(nombre); // Santiago Castillo

    nombre += " De León";
    System.out.println(nombre); // Santiago Castillo De León

    nombre = "Alex" + nombre;
    System.out.println(nombre); // Alex Santiago Castillo De León
  }
}

```

## Convención de Nombres en Java
Una convención de nombres es un patrón que deben seguir los nombres de las variables para que el código esté organizado, entendible y sin repetidos.

Java es sensible a mayúsculas y minúsculas, este punto es clave al seguir una convención.

Las variables siempre deben comenzar con un simbolo de letra, `$` o `_`.

No puedes usar el simbolo `-` en ninguna parte de la variable.

Las variables constantes son variables cuyo valor nunca va a cambiar, por lo que se deben escribir completamente en mayúsculas y usando el caracter `_`.

## Técnica de Naming: Camel Case

Camel Case es una convención muy popular para nombrar nuestras variables. Podemos usarlo en modo Upper Camel Case o Lower Camel Case, la diferencia es si comenzamos el nombre de la variable con mayúscula o minúscula.

```java
// Upper Camel Case:
class SoyUnaClase {};

// Lower Camel Case
int soyUnNumeroInt = 10;
```

🐫Debemos usar Upper Camel Case en los nombres de las clases y archivos. Y Lower Camel Case en los nombres de las variables o métodos.
🐍Snake Case: para constantes

## Tipos de datos numéricos

Tipos de datos para números enteros (sin decimales):

* byte: Ocupa 1 byte de memoria y su rango es de -128 hasta 127.
* short: Ocupa 2 bytes de memoria y su rango es de -32,768 hasta 32,727.
int: Ocupa 4 bytes de memoria y su rango es de -2,147,483,648 hasta 2,147,483,647. Es muy cómodo de usar, ya que no es tan pequeño para que no quepan nuestros números ni tan grande como para desperdiciar mucha memoria. Puede almacenar hasta 10 dígitos.
* long: Ocupa 8 bytes de memoria y su rango es de -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807. Para diferenciarlo de un tipo de dato long debemos terminar el número con la letra L.
* Por ejemplo:
```java
// Int:
int n = 1234567890;

// Long:
long nL = 123456789012345L;
```

Tipos de datos para números flotantes (con decimales):

* float: Ocupan 4 bytes de memoria y su rango es de 1.40129846432481707e-45 hasta 3.40282346638528860e+38. Así como long, debemos colocar una letra F al final.
* double: Ocupan 8 bytes de memoria y su rango es de 4.94065645841246544e-324d hasta 1.79769313486231570e+308d.
* Por ejemplo:

```java
// Double:
double nD = 123.456123456;

// Float
float nF = 123.456F;
```


```java
public class Main {
    public static void main(String[] args) {

        //byte, short, int, long
        System.out.println("bits tipo byte:" + Byte.SIZE);
        System.out.println("bytes tipo byte:" + Byte.BYTES);
        System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);

        System.out.println();

        System.out.println("bits tipo short:" + Short.SIZE);
        System.out.println("bytes tipo short:" + Short.BYTES);
        System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);

        System.out.println();

        System.out.println("bits tipo int:" + Integer.SIZE);
        System.out.println("bytes tipo int:" + Integer.BYTES);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);

        System.out.println();

        System.out.println("bits tipo long:" + Long.SIZE);
        System.out.println("bytes tipo long:" + Long.BYTES);
        System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);

        System.out.println();

        System.out.println("bits tipo float:" + Float.SIZE);
        System.out.println("bytes tipo float:" + Float.BYTES);
        System.out.println("valor minimo tipo float:" + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float:" + Float.MAX_VALUE);

        System.out.println();

        System.out.println("bits tipo Double:" + Double.SIZE);
        System.out.println("bytes tipo Double:" + Double.BYTES);
        System.out.println("valor minimo tipo Double:" + Double.MIN_VALUE);
        System.out.println("valor maximo tipo Double:" + Double.MAX_VALUE);

        System.out.println();

        System.out.println("bits tipo char:" + Character.SIZE);
        System.out.println("bytes tipo char:" + Character.BYTES);
    }
}

```

## Tipos de datos char y boolean

* `char`: Ocupa 2 bytes y solo puede almacenar 1 dígito, debemos usar comillas simples en vez de comillas dobles.
* `boolean`: Son un tipo de dato lógico, solo aceptan los valores true y false. También ocupa 2 bytes y almacena únicamente 1 dígito.

Seguro te diste cuenta que siempre debemos escribir el tipo de dato de nuestras variables antes de definir su nombre y valor. Pero esto cambia a partir de Java 10: solo debemos escribir la palabra reservada var y Java definirá el tipo de dato de nuestras variables automáticamente:

```java
var salary = 1000; // INT
var pension = salary * 0.03; // DOUBLE
var totalSalary = salary - pension; // DOUBLE
```

Recuerda que esto solo funciona con versiones superiores a Java 10.



| Tipo de dato  | Bits | bytes | Rango |
| ------------- | ---- | ----- | ----- |
| `byte`  | 8 | 1 | -128 hasta 127
| `short`   | 16 | 2 | -32768 hasta 32767
| `int` | 32 | 4 | -2147483648 hasta 2147483647 |
| `long` | 64 | 8 | -9223372036854775808 hasta 9223372036854775807 |
| `float` | 32 | 4 | 1.4E-45 hasta 3.4028235E38 |
| `double` | 64 | 8 | 4.9E-324 hasta 1.7976931348623157E308 |
| `char` | 16 | 2 | solo puede almacenar 1 dígito o un carácter |
| `boolean` | 16 | 2 | Son un tipo de dato lógico, solo aceptan los valores `true` o `false` |

**[⬆ Volver a índice](#índice)**

---

## Operadores de asignación:
* `+=`: a += b es equivalente a `a = a + b`.
* `-=`: a -= b es equivalente a `a = a - b`.
* `*=`: a *= b es equivalente a `a = a * b`.
* `/=`: a /= b es equivalente a `a = a / b`.
* `%=`: a %= b es equivalente a `a = a % b`.

## Operadores de incremento:

* `++`: i++ es equivalente a `i = i + 1`.
* `--`: i-- es equivalente a `i = i - 1`.

Podemos usar estos operadores de forma prefija (++i) o postfija (i++). La diferencia está en qué operación se ejecuta primero:

```java
// Incremento postfijo:
int vidas = 5;
int regalo = 100 + vidas++;

System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
// Regalo: 105, vidas: 6

// Incremento prefijo:
int vidas = 5;
int regalo = 100 + ++vidas;

System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
// Regalo: 106, vidas: 6
```

## Operaciones matemáticas

`Math` es una clase de Java que nos ayuda a ejecutar diferentes operaciones matemáticas:

```java
Math.PI // 3.141592653589793
Math.E // 2.718281828459045

Math.ceil(2.1) // 3.0 (redondear hacia arriba)
Math.floar(2.1) // 2.0 (redondear hacia abajo)

Math.pow(2, 3) // 8.0 (número elevado a una potencia)
Math.sqrt(3) // 1.73... (raíz cuadrada)

Math.max(2, 3) // 3.0 (el número más grande)

// Área de un círculo (PI * r^2):
Math.PI * Math.pow(r, 2)

// Área de una esfera (4 * PI * r^2):
4 * Math.PI * Math.pow(r, 2)

// Volumen de una esfera ( (4/3) * PI * r^3):
(4/3) * Math.PI * Math.pow(r, 3)
```

### Ejemplo

```java
public class MathematicOperations {
    public static void main(String[] args) {
        //Valores enteros
        int a = 5;
        int b = 10;

        //Valores con decimales
        double i = 2.1;
        double j = 3.5;

        //Redondea hacia arriba
        System.out.println(Math.ceil(i));

        //Redondea hacia abajo
        System.out.println(Math.floor(j));

        //Devuelve el valor mayor
        System.out.println(Math.max(a,b));

        //Imprime un numero elevado a otro
        System.out.println(Math.pow(a,b));

        //Devuelve el valor absoluto de un argumento dado
        System.out.println(Math.abs(j));

        //Devuelve la suma de sus argumentos
        System.out.println(Math.addExact(a,b));

        //Devuelve la tangente del arco de un angulo (-pi/2 y pi/2)
        System.out.println(Math.atan(j));

        //Devuelve la raiz cubica de un valor double
        System.out.println(Math.cbrt(i));

        //Devuvleve el coseno hiperbolico de un valor double
        System.out.println(Math.cosh(j));

        //Devuelve el coseno trigonometrico de un angulo
        System.out.println(Math.cos(j));

        //Devuelve el numero elevado a la potencia de un valor double
        System.out.println(Math.exp(i));
    }
}
```

### otro ejemplo

```java 
import java.util.Scanner;


public class JavaOperadores1 {
    public static void main(String[] args) {
        //Permite ingresar datos por teclado
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros");
        
        var num1 = s.nextInt();
        var num2 = s.nextInt();
        var num3 = s.nextInt();
        var num4 = s.nextInt();
        var num5 = s.nextInt();

        //Esto lo logre luego de buscar un buen rato.
        //Math.max y Math.min devuelve un valor entre dos numeros, por lo tanto se hace una comparacion en secuencia
        var max = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5);
        var min = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5);

        //Devuelve el numero mayor
        System.out.println("El numero maximo es: " + max);
        //Devuelve el numero menor
        System.out.println("El numero minimo es: " + min);

        //La raiz del num3

        System.out.println("La raiz cuadrada de " + num3 + " es " + Math.sqrt(num3));

        //La potencia del num1 con el numero 5
        System.out.println("La potencia del " + num1 + " con el " + num5 + " es " + Math.pow(num1, num5));

    }
}
```

## Cast en variables: Estimación y Exactitud
En la programación hay situaciones donde necesitamos cambiar el tipo de dato de nuestras variables, esto lo conocemos como Cast.

Estimación:

```java
double monthlyDogs = dogsQuantity / 12.0;
// monthlyDogs: 2.5 (pero no es posible, ¡no rescatamos medio perrito!)

int estimatedMonthlyDogs = (int) monthlyDogs;
// estimatedMonthlyDogs: 2

// Recuerda que el casteo no redondea, solo quita los decimales:
Math.sqrt(3) // 1.7320508075688772
(int) Math.sqrt(3) // 1
```

Exactitud:

```java
int a = 30;
int b = 12;

a / b // 2
(double) a / b // 2.5
```

## Casteo entre tipos de datos

Java nos ayuda a realizar casteo automático de los tipos de datos más chicos a otros más grandes.

Sin embargo, en algunos casos vamos a necesitar realizar un cast manualmente, así como aprendimos en la clase anterior `((dataType) variableOperación)`.

Por ejemplo: supongamos que declaramos dos variables `a` y `b` de tipo `int` y una variable `c` de tipo `double` que es igual a la división de las primeras dos variables.

En este caso, aunque definimos que el tipo de dato de `c` es `double`, Java automáticamente convertirá el resultado de la división a tipo `int`, ya que este es el tipo de datos de las dos variables que dividimos, pero seguirá respetando que la variable `c` es de tipo `double` y añadirá un decimal al final `(.0)`.

Esto significa que muchas de nuestras operaciones pueden verse afectadas. Por ejemplo:


```java
int a = 30;
int b = 12;

double c = a / b;
System.out.println(c); // 2.0 (??)
```

En este caso, ya que Java convierte nuestras variables automáticamente, debemos indicarle a nuestra variable c (de tipo double) que debe hacer cast de su valor para que Java no altere los valores de las variables y el resultado de la operación sea correcto:

```java
int a = 30;
int b = 12;

double c = (double) a / b;
System.out.println(c); // 2.5
```

Es decir, como `a` y `b` son de tipo `int`, el resultado de una operación entre ambas variables será de tipo `int`, por lo que no tendrá decimales, pero si guardamos el resultado de esta división en una variable de tipo `double` añadiremos un `.0`.

Esto podemos solucionarlo si indicamos que además de que la variable `c` es de tipo `double`, el valor de esta variable también debe ser de tipo `double`. Esto significa que Java ejecutará la división entre `a` y `b` como si fueran de tipo `double`, por lo que tendrán decimales a pesar de haber sido definidas inicialmente como números enteros.





