package Deserialization;

import java.io.IOException;
import java.io.FileInputStream;
import java.util.Set;
import java.io.ObjectInputStream;

public class Test1 {
    public void test(FileInputStream fileIS) throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(fileIS);
        ParentClass userParent = (ParentClass) in.readObject();
        ChildClass userChild = (ChildClass) userParent;
        in.close();
    }
}

class ParentClass {
    private int val;

    public ParentClass(int value){
        this.val = value;
    }
}

class ChildClass extends ParentClass {
    private ObjectClass obj = null;

    public ChildClass(int value){
        super(value);
        this.obj = new ObjectClass(value);
    }
}

class ObjectClass {
    private int val;
    private Set<String> setVal = null;

    public ObjectClass(int value){
        this.val = value;
    }
}