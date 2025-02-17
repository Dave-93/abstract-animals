public class Main {
    public static void main(String[] args) {
        RegnoAnimale bery = new Cane();
        bery.dormi();
        bery.verso();
        bery.mangia();
        //bery.corri();
        RegnoAnimale.faiCorrere(bery);

        RegnoAnimale gwaihir = new Aquila();
        gwaihir.dormi();
        gwaihir.verso();
        gwaihir.mangia();
        //gwaihir.vola();
        RegnoAnimale.faiVolare(gwaihir);

        RegnoAnimale passero = new Passerotto();
        passero.dormi();
        passero.verso();
        passero.mangia();
        //passero.vola();
        RegnoAnimale.faiVolare(passero);

        RegnoAnimale curioso = new Delfino();
        curioso.dormi();
        curioso.verso();
        curioso.mangia();
        //curioso.nuota();
        RegnoAnimale.faiNuotare(curioso);
    }
}