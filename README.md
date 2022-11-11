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

[![YouTube Channel Subscribers](https://img.shields.io/youtube/channel/subscribers/UCzoC8FXE62AInx6V4bxrxBQ?style=social)](https://youtube.com/tavcode?sub_confirmation=1)
[![Twitch Status](https://img.shields.io/twitch/status/mouredev?style=social)](https://twitch.com/gustavo_dev_)
[![Discord](https://img.shields.io/discord/729672926432985098?style=social&label=Discord&logo=discord)](https://mouredev.com/discord)
[![Twitter Follow](https://img.shields.io/twitter/follow/gustavo_dev_?style=social)](https://twitter.com/gustavo_dev_)
![GitHub Followers](https://img.shields.io/github/followers/elmergustavo?style=social)
![GitHub Followers](https://img.shields.io/github/stars/elmergustavo?style=social)

## Índice

- [Índice](#índice)
  - [Introducción](#Introducción)
    - [Instalar IntelliJ IDEA](#Instalar-IntelliJ-IDEA)
    - [Variables](#variable)
    

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

**[⬆ Volver a índice](#índice)**

---
