# Makiato 1.0

A small educational Java-based interpreter for a toy programming language with variables, arithmetic expressions, conditions, loops, and block execution.

This project explores the basics of language runtime design using object-oriented Java classes: each instruction and expression is modeled as a distinct component, and the execution engine steps through them one by one.

## ✨ Features

- Arithmetic expressions: addition, subtraction, multiplication, division, modulo
- Variable handling and assignments
- Conditional execution with comparison operators
- Loop execution
- Block-based instruction sequencing
- Printable output via `Print`
- Minimal interpreter architecture built from Java classes

## 🧩 Project structure

- `Main.java` — demo program and entry point
- `Instrukcja.java` — base class for instructions
- `Wyrazenie.java` — base class for expressions
- `Zmienna.java` — variable model
- `Przypisanie.java` — assignment instruction
- `Warunek.java` — conditional branch
- `Petla.java` — loop instruction
- `Blok.java` — grouped instruction block
- `Print.java` — output instruction
- `Dodawanie.java`, `Odejmowanie.java`, `Mnozenie.java`, `Dzielenie.java`, `Modulo.java` — expression implementations
- `Lit.java` — literal values
- `Stopexeption.java` — custom stop exception

## 🚀 Quick start

From the project root, compile and run:

```bash
javac *.java
java Main
```

The project includes a sample program in `Main.java` demonstrating nested blocks, a loop, and a conditional statement.

## 🏗️ Example idea

The interpreter is built around a stepping model:

- Each instruction has a `step()` method
- Expressions compute values with `oblicz()`
- The runtime advances through the instruction list until completion
- `Stopexeption` is used to stop execution gracefully

This makes the project a great learning tool for understanding how interpreters and execution engines can be structured in Java.

## 📘 Example flow

The sample program in `Main.java` creates variables, performs arithmetic, evaluates conditions, and loops over a block while updating values. It is a compact example of how a simple language runtime can be expressed with Java objects.

## 🧠 Notes

This is a teaching project rather than a full production language implementation. It focuses on:

- object modeling
- execution flow
- expression evaluation
- interpreter mechanics

## 📌 License

This repository does not currently declare a license. If you plan to publish it publicly, you may want to add one such as MIT or Apache 2.0.

## 👨‍💻 Author

Makiato 1.0 is a personal Java interpreter project created for experimentation and learning.
