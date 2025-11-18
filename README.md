# 🐞 Debugger Mode – Exception Propagation Demo

A small Java exercise showing how exceptions can **bubble up** through multiple methods using `throws`, and how to debug using `e.printStackTrace()`.

## 🎯 Purpose
- Understand **exception propagation**.
- Learn how `throws` works.
- Use `e.printStackTrace()` to display full error details.

## 🧪 Requirements
Create a program with three methods:

- `main()`
- `runSimulation()`
- `loadData()`

`loadData()` must **throw an IOException**.  
This exception should *not* be handled in `runSimulation()` — instead it must propagate up to `main()`, where it is finally caught and printed using:

```java
e.printStackTrace();
