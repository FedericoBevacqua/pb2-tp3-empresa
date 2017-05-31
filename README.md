# pb2-tp3-empresa

# TRABAJO PRÁCTICO NRO. 3 – PB 2

## Integrantes:

 - Bevacqua Federico Iván - 39.336.983
 - Falon Gabriel - 34.348.308


----------
**CONSIGNA**
------------

Encontrar la jerarquía de clases adecuada para un Sistema de empleados con las siguientes
características:
Se solicita realizar un Sistema de empleados que registre el nombre, el salario
y fecha de cumpleaños y, además, el comportamiento brindarDetalles que
devuelve los detalles del empleado.
El organigrama de la empresa, determina que está organizada en diferentes
departamentos, siendo que cada departamento está administrado por un
gerente, quienes a su vez tienen una cochera asignada. El director de la
empresa, además de tener su cochera, tiene recibe un extra a su salario para
los gastos del vehículo. Existen otros dos tipos de empleados, ingeniero y
secretaria.
Además, se debe modelar una clase de aplicación que reciba un empleado y
lo compare con cierto tope de salarios para determinar los impuestos
correspondientes a ese empleado (nada se expresa sobre las escalas, se
brinda libertad de elección).

**Sugerencias**

Usar como guía para el último requerimiento, el siguiente código que podría
aparecer en un test:
ServicioImpuesto impSvc = new ServicioImpuesto();
Aministrador adm = new Administrador();
Double impuesto = impSvc.obtenerImpuesto(adm);

**A tener en cuenta:**

La entrega será grupal (dos integrantes). Se pide que el proyecto del grupo esté
compartido en GitHub (https://github.com/).
El integrante N° 1 deberá crear el repositorio y el integrante N° 2 deberá trabajar
sobre una copia del mismo (fork).
Deberá hacer los test´s aplicando lo visto en clase y comprobando la totalidad
de la funcionalidad requerida.
A la hora de dividir el trabajo, cada integrante debería realizar aproximadamente
el 50% de las funcionalidades.

Una vez completado el se deberá enviar un mail al grupo con el tema [ENTREGATPn] y en el cuerpo del mensaje aclarar: 

 - nombre y apellido.
 - Dni.
 - url del repositorio.
 - Usar eclipse y java 8.

**Fecha límite de entrega: domingo 4 de junio, 23:59 hs.**