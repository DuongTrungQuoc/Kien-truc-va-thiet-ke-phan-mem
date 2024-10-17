package creational.prototype;

import java.io.*;

public abstract class Prototype implements  IPrototype{
    @Override
    public Object copy(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            oos.close();
            bos.close();
            byte[] byteData = bos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(byteData);
            return new ObjectInputStream(bais).readObject();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    public Object clone() {
        try{
            return super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.toString());
            return null;
        }
    }


}
