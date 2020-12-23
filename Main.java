class Main {
  public static void main(String[] args) {
    String str = "navE si eman yM iH";
    char[] charInput = str.toCharArray();
    String reversedInput = "";

    System.out.println(str);

    for (int i = charInput.length - 1; i >= 0; --i) {
      reversedInput += charInput[i];
    }

    System.out.println(reversedInput);
  }
}