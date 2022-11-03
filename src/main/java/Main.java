public class Main {
    public static void main(String[] args){

        String doneText = "The Memento Design Pattern\nHow to implement it in Java?\n";

        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();
        textEditor.write("Buy milk and eggs before coming home\n");
        textEditor.hitUndo();


        //Test
        if(textEditor.print().equals(doneText)){
            System.out.println("It's the same :-)");
        }else{
            System.out.println("It's NOT the same");
        }


    }
}
