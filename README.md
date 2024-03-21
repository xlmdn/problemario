
## Repositorio de Problemas y Programas de Métodos Numéricos

¡Bienvenido al repositorio de Métodos Numéricos Tema 3 - insertar titulodel tema !

Aquí encontrarás una colección completa de **problemarios**, **programas** y **pruebas de ejecución** relacionados con los diferentes metodos de solución de sistemas de ecuaciones lineales de la materia de Métodos Numéricos. 

## Contenido del Repositorio

# Índice
## Método Gauss Jordan

- [Descripción](#descripción-gauss-jordan)
- [Algoritmo](#algoritmo-gauss-jordan)
- [Ejemplos](#ejemplos-gauss-jordan)

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

Aquí se proporcionará una descripción general del Método Eliminación Gaussiana, incluyendo su origen, fundamentos teóricos y condiciones de aplicabilidad.

### Algoritmo Eliminación Gaussiana

Se presentará el algoritmo paso a paso del Método Eliminación Gaussiana, detallando los cálculos necesarios para resolver sistemas de ecuaciones utilizando este método.

### Ejemplos Eliminación Gaussiana

Se incluirán ejemplos prácticos de aplicación del Método Eliminación Gaussiana para resolver sistemas de ecuaciones lineales, junto con su correspondiente explicación y análisis de resultados.

## Método Jacobi

### Descripción Jacobi

Aquí se proporcionará una descripción general del Método Jacobi, incluyendo su origen, fundamentos teóricos y condiciones de aplicabilidad.

### Algoritmo Jacobi

Se presentará el algoritmo paso a paso del Método Jacobi, detallando los cálculos necesarios para resolver sistemas de ecuaciones utilizando este método.

### Ejemplos Jacobi

Se incluirán ejemplos prácticos de aplicación del Método Jacobi para resolver sistemas de ecuaciones lineales, junto con su correspondiente explicación y análisis de resultados.


## Contribuciones y Retroalimentación:

Este repositorio es un recurso en constante evolución, y tu contribución es fundamental para mejorarlo. Si tienes sugerencias, correcciones o nuevos recursos que te gustaría compartir, no dudes en hacer una contribución al repositorio. Además, apreciamos cualquier retroalimentación que tengas sobre tu experiencia utilizando este material.

¡Esperamos que este repositorio sea una herramienta valiosa para tu estudio y práctica de Métodos Numéricos! Si tienes alguna pregunta o necesitas ayuda adicional, no dudes en ponerte en contacto con nosotros.

¡Que disfrutes explorando el mundo de los Métodos Numéricos!

Atentamente,

[Nombre del Equipo/Mantenedor del Repositorio]
