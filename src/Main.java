public class Main {
    public static void main(String[] args) {
        RegnoAnimale bery = new Cane();
        bery.dormi();
        bery.verso();
        bery.mangia();

        RegnoAnimale gwaihir = new Aquila();
        gwaihir.dormi();
        gwaihir.verso();
        gwaihir.mangia();

        RegnoAnimale pass = new Passerotto();
        pass.dormi();
        pass.verso();
        pass.mangia();

        RegnoAnimale curioso = new Delfino();
        curioso.dormi();
        curioso.verso();
        curioso.mangia();
    }
}