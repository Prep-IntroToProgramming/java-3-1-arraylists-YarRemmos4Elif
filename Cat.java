public class Cat {
    private String name;/*creates a name variable*/
    private double weight;/*creates a weight value variable*/
    void setName (String nName){
        name = nName;
    }
    void setWeight (double wWeight){
        weight = wWeight;
    }
    String getName (){
        return name;
    }
    double getWeight (){
        return weight;
    }
    public Cat(){
    }
    public Cat(String nName){
        name = nName;
    }
    void meow(){/*this is the method that prints out meow*/
        System.out.println("Meow");
    }
}
