# 📱 DMC_Proyecto_Final - Explorador de Personajes de Rick and Morty

¡Bienvenido a **DMC_Proyecto_Final**! 🎉  
Una aplicación Android moderna que consume la API de Rick and Morty para mostrar una lista de personajes de forma dinámica y visualmente atractiva.  
Desarrollada con las mejores prácticas de Android usando **MVVM**, **Clean Architecture**, y tecnologías modernas como **Jetpack Compose** y **Kotlin Flow**.

---

## 🌌 ¿Qué es DMC_Proyecto_Final?

DMC_Proyecto_Final es una app que obtiene datos de personajes de la API de Rick and Morty y los presenta en una interfaz reactiva.  
La aplicación carga los personajes de forma incremental (página por página) y los muestra en una lista clara y organizada, ideal para demostrar el uso del patrón MVVM en un entorno profesional.

---

## 📸 Capturas de Pantalla
Guarda tus screenshots en la carpeta `screenshots/`.  
Ejemplos sugeridos:  
- `loading.jpeg` – Indicador de carga.  
- `screen1.jpeg` – Primera vista de imagenes.
- `screen2.jpeg` – Segunda vista de imagenes.

---

## ✨ Características

- 📡 **Carga Incremental de Datos**: Obtiene personajes página por página desde la API, mostrando los resultados en tiempo real.  
- 🖼️ **Interfaz Moderna**: Construida con Jetpack Compose para una experiencia fluida y reactiva.  
- 🚨 **Manejo de Errores**: Gestiona errores de red mostrando datos acumulados o un indicador de carga.  
- 🧱 **Clean Architecture**: Código organizado en capas (data, domain, presentation) siguiendo principios SOLID.  
- 💉 **Inyección de Dependencias**: Usa Hilt para una gestión eficiente de dependencias.  
- 📊 **Ideal para Portafolios**: Demuestra habilidades en desarrollo Android moderno.  

---

## 🛠️ Tecnologías Utilizadas

- ✅ **Kotlin**  
- ✅ **MVVM**  
- ✅ **Clean Architecture**  
- ✅ **Jetpack Compose**  
- ✅ **Retrofit**  
- ✅ **Kotlin Flow**  
- ✅ **Hilt**  
- ✅ **Coil**  
- ✅ **Gradle (Kotlin DSL)**  
- ✅ **Min SDK: 24 | Compile SDK: 36**  

---

## 📂 Estructura del Proyecto

```bash
DMC_Proyecto_Final/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/proyectofinal/
│   │   │   │   ├── data/          # Capa de datos
│   │   │   │   │   ├── dto/       # DTOs para respuestas de la API
│   │   │   │   │   ├── mapper/    # Mapeadores DTO -> Entidades
│   │   │   │   │   ├── remote/    # Servicio de API con Retrofit
│   │   │   │   │   ├── repository/# Implementaciones del repositorio
│   │   │   │   ├── di/            # Módulos de Hilt
│   │   │   │   ├── domain/        # Entidades y casos de uso
│   │   │   │   ├── presentation/  # ViewModels y UI (Compose)
│   │   │   ├── res/               # Recursos (temas, strings)
│   │   │   ├── AndroidManifest.xml
│   ├── build.gradle.kts           # Configuración del módulo
├── gradle/
│   ├── libs.versions.toml         # Versiones de dependencias
├── build.gradle.kts               # Configuración del proyecto
├── README.md                      # Este archivo
├── screenshots/                   # Carpeta para capturas

```
---

## 🧠 Implementación del Patrón MVVM

### 🗃️ Modelo (Model)
- Gestiona y representa los datos de la API.  
- **Capa de Datos**  
  - `CharacterApiService.kt`: Llamadas HTTP a la API.  
  - `CharactersResponse.kt`: DTOs para las respuestas.  
  - `CharacterMapper.kt`: Convierte DTOs a entidades.  
  - `CharacterRepositoryImpl.kt`: Usa un Flow frío para emitir listas de personajes página por página.  
- **Capa de Dominio**  
  - `CharacterEntity.kt`: Modelo de datos del dominio.  
  - `GetCharactersUseCase.kt`: Lógica de negocio.  
  - `CharacterRepository.kt`: Interfaz para acceso a datos.  

### 🖥️ Vista (View)
- Muestra los datos al usuario.  
- `CharacterListScreen.kt`: Usa Jetpack Compose con `LazyColumn`.  
- Observa `StateFlow` del ViewModel con `collectAsState()`.  
- Muestra `CircularProgressIndicator` si no hay datos.  

### 🔗 ViewModel
- Conecta Modelo y Vista, gestionando la lógica de presentación.  
- `CharacterViewModel.kt`: Recolecta el Flow del caso de uso y actualiza un `StateFlow`.  
- Usa `viewModelScope` para operaciones asíncronas.  

---

## ⚙️ Configuración

### 📋 Requisitos
- Android Studio (Koala 2024.1.1 o posterior)  
- JDK 11  
- Emulador o dispositivo (API 24+, preferiblemente API 36)  
- Conexión a internet  

### 🛠️ Instalación
```bash
git clone https://github.com/malvab11/DMC_Proyecto_Final.git
cd DMC_Proyecto_Final
