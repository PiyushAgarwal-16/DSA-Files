public class Q4{
    public static void main(String args[]){
        int space = ' ';
        System.out.println("Space: " + space);
        for(char ch = 'A'; ch <= 'Z'; ch++){
            // System.out.println((char) (ch | ' '));
            int ascii = ch;
            System.out.println("ASCII: "+ ascii);
        }

        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println("After OR operation: " + (ch | ' '));
            System.out.println("After OR operation: " + (char)(ch | ' '));
            // Although this can also be done using ch + ' '
        }
    }
}

// The code you provided actually performs an OR operation between an **uppercase character** and `' '` (a space character), and the result is a **lowercase character**. Let me explain step by step how this works.

// ### Key Concepts
// 1. **Characters in Java**: Characters are internally represented as integers using their ASCII (or Unicode) values. For example:
//    - `'A'` has an ASCII value of `65`.
//    - `'a'` has an ASCII value of `97`.
//    - `' '` (space) has an ASCII value of `32`.

// 2. **Bitwise OR (`|`)**: The OR operation compares each bit of two numbers. If either of the bits is `1`, the result is `1`. Otherwise, the result is `0`.

// 3. **Uppercase and Lowercase in ASCII**:
//    - Uppercase letters (`A-Z`) have ASCII values from `65` to `90`.
//    - Lowercase letters (`a-z`) have ASCII values from `97` to `122`.
//    - The difference between uppercase and lowercase letters is **32**. In binary:
//      - `'A'` = `01000001`
//      - `'a'` = `01100001`
//      - Notice that the 6th bit (from the right) is `0` for uppercase and `1` for lowercase.

// 4. **Space Character (`' '` = 32)**:
//    - `' '` in binary is `00100000`.
//    - Performing an OR operation with `' '` sets the 6th bit to `1`, which converts an uppercase letter to its lowercase equivalent.

// ---

// ### Step-by-Step Explanation of the Code
// Here’s what happens in your code:

// 1. **Loop through uppercase letters**:
//    ```java
//    for (char ch = 'A'; ch <= 'Z'; ch++) {
//    ```
//    This iterates through all uppercase letters from `'A'` to `'Z'`.

// 2. **Perform OR operation**:
//    ```java
//    ch | ' '
//    ```
//    - For example, take `'A'`:
//      - `'A'` in binary: `01000001`
//      - `' '` in binary: `00100000`
//      - OR result: `01100001` (which is the binary representation of `'a'`).

//    - Similarly, for `'B'`:
//      - `'B'` in binary: `01000010`
//      - `' '` in binary: `00100000`
//      - OR result: `01100010` (which is `'b'`).

//    This operation effectively converts the uppercase letter to its lowercase equivalent.

// 3. **Print the result**:
//    ```java
//    System.out.println("After OR operation: " + (ch | ' '));
//    ```
//    This prints the integer value of the result (since `ch | ' '` is treated as an integer). If you want to see the character, you can cast it back to `char`:
//    ```java
//    System.out.println("After OR operation: " + (char)(ch | ' '));
//    ```

// ---

// ### Example Output
// For the first few iterations:
// ```
// After OR operation: a
// After OR operation: b
// After OR operation: c
// ...
// ```

// ---

// ### Summary
// The OR operation with `' '` works because it sets the 6th bit of the character to `1`, which is the difference between uppercase and lowercase letters in ASCII. If you want to convert **lowercase to uppercase**, you would use a **bitwise AND** with the complement of `' '` (`~' '`), which clears the 6th bit.