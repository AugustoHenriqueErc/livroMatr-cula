public class CircularLinkedList {
    private Cell tail;
    private Cell head;
    public CircularLinkedList()
    {
        tail = null;
        head = null;
    }

    public void insertFirst(Student value){
        this.insertFirst(new Cell(value));
    }
    private void insertFirst(Cell cell){
        if(tail == null||head == null)
        {
            tail = cell;
            head = cell;
            tail.setNext(cell);
        }
        else {
            cell.setNext(head);
            head = cell;
            tail.setNext(cell);
        }
    }

    public void insertEnd(Student value)
    {
        this.insertEnd(new Cell(value));
    }

    private void insertEnd(Cell cell)
    {
        if((tail == null||head == null))
        {
            tail = cell;
            head = cell;
            tail.setNext(cell);
        }
        else
        {
            tail.setNext(cell);
            cell.setNext(head);
            tail = cell;
        }
    }

    public boolean search(Student value)
    {
        Cell aux = tail.getNext();
        while(aux != null)
        {
            if(aux.getValue() == value) return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        Cell aux = head;
        StringBuilder sb = new StringBuilder();
        do
        {
            sb.append(aux.toString()).append(" | ");
            aux = aux.getNext();
        }while (aux != head);
        return sb.toString();
    }

    public void print(String course)
    {
        Cell aux = head;
        StringBuilder sb = new StringBuilder();
        do
        {
            if(course == aux.getValue().getCourse()) sb.append(aux.toString()).append(" | ");
            aux = aux.getNext();
        }while (aux != head);
        System.out.println(sb.toString());
    }

    public void print(int ID)
    {
        Cell aux = head;
        StringBuilder sb = new StringBuilder();
        do
        {
            if(ID == aux.getValue().getID()) sb.append(aux.toString()).append(" | ");
            aux = aux.getNext();
        }while (aux != head);
        System.out.println(sb.toString());

    }

}