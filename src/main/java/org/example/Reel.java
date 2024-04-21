package org.example;

import java.util.Random;

public class Reel {

        private int[] symbols;


        public Reel(int[] symbolName) {
            this.symbols=symbolName;

        }



        public int spin(){
            Random rand= new Random();
            return symbols[rand.nextInt(symbols.length)];

        }
    }


