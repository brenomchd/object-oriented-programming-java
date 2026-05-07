# Object-Oriented Programming Java

Academic portfolio with Java exercises and notebook-based projects organized for study, practice, and presentation.

## About

This repository contains programming activities focused on object-oriented programming, Java fundamentals, file manipulation, unit testing and threads.

The code is organized into several main areas:

- `student-averages/`: Java solution for a C-to-Java transcription activity.
- `abstract-classes-interfaces/`: OOP model using students, exams, and an abstract professor class.
- `professor-student-model/`: expanded OOP exercise with classes, interfaces, inheritance, and a runnable demo.
- `junit-and-threads/`: equation exercise with a JUnit test plus a Java threads example.
- `file-io/`: examples of reading, writing, copying, and managing files in Java.

## Repository Structure

```text
.
├── abstract-classes-interfaces/
├── file-io/
├── junit-and-threads/
├── professor-student-model/
└── student-averages/
```

## Contents

### Java Exercises

The repository contains multiple directories with standalone Java exercises covering different concepts:

- **OOP & Fundamentals**: `student-averages/`, `abstract-classes-interfaces/`, and `professor-student-model/` cover classes, interfaces, inheritance, and basic syntax.
- **Unit Testing & Threads**: `junit-and-threads/` includes an equation exercise with a JUnit test and a Java threads example.
- **File I/O**: `file-io/` demonstrates reading, writing, copying, and managing files in Java.

Each project can be compiled and executed independently.

Example of running the student averages project:

```bash
cd student-averages
javac Main.java
java Main
```

Example of running the professor student model project:

```bash
cd professor-student-model
javac *.java
java TestaSolucao
```

## Requirements

- JDK 17 or later
- JUnit 4 for the equation test
- Terminal or command-line environment

## Compile and Run Examples

To compile and run the threads example:

```bash
cd junit-and-threads/threads
javac SimpleThreads.java
java SimpleThreads
```

To compile and run the file I/O examples:

```bash
cd file-io
javac -d out src/arquivo1/Arquivos1.java
java -cp out arquivo1.Arquivos1
```

## Notes

PDFs, screenshots, compiled files, generated documentation, temporary files, and source-only reference files were removed to keep the repository clean. Many exercises are intentionally small and focused on practicing one concept at a time.

## Author

Breno Machado Barros
