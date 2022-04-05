/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

//Вывод предыдущих результатов
public class Out {

    public static void main(String MassTela, String SkorostTela) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.out"));
        SerializableClass dateRestored = (SerializableClass) objectInputStream.readObject();
        objectInputStream.close();
        String q = String.valueOf(dateRestored);
        //Добавляем колекциб
        ArrayList<String> Out1 = new ArrayList<>(Arrays.asList(q));
        System.out.println(Out1);
    }
}
