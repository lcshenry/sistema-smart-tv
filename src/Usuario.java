public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.decreaseSound();
        smartTV.decreaseSound();
        smartTV.decreaseSound();
        smartTV.increaseSound();

        System.out.println("Canal Atual ?" + " " + smartTV.channel);

        smartTV.changeChannel(13);
        System.out.println("Canal Atual ?" + " " + smartTV.channel);

        System.out.println("Volume Atual ?" + " " + smartTV.sound);

        System.out.println("TV ligada ?" + " " + smartTV.turnOn);
        System.out.println("Canal Atual ?" + " " + smartTV.channel);
        System.out.println("Volume Atual ?" + " " + smartTV.sound);

        smartTV.on();
        System.out.println("Novo Status -> TV ligada ?" + " " + smartTV.turnOn);
        smartTV.off();
        System.out.println("Novo Status -> TV ligada ?" + " " + smartTV.turnOn);
    }
}
