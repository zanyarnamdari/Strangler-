
# Strangler Fig Pattern with Facade in Java

This project demonstrates the Strangler Fig pattern with facade in Java. The Strangler Fig pattern is used to gradually replace an existing system by incrementally building a new system around it.

## Legacy Systems

- LegacySystemA: Contains legacy operations for System A.
- LegacySystemB: Contains legacy operations for System B.

## New System

- NewSystemC: Contains new operations for System C.

## Facade

- StranglerFigFacade: Acts as a facade for the legacy systems and new system, providing a simplified interface for interacting with them.

## Usage

1. Compile the Java files using a Java compiler.
2. Run the Main class to see the output of operations performed by the legacy systems and new system through the facade.


