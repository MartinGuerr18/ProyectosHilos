readme_content = """\
# 🧵 ProyectosHilos

Este proyecto demuestra el uso de **hilos en Java** utilizando dos enfoques principales:
1. **Extender la clase `Thread`** (en `ThreadSimple.java`).
2. **Implementar la interfaz `Runnable`** (en `HilosR.java`).

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
│── README.md
```

## 🏗 Ejecución
Para ejecutar el proyecto:
```bash
git clone https://github.com/MartinGuerr18/ProyectosHilos.git
cd ProyectosHilos
javac -d . src/Model/ThreadSimple.java src/mx/edu/itses/marg/hilos/Hilos.java src/mx/edu/itses/marg/hilos/HilosR.java
java mx.edu.itses.marg.hilos.Hilos
```

## 🔧 Tecnologías Usadas
- **Java** (Manejo de hilos)
- **NetBeans** (Opcional, si fue el IDE utilizado)

## 📄 Licencia
MIT License.
"""

# Guardar el contenido en un archivo README.md
with open("README.md", "w", encoding="utf-8") as file:
    file.write(readme_content)

print("README.md generado con éxito.")
