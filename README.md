# Sistema Académico con Árbol Binario de Búsqueda en Java

## Descripción del proyecto

Este proyecto consiste en el desarrollo de un sistema académico utilizando Árboles Binarios de Búsqueda (BST) en Java para gestionar estudiantes de la Universidad Técnica de Ambato.

El sistema permite almacenar información de estudiantes de manera organizada utilizando la cédula como clave principal dentro del árbol binario.

Además, el proyecto implementa distintos recorridos del árbol, búsqueda, eliminación de nodos, cálculo de altura, conteo de estudiantes y clasificación de aprobados y reprobados.

---

# Objetivo general

Implementar un sistema académico mediante Árboles Binarios de Búsqueda aplicando Programación Orientada a Objetos, recursividad y estructuras dinámicas en Java.

---

# Datos almacenados de cada estudiante

Cada estudiante contiene la siguiente información:

- Cédula
- Apellidos
- Nombres
- Nota final
- Carrera
- Nivel

---

# Funciones implementadas

El sistema implementa las siguientes funciones:

- Insertar estudiante
- Buscar estudiante por cédula
- Eliminar estudiante
- Recorrido Inorden
- Recorrido Preorden
- Recorrido Postorden
- Recorrido por niveles BFS
- Contar estudiantes
- Calcular altura del árbol
- Buscar estudiante con mayor nota
- Buscar estudiante con menor nota
- Mostrar estudiantes aprobados
- Mostrar estudiantes reprobados

---

# Tecnologías utilizadas

- Java
- Visual Studio Code
- GitHub

---

# Conceptos aplicados

Durante el desarrollo del proyecto se aplicaron los siguientes conceptos:

- Árboles Binarios de Búsqueda (BST)
- Programación Orientada a Objetos
- Recursividad
- Clases y objetos
- Referencias en Java
- Colas para recorrido BFS
- Métodos recursivos
- Modularización del código

---

# Explicación del funcionamiento del sistema

El sistema utiliza un Árbol Binario de Búsqueda para organizar estudiantes utilizando la cédula como criterio principal.

## Funcionamiento del BST

- Si la cédula es menor que la del nodo actual, el estudiante se inserta a la izquierda.
- Si la cédula es mayor, se inserta a la derecha.

Esto permite realizar búsquedas eficientes y mantener la información organizada automáticamente.

---

# Explicación de las clases

## Clase Main.java

La clase `Main` contiene el menú principal del sistema.

Funciones principales:

- Mostrar el menú interactivo
- Leer datos ingresados por el usuario
- Ejecutar las operaciones del árbol
- Controlar el flujo del programa

---

## Clase Estudiante.java

La clase `Estudiante` representa la información de cada estudiante.

Atributos principales:

- cedula
- apellidos
- nombres
- notaFinal
- carrera
- nivel

También contiene el método `mostrar()` para imprimir la información del estudiante.

---

## Clase Nodo.java

La clase `Nodo` representa cada nodo del árbol binario.

Cada nodo contiene:

- Un objeto de tipo `Estudiante`
- Referencia al hijo izquierdo
- Referencia al hijo derecho

---

## Clase ArbolBST.java

La clase `ArbolBST` contiene toda la lógica del Árbol Binario de Búsqueda.

Funciones principales:

- Inserción de estudiantes
- Búsqueda recursiva
- Eliminación de nodos
- Recorridos del árbol
- BFS usando cola
- Conteo de nodos
- Cálculo de altura
- Búsqueda de notas mayores y menores
- Mostrar aprobados y reprobados



---

# Evidencias de ejecución

## Menú principal del sistema

El sistema muestra un menú interactivo con todas las las operaciones disponibles del árbol binario de búsqueda.

![Menu](assets/menu-java.png)

---

## Inserción de estudiantes

Se insertan estudiantes dentro del árbol utilizando la cédula como criterio principal de organización.

![Insertar](assets/InsertarEstudiante-java.png)

---

## Búsqueda por cédula

El sistema permite buscar estudiantes mediante la cédula ingresada por el usuario.

![Buscar](assets/BuscarporCedula-java.png)

---

## Recorrido Inorden

El recorrido Inorden muestra los estudiantes ordenados de menor a mayor según la cédula.

![Inorden](assets/Inorden-java.png)

---

## Recorrido Preorden

El recorrido Preorden visita primero la raíz y luego los subárboles izquierdo y derecho.

![Preorden](assets/Preorden-java.png)

---

## Recorrido Postorden

El recorrido Postorden visita primero los nodos hijos y finalmente la raíz.

