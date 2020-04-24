package com.alzk;

public class SimCard {

    enum CardType {
        card4G,
        card5G;
    }
    private static final int realSimCardSize = 16; // fking fixed size, can not be retrieved
    int totalSimCardSize;
    CardType type;
//    int plasticSimCardSize;

    SimCard(CardType type, int totalSimCardSize) {
        this.type = type;
        this.totalSimCardSize = totalSimCardSize;
    }

    public int getCardPlasticSize() {
        return totalSimCardSize - realSimCardSize;
    }

    public int getCardRealSize() {
        return realSimCardSize;
    }

//    public static int compareSize(SimCard simCard) {
//        return 1;
//    }

}
