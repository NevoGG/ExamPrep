package utility_abilities;

import java.io.*;

public class Serialization implements Serializable { // must implement
    public transient int field1 = 0; // if its not serializable or we dont want it to be
    public String field2 = "data"; // if we create a class that's stored here we need to also implement Serializable.

    public static void main(String[] args){
        try{ // the compiler doesnt catch this so we have to do it
            // all this for writing in stream:
            OutputStream outStream = new FileOutputStream("filename.ser");
            ObjectOutputStream out = new ObjectOutputStream(outStream);
            out.writeObject(new Serialization());

            InputStream inStream = new FileInputStream("filename.ser");
            ObjectInputStream in = new ObjectInputStream(inStream);
            Serialization newObj = (Serialization) in.readObject();
        } catch (FileNotFoundException | IOException e){
            e.printStackTrace(); //
        }
    }
