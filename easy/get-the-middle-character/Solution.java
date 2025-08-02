class Kata {
  public static String getMiddle(String word) {

    if (word.length() == 1 ||word.length() == 2 ) return word;
    

    String middle = "";

    if (word.length() % 2 == 0) {
      middle += word.charAt((word.length() / 2) - 1);
      middle += word.charAt(word.length() / 2);
    } else {
      middle += word.charAt(word.length() / 2);
    }

    return middle;
  }
}
