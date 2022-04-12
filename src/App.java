public class App {
    public static void main(String[] args) throws Exception {
        Alimentare pastaPenne = new Alimentare("penne n°12",4.35,"italy",2023,12);
        Alimentare fragole = new Alimentare("fragole",3.50,"poland",2022,5);
        Alimentare latte = new Alimentare("latte intero",1.40,"italy",2021,12);

        NonAlimentare quaderno = new NonAlimentare("quaderno a righe", 5.12, "china", "carta", false);
        
        System.out.println(pastaPenne.toString());
        System.out.println(fragole.toString());
        System.out.println(latte.toString());
        System.out.println(quaderno.toString());
        System.out.println("-----------------------------");
        pastaPenne.applicaSconto();
        fragole.applicaSconto();
        latte.applicaSconto();
        quaderno.applicaSconto();
        System.out.println(pastaPenne.toString());
        System.out.println(fragole.toString());
        System.out.println(latte.toString());
        System.out.println(quaderno.toString());

    }
}
