package com.example.effectivejava.chapter01.item03.serialization;

import java.io.*;
import java.time.LocalDate;

public class SerializationExample {

    private void serialize(Book book){
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))){
            out.writeObject(book);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private Book deserialize(){
       try(ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))){
           return (Book) in.readObject();
       }catch (IOException | ClassNotFoundException e){
           throw new RuntimeException(e);
       }
    }

    public static void main(String[] args) {
        Book book = new Book("12345", "이펙티브 자바", "백기선", LocalDate.of(2002, 6, 13));
        book.setNumberOfSold(200);

        SerializationExample example = new SerializationExample();
        example.serialize(book);
        Book deserializedBook = example.deserialize();

        System.out.println(book);
        System.out.println(deserializedBook);
    }

}
