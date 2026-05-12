# Conversor de Monedas - Challenge Java G7

Bienvenido a mi proyecto del **Conversor de Monedas**, desarrollado como parte de la formación **Java Orientado a Objetos** en el programa **Oracle Next Education** en colaboración con **Alura Latam**.

## 📝 Descripción del Proyecto
Este programa es una herramienta de consola que permite realizar conversiones de divisas en tiempo real. Utiliza una API externa para obtener las tasas de cambio más actualizadas, garantizando precisión en los cálculos.

### 🚀 Funcionalidades principales:
* **Interfaz por consola:** Menú interactivo y fácil de usar.
* **Consumo de API:** Conexión con *ExchangeRate-API* para datos en vivo.
* **Manejo de JSON:** Uso de la librería **Gson** para procesar las respuestas de la API.
* **Soporte de Monedas:** Conversiones entre Dólar (USD), Peso Argentino (ARS), Real Brasileño (BRL) y Peso Colombiano (COP).

## 🛠️ Tecnologías y Herramientas:
* **Java SDK 17+**
* **IntelliJ IDEA** (IDE de desarrollo)
* **Biblioteca GSON 2.11.0**
* **Git & GitHub** para el control de versiones.

## 📁 Estructura del Código:
El proyecto sigue una arquitectura organizada en clases:
1. `Main.java`: Contiene la lógica del menú y el flujo principal.
2. `Moneda.java`: Un `record` de Java que mapea los datos recibidos de la API.
3. `ConsultaMoneda.java`: Clase encargada de realizar las peticiones HTTP y devolver los datos procesados.

## ⚙️ Cómo ejecutar el proyecto:
1. Clona este repositorio: `git clone https://github.com/TuUsuario/ConversorJava.git`
2. Importa el proyecto en **IntelliJ IDEA**.
3. Asegúrate de tener el archivo `gson-2.11.0.jar` vinculado en las **Project Structure > Libraries**.
4. Ejecuta la clase `Main.java`.

---
Desarrollado con dedicación por *Cesar Cascabita* 👨‍💻
