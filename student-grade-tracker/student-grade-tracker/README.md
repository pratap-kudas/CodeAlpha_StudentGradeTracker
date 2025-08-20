# Student Grade Tracker

## Overview
The Student Grade Tracker is a Java application designed to manage and track student grades efficiently. It allows users to input student names and their respective grades, calculate averages, and generate summary reports. The application features a console-based interface for easy interaction.

## Features
- Input and manage student grades.
- Calculate average, highest, and lowest scores for each student.
- Generate a summary report of all students and their grades.
- User-friendly console interface for seamless interaction.

## Project Structure
```
student-grade-tracker
├── src
│   ├── Main.java
│   ├── model
│   │   └── Student.java
│   ├── service
│   │   └── GradeTracker.java
│   ├── ui
│   │   └── ConsoleUI.java
│   └── util
│       └── ReportGenerator.java
└── README.md
```

## Getting Started
To run the Student Grade Tracker application, follow these steps:

1. **Clone the repository**:
   ```
   git clone <repository-url>
   ```

2. **Navigate to the project directory**:
   ```
   cd student-grade-tracker
   ```

3. **Compile the Java files**:
   ```
   javac src/*.java src/model/*.java src/service/*.java src/ui/*.java src/util/*.java
   ```

4. **Run the application**:
   ```
   java src/Main
   ```

## Usage
Upon running the application, users will be presented with a menu to:
- Add a new student and their grades.
- View the summary report of all students.
- Exit the application.

Follow the prompts to input data and view results.

## Contributing
Contributions are welcome! If you have suggestions for improvements or new features, please submit a pull request or open an issue.

## License
This project is licensed under the MIT License. See the LICENSE file for details.