package com.progetto;




public class Stringhe  {



    public static void main(String[] args) {
        String stringa1 = "Questa è una stringa";
        String stringa2 = "Questa è una seconda stringa";
        UguaglianzaStringa uguaglianzaStringa = new UguaglianzaStringa();
        boolean uguali = uguaglianzaStringa.uguaglianza(stringa1,stringa2);
        if(!uguali){
            System.out.println("Sono diverse");
        }

    }
}