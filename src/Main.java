public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Augusto", "BSI");
        Student s2 = new Student("João Pedro", "BSI");
        Student s3 = new Student("João Victor", "BSI");
        Student s4 = new Student("Rodrigo", "Engenharia de Controle de Automação");

        CircularLinkedList l1 = new CircularLinkedList();
        l1.insertEnd(s1);
        l1.insertFirst(s2);
        l1.insertFirst(s3);
        l1.insertEnd(s4);

        System.out.println(l1);


    }
}