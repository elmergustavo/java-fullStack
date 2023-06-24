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


## Categorías de Tipos en Java

En Java, los tipos se pueden clasificar en las siguientes categorías:

1. **Tipos primitivos:**
   - `boolean`: representa un valor booleano (`true` o `false`).
   - `byte`: representa un número entero de 8 bits.
   - `short`: representa un número entero de 16 bits.
   - `int`: representa un número entero de 32 bits.
   - `long`: representa un número entero de 64 bits.
   - `float`: representa un número de punto flotante de 32 bits.
   - `double`: representa un número de punto flotante de 64 bits.
   - `char`: representa un carácter Unicode de 16 bits.

2. **Clases Wrapper:**
   - `Boolean`: wrapper para `boolean`.
   - `Byte`: wrapper para `byte`.
   - `Short`: wrapper para `short`.
   - `Integer`: wrapper para `int`.
   - `Long`: wrapper para `long`.
   - `Float`: wrapper para `float`.
   - `Double`: wrapper para `double`.
   - `Character`: wrapper para `char`.

3. **Tipos de referencia:**
   - `String`: representa una secuencia de caracteres.
   - `Object`: es la clase base de todas las clases en Java.
   - `Array`: representa un arreglo de elementos.
   - `Class`: representa la información de una clase en tiempo de ejecución.
   - `Interface`: representa una interfaz.

4. **Tipos enumerados (Enums):** Son un tipo especial de clase que representa un conjunto fijo de constantes.

Además de estas categorías, Java también ofrece otras estructuras y tipos de datos para almacenar y manipular colecciones de elementos, como `List`, `Set`, `Map`, entre otros. Estos tipos están definidos en el paquete `java.util`.

Es importante tener en cuenta que Java es un lenguaje de tipado estático, lo que significa que los tipos de las variables deben ser declarados explícitamente antes de usarlas. Cada variable tiene un tipo específico y solo puede almacenar valores compatibles con ese tipo.



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

## Reglas para Definir Nombres de Variables en Java

Aquí tienes algunas reglas para definir nombres de variables en Java:

1. Los nombres de variables en Java son sensibles a mayúsculas y minúsculas, lo que significa que `miVariable` y `mivariable` se considerarán como dos variables diferentes.

2. Los nombres de variables deben comenzar con una letra, un guion bajo (`_`) o un símbolo de dólar (`$`). No pueden comenzar con un número.

3. Después del primer carácter, los nombres de variables pueden contener letras, dígitos, guiones bajos y símbolos de dólar.

4. Los nombres de variables no pueden ser palabras reservadas de Java, como `int`, `boolean`, `if`, `for`, entre otras. Puedes encontrar una lista completa de palabras reservadas en la documentación oficial de Java.

5. Es una buena práctica utilizar nombres descriptivos para las variables, que indiquen su propósito o contenido. Por ejemplo, en lugar de usar nombres como `a`, `x` o `temp`, es preferible utilizar nombres como `edad`, `nombreUsuario` o `totalVentas`.

6. Se recomienda seguir una convención de nomenclatura llamada CamelCase, donde la primera letra de la variable comienza en minúscula y las primeras letras de las palabras subsiguientes se capitalizan. Por ejemplo: `nombreUsuario`, `totalVentas`, `saldoCuenta`.

7. Evita utilizar nombres de variables demasiado largos y complicados, ya que esto puede dificultar la legibilidad del código. Busca un equilibrio entre nombres descriptivos y concisos.

Recuerda seguir estas convenciones al nombrar tus variables en Java para mantener un código legible y comprensible.

## Convenciones de Nomenclatura para Clases y Métodos en Java

A continuación, se presentan las convenciones de nomenclatura recomendadas para clases y métodos en Java:

### Clases

- Los nombres de las clases deben comenzar con una letra mayúscula y seguir el estilo CamelCase.
- Utiliza nombres descriptivos que reflejen el propósito y la responsabilidad de la clase.
- Evita nombres de clases demasiado genéricos o ambiguos.

Ejemplo: 
```java
public class MiClase {
    // código de la clase
}
```


### Métodos

- Los nombres de los métodos deben comenzar con una letra minúscula y seguir el estilo camelCase.
- Utiliza nombres descriptivos que indiquen la acción realizada por el método.
- Los nombres de los métodos deben ser verbos o frases verbales.

```java
public void calcularPromedio() {
    // código del método
}
```

### Métodos de Acceso (Getters y Setters)

- Los métodos de acceso deben seguir la convención de los métodos normales.
- Utiliza el prefijo "get" para los métodos que devuelven el valor de una propiedad.
- Utiliza el prefijo "set" para los métodos que establecen el valor de una propiedad.

```java
public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}
```

Recuerda seguir estas convenciones de nomenclatura al escribir tus clases y métodos en Java para mantener un código consistente y legible.


# Tipos de Datos Numéricos en Java

En Java, existen varios tipos de datos numéricos que se utilizan para representar diferentes rangos y precisiones de valores numéricos. A continuación, se presentan algunos ejemplos de estos tipos de datos numéricos:

