package Lecture09;

public class WrapperClasses {
    int[] arr;
    int object;

    WrapperClasses(){
        arr = new int[4];
        object = 0;
    }

    public void addElement(int element, int index){
        this.arr[index]= element;
        object++;
    }
}
