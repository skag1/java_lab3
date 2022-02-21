public class Main {
    public static void main(String[] args) {

        //  Lamp.OFF   --   Мига уходит

        //  0.5,    0.5
        //  0.5     --      все по тексту

        //  0.5,    0.5     hearingCondition больше чем voiceVolume
        //  0.6     --      Фикс не услышит Мигу

        //  0.5,    1       mass дубинки большая
        //  0.5     --      Калитка сломается

        Policeman policeman = new Policeman("Мига", 0.5, 0.5);
        Owner owner = new Owner("Фикс", 0.5);

        Lamp lamp = Lamp.ON;
        Baton baton = new Baton();
        Gate gate = new Gate();
        Gate brokenGate = new Gate(Status.BROKEN);
        Gate unbrokenGate = new Gate(Status.UNBROKEN);
        policeman.check(lamp, baton, gate, policeman);
        if(gate.equals(brokenGate)){
            owner.stay();
        }
        else if(gate.hashCode() == unbrokenGate.hashCode()) {
            owner.leave();
            policeman.say();
            if(!owner.hear(policeman.policeWord, policeman.getVoiceVolume()))policeman.run();
        }
    }
}