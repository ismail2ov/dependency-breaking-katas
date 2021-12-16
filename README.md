# Dependency Breaking Katas

Exercises to practice breaking dependencies in legacy code to create tests for it.

## Goal

We have some legacy code. We need to make changes.
To make changes we need to introduce tests first.
We might have to change some code to enable testing.

## How to do it?

Changing code without tests is risky, so we want to:

- Only change as little code as possible.
- Rely on automated Refactoring tools as much as possible.
- You must not change the public API of the class.

### Technique assignments

- Adapt Parameter
- Break Out Method Object
- Expose Static Method
- Extract and Override Call
- Extract and Override Factory Method
- Extract Interface
- Parameterize Constructor
- Parameterize Method
- Pull Up Feature
- Replace Global Reference With Getter
- Subclass And Override Method

### Task

Each task presents you with a class and some collaborators.

- Bring this class under test. Make sure to cover all paths in the core logic.
- There is an existing test class with a first test case which might or might not work.
- You cannot change collaborators because they are used by other teams as well.