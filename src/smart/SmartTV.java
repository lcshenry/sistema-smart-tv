package smart;

public class SmartTV {
    boolean turnOn = false;
    int channel = 1;
    int sound = 25;
    public void changeChannel(int newChannel){
        channel = newChannel;
    }
    public void increaseChannel(){
        channel++;

    }
    public void decreaseChannel(){
        channel--;
    }

    public void increaseSound(){
        sound++;
        System.out.println("Aumentando o volume para: " + " " + sound);
    }
    public void decreaseSound(){
        sound--;
        System.out.println("Diminuindo o volume para: " + " " + sound);
    }
    public void on(){
        turnOn = true;
    }
    public void off(){
        turnOn = false;
    }
}

