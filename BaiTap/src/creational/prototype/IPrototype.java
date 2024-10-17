package creational.prototype;
import java.io.Serializable;

public interface IPrototype extends Cloneable, Serializable{
    Object copy() ;
    Object clone();
}
