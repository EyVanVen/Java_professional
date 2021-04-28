package homework5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String text = "The twenty first century we can't imagine our lives without technologies. And the teenagers " +
                "understand them more, than other generations. Lot's of young people are keen on them and that makes " +
                "them create something on their own, buy the created ones or just spectate the progress. And that makes " +
                "people, who connected with making gadgets really admirable. One of them is an American engineer, " +
                "businessman, billionaire, founder of PayPal, Tesla, SpaceX.";

        String temp1, temp2;

        String [] sentences = text.split("\\.");

        for (int i = 0; i < sentences.length; i++){

            String oneSent = sentences[i] + ".";



            oneSent = oneSent.trim();

            temp1 = oneSent.substring(0, oneSent.indexOf(" "));
            temp2 = oneSent.substring(oneSent.lastIndexOf(" ") + 1);

            String out1 = oneSent.replace(oneSent.substring(0, oneSent.indexOf(" ")), temp2);

            String out =" " + out1.replace(oneSent.substring(oneSent.lastIndexOf(" ")), temp1);

            System.out.println(out);
            System.out.println(oneSent.length());
            System.out.println(out.length());
        }

    }

}
