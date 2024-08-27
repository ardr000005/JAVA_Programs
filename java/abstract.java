abstract class shape {
    abstract void sides();
}
class rectangle extends shape{
    void sides(){
        System.out.println("The Number of sides = 4");
    }
}
class hexagon extends shape{
    void sides(){
        System.out.println("The Number of sides = 6");
    }
}
class octagon extends shape{
    void sides(){
        System.out.println("The Number of sides = 8");
    }
}
class Test{
    public static void main (String [] args){
        shape sh;
        sh = new hexagon();
        sh.sides();
        sh = new octagon();
        sh.sides();
        sh = new rectangle();
        sh.sides();
    }

}