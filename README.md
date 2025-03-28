readme_content = """\
# 🧵 ProyectosHilos

Este proyecto demuestra el uso de **hilos en Java** utilizando dos enfoques principales:
1. **Extender la clase `Thread`** (en `ThreadSimple.java`).
2. **Implementar la interfaz `Runnable`** (en `HilosR.java`).
3. **Uso de sincronización con `wait()` y `notify()`** (en el paquete `Synchronized`).

## 🚀 Funcionalidad
El programa crea y ejecuta múltiples hilos que imprimen mensajes en la consola, mostrando cómo funcionan los hilos en Java. 
Cada hilo tiene un nombre y ejecuta un bucle que imprime mensajes antes de finalizar.

## 📌 Estructura del Código
```
ProyectosHilos/
│── src/
│   ├── Model/
│   │   └── ThreadSimple.java  # Hilo que extiende Thread
│   ├── mx/edu/itses/marg/hilos/
│   │   ├── Hilos.java         # Ejecuta hilos usando ThreadSimple
│   │   ├── HilosR.java        # Ejecuta hilos con Runnable
│   ├── Synchronized/
│   │   ├── FlagExample.java   # Uso de flags en hilos
│   │   ├── WaitNotify.java    # Uso de wait() y notify() en sincronización
│── README.md
```

## 📄 Descripción de Archivos
- **ThreadSimple.java** → Define un hilo que extiende `Thread`.
- **Hilos.java** → Crea y ejecuta hilos usando `ThreadSimple`.
- **HilosR.java** → Implementa hilos usando `Runnable`.
- **FlagExample.java** → Demuestra el uso de una *flag* para controlar la ejecución de un hilo.
- **WaitNotify.java** → Explica el uso de `wait()` y `notify()` para sincronización de hilos.

## 🔍 Conceptos Clave
- **¿Qué es una flag?**
  Una *flag* es una variable booleana utilizada para controlar el flujo de ejecución de un hilo. Se usa comúnmente para detener o pausar un hilo de manera segura.

- **¿Qué es el método `wait()`?**
  `wait()` es un método que suspende la ejecución de un hilo hasta que otro hilo lo notifique con `notify()`.

- **¿Qué es el método `notify()`?**
  `notify()` reanuda la ejecución de un hilo que ha sido pausado con `wait()`.

- **Diferencias entre programación normal y programación funcional**
  - **Programación normal (imperativa):** Se basa en instrucciones paso a paso y control explícito del flujo de ejecución.
  - **Programación funcional:** Se basa en funciones puras, evitando el estado mutable y efectos secundarios.

## 🏗 Ejecución
Para ejecutar el proyecto:
```bash
git clone https://github.com/MartinGuerr18/ProyectosHilos.git
cd ProyectosHilos
javac -d . src/Model/ThreadSimple.java src/mx/edu/itses/marg/hilos/Hilos.java src/mx/edu/itses/marg/hilos/HilosR.java src/Synchronized/FlagExample.java src/Synchronized/WaitNotify.java
java mx.edu.itses.marg.hilos.Hilos
```

## 🔧 Tecnologías Usadas
- **Java** (Manejo de hilos y sincronización)
- **NetBeans** (Opcional, si fue el IDE utilizado)

## 📄 Licencia
MIT License.

## 🔄 Actualización del Proyecto en GitHub
Después de hacer cambios, actualiza el repositorio con:
```bash
git add .
git commit -m "Añadido paquete Synchronized y actualizado README"
git push origin main
```
"""

# Guardar el contenido en un archivo README.md
with open("README.md", "w", encoding="utf-8") as file:
    file.write(readme_content)

print("README.md actualizado con éxito.")
