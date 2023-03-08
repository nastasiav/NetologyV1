package ru.netology.oop.lvl4.l1;

/**
 * @author: Baeva Nastasia
 */
public class PasswordChecker {
    private int minLength;
    private int maxRepeats;
    private int count;

    public void setMinLength(int minLength) {
        if (minLength <= 0) {
            throw new IllegalArgumentException("Incorrect min length: " + minLength);
        }
        else {
            count++;
            this.minLength = minLength;
        }
    }
    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("Incorrect max repeats: " + maxRepeats);
        }
        else {
            count++;
            this.maxRepeats = maxRepeats;
        }
    }
    public boolean verify(String password){
        if(count != 2) {
            throw new IllegalStateException("No setters for settings");
        }
        if (password.length() >= minLength) {
            for (int i = 0; i < password.length() - maxRepeats; i++) {
                int count = 0;
                for(int j = i; j < password.length(); j++) {
                    if(password.charAt(i) == password.charAt(j))
                        count++;
                    if(count > maxRepeats)
                        return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
