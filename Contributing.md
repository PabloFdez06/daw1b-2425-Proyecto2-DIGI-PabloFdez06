# Contributing to Digital Task Management System

Thank you for considering contributing to this project! This guide will help you get started and ensure smooth collaboration.

## 🙌 How to Contribute

We welcome contributions of all kinds, including:

-  Bug reports and fixes  
-  Feature suggestions and implementations  
-  Improvements to documentation  
-  Adding tests  
-  Refactoring or performance optimizations  

## 📦 Getting Started

1. **Fork** the repository.
2. **Clone** your fork to your local machine:

   ```bash
   git clone https://github.com/PabloFdez06/daw1b-2425-Proyecto2-DIGI-PabloFdez06.git

3. Open the project in IntelliJ IDEA, Android Studio, or any Kotlin-compatible IDE.
4. Make your changes and commit them clearly.
5. Push to your fork and create a Pull Request against the main branch.

## 🌱 Branching Model

- Use meaningful branch names like `feature/add-login`, `fix/input-validation`, etc.
- All changes should be merged into the `main` branch via Pull Requests.

## 📐 Code Style Guide
Please follow these conventions:

- Use camelCase for variable and function names.
- Use PascalCase for class and data class names.
- Keep functions focused and modular.
- Apply KDoc comments (/** */) for public classes and methods.
- Validate user input gracefully.
- Avoid magic strings and numbers — use constants.

## 📝 Documentation
When submitting a contribution:

- Add or update KDoc for any public method/class.
- If functionality is significant, update the README.md.
- Generate automatic documentation using Dokka (optional).
- Propose devlog updates for inclusion in the project Wiki.

## 🛠️ Running the Project Locally

You can compile the Kotlin file with:

```bash
kotlinc Main.kt -include-runtime -d taskmanager.jar
java -jar taskmanager.jar
```

## 💬 Issues & Feature Requests

If you find a bug or have a suggestion for a new feature, please open an issue first to discuss it.

