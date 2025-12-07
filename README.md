# *Java Console-Based Simple Calculator*
## Overview
A simple console-based calculator project developed in **Java** using **IntelliJ IDEA**. This program allows users to perform basic arithmetic operations (addition, subtraction, multiplication, division) in a loop until the user chooses to exit.
## Features
- Perform arithmetic operations: `+`, `-`, `*`, `/`
- Input can be integers or floating-point numbers.
- Smart result formatting:
  - Whole numbers are displayed without `.0` (e.g., `5+6=11`)
  - Floating-point numbers retain decimal points when necessary.
- Exit options:
  - Press **ESC key** to exit.
  - Type `"exit"` at any input prompt to terminate the program.
- Continuous loop for multiple calculations without restarting.
### Technical Details
- **Language:** *Java*
- **Development Environment:** *IntelliJ IDEA*
- **Input Handling:** Uses Scanner to accept user input for numbers and operators.
- **Loop Control:** Infinite loop controlled by ESC key or "exit" command.
- **Operations:** Each operation has its dedicated method (add, subtract, multiply, divide).
- **Result Formatting:** Checks if numbers are integers or floating-point to display results cleanly.
