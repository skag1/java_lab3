public class Baton {
    private double mass;
    public Baton(){
        this.mass = 2.5;
    }
//    public Baton(double mass){
//        this.mass = mass;
//    }
    public void hit(Gate gate, Human human, Material material){
        if(mass * human.getPower() > gate.calcHardness()){
            System.out.println(gate.getType() + ", сделанная из " + material.toString() + ", сломалась");
            //впринципе можно и не писать toString()
            gate.setStatus(Status.BROKEN);
        }
        else {
            gate.setStatus(Status.UNBROKEN);
        }
    }
}