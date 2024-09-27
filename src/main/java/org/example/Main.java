package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static class Button {
        private int clicks;

        public Button() {
            this.clicks = 0;
        }

        public void click() {
            clicks++;
            System.out.println("Clicks: " + clicks);
        }

        public int getClicks() {
            return clicks;
        }
    }

    public static class Balance {
        private int leftScales;
        private int rightScales;

        public Balance() {
            this.leftScales = 0;
            this.rightScales = 0;
        }

        public void addLeft(int weight) {
            this.leftScales += weight;
        }

        public void addRight(int weight) {
            this.rightScales += weight;
        }

        public String result() {
            if (leftScales > rightScales) return "L";
            else if (rightScales > leftScales) return "R";
            else return "=";
        }
    }

    public static class Bell {
        private boolean isTrue = true;

        public String sound() {
            if (isTrue) {isTrue = false; return "ding";}
            else {isTrue = true; return "dong";}
        }
    }

    public static class OddEvenSeparator {
        private List<Integer> evenNumbers;
        private List<Integer> oddNumbers;

        public OddEvenSeparator() {
            this.evenNumbers = new ArrayList<>();
            this.oddNumbers = new ArrayList<>();
        }

        public void addNumber(int number) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        public List<Integer> even() {
            return evenNumbers;
        }

        public List<Integer> odd() {
            return oddNumbers;
        }
    }

    public static class Table {
        private int[][] table;

        public Table(int rows, int cols) {
            this.table = new int[rows][cols];
        }

        public void setValue(int row, int col, int value) {
            table[row][col] = value;
        }

        public int getValue(int row, int col) {
            return table[row][col];
        }

        public int rows() {
            return table.length;
        }

        public int cols() {
            return table[0].length;
        }

        public double average() {
            int sum = 0;
            int count = 0;
            for (int[] row : table) {
                for (int val : row) {
                    sum += val;
                    count++;
                }
            }
            return (double) sum / count;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int[] row : table) {
                for (int val : row) {
                    sb.append(val).append(" ");
                }
            }
            return sb.toString();
        }
    }
}