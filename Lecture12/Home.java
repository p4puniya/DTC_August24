package Lecture12;

public class Home {
    public static void main(String[] args) {
        Dogs dog1= new Dogs(
            "Shadow",
            "Bark",
            "Black",
            4,
            false,
            1
        );
        dog1.Displays();
        Dogs dog2= new Dogs();
        dog2.Displays();
    }
}
