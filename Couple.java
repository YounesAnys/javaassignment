public class Couple{
    //deux attributs privées p et q de type int (éléments d’un couple)
    private int p;
    private  int q;

    // un constructeur pour initialiser les attributs privés du couple.
    public Couple(int p, int q) {
        this.p = p;
        this.q = q;
    }

    // un deuxième constructeur qui initialisera à 0 les éléments du couple
    public Couple() {
        int p = 0;
        int q = 0;

    }

    // un troisième constructeur, qui initialisera un couple à l’aide d’un autre
    // couple.
    public Couple(Couple p1, Couple q1) {
        p = p1.p;
        q = q1.q;

    }

    // des méthodes getP et getQ permettant d’accéder à chaque élément du couple
    public int getP() {
        return p;
    }

    public int getQ() {
        return q;
    }

    // des méthodes setP et setQ permettant de modifier chaque élément du couple.
    public void setP(int p2) {
        this.p = p2;

    }

    public void setQ(int q2) {
        this.q = q2;
    }

    // méthode display qui affichera les variables d’instance.
    public static void display(Couple a) {
        System.out.printf("(" + a.p + "," + a.q + ")"+"\n");
        
    }
    //méthode compare
    public static boolean compare(Couple a, Couple b){

        if ( a.p < b.p || (a.p == b.p && a.q < b.q)){
           
        }
        return true;

    }

    

   }