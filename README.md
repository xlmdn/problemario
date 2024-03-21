
## Repositorio de Problemas y Programas de Métodos Numéricos

¡Bienvenido al repositorio de Métodos Numéricos Tema 3 - Métodos de solución de sistemas de ecuaciones lineales !

Aquí encontrarás una colección completa de **algoritmos**, **programas** y **pruebas de ejecución** relacionados con los diferentes metodos de solución de sistemas de ecuaciones lineales de la materia de Métodos Numéricos:

Eliminación Gaussiana

Gauss Jordan

Gauss Seidel

Jacobi

## Contenido del Repositorio

# Índice
## Método Gauss Jordan

- [Descripción](#descripción-gauss-jordan)
- [Algoritmo](#algoritmo-gauss-jordan)
- [Ejemplos](#ejemplos-gauss-jordan)
- [Programa](./Metodo_GaussJordan/)


## Método Gauss Seidel

- [Descripción](#descripción-gauss-seidel)
- [Algoritmo](#algoritmo-gauss-seidel)
- [Ejemplos](#ejemplos-gauss-seidel)

## Método Eliminación Gaussiana

- [Descripción](#descripción-eliminación-gaussiana)
- [Algoritmo](#algoritmo-eliminación-gaussiana)
- [Ejemplos](#ejemplos-eliminación-gaussiana)

## Método Jacobi

- [Descripción](#descripción-jacobi)
- [Algoritmo](#algoritmo-jacobi)
- [Ejemplos](#ejemplos-jacobi)

---

## Método Gauss Jordan

### Descripción Gauss Jordan

El Método de Gauss-Jordan es un algoritmo utilizado para resolver sistemas de ecuaciones lineales. Es una variación del método de eliminación gaussiana, donde se utiliza la reducción por filas para convertir la matriz de coeficientes en una forma escalonada reducida, facilitando así la resolución del sistema.

### Algoritmo Gauss Jordan

-En primer lugar, se registra el sistema de ecuaciones en forma de matriz, conocida también como matriz aumentada. 

-Posteriormente, se procede a transformar esta matriz en una matriz identidad. Para lograrlo, se pueden llevar a cabo las siguientes operaciones en las filas de la matriz:
cambiar el orden de las filas, multiplicar o dividir todos los elementos de una fila por un número distinto de cero, o sustituir una fila por la suma de esa misma fila y otra fila multiplicada por un número. 

-Una vez que se ha alcanzado la forma de matriz identidad, las soluciones del sistema de ecuaciones son simplemente los términos independientes de la matriz resultante.

## Ejemplos Gauss Jordan

## Ejemplo 1

![image](https://github.com/xlmdn/problemario/assets/147437527/b7fc09c5-c508-4637-9acd-bb039cae35a8)

![image](https://github.com/xlmdn/problemario/assets/147437527/805d032f-013f-4894-bb5b-7743f641151a)

![image](https://github.com/xlmdn/problemario/assets/147437527/840ed781-6ba4-4f4f-af9b-8e16870231bd)

## Ejemplo 2

![image](https://github.com/xlmdn/problemario/assets/147437527/3141cbf7-a129-4eb2-b89f-cd8902e4c2f9)

![image](https://github.com/xlmdn/problemario/assets/147437527/12e4ba00-8fca-4ad8-897d-1c21df43b987)

![image](https://github.com/xlmdn/problemario/assets/147437527/bf8f04ea-47db-497e-ac80-16e838e97072)


## Ejemplo 3

![image](https://github.com/xlmdn/problemario/assets/147437527/a902a0f5-fe5b-41a5-97d5-f84553d87c86)

![image](https://github.com/xlmdn/problemario/assets/147437527/ea0a7857-abd1-4b31-9297-7f0ec1222bea)

![image](https://github.com/xlmdn/problemario/assets/147437527/c0600fdb-042d-466a-9ce1-80e6d9009b4b)

## Ejemplo 4

![image](https://github.com/xlmdn/problemario/assets/147437527/c96cf10c-6258-4ec2-ad62-a2247e053429)

![image](https://github.com/xlmdn/problemario/assets/147437527/871cef1d-64ba-497c-8eec-bd89f7380da3)

![image](https://github.com/xlmdn/problemario/assets/147437527/bd345a8e-5748-4fea-b660-cd2f8a056d51)

## Ejemplo 5

![image](https://github.com/xlmdn/problemario/assets/147437527/f8e099db-8760-482f-829b-9b7d206077f6)

![image](https://github.com/xlmdn/problemario/assets/147437527/61f04ce2-a730-4508-85b2-a009b85f0882)

![image](https://github.com/xlmdn/problemario/assets/147437527/c2de7af7-329f-4702-ba19-7b094c5e04c0)







## Método Gauss Seidel

### Descripción Gauss Seidel

El método de Gauss-Seidel es un algoritmo iterativo utilizado para resolver sistemas de ecuaciones lineales. Su objetivo es encontrar las soluciones aproximadas del sistema iterando a través de cada ecuación y actualizando las incógnitas en cada paso. 

### Algoritmo Gauss Seidel

-Inicialización: Establecer una estimación inicial para las incógnitas.

-Iteración:

Para cada ecuación del sistema:

Resolver la ecuación utilizando las incógnitas actualizadas.

Actualizar las incógnitas con los nuevos valores calculados.

Repetir hasta convergencia.

-Condición de Convergencia: Verificar si se alcanza una convergencia aceptable.

-Salida: Tomar las soluciones aproximadas como soluciones del sistema.

### Ejemplos Gauss Seidel

## Ejemplo 1

![image](https://github.com/xlmdn/problemario/assets/147437527/5f447999-4ab3-4b51-bbf2-3eda3a3e8539)

![image](https://github.com/xlmdn/problemario/assets/147437527/d4517535-3b2d-48c6-8194-a6e7a059d19e)

![image](https://github.com/xlmdn/problemario/assets/147437527/d521dd63-e3c0-42ca-b1c4-f52e6e03ecbc)

## Ejemplo 2

![image](https://github.com/xlmdn/problemario/assets/147437527/d7eca18d-8ee3-4b0a-8772-3e46aa647eeb)

![image](https://github.com/xlmdn/problemario/assets/147437527/423c58fd-8da7-400b-aa16-e4ce2dc21a25)

![image](https://github.com/xlmdn/problemario/assets/147437527/2471c22f-0f4b-4155-9bc8-04f6e2f68c75)

## Ejemplo 3

![image](https://github.com/xlmdn/problemario/assets/147437527/2e8d78e6-728a-4ab0-bcb1-bd9b267d4805)

![image](https://github.com/xlmdn/problemario/assets/147437527/554bec45-0e89-4eae-a0dc-6bd44bd3786a)

![image](https://github.com/xlmdn/problemario/assets/147437527/c012cc3a-939e-4fd8-b3b4-e452308978e4)

## Ejemplo 4

![image](https://github.com/xlmdn/problemario/assets/147437527/77bfcce2-8244-49e2-a5b5-c0c8ef0f1364)


![image](https://github.com/xlmdn/problemario/assets/147437527/cc748e25-01de-4f41-be38-3721190988df)

![image](https://github.com/xlmdn/problemario/assets/147437527/6475cd9e-7549-4422-9c7d-dd363a5414df)


## Ejemplo 5

![image](https://github.com/xlmdn/problemario/assets/147437527/baa3dae9-87d1-40c8-962e-247f84b41eda)

![image](https://github.com/xlmdn/problemario/assets/147437527/22c8ef2b-5cc5-4131-9183-67dde584441b)

![image](https://github.com/xlmdn/problemario/assets/147437527/29e55634-2f44-45e3-b1e5-f17a32b5088f)


## Método Eliminación Gaussiana

### Descripción Eliminación Gaussiana

La eliminación gaussiana es un método utilizado para resolver sistemas de ecuaciones lineales mediante la transformación de la matriz aumentada del sistema en una forma escalonada mediante operaciones elementales de fila. Este método es fundamental en álgebra lineal y es utilizado en numerosos campos de la ciencia y la ingeniería.

### Algoritmo Eliminación Gaussiana

-Inicialización: Comenzamos con una matriz aumentada que representa el sistema de ecuaciones lineales.

-Iteración por filas: Recorremos la matriz por filas de arriba hacia abajo y aplicamos las siguientes operaciones para cada fila:

Pivoteo parcial (opcional): Si es necesario, intercambiamos filas para asegurar que el elemento en la posición de pivote (el primer elemento no nulo de la fila actual) sea el mayor en magnitud entre todos los elementos de la columna.

Escalonamiento: Convertimos todos los elementos debajo del pivote en ceros, utilizando operaciones de fila. Para cada fila por debajo de la fila actual, restamos un múltiplo apropiado de la fila actual de manera que el elemento correspondiente se vuelva cero.

-Verificación de solución única: Después de llevar la matriz a su forma escalonada, verificamos si el sistema tiene una única solución, ninguna solución o infinitas soluciones. Esto puede hacerse verificando si hay alguna fila completamente nula o si hay una fila con ceros en todas las columnas excepto en la última.

-Sustitución hacia atrás (si es necesario): Si el sistema tiene una solución única, realizamos la sustitución hacia atrás para encontrar los valores de las incógnitas.

### Ejemplos Eliminación Gaussiana

## Ejemplo 1

![image](https://github.com/xlmdn/problemario/assets/147437527/3a376ee5-0126-42d2-909c-a57c5bd2daf7)

![image](https://github.com/xlmdn/problemario/assets/147437527/230d0971-fb8d-419e-bb6f-c77479142103)

![image](https://github.com/xlmdn/problemario/assets/147437527/0fc9c903-f3d8-4fa4-b0ef-63b056bd2a6d)

## Ejemplo 2

![image](https://github.com/xlmdn/problemario/assets/147437527/995e3c85-013a-49bd-ba7f-1b54ab053b2e)

![image](https://github.com/xlmdn/problemario/assets/147437527/de440c60-bdeb-4498-9737-9f8df80d89c2)

![image](https://github.com/xlmdn/problemario/assets/147437527/40ad4f99-3581-4643-9553-bbd7e1524dd3)



## Ejemplo 3

![image](https://github.com/xlmdn/problemario/assets/147437527/e3706641-99e0-4b8f-8048-9e6f72b89cf8)

![image](https://github.com/xlmdn/problemario/assets/147437527/725c751e-6086-4184-9143-07dcc5589136)

![image](https://github.com/xlmdn/problemario/assets/147437527/84447f21-399b-4707-aaa3-62d01fd05767)

## Ejemplo 4

![image](https://github.com/xlmdn/problemario/assets/147437527/250da839-6831-47b8-a974-6522a47e298b)

![image](https://github.com/xlmdn/problemario/assets/147437527/4a85f20a-9072-42a6-b033-f4065cc5bb71)

![image](https://github.com/xlmdn/problemario/assets/147437527/d9e18a9e-1259-4801-abc4-c7d005b49b23)


## Ejemplo 5

![image](https://github.com/xlmdn/problemario/assets/147437527/a7358a9c-3f3a-4b04-ba8d-42cc1b2ea91d)

![image](https://github.com/xlmdn/problemario/assets/147437527/85b922eb-83a1-42db-81eb-2a1435ce72f9)

![image](https://github.com/xlmdn/problemario/assets/147437527/e1f3ef3d-dd53-4f14-b6ab-082d3d8d3e67)


## Método Jacobi

### Descripción Jacobi

El método de Jacobi es un algoritmo iterativo utilizado para resolver sistemas de ecuaciones lineales, especialmente cuando la matriz del sistema es grande y dispersa. El método se basa en la descomposición de la matriz del sistema en una matriz diagonal y el resto de los términos.

### Algoritmo Jacobi

-Descomposición de la matriz: Separar la matriz del sistema en una matriz diagonal y dos matrices triangulares.

-Iteración inicial: Seleccionar un vector inicial de soluciones.

-Iteración: Evaluar cada una de las funciones con los valores iniciales de forma iterativa para actualizar el vector de soluciones en cada paso.

Criterio de parada: Verificar si se ha alcanzado la convergencia.

Convergencia: Si se ha alcanzado la convergencia, devolver el vector de soluciones aproximado.

### Ejemplos Jacobi

## Ejemplo 1

![image](https://github.com/xlmdn/problemario/assets/147437527/e12652c0-3407-4fb1-84d0-fd402bc1e8d3)

![image](https://github.com/xlmdn/problemario/assets/147437527/1969ac1f-202d-41da-a533-8ac8f4a995ee)

![image](https://github.com/xlmdn/problemario/assets/147437527/e1fc71c9-beff-4c26-89ee-719b8f3dd32e)

## Ejemplo 2

![image](https://github.com/xlmdn/problemario/assets/147437527/8e43e1fa-1596-4765-9be6-d25ed2423f9b)

![image](https://github.com/xlmdn/problemario/assets/147437527/308953d4-f618-405d-8d1d-86a945a4be30)

![image](https://github.com/xlmdn/problemario/assets/147437527/55d82ccf-23ce-4f06-911b-cef7a84e85fe)

## Ejemplo 3

![image](https://github.com/xlmdn/problemario/assets/147437527/f0c0c570-c266-4a5e-81a6-2ff3c9b9332b)

![image](https://github.com/xlmdn/problemario/assets/147437527/31ef96ce-dd82-4381-b718-62ea7ed70582)

![image](https://github.com/xlmdn/problemario/assets/147437527/df112e9f-c893-44d6-b82d-22344b88d0eb)

## Ejemplo 4

![image](https://github.com/xlmdn/problemario/assets/147437527/5f720301-4cf4-4afc-a495-d8a48b3b79e9)

![image](https://github.com/xlmdn/problemario/assets/147437527/aca01853-0948-45e8-9529-e1f26ea3248a)

![image](https://github.com/xlmdn/problemario/assets/147437527/653f3ff1-9c36-4a84-a222-2ac2b0a8d049)


## Ejemplo 5

![image](https://github.com/xlmdn/problemario/assets/147437527/9544e680-3f53-4d3c-9ff4-4ed72fcb4d12)

![image](https://github.com/xlmdn/problemario/assets/147437527/51d4ea0b-fe2c-44a2-87b4-474b9ccce24e)

![image](https://github.com/xlmdn/problemario/assets/147437527/d27cf32b-ba74-4bf4-af52-bb2e14ff546e)

## Contribuciones y Retroalimentación:

Este repositorio es un recurso en constante evolución, y tu contribución es fundamental para mejorarlo. Si tienes sugerencias, correcciones o nuevos recursos que te gustaría compartir, no dudes en hacer una contribución al repositorio. Además, apreciamos cualquier retroalimentación que tengas sobre tu experiencia utilizando este material.

¡Esperamos que este repositorio sea una herramienta valiosa para tu estudio y práctica de Métodos Numéricos! Si tienes alguna pregunta o necesitas ayuda adicional, no dudes en ponerte en contacto con nosotros.

¡Que disfrutes explorando el mundo de los Métodos Numéricos!

Atentamente,

[Nombre del Equipo/Mantenedor del Repositorio]
