package pharmacysystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class fileSave implements Serializable {
    public static void saveFile(String fileName, ArrayList arr) {
        try{
            FileOutputStream fos = new FileOutputStream(new File(fileName+".dat"));
            ObjectOutputStream objectOut = new ObjectOutputStream(fos);
            objectOut.writeObject(arr);
        }
        catch (IOException e){
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }
    public static ArrayList readFile(String fileName) {
        ArrayList returning = new ArrayList();
        try{
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            returning = (ArrayList) obj;
            return returning;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return returning;
    }
    
}