- `byte`: Representa números enteros de 8 bits con signo. Su rango va desde -128 hasta 127.

```java
byte myByte = 10;
```
- `short`: Representa números enteros de 16 bits con signo. Su rango va desde -32,768 hasta 32,767.
```java
short myShort = 1000;
```

- `int`: Representa números enteros de 32 bits con signo. Es el tipo de dato numérico más común en Java. Su rango va desde -2,147,483,648 hasta 2,147,483,647.
```java
int myInt = 100000;
```

- `long`: Representa números enteros de 64 bits con signo. Debes agregar una "L" al final del valor para indicar que es un tipo long. Su rango va desde -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807.
```java
long myLong = 10000000000L;
```

- `float`: Representa números de punto flotante de 32 bits. Debes agregar una "f" o "F" al final del valor para indicar que es un tipo float.
```java
float myFloat = 3.14f;
```

- `double`: Representa números de punto flotante de 64 bits. Es el tipo de dato numérico decimal más común en Java. No es necesario agregar nada al final del valor para indicar que es un tipo double.
```java
double myDouble = 3.14159;

```

Estos son solo algunos ejemplos de los tipos de datos numéricos en Java. Puedes utilizar estos tipos de datos para almacenar y manipular diferentes valores numéricos en tus programas Java.


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
# Tipos de Datos en Java

En Java, además de los tipos de datos numéricos, existen otros tipos de datos que se utilizan para diferentes propósitos. A continuación se presentan algunos de estos tipos de datos:

- `boolean`: Representa un valor de verdad, que puede ser `true` (verdadero) o `false` (falso). Se utiliza principalmente en estructuras de control condicionales.

- `char`: Representa un solo carácter Unicode. Se declara utilizando comillas simples (' '). Por ejemplo, `char myChar = 'A';`.

- `String`: Representa una secuencia de caracteres. Aunque técnicamente no es un tipo de dato primitivo, se utiliza ampliamente en Java para representar texto y se trata de manera especial en el lenguaje.

- Arreglo (`array`): Representa una colección de elementos del mismo tipo. Permite almacenar múltiples valores en una única variable. Se declara utilizando corchetes []. Por ejemplo, `int[] myArray = {1, 2, 3};`.

- Enumerado (`enum`): Representa un conjunto de constantes predefinidas. Se utiliza para definir un conjunto de valores permitidos para una variable. Por ejemplo, `enum Day {MONDAY, TUESDAY, WEDNESDAY};`.


# Palabra reservada `var` en Java

la palabra reservada var se introdujo en la versión 10 del lenguaje y se utiliza para declarar variables con inferencia de tipos. Con `var`, el tipo de dato de la variable se infiere automáticamente a partir del valor que se le asigna en el momento de la declaración.

Algunas consideraciones sobre el uso de `var` en Java:

- **Inferencia de tipos**: Al utilizar `var`, el compilador deduce automáticamente el tipo de dato de la variable basándose en el valor asignado.

- **Uso local**: `var` solo se puede utilizar para declarar variables locales dentro de métodos o bloques de código.

- **Tipo estático**: Aunque el tipo de dato se infiere automáticamente, la variable sigue siendo fuertemente tipada.

- **Inicialización requerida**: Es obligatorio inicializar la variable al momento de la declaración.

Aquí tienes un ejemplo de cómo se utiliza `var` en Java:

```java
var message = "Hola, mundo!"; // El tipo de dato de 'message' se infiere como String
var number = 10; // El tipo de dato de 'number' se infiere como int
var pi = 3.14; // El tipo de dato de 'pi' se infiere como double

System.out.println(message);
System.out.println(number);
System.out.println(pi);
```



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

## Comentarios en Java

En Java, los comentarios se utilizan para agregar notas o explicaciones en el código fuente. Los comentarios no se ejecutan como parte del programa y son ignorados por el compilador. Son útiles para hacer el código más legible y comprensible para otros programadores o para tu futuro yo.

Java admite tres tipos de comentarios:

- **Comentarios de una línea**: Estos comentarios se utilizan para agregar notas breves en una sola línea.
```java
// Esto es un comentario de una línea
int x = 5; // También se pueden agregar comentarios después del código en la misma línea
```

- **Comentarios de múltiples líneas**: Estos comentarios se utilizan para agregar notas o explicaciones más extensas que abarcan varias líneas.
```java
/*
Este es un comentario
de múltiples líneas.
Puedo escribir aquí varias líneas de texto
sin afectar el código.
*/
```

- **Comentarios de documentación**: Estos comentarios se utilizan para generar documentación automática utilizando la herramienta Javadoc. Los comentarios de documentación siguen una estructura específica y se utilizan para describir clases, métodos, parámetros y valores de retorno.
```java
/**
 * Esta clase representa un objeto de tipo Persona.
 * Contiene atributos y métodos relacionados con una persona.
 */
public class Persona {
    /**
     * Este método devuelve el nombre de la persona.
     * @return El nombre de la persona.
     */
    public String getNombre() {
        // ...
    }
}
```

