package ass3;

public class Object {

  //  are these scoped correctly?
  private String attr1;
  public String attr2;
  
  public static void main(String[] cheese) {
    //cant return anything on a void method, so pass this stuff to another method
    instantiator(cheese);
  }

  
  //Create/instantiate the object 
  private static Object instantiator(String[] cheese) {
    //how do i declare/access the new object type? which scope?
    var instantiatedObject = new Object(); //this is what i want to happen, but dont know how....
    instantiatedObject.attr1 = new String();
    instantiatedObject.attr2 = new String();
    return instantiatedObject;
  }

  public void setAttr1(String stringToBeStored) {
    this.attr1 = stringToBeStored;
  }

  public String getAttr2() {
    return attr2;
  }


}
 