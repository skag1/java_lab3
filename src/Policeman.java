public class Policeman extends Human {

    private final double voiceVolume;
    //voiceVolume - это процент громкости голоса человека от 0 до 1
    public String policeWord = "полиция";

//    public Policeman(String name, double power){
//        super(name, power);
//        this.voiceVolume = 0.5;
//    }
    public Policeman(String name, double voiceVolume, double power){
        super(name, power);
        this.voiceVolume = voiceVolume;
    }

    public void check(Lamp lamp, Baton baton, Gate gate, Human human){
        if(lamp == Lamp.ON){
            System.out.println(getName() + " подошел к воротам и заметил свет в окнах дома.");
            System.out.println(getName() + " принялся громко стучать дубинкой в калитку.");
            baton.hit(gate, human, gate.getMaterialType());
        }
        if(lamp == Lamp.OFF){
            System.out.println(getName() + " подошел к воротам, не увидел свет в окнах дома и ушел");
        }
    }
    public void say(){
        if(this.voiceVolume > 0.5) {
            System.out.println(getType() + " громко произнес " + policeWord + "!");
        }
        else {
            System.out.println(getType() + " произнес " + policeWord);
        }
    }
    public void run(){
        System.out.println(getType() + " " + getName() + " испугался и убежал");
    }

    public double getVoiceVolume(){
        return voiceVolume;
    }

    @Override
    public String getType(){
        return "Полицейский";
    }
}