//Given a string, remove duplicate letters/chars
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    String tester = "This is a random string";
    System.out.println(removeDuplicates(tester));

  }

  public static String removeDuplicates(String input){
    //make a list of all the characters
    //only new characters get added to the list
    //build a string with those characters

    List<Character> list = new ArrayList<Character>();  
    StringBuilder newString = new StringBuilder();

    for(int charIndex =  0; charIndex < input.length(); charIndex++){
      char current = input.charAt(charIndex);
      if(!list.contains(current)){
        list.add(current);
        newString.append(current);
      }
    }

    return newString.toString();
  }
}
