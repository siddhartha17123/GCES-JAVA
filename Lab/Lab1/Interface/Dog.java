class Dog implements Animal{
    public void sound(){
        System.out.println("Sleeping");
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
    }
}