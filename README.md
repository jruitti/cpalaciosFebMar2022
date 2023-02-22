# Examen Final - Programación III
### Ing. y Lic. en Sistemas
### Turno Febrero-Marzo 2022, 2° llamado

### Objetivos
- Desarrollar endpoints que permitan el registro y consulta del entidad Curso

### Tiempo
- 2 horas reloj
### Evaluacion
- Se evaluará la versión del proyecto en el repositorio correspondiente, a la hora de finalización del examen, estimada para el día 23/02/2023 17:00
- El proyecto debe compilar sin errores en cualquier entorno de programación en el que se abra
- Todos los test unitarios deben pasar en verde

### Punto de partida
- Se proveerá el esquema de Backend parcialmente desarrollado, de manera que el alumno pueda lograr los objetivos en el tiempo previsto.

## Consigna
#### Módulo Cursos
_Se desea implementar un backend para un microservicio que permita registrar y consultar cursos._

#### Restricciones:
- No puede existir dos Cursos con el mismo nombre
- Todos los atributos de Curso son obligatorios
- La fecha de cierre de inscripcion del Curso no puede ser inferior a la actual
- El nivel puede tomar solo los valores [Inicial, Medio, Avanzado]

#### Funcionalidad
- Crear Curso
  - Endpoint: POST http://localhost:8080/cursos
  - RequestBody:
    ```json
    {
      "id": null,
      "nombre": "Clean Architecture",
      "fecha_cierre_inscripcion": "2023-03-01T10:00:00.000Z",
      "nivel": "Inicial"
    }
    ```

- Buscar Cursos
  - Endpoint: GET http://localhost:8080/cursos

#### Buenas prácticas y conceptos a considerar
- La nomenclatura de paquetes será en minúsculas
- La nomenclatura de clases será en UpperCamelCase
- La nomenclatura de métodos será en lowerCamelCase
- La organización de paquetes será por modelo->aspecto, tanto a nivel src/main como a nivel src/test. Ejemplo:
  ```
  cursos
  └─ excepciones
  └─ modelo
  └─ repositorio
  └─ casodeuso
  ```
- Usar Excepciones personalizadas
- Se debe usar método factory/instancia para crear objetos
- Nomenclatura representativa de clases, métodos, etc.
