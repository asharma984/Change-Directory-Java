import java.util.Stack;

public class ChangeDirectory {
  public static void main(String[] args)
  {
    String currentPath=args[0];
    String changePath=args[1];
    System.out.println(changePath(currentPath,changePath));
  }

  public static String changePath(String current, String change) {

    if (change == null || change.trim().isEmpty()) {
      return current;
    }
    if(change.charAt(0)=='/')
    {
      current="";
    }

    Stack<String> stack = new Stack<>();
    String[] currentComponents = current.split("/");
    for (String directory : currentComponents) {
      if (!directory.isEmpty()) {
        stack.push(directory);
      }
    }
    String[] changeComponents = change.split("/");
    if(changeComponents.length==1 && (!changeComponents[0].equals(".") &&
            !changeComponents[0].equals("..")) && (!Character.isLetter(changeComponents[0].charAt(0)))
    && (!Character.isDigit(changeComponents[0].charAt(0))))
    {
      return "No Such Directory exist.";
    }

    for (String directory : changeComponents) {
      if(directory.equals(""))
      {
        continue;
      }
      if((!Character.isLetter(directory.charAt(0)))
              && (!Character.isDigit(directory.charAt(0)))&& (!changeComponents[0].equals(".") &&
              !changeComponents[0].equals("..")))
      {
        return "No Such Directory exist.";
      }
      // current directory . or empty directory
      if (directory.isEmpty() || directory.equals(".")) {
        continue;
      }

      // Previous directory ..
      if (directory.equals("..")) {
        // if stack is not empty then go to previous directory
        if (!stack.isEmpty()) {
          stack.pop();
        }
      } else {
        stack.push(directory);
      }
    }


    StringBuilder resultPath = new StringBuilder();

    while (!stack.isEmpty()) {
      resultPath.insert(0,stack.pop());
      resultPath.insert(0,"/");
    }
    return resultPath.length() > 0 ? resultPath.toString() : "/";

  }


}
