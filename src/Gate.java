public class Gate implements IBuilded, IType {
    private double condition;
    //condition - это процент состояния от 0 до 1
    private Status status = Status.UNTOUCHED;
    private Material materialType;
    Gate(){
        setMaterialType(Material.WOOD);
        setCondition(1);
    }
//    Gate(Material materialType){
//        setMaterialType(materialType);
//        setCondition(1);
//    }
//    Gate(Material materialType, double condition){
//        setMaterialType(materialType);
//        setCondition(condition);
//    }
    Gate(Status status){
        setMaterialType(Material.WOOD);
        setCondition(1);
        this.status = status;
    }

//    public Status getStatus(){
//        return status;
//    }

    public void setStatus(Status status){
        this.status = status;
    }

    @Override
    public String getType(){
        return "Калитка";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Gate that = (Gate)obj;
        return status == that.status;
    }

    @Override
    public int hashCode(){
        int result = 1, length = this.status.toString().length();
        result = result * 31 + length;
        return result;
    }

    @Override
    public double calcHardness(){
        double hardness = 1;
        switch (this.materialType){
            case CONCRETE:
                hardness = condition * 2;
                break;
            case BRICK:
                hardness = condition * 3.5;
                break;
            case WOOD:
                hardness = condition * 7;
                break;
            case STEEL:
                hardness = condition * 50;
                break;
        }
        return hardness;
    }
    @Override
    public void setCondition(double value){
        if(value <= 1 && value > 0) {
            this.condition = value;
        }
        else {
            System.out.println("Cостояние " + getType() + " не может иметь такого значечния. Введите число от 0 до 1");
        }
    }
    @Override
    public void setMaterialType(Material materialType){
        this.materialType = materialType;
    }
//    @Override
//    public double getConditionValue(double value){
//        return value;
//    }
    @Override
    public Material getMaterialType(){
        return materialType;
    }
}