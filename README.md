# 📚 project-java-streams

Este proyecto es un taller práctico en Java para aprender y aplicar el uso de **Streams** y **Expresiones Lambda**. El ejemplo está basado en una tienda de libros con una lista de 40 títulos.

---

## ✅ Funcionalidades

- Mostrar todos los libros.
- Filtrar libros con precio mayor a $50.
- Mostrar títulos en mayúsculas.
- Libros baratos (precio < $50).
- Precio total de todos los libros.
- Verificar si hay libros de un autor específico.
- Eliminar títulos duplicados.
- Limitar y saltar libros.
- Ordenar libros por precio.
- Mostrar recomendaciones (< $60, orden descendente).
- Imprimir evaluación con preguntas rápidas.

---

## 🧪 Evaluación (impresa en consola)

1. ¿Qué operador usarías para transformar una lista de títulos a mayúsculas?  
   → `map()`

2. ¿Cómo verificarías si todos los libros cuestan menos de $100?  
   → `allMatch(book -> book.getPrice() < 100)`

3. Expresión lambda si el autor es "Gabriel García Márquez":  
   → `(book) -> book.getAuthor().equals("Gabriel García Márquez")`

---

## 🚀 Cómo ejecutar

1. Clona el repositorio.
2. Compila con `javac`.
3. Ejecuta con `java`.

