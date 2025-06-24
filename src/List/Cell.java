
package List;
import book.Student;

public class Cell {
    Student value;
    Cell next;

    public void setValue(Student value) {
        this.value = value;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell(Student value){
        this.value = value;
        this.next = null;
    }

    public Cell getNext() //throws NullPointerException
    {
        return next;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
