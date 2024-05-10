![header](./images/cover2.png)

# ScreenMatch

**ScreenMatch** es una aplicación Java simple que permite calcular la media de evaluaciones para una película, basándose en las evaluaciones ingresadas por el usuario.

## Requisitos

- Java JDK 21 o superior
- IDE de desarrollo Java (opcional)

## Instalación

Para comenzar a utilizar ScreenMatch, sigue estos pasos simples:

1. Clona este repositorio en tu máquina local utilizando el siguiente comando en tu terminal:

```bash
   git clone https://github.com/Jerick97/screen-math-inmersion-java.git
```

2. Abre tu entorno de desarrollo Java preferido (por ejemplo, IntelliJ IDEA, Eclipse, etc.).

3. Abre el proyecto ScreenMatch dentro de tu IDE y navega hasta el archivo Main.java.

4. Ejecuta el archivo Main.java para iniciar la aplicación.

## Uso

Para utilizar ScreenMatch, sigue estos pasos:

1. Ejecuta el archivo Main.java en tu entorno de desarrollo Java.
2. Sigue las instrucciones en la consola para seleccionar una opción del menú:
   - Ingresa **1** para registrar una nueva película.
   - Ingresa **2** para registrar una nueva serie.
   - Ingresa **9** para salir de la aplicación.
3. Sigue las indicaciones adicionales que aparezcan en la consola según la opción seleccionada.

## Estructura del Proyecto

El proyecto consta de un único archivo Java, Main.java, que contiene todo el código necesario para ejecutar la aplicación.

```

screen-match/
│
├── src/ # Directorio principal del código fuente
│ └── modelo/ #Contiene las clases relacionadas con el modelo de datos.
│      └── Titulo.java #Clase base que define las propiedades comunes entre películas y series.
│      └── Pelicula.java #Clase que representa una película y hereda de Titulo.
│      └── Serie.java: #Clase que representa una serie y hereda de Titulo.
│ └── Main.java #Clase principal que contiene el punto de entrada de la aplicación y llama a la clase Principal para mostrar un menú interactivo.
│ └── Principal.java #Clase que gestiona la lógica del menú interactivo y utiliza las clases Pelicula y Serie del paquete modelo para registrar nueva información.
├─ images/
│    └── cover.png
│    └── cover2.png
└── README.md # Documentación principal del proyecto

```

## Agradecimientos

Este proyecto fue creado como parte de mi aprendizaje inicial en Java. Agradezco a **[Alura](https://www.aluracursos.com/)** por proporcionar recursos educativos que me permitieron desarrollar esta aplicación.

## Demostración

Para ver una demostración de cómo funciona el proyecto, puedes ver el siguiente video:
