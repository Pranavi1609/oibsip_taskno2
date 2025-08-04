# 🎲 Number Guessing Game

A fun and interactive Java console game where players try to guess a randomly generated number within a limited number of attempts. This project demonstrates core Java programming concepts including loops, conditionals, user input handling, and random number generation.

---

## 🌟 About This Project

This is **Task 2** from the **Oasis Infobyte Student Internship Program (OIBSIP)** - Java Development track. The game challenges users to guess a computer-generated number between 1 and 100, providing helpful hints along the way.

---

## 🎮 Game Features

- 🎯 **Random Number Generation**: Computer generates a secret number between 1-100
- 🔢 **Limited Attempts**: Players have a set number of tries to guess correctly  
- 💡 **Smart Hints**: Feedback tells you if your guess is too high or too low
- 🏆 **Score Tracking**: Displays number of attempts used
- 🎊 **Win/Lose Logic**: Congratulates winners or reveals the answer when attempts run out
- 🔄 **Input Validation**: Handles invalid inputs gracefully

---

## 🛠️ Technology Stack

- **Language**: Java 8+
- **Libraries**: java.util.Scanner, java.util.Random
- **Development Environment**: Any Java IDE (Eclipse, IntelliJ IDEA, VS Code)
- **Runtime**: Java Virtual Machine (JVM)

---

## 📁 Project Structure

```
oibsip_taskno2/
├── numberguessinggame.java    # Main game implementation
└── README.md                  # Project documentation
```

---

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE or text editor
- Command line/terminal access

### Installation & Execution

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Pranavi1609/oibsip_taskno2.git
   ```

2. **Navigate to project directory:**
   ```bash
   cd oibsip_taskno2
   ```

3. **Compile the Java file:**
   ```bash
   javac numberguessinggame.java
   ```

4. **Run the game:**
   ```bash
   java numberguessinggame
   ```

---

## 🎯 How to Play

1. **Start the Game**: Run the program to begin
2. **Read Instructions**: The game will display the rules and range (1-100)
3. **Make Your Guess**: Enter a number when prompted
4. **Get Feedback**: 
   - "Too High" - Your guess is above the target
   - "Too Low" - Your guess is below the target
   - "Correct!" - You've won the game!
5. **Keep Trying**: Continue guessing until you win or run out of attempts
6. **Game Over**: See your final score and the correct answer

### Example Gameplay:
```
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
You have 7 attempts to guess it!

Enter your guess: 50
Too high! Try a lower number.

Enter your guess: 25
Too low! Try a higher number.

Enter your guess: 37
Congratulations! You guessed it in 3 attempts!
```

---

## 🎲 Game Logic

The game implements the following core logic:

1. **Random Number Generation**: Uses `Math.random()` to generate target number
2. **User Input Loop**: Continues until correct guess or attempts exhausted
3. **Comparison Logic**: 
   - `guess > target` → "Too High"
   - `guess < target` → "Too Low" 
   - `guess == target` → "Winner!"
4. **Attempt Counter**: Tracks and limits number of guesses
5. **Input Validation**: Ensures valid number inputs

---

## 💻 Key Programming Concepts

This project demonstrates:

- **Control Flow**: while loops, if-else statements
- **User Input**: Scanner class for reading console input
- **Random Number Generation**: Math.random() method
- **Variable Management**: int variables for game state
- **Method Design**: Modular programming approaches
- **Exception Handling**: Input validation and error management

---

## 🏆 Learning Outcomes

By completing this project, you will practice:

- ✅ **Java Fundamentals**: Variables, data types, operators
- ✅ **Control Structures**: Loops and conditional statements  
- ✅ **User Interaction**: Console input/output operations
- ✅ **Problem Solving**: Game logic and algorithm design
- ✅ **Code Organization**: Clean, readable code structure

---

## 🚀 Future Enhancements

Potential improvements for advanced learning:

- [ ] **Difficulty Levels**: Easy (1-50), Medium (1-100), Hard (1-500)
- [ ] **GUI Interface**: Swing or JavaFX graphical interface
- [ ] **High Score System**: Save and display best scores
- [ ] **Multiplayer Mode**: Take turns guessing
- [ ] **Custom Ranges**: User-defined number ranges
- [ ] **Hint System**: Additional clues for struggling players
- [ ] **Statistics**: Track win rate and average attempts

---

## 📚 About OIBSIP

This project was completed as part of the **Oasis Infobyte Student Internship Program**:
- **Program**: Java Development Internship
- **Task**: Task 2 - Number Guessing Game
- **Duration**: 4 weeks
- **Focus**: Practical Java programming skills

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/improvement`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/improvement`)
5. Create a Pull Request

---

## 🙏 Acknowledgments

- **Oasis Infobyte** for the internship opportunity
- **Java Community** for excellent documentation and resources
- **Open Source Contributors** for inspiration and best practices

---

**Ready to test your guessing skills? Clone the repo and start playing! 🎯**
