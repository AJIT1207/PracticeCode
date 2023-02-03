package geeksforgeeks;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        StackDemo editor = new StackDemo();
        editor.addText("Ajit");   //We can pass the value in method
        System.out.println(editor.getText());  // will print Ajit in console
        editor.addText("Jaiswal");
        System.out.println(editor.getText()); // will print AjitJaiswal in console
        editor.unDo();
        System.out.println(editor.getText()); // will print Ajit in console
        editor.reDo();
        System.out.println(editor.getText()); // will print AjitJaiswal in console


    }

    Stack<String> undoStack ;  //this undoStack is to store the previous state for undo
    Stack<String> redoStack ; // this redostack is to store states for redo
    String currentText;

    public  StackDemo()  //Constructor for Stackdemo class
    {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        currentText = "";  //creating empty string
    }

    //method to add text to the editor reference
    public void addText(String text)
    {
        undoStack.push(currentText);  //push currentText to undoStack
        currentText = currentText + text; //add new text passing from main method to currentText
    }

    //method to undo the last action
    public void unDo()
    {
        if (!undoStack.isEmpty())
        {
            redoStack.push(currentText);  //push currentTetx to redo stack
            currentText = undoStack.pop(); //set currentText to previous state
        }
        else
        {
            System.out.println("nothing to undo"); //if nothing
        }
    }

    //method to redo the last undo action
    public void reDo()
    {
        if (!redoStack.isEmpty())
        {
            undoStack.push(currentText);  //push currentText to undoStack
            currentText  = redoStack.pop(); //set currentText to next state
        }
        else
        {
            System.out.println("nothting to redo");
        }
    }

    //method to get the current text in the editor
    public String getText()
    {
        return currentText;
    }




}
