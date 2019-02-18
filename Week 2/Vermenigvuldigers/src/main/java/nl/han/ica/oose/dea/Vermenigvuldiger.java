package nl.han.ica.oose.dea;

public class Vermenigvuldiger implements Runnable {
    int Basis;
    int Vermenigvuldigingen;

//    public Vermenigvuldiger(int basis, int vermenigvuldigingen) {
//        Basis = basis;
//        Vermenigvuldigingen = vermenigvuldigingen;
//    }

    public Vermenigvuldiger(int basis) {
        Basis = basis;
        Vermenigvuldigingen = basis;
    }

    public void printTafel() {

for(var i = 0; i < Basis; i++){ System.out.println(i + "*" + Basis + "= " + rekenFuncties.vermenigvuldig(Basis, i));
        }
    }

    @Override
    public void run() {
        printTafel();
    }
}