![Postorden](assets/Postorden-java.png)

---

## Recorrido BFS por niveles

El recorrido BFS utiliza una cola para recorrer el árbol nivel por nivel.

![BFS](assets/BFS-java.png)

---

## Conteo de estudiantes

El sistema calcula la cantidad total de estudiantes almacenados en el árbol.

![Contar](assets/ContarEstudiante-java.png)

---

## Cálculo de altura del árbol

El sistema calcula la altura total del árbol binario de búsqueda.

![Altura](assets/CalcularAltura-java.png)

---

## Estudiante con mayor nota

El sistema busca y muestra el estudiante con la nota más alta registrada.

![MayorNota](assets/MayorNota-java.png)

---

## Estudiante con menor nota

El sistema busca y muestra el estudiante con la nota más baja registrada.

![MenorNota](assets/MenorNota-java.png)

---

## Mostrar estudiantes aprobados

El sistema muestra los estudiantes con nota mayor o igual a 7.

![Aprobados](assets/Aprobados-java.png)

---

## Mostrar estudiantes reprobados

El sistema muestra los estudiantes con nota menor a 7.

![Reprobados](assets/Reprobados-java.png)

---

## Eliminación de estudiantes

El sistema elimina estudiantes manteniendo correctamente la estructura del árbol BST.

![Eliminar](assets/EliminarEstudiante-java.png)

---

## Salida del sistema

El programa finaliza correctamente cuando el usuario selecciona la opción salir.

![Salir](assets/Salir-java.png)

# Uso de GitHub

GitHub fue utilizado como herramienta de control de versiones para almacenar, organizar y respaldar el desarrollo del proyecto.

Durante la realización de la práctica se utilizaron comandos fundamentales como:

- `git add .`
- `git commit -m "mensaje"`
- `git push`
- `git status`
- `git log --oneline`

El uso de GitHub permitió mantener un historial de cambios mediante commits, facilitando el seguimiento del desarrollo del sistema académico implementado con Árboles Binarios de Búsqueda.

Además, el repositorio permitió almacenar el código fuente, evidencias de ejecución y documentación del proyecto de manera organizada.

---

# Explicación del funcionamiento del árbol binario de búsqueda

El sistema académico fue implementado utilizando un Árbol Binario de Búsqueda (BST), donde cada estudiante es almacenado dentro de un nodo del árbol.

La organización de los estudiantes se realiza utilizando la cédula como criterio principal de comparación.

## Funcionamiento

- Si la cédula del nuevo estudiante es menor que la del nodo actual, se inserta en el subárbol izquierdo.
- Si la cédula es mayor, se inserta en el subárbol derecho.

Gracias a esta estructura, el árbol mantiene automáticamente los datos organizados, permitiendo realizar búsquedas y recorridos de manera eficiente.

## Ejemplo

Si se insertan las siguientes cédulas:

```text
0303
0101
0505
0202
0404
```

El árbol se organiza jerárquicamente según las comparaciones realizadas durante la inserción.

El recorrido Inorden mostrará automáticamente:

```text
0101
0202
0303
0404
0505
```

demostrando que los datos quedan ordenados ascendentemente dentro del BST.

---

# Conclusión sobre el uso de IA

Durante el desarrollo de la práctica se utilizó inteligencia artificial como herramienta de apoyo para reforzar conceptos relacionados con Árboles Binarios de Búsqueda, recursividad, BFS, estructuras dinámicas y organización del código en Java.

La IA fue utilizada principalmente para resolver dudas conceptuales, comprender errores de compilación y mejorar la documentación del proyecto. Sin embargo, el proceso de implementación, pruebas y adaptación del sistema fue realizado progresivamente por el estudiante como parte del aprendizaje práctico.

El uso de inteligencia artificial permitió optimizar el tiempo de desarrollo y mejorar la comprensión de las estructuras de datos implementadas.

---

# Conclusión general del examen

La práctica permitió implementar correctamente un sistema académico utilizando Árboles Binarios de Búsqueda en Java, aplicando conceptos fundamentales de estructuras de datos y Programación Orientada a Objetos.

Además, se logró utilizar recorridos Inorden, Preorden, Postorden y BFS para procesar la información almacenada dentro del árbol, demostrando el funcionamiento eficiente de las estructuras jerárquicas.

El desarrollo del proyecto fortaleció conocimientos relacionados con recursividad, colas, referencias, modularización del código y control de versiones mediante GitHub, integrando teoría y práctica en un caso aplicado real.
