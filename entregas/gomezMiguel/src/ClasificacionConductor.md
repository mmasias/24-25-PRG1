# [Clasificación de un conductor](ClasificacionConductor.java)

<div align=center>

|Categoría|Criterios|
|-|-|
|Menor de edad|Edad < 18 años|
|Mayor sin licencia|Edad ≥ 18 años, sin licencia de conducir|
|Conductor novel|Edad entre 18 y 19 años, con licencia|
|Conductor experimentado|Edad entre 20 y 27 años, con licencia|
|Conductor senior|Edad entre 28 y 64 años, con licencia|
|Conductor jubilado|Edad ≥ 65 años, con licencia|

</div>

## Notas

- La edad mínima para conducir es 18 años.
- Se considera conductor novel durante los primeros 2 años después de obtener la licencia.
- Se considera conductor experimentado entre 2 y 10 años después de obtener la licencia.
- La edad de jubilación se considera a los 65 años.
- Todos los conductores con licencia pueden conducir, independientemente de su clasificación.

## Salida esperada

```text
┏[manuel]--[main ≡ ● ]
┖[~/misRepos/[24][25]/24-25-PRG1]
  java ClasificacionConductor

Ingrese su edad:
25
¿Tiene licencia de conducir? (true/false):
true
Clasificación: Conductor experimentado. Puede conducir.

┏[manuel]--[main ≡ ● ]
┖[~/misRepos/[24][25]/24-25-PRG1]
  java ClasificacionConductor

Ingrese su edad:
10
¿Tiene licencia de conducir? (true/false):
true
Clasificación: Menor de edad, no puede conducir. No puede conducir.
```
