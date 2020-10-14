public class Person {
    private String name;
    private int age;

    public Person(String name) throws EmptyFieldException {
        if(name.isEmpty()){
           throw new EmptyFieldException();
        }
        this.name = name;
        this.age = 0;
    }

    public void setName(String name) throws EmptyFieldException{ //todo : to create excetpion
        if(!name.isEmpty()){
            this.name = name;
        }
        throw new EmptyFieldException();
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age) throws EmptyFieldException {
        if(age <= 18){
            throw new EmptyFieldException("The age can't be less than 18");
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Person: "+
                "\n  Name: "+ this.getName() +
                "\n  Age: "+ this.getAge();
    }

}
