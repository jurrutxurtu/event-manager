# event-manager
Necesitamos diseñar un sistema que registre eventos y que bajo ante ciertos casos lance otros. 

Los eventos, los sistemas de entrada/salida de eventos, la persistencia y la lógica sobre la que generar nuevos eventos son temas que pueden variar con el tiempo.

Inicialmente, para este ejercicio, recibiremos eventos de encendido y apagado de mecanismos por entrada estandar, se persistirán solo en memoria y enviaremos los eventos

generados a la salida estándar. Se generará un evento de "Alarma en dispositivo" cuando un mecanismo se apague indicando los segundos que estuvo encendido:

 

Por ejemplo, para la siguientes entradas: 

ON Device1

ON Device2

OFF Device1

 

Siendo cada línea un evento, la primera palabra de cada línea el tipo de evento y las siguientes palabras los parámetros.

Se producirá la siguiente salida:

ALARM Device1 12


Se ha desarrollado exclusivamente lo que se requería en el enunciado.
La solución esta diseñada para ejecutarse en un entorno con un solo hilo de ejecución.
No se ha implementado un sistema de control de errores, ante un comando no reconocido, el sistema fallará. Esto sería una posible ampliación de la solución.
No se han desarrollado tests unitarios de cada clase desarrollada, esto sería una ampliación muy recomendable.
El tiempo empleado en el desarrollo ha sido de 7-8 horas en total.
La distribución de los paquetes y la encapsulación de todo el sistema no es la óptima. Haría falta mas tiempo de análisis para refactorizar esto.
