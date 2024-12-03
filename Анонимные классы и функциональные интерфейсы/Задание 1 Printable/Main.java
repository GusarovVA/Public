package anonimys;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Printable print1 = new Printable() {
            @Override
            public void print() {
                System.out.println("Печать фото");
            }
        };
        Printable print2 = new Printable() {
            @Override
            public void print() {
                System.out.println("Печать текста");
            }
        };
        Printable print3 = new Printable() {
            @Override
            public void print() {
                System.out.println("Печать денег");
            }
        };
        print1.print();
        print2.print();
        print3.print();
    }
}