# Password Generator Project

## Documentation

### Project Description
This project is a Java-based password generator that creates random passwords based on user preferences. The user can specify the length of the password and choose which character types to include (lowercase letters, uppercase letters, numbers, and symbols). The program also evaluates the strength of the generated password.

### Design Choices
1. **Character Sets**:
   - The program uses predefined strings for lowercase letters, uppercase letters, numbers, and symbols.
   - These sets are combined into a single character pool based on user input.

2. **Password Generation**:
   - The `generatePassword` method uses the `Random` class to select characters randomly from the character pool.
   - The length of the password is determined by user input.

3. **Password Strength Evaluation**:
   - The `evaluatePasswordStrength` method checks the password length and the presence of different character types to determine its strength.
   - The strength is categorized as "Very Strong," "Strong," "Medium," or "Weak."

### Algorithms and Data Structures
- **Random Number Generation**: The `Random` class is used to generate random indices for selecting characters from the character pool.
- **String Manipulation**: The `StringBuilder` class is used to efficiently build the character pool and the password.
- **Regular Expressions**: The `matches` method is used to check for the presence of specific character types in the password.

### Challenges Encountered
1. **Input Validation**:
   - Ensuring that the user provides valid input for password length and character type preferences was a challenge. The program currently assumes valid input.

2. **Password Strength Criteria**:
   - Defining clear and meaningful criteria for evaluating password strength required careful consideration.

### Improvements Made
- The initial implementation was enhanced to include password strength evaluation, providing users with feedback on the quality of their generated password.

### Input and Output Files
- **Input**: The program does not use external input files. All input is provided by the user via the console.
- **Output**: The program outputs the generated password and its strength evaluation to the console. Sample outputs are provided in the `test_files` folder.

### Additional Details
- The program is designed to be simple and user-friendly, with clear prompts and feedback.
- Future improvements could include enhanced input validation, support for external input/output files, and more sophisticated password strength evaluation.

---

## How to Run the Program
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/PasswordGenerator.git
