package com.upgrad.fop.com.upgrad.muit;

public class SmartPhone {
    //define all the entity/properties/attributes
    int size;
    boolean mic;
    boolean speaker;
    int speakerPower;
    int displaySize;
    String colour;
    int button;
    //feature
    void music(String songName){
        if (speaker==true){
            System.out.println("You song: "+songName+" is playing now");
        }else{
            System.out.println("O garib aadmi, dusra mobile lele..speaker nhi hai isme");
        }
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
    public static void main(String[] args) {
        SmartPhone oppo= new SmartPhone();
        oppo.size=7;
        oppo.speaker=true;
        oppo.speakerPower=5;
        oppo.colour="white";
        oppo.call("9999999999");
        boolean oppoResult=oppo.callRecording("9999999898");
        if (oppoResult==true){
            System.out.println("Call recording is working fine");
        }else{
            System.out.println("Esa hai..chinies maal hai..nhi kaam kar rha kuch bhi sahi se");
        }
        SmartPhone vivo= new SmartPhone();
        vivo.size=8;
        vivo.speakerPower=10;
        vivo.speaker=true;
        vivo.colour="Blue";
        vivo.mic=true;
        vivo.call("8888888888");


    }
}