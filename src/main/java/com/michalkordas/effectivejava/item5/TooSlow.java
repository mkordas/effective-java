package com.michalkordas.effectivejava.item5;

class TooSlow {

    // What is so slow here?
    public static void main(String[] args) {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}