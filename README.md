# Animal Hierarchy Project

This Java project demonstrates an object-oriented approach to modeling animals, specifically **cats** and **dogs**. Using inheritance, the project defines a base class `Animal` with shared attributes, which is extended by subclasses `Gato` (Cat) and `Perro` (Dog). These subclasses add specific attributes, such as breed type, allowing each animal type to be managed in a flexible and scalable way.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Class Structure](#class-structure)
- [Input Format](#input-format)
- [Example Input and Output](#example-input-and-output)
- [Explanation](#explanation)

---

## Overview

The project models basic animal characteristics using a class hierarchy. The `Animal` base class represents general attributes, like **age**, which are common across animals, while subclasses `Gato` and `Perro` add unique attributes, such as breed-specific details. This structure demonstrates effective use of inheritance and encapsulation in Java.

## Purpose

This project serves as a **learning exercise** in:
- Understanding **inheritance** and **encapsulation** by creating subclasses with shared and specific attributes.
- Managing data with **getters** and **setters** for proper data encapsulation and validation.
- Creating a **flexible object-oriented model** that allows for easy expansion and modification.

## Features

- **Inheritance and Extensibility**: A base `Animal` class allows for shared properties, and specific details are added in subclasses `Perro` and `Gato`.
- **Encapsulated Attributes**: Attributes such as age and breed type are encapsulated and managed via getters and setters.
- **Age Restriction**: The `Animal` class caps the maximum age at 15 years to ensure realistic values.

## Class Structure

- **`Animal`**: The base class that includes a common attribute for age. The setter for age enforces a maximum limit of 15 years.
- **`Gato`**: Represents a cat with an additional attribute to indicate if it is of European breed.
- **`Perro`**: Represents a dog with an additional attribute to indicate if it is a purebred.

## Input Format

The program expects age and breed information as parameters when creating each animal object. For example:
- For a `Perro` (Dog): age and purebred status.
- For a `Gato` (Cat): age and European breed status.

These inputs are handled directly within the code, where each animal is initialized with the specified attributes.

## Example Input and Output

### Input

```java
Perro canKan = new Perro(16, true);
Gato cati = new Gato(13, false);
```

### Output

```plaintext
Edad canKan: 15 Es pura raza canKan: true
Edad cati: 13 cati es raza europea: false
```

### Explanation

- The dog `canKan` has an initial age of 16, but the `Animal` class caps the age at 15, so `canKan`’s age is displayed as 15.
- The cat `cati` has an age of 13 and is not of European breed, so these details are displayed directly.

## Explanation

The project is organized as follows:
1. **Animal**: Base class providing a shared `edad` (age) attribute, with a maximum limit of 15.
2. **Perro (Dog)**: Extends `Animal` with a `puraRaza` attribute indicating if the dog is purebred.
3. **Gato (Cat)**: Extends `Animal` with a `razaEuropea` attribute indicating if the cat is of European breed.
