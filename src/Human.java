public abstract class Human implements IType{
    protected String name;
    protected String type;
    protected double power;
    //power - это процент силы человека от 0 до 1
    public Human(String name){
        this.name = name;
        this.power = 0.5;
    }
    public Human(String name, double power){
        this.name = name;
        this.power = power;
    }
    public String getName(){
        return name;
    }
    public double getPower(){
        return power;
    }
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Human that = (Human)obj;
        if(power != that.power)return false;
        return name == that.name;
    }

    @Override
    public int hashCode(){
        int result = 1;
        result = result * 31 +(int)power;
        return result;
    }
}