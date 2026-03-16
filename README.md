# Taller 3 – DYAS Music Player

## Descripción

Este proyecto es una simulación de un reproductor de música desarrollado en **Java** para el taller de **Diseño y Arquitectura de Software (DyAS)**.

La idea del proyecto es aplicar el **patrón de diseño Adapter**, para poder reproducir diferentes tipos de archivos de audio usando una misma interfaz.

---

## Qué se utilizó

* Java
* Maven
* Programación Orientada a Objetos
* Visual Studio Code

Maven se utilizó para manejar la estructura del proyecto y poder compilarlo desde la terminal.

---

## Cómo se hizo

El proyecto se creó usando la estructura estándar de **Maven**:

```
src/main/java
```

Dentro de esta estructura se organizaron los paquetes del proyecto:

```
edu.unisabana.dyas.patterns
```

y

```
edu.unisabana.dyas.patterns.utils
```

Ahí están las clases del sistema como **Client**, **AudioPlayer**, **AdvancedAudioPlayer** y **AdvancedAudioPlayerAdapter**, que permiten reproducir diferentes formatos de archivos usando el patrón **Adapter**.

---

## Cómo ejecutar el proyecto

1. Clonar el repositorio:

```
git clone https://github.com/santyBarru/DYAS-MusicPlayer.git
```

2. Abrir el proyecto en **Visual Studio Code**.

3. Abrir la terminal dentro del proyecto.

4. Compilar el proyecto:

```
mvn clean compile
```

5. Ejecutar la clase principal:

```
mvn exec:java "-Dexec.mainClass=edu.unisabana.dyas.patterns.Client"
```

Al ejecutarlo se podrá ver en la terminal cómo el reproductor reproduce archivos **mp3, mp4 y vlc**, y muestra un mensaje si el formato no es soportado.
