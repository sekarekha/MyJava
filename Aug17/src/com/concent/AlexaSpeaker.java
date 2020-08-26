package com.concent;

public class AlexaSpeaker {
    public static void main(String args[]){
        int playSong;
        String playBithdaySong;
        for(playSong=1;playSong<=5;playSong++){
            if(playSong<2){
                System.out.println("Play previous song: "+playSong);
            }else{
                System.out.println("play next song");
                break;
            }
        }
    }
}
