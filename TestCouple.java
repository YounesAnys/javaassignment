public class TestCouple extends Couple{
    
    

    public static void main(String[] args){
        Couple c1 = new Couple(2,3);
        Couple c2 = new Couple(0,0);
        Couple c3 = new Couple(2,3);

        display( c1);
        display( c2);
        display( c3);


        c3.setP(8);
        System.out.printf("Apres modification, les elements de c3 sont :" + c3.getP()+","+ c3.getQ()+"\n");

        
        System.out.println("c1 est inferieur a c3 :" + compare(c1,c3));

    }
}
