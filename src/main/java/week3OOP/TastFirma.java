package week3OOP;

import java.util.ArrayList;
import java.util.List;

public class TastFirma {

    public static void main(String[] args) {

        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        worker1.setImie("Pavel");
        worker1.setNazwisko("Samsonenka");
        worker1.setPensja(3500);

        worker2.setImie("Jan");
        worker2.setNazwisko("Kowalski");
        worker2.setPensja(8000);

        worker3.setImie("Anna");
        worker3.setNazwisko("Kola");
        worker3.setPensja(7000);

        List<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);


        Firma firma1 = new Firma();
        Firma firma2 = new Firma();

        firma1.setNazwa("Astra");
        firma1.setSiedziba("Praga");
        firma1.setLiczbaPracownikow(workers.size());
        firma1.setWork(workers);

        firma2.setNazwa("Signum");
        firma2.setSiedziba("Warszawa");
        firma2.setLiczbaPracownikow(workers.size());
        firma2.setWork(workers);


        System.out.println(worker1.getImie());
        System.out.println(worker2.getImie());

        System.out.println(pensja(workers));
    }

    static List<Worker> pensja(List<Worker> workers){

        List<Worker> newWorkers = new ArrayList<>();

        for (Worker value: workers){
            if (value.getPensja() > 5000){
                newWorkers.add(value);
            }
        }
        return newWorkers;
    }
}
