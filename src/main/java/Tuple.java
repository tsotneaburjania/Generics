// განზოგადებული კლასი, ზოგადი ტიპები თავშივე ეთითება
// ეს კლასი კონსტრუქტორში მიიღებს ორი ნებისმიერი ტიპის ობიექტს
// და შედეგად იქცევა ორი ნებისმიერი ტიპის ობიექტის წყვილად
public class Tuple<E,T> {
    private E elementOne;
    private T elementTwo;

    public Tuple(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public E getElementOne() {
        return elementOne;
    }

    public T getElementTwo() {
        return elementTwo;
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "elementOne=" + elementOne +
                ", elementTwo=" + elementTwo +
                '}';
    }
}
