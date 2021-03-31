package moreclasses;

abstract class Animal {
    public int age;
    public abstract int printAge();
}
class cat extends Animal{
    public int printAge(){
        return age;
    }
}
