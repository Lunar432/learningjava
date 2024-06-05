package learningjava;

import java.io.*;

class List implements Serializable {
    int Index;
    int MaxSize;
    int[] Data;

    public List() {
        MaxSize = 10;
        Index = -1;
        Data = new int[MaxSize];
    }

    public List(int mS) {
        this.MaxSize = mS;
        Index = -1;
        Data = new int[MaxSize];
    }

    public void push(int data) {
        if (Index < (MaxSize - 1)) {
            this.Data[++Index] = data;
        } else {
            System.out.println("Array is full");
        }
    }

    public void pop() {
        if (Index >= 0) {
            Index--;
        } else {
            System.out.println("List is empty");
        }
    }

    public int top() {
        if (Index >= 0) {
            return Data[Index];
        } else {
            System.out.println("List is empty");
            return -1;
        }
    }

    public void display() {
        for (int i = 0; i < Index; i++) {
            System.out.print(Data[i] + " ");
        }
        System.out.println();
    }

}

public class lab09_prob4 {
    public static void main(String[] args) {
        File f = new File("Lab08_04.dat");
        try (ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream(f))) {
            List[] lists = new List[5];
            for (int i = 0; i < lists.length; i++) {
                lists[i] = new List(5);
                for (int j = 0; j < 5; j++) {
                    lists[i].push((int) (0 + Math.random() * 10));
                }
                lists[i].display();
            }
            w.writeObject(lists);
            System.out.println("Five List objects have been written to Lab08_04.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
