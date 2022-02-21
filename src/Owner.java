public class Owner extends Human{

    private final double hearingCondition;
    //hearingCondition - это процент потери слуха у человека от 0 до 1
    public Owner(String name) {
        super(name);
        this.hearingCondition = 0.5;
    }

    public Owner(String name, double hearingCondition) {
        super(name);
        this.hearingCondition = hearingCondition;
    }

    public boolean hear(String policeWord, double volume){
        if(volume >= this.hearingCondition){
            System.out.println(getName() + " услышал слово " + policeWord);
            System.out.println(getName() + " растерялся и моментально открыл калитку.");
            System.out.println(getName() + " затрясся всем телом и уронил ружье.");
            return true;
        }
        else {
            System.out.println(getName() + " не услышал слово " + policeWord);
            System.out.println(getName() + " взял ружье и начал стрелять в небо");
            return false;
        }
    }

    public void leave(){
        System.out.println(getType() + " " + getName() + " вышел с ружьем в руках и зашлепал в своих шлепанцах по дорожке.");
    }
    public void stay(){
        System.out.println(getType() + " " + getName() + " испугался и не вышел из дома.");
    }

    @Override
    public String getType(){
        return "Владелец";
    }
}