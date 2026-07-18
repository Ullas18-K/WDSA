package arraysNew;

public class arrlistimp {


    private int[] arr;
    private int size;

    public arrlistimp() {
        arr = new int[10];
        size = 0;
    }

    private void resize() {
        int[] newArr = new int[arr.length * 2];

        for(int i = 0; i < arr.length; i++)
            newArr[i] = arr[i];

        arr = newArr;
    }

    public void add(int value) {
        if(size == arr.length)
            resize();

        arr[size++] = value;
    }

    public void add(int index, int value) {

        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        if(size == arr.length)
            resize();

        for(int i = size; i > index; i--)
            arr[i] = arr[i-1];

        arr[index] = value;
        size++;
    }

    public int get(int index) {

        if(index >= size)
            throw new IndexOutOfBoundsException();

        return arr[index];
    }

    public void set(int index, int value) {

        if(index >= size)
            throw new IndexOutOfBoundsException();

        arr[index] = value;
    }

    public boolean contains(int value) {

        for(int i = 0; i < size; i++)
            if(arr[i] == value)
                return true;

        return false;
    }

    public void remove(int index) {

        if(index >= size)
            throw new IndexOutOfBoundsException();

        for(int i = index; i < size - 1; i++)
            arr[i] = arr[i + 1];

        size--;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
    }

    public void print() {

        System.out.print("[");

        for(int i = 0; i < size; i++) {

            System.out.print(arr[i]);

            if(i != size - 1)
                System.out.print(", ");
        }

        System.out.println("]");
    }


    static void main() {

        arrlistimp arr=new arrlistimp();
        arr.add(1);
        arr.add(2);

        arr.add(0,23);
        arr.clear();
        arr.print();
    }
}
