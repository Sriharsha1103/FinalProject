package com.example.jokelib;

import java.util.Random;

public class MyJokes {
    private static String[] jokes = {
            " రాజేష్ : బావా... హైదరాబాద్\u200Cలో చేప, మందు ఫ్రీ అంటగా... బయలుదేరి వస్తున్నావా...\n" +
            "సురేష్ : ఒరేయ్ దరిద్రుడా... దాని అర్థం అది కాదురా... చేప, మందు కాదురా చేపమందు. ",
            " Two fish are sitting in a tank. One looks over at the other and says: Hey, do you know how to drive this thing?",
            " ఒరేయ్ సన్నీ.. దశరథుడికి ఎంతమంది కొడుకులో చెప్పు..? అడిగింది టీచర్"+
            "నలుగురు మేడమ్.."+" చెప్పాడు సన్నీ \n"+

            "గుడ్.. మరైతే వాళ్లెవరో వరుసగా చెప్పేసేయ్..? \n"+

            "మొదటివాడు, రెండోవాడు, మూడోవాడు, నాలుగోవాడు.. టీచర్!!",
            "I told my doctor that I broke my arm in two places. He told me to stop going to those places.",

            " డిశ్చార్జ్ అయి వెళ్లిపోతున్న పేషెంట్\u200Cతో....\n" +
                    "డాక్టర్: ఇప్పుడు తేలిగ్గానే అనిపిస్తుందా?\n" +
                    "రోగి : పర్సు తడుముకుంటూ.. హా చాలా తేలిగ్గా అనిపిస్తుంది.",
            "What do you call an alligator detective? An investi-gator. ",
            "ఒక దొంగ దొంగతనం చేసి వెళ్ళే సమయంలో..... ఇంట్లో ఉన్న పిల్లవాడు మెల్లగా కళ్ళు తెరిచి ఇలా అంటాడు. మర్యాదగా స్కూల్ బ్యాగ్ కూడా తీసుకెళ్లు... లేదంటే అరచి గోల చేస్తా.",
            "How do you keep an idiot in suspense?",
            " Why did the scarecrow win an award? Because he was outstanding in his field.",
            " Why shouldn’t you write with a broken pencil? Because it’s pointless"

    };
    public static String getData(){
        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
