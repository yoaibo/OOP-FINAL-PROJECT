# PROPERTY MANAGEMENT SYSTEM (PMS)

A simplified, execution-ready Property Management System built in Java. This project implements the core fundamentals of Object-Oriented Programming (OOP) across 7 structural categories, assigning specific system roles to individual classes to manage real-estate operations seamlessly via a terminal console interface.

## 1. Project Structure
The project consists of 6 core source files, organized within a flat structure to prevent project-wide package declaration conflicts:

* Main.java — Driver class containing the system loop, dynamic user prompt diagnostics, and runtime operations.
* Property.java — Core asset model holding property parameters, valuations, status tracking, and file logging outputs.
* User.java — Abstract base class providing common data structures (ID, Name) and contracts for individual actors.
* Manager.java — Subclass representing the System Administrator who registers and assigns properties.
* Tenant.java — Subclass representing the Resident Client who signs lease profiles.
* Inspector.java — Subclass representing the Damage Evaluator who conducts validation inspections and signs off maintenance logs.

## 2. Technical Scope (7 Concepts Documented)
The codebase includes implementations covering the following core technical targets:
1. Encapsulation — Using private access fields bound to clear public methods for variable queries and state modifications.
2. Inheritance — Extending structural fields from the base class User down into child models.
3. Polymorphism — Declaring child entities dynamically inside abstract User handles at execution.
4. Abstract Classes — Isolating core common requirements directly inside an abstract User template.
5. Method Overriding — Implementing unique role signatures on abstract method hooks via `@Override`.
6. Static Tracking — Using atomic class counters (`totalProperties`) to observe initialization states globally.
7. File I/O — Saving critical structural log entries instantly to disk using buffered file writers.

## 3. How To Run

### Compilation
Compile all Java sources simultaneously inside your source folder:
```bash
javac Main.java User.java Property.java Manager.java Tenant.java Inspector.java