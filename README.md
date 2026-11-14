# Java TicTacToe Game

A Java Swing-based TicTacToe application featuring three different versions: **Basic, Medium-Advanced, and Advanced**. The project demonstrates the development of a desktop game using Java, Swing GUI components, event handling, and game logic.

Each version introduces additional features and improvements, progressing from a simple two-player game to a more interactive experience with player customization and series selection.

## 🎮 Project Overview

This project implements the classic TicTacToe game, where two players take turns placing X and O symbols on a 3 × 3 grid. The objective is to complete a horizontal, vertical, or diagonal line of three matching symbols.

The application is developed using Java Swing and provides a graphical interface for playing the game.

## ✨ Features

- Three different versions with increasing functionality.
- Graphical user interface built using Java Swing.
- Two-player gameplay.
- Player-name customization in the enhanced versions.
- Automatic turn switching between players.
- Visual distinction between X and O.
- Detection of horizontal, vertical, and diagonal winning combinations.
- Draw detection when all nine cells are occupied.
- Option to restart the game after a win or draw.
- Series selection in the Advanced Version.

## 🕹️ Available Versions

### 1. Basic Version

A simple implementation of the traditional TicTacToe game.

**Features:**
- Two-player gameplay.
- Interactive 3 × 3 game board.
- Alternating turns between X and O.
- Basic winning-condition detection.
- Draw detection.

### 2. Medium-Advanced Version

An enhanced version that introduces player customization and a more interactive game interface.

**Features:**
- Enter names for both players before starting.
- Displays the current player's name and symbol in the window title.
- Uses different background colours to distinguish X and O.
- Automatically disables a button after it has been selected, preventing repeated moves.
- Checks all eight possible winning combinations:
  - Three horizontal combinations.
  - Three vertical combinations.
  - Two diagonal combinations.
- Displays the winner using a dialog box.
- Detects a draw when all nine positions are occupied.
- Provides an option to restart the game.
- Maintains the appropriate starting player when restarting.

### 3. Advanced Version

The Advanced Version extends the gameplay by introducing a series-selection feature.

**Features:**
- Enter names for both players.
- Select the number of games in a series.
- Available series options: 3, 5, 7, and 9 games.
- Enhanced player-input interface with styled labels and controls.
- Uses a dedicated result window to display the series outcome.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| Java Swing | Graphical user interface |
| AWT | Layout management, colours, and fonts |
| ActionListener | Handling button-click events |
| JFrame | Creating application windows |
| JButton | Interactive game-board buttons |
| JLabel | Displaying labels and messages |
| JTextField | Accepting player names |
| JComboBox | Selecting the number of games in a series |
| JOptionPane | Displaying winner, draw, and restart dialogs |

## 📂 Project Structure

```text
Java-TicTacToe-Game/
│
├── nbproject/
│
├── src/
│   ├── tictactoe1/
│   │   └── Basic Version source files
│   │
│   ├── tictactoe2/
│   │   ├── TicTacToe2.java
│   │   ├── UserPanel.java
│   │   └── GamePanel.java
│   │
│   └── tictactoe3/
│       ├── TicTacToe3.java
│       ├── UserPanel.java
│       ├── GamePanel.java
│       └── WhoWonSeries.java
│
├── release/
│   ├── BasicTicTacToe.jar
│   ├── TicTacToe2.jar
│   ├── TicTacToe3.jar
│   └── README.md
│
├── LICENSE
├── README.md
├── build.xml
└── manifest.mf
```

## 🚀 How to Run the Application

### Option 1: Run Using Executable JAR Files

1. Open the `release` folder.
2. Choose the version you want to play.
3. Double-click the corresponding JAR file.

| Version | Executable JAR |
|---|---|
| Basic | `BasicTicTacToe.jar` |
| Medium-Advanced | `TicTacToe2.jar` |
| Advanced | `TicTacToe3.jar` |

Make sure Java is installed on your system.

Alternatively, run a JAR file from the terminal:

```bash
java -jar BasicTicTacToe.jar
```

Replace the filename with the JAR file of your preferred version.

### Option 2: Run Using NetBeans

1. Clone or download this repository.
2. Open NetBeans IDE.
3. Select **File → Open Project**.
4. Browse to the downloaded project folder.
5. Open the project.
6. Run the required version using its respective main class.

## 📚 Concepts Demonstrated

This project demonstrates practical implementation of several Java programming concepts:

- Object-Oriented Programming (OOP).
- Java Swing GUI development.
- Event-driven programming.
- ActionListener and event handling.
- Conditional statements and logical operators.
- Methods and constructors.
- Arrays and game-state management.
- GUI layouts using GridLayout.
- Dialog boxes using JOptionPane.
- Basic game logic and winning-condition validation.

## 🎯 Learning Outcomes

Through this project, I practised developing desktop applications using Java Swing, implementing event-driven interactions, managing game states, and designing graphical interfaces.

Developing three versions helped me progressively improve the application by introducing additional functionality and enhancing the overall user experience.

## 👩‍💻 Author

**Juveria Shaikh**

GitHub: [@juverias](https://github.com/juverias)

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
