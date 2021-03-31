package moreclasses;

interface Animall {
    public void eat();
}
class Cat implements Animall{
    public void eat(){
        System.out.println("Cat eats");
    }
}
