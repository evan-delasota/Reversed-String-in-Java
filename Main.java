class Main {
  public static void main(String[] args) {
    String str = "navE si eman yM iH";
    System.out.println("String: " + str + "\n");

    str = reverseString(str);

    System.out.println("String Reversed: " + str + "\n");
  }

  public static String reverseString(String string) {
    if (string.length() <= 1 ) {
      return string;
    }

    char[] charInput = string.toCharArray();
    String reversedInput = "";
      for (int i = charInput.length - 1; i >= 0; --i) {
      reversedInput += charInput[i];
    }

    return reversedInput;
  }
}