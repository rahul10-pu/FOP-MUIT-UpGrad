package com.upgrad.fop;

public class ThisOperator {
    public static void main(String[] args) {
        System.out.println("Hi");
        Mobile vivo= new Mobile();
        vivo.size=8;
        vivo.speakerPower=10;
        vivo.speaker=true;
        vivo.colour="Blue";
        vivo.mic=true;
        vivo.music("songabc");
    }

}
class Mobile {
    //define all the entity/properties/attributes/instance variable
    int size;
    boolean mic;
    boolean speaker;
    int speakerPower;
    int displaySize;
    String colour;
    int button;
    //feature
    void music(String songName){
        int speaker=3;
        if (this.speaker==true){
            System.out.println("You song: "+songName+" is playing now");
        }else{
            System.out.println("O garib aadmi, dusra mobile lele..speaker nhi hai isme");
        }
        System.out.println(speaker);
        System.out.println(this.speaker);
    }
    boolean recording(){
        if(mic==true){
            System.out.println("Recordingg has started");
            System.out.println("It ended..ho gya..chalo niklo ab");
            return true;
        }
        return false;
    }
    boolean call(String number){

        if(mic==true && speaker==true){
            System.out.println("Call to "+number+" has been started");
            return true;
        }else{
            System.out.println("Your mic or speaker is missing..can't call");
            return false;
        }
    }
    boolean callRecording(String number){
        boolean isRecordingPossible=recording();
        boolean isCallPossibale= call(number);
        if(isCallPossibale == true & isCallPossibale ==true){
            System.out.println("Call recording working fine");
            return true;
        }
        return false;
    }
}