public abstract class RegnoAnimale implements Movimento {

    public void dormi(){
        System.out.println("Zzz");
    }
    
    public abstract void verso();

    public abstract void mangia();

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

    @Override
    public void corri() {
        System.out.println("Sto correndo!!!");
    }

    public static void faiVolare(RegnoAnimale animale){
        animale.vola();
    }

    public static void faiNuotare(RegnoAnimale animale){
        animale.nuota();
    }

    public static void faiCorrere(RegnoAnimale animale){
        animale.corri();
    }
}