Los comentarios son una buena práctica de programación y te ayudan a mantener tu código organizado y comprensible. Utilízalos para explicar la lógica detrás de tu código, documentar decisiones importantes o proporcionar instrucciones a otros programadores que puedan trabajar en el mismo código en el futuro.

---

## Operadores Aritméticos:
```java
int a = 10;
int b = 5;

int suma = a + b; // suma = 15
int resta = a - b; // resta = 5
int multiplicacion = a * b; // multiplicacion = 50
int division = a / b; // division = 2
int modulo = a % b; // modulo = 0

## Operadores de Asignación:
```java
int x = 10;

x += 5; // equivalente a x = x + 5;
x -= 3; // equivalente a x = x - 3;
x *= 2; // equivalente a x = x * 2;
x /= 4; // equivalente a x = x / 4;
x %= 3; // equivalente a x = x % 3;
```

## Operadores de Comparación:
```java
int a = 10;
int b = 5;

boolean igual = (a == b); // false
boolean diferente = (a != b); // true
boolean mayor = (a > b); // true
boolean menor = (a < b); // false
boolean mayorIgual = (a >= b); // true
boolean menorIgual = (a <= b); // false
```

## Operadores de Incremento y Decremento:
```java
int x = 5;

x++; // incremento en 1, x = 6
x--; // decremento en 1, x = 5

int y = 10;
int z = ++y; // incremento antes de asignar, z = 11, y = 11

int w = 10;
int v = w++; // incremento después de asignar, v = 10, w = 11
```

## Operadores Lógicos:
```java
boolean a = true;
boolean b = false;

boolean and = (a && b); // false
boolean or = (a || b); // true
boolean not = !a; // false
```

# Operaciones matemáticas con la clase Math en Java

En Java, puedes realizar operaciones matemáticas comunes utilizando la clase `Math`. Esta clase proporciona métodos estáticos para realizar cálculos matemáticos sin tener que implementar las operaciones desde cero.

## Ejemplos de uso

Aquí tienes algunos ejemplos de cómo utilizar la clase `Math` en Java:

### Operaciones básicas:

```java
double x = 4.3;
double y = 2.5;

double max = Math.max(x, y); // Obtiene el valor máximo entre x e y (max = 4.3)
double min = Math.min(x, y); // Obtiene el valor mínimo entre x e y (min = 2.5)
double abs = Math.abs(-5.6); // Obtiene el valor absoluto de -5.6 (abs = 5.6)
double sqrt = Math.sqrt(25); // Obtiene la raíz cuadrada de 25 (sqrt = 5.0)
```
### Funciones trigonométricas:
```java
double angle = 45.0;
double radians = Math.toRadians(angle); // Convierte el ángulo a radianes
double sin = Math.sin(radians); // Calcula el seno del ángulo (sin = 0.7071)
double cos = Math.cos(radians); // Calcula el coseno del ángulo (cos = 0.7071)
double tan = Math.tan(radians); // Calcula la tangente del ángulo (tan = 1.0)

```

### Funciones exponenciales y logarítmicas:
```java
double power = Math.pow(2, 3); // Calcula 2 elevado a la potencia de 3 (power = 8.0)
double exp = Math.exp(1.0); // Calcula el exponencial de 1.0 (exp = 2.7183)
double log = Math.log(10.0); // Calcula el logaritmo natural de 10.0 (log = 2.3026)
double log10 = Math.log10(100.0); // Calcula el logaritmo base 10 de 100.0 (log10 = 2.0)

```

### Generación de números aleatorios:
```java
double random = Math.random(); // Genera un número aleatorio entre 0.0 y 1.0
int randomInt = (int) (Math.random() * 10); // Genera un número aleatorio entre 0 y 9

```

Estos son solo algunos ejemplos de cómo puedes utilizar el operador Math en Java. La clase Math proporciona muchos más métodos para realizar operaciones matemáticas más complejas. Puedes consultar la documentación oficial de Java para obtener más información sobre los métodos disponibles en la clase `Math`.

## Casting en Java

### Casting de ampliación (upcasting):
```java
int x = 5;
double y = x; // Casting implícito de int a double (upcasting)
System.out.println(y); // Resultado: 5.0
```

### Casting de reducción (downcasting):
```java
double x = 3.14;
int y = (int) x; // Casting explícito de double a int (downcasting)
System.out.println(y); // Resultado: 3 (parte decimal truncada)
```

### Casting entre tipos numéricos:
```java
int a = 10;
byte b = (byte) a; // Casting explícito de int a byte
System.out.println(b); // Resultado: 10 (sin pérdida de información)

double c = 3.75;
int d = (int) c; // Casting explícito de double a int
System.out.println(d); // Resultado: 3 (parte decimal truncada)

long e = 2147483643534547l;
int f = (int) e; // Casting explícito de long a int
System.out.println(f); // Resultado: -4465453 (pérdida de información, fuera del rango de int)
```
### Casting con tipos de datos booleanos:
```java
int x = 1;
boolean y = (x != 0); // Casting implícito de int a boolean
System.out.println(y); // Resultado: true

boolean z = true;
int w = (z) ? 1 : 0; // Casting implícito de boolean a int
System.out.println(w); // Resultado: 1

```
