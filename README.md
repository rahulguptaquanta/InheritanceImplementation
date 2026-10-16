# Inheritance Implementation

A beginner-friendly Java project demonstrating inheritance and runtime polymorphism.

## Project structure

```text
InheritanceImplementation/
├── src/
│   └── com/
│       └── internship/
│           └── animals/
│               ├── Animal.java
│               ├── Dog.java
│               ├── Cat.java
│               └── Main.java
├── docs/
│   └── sample-output.txt
├── .gitignore
└── README.md
```

## Requirements

- Java JDK 8 or later

## How to compile and run

Open a terminal in the project root and run:

```bash
javac -d out src/com/internship/animals/*.java
java -cp out com.internship.animals.Main
```

## Concepts demonstrated

- `Animal` is the base class with shared `name` and `age` attributes.
- `Dog` and `Cat` extend `Animal` and add their own attributes.
- Both derived classes override `makeSound()` and `displayInfo()`.
- An `Animal[]` stores different child objects and calls overridden methods at runtime, demonstrating polymorphism.
