# MiniJava2C Compiler

## Overview

This project is a compiler developed for a course on compilers, designed to translate a simplified subset of Java into equivalent C code. The goal is to gain practical experience with compiler design, including lexical analysis, parsing, semantic analysis, and code generation.

## Features

- Parses a simplified Java-like language with core constructs:
  - Class definitions with fields and methods
  - Basic data types (`int`, `boolean`)
  - Int array support (`int[]`)
  - Control flow statements (`if`, `while`, `return`, ...)
  - Expressions (arithmetic, logical)
- Performs syntax and semantic checks (type checking, variable declaration)
- Supporting inheritance
- Generates readable and compilable C code as output
