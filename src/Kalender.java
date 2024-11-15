public class Kalender {

    private String monat;
    private int tage;

    public Kalender(String monat, int tage) {
        this.monat = monat;
        this.tage = tage;
    }


    public void arbeitstage(){
        int wochen = tage /7;
        System.out.println("Unserer Monat " + monat + " hat " + wochen + " Wochen.");
        int restTage = tage % 7;
        System.out.println("Unserer Monat " + monat + " hat " + restTage + " Resttage.");

        int arbeitstage = wochen * 5 + restTage;
        System.out.println("Unserer Monat " + monat + " hat " + arbeitstage + " Arbeitstage.");
    }
}
