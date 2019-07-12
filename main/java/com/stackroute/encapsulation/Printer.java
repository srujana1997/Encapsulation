package main.java.com.stackroute.encapsulation;

public class Printer {

    private String name;
    private double tonerLevel;
    private int ammountOfPaper;
    private int numberOfPagesPrinted;
    private boolean isDoubleSided;
    int flag;

    public Printer(String name, double tonerLevel, int ammountOfPaper, boolean isDoubleSided) {
        this.name = name;
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.ammountOfPaper = ammountOfPaper;
        this.isDoubleSided = isDoubleSided;
    }

    //checking tonnerlevel to print required number of pages
    public boolean isOutOfToner(double numberToPrint) {
        if ((tonerLevel - (numberToPrint / 2) < 0)) {
            return true;
        } else {
            return false;
        }
    }

    //checking for availabilty of paper to print required number of pages
    public boolean isOutOfPaper(double numberToPrint) {
        if (((ammountOfPaper - numberToPrint) < 0)) {
            return true;
        } else {
            return false;
        }
    }

    //checking for duplex
    public String isDuplex(int flag) {
        if (flag == 1) {
            return "Can print both sides of the paper";
        } else {
            return "Cannot print both sides of the paper";

        }
    }

    //getting number of pages to be printed
    public int check(int numberOfPagesPrinted) {
        if (numberOfPagesPrinted % 2 == 0) {
            return 1;
            //System.out.println("Even Number Of pages we can print both sides of a paper");
        } else {
            return 0;
            //System.out.println("odd Number Of pages we can print boh sides of a paper");
        }
    }

    //code for printing pages
    public void printPages(double numberToPrint) {
        if (tonerLevel == 0) {
            System.out.println("Out of toner");
        }
        if (ammountOfPaper == 0) {
            System.out.println("Out of Paper");
        }

    }
        public void refillToner(){
            tonerLevel = 100;
        }
        public void refillPaper(int paper){
            if (paper > 50) {
                System.out.println("Cannot put in more paper");
            } else {
                this.ammountOfPaper += paper;
            }
        }
        public int getAmmountOfPaper(){
            return ammountOfPaper;
        }

        public double getTonerLevel(){
            return tonerLevel;
        }

        public void setTonerLevel(double tonerLevel){
            this.tonerLevel = tonerLevel;
        }

        public void setAmmountOfPaper(int ammountOfPaper){
            this.ammountOfPaper = ammountOfPaper;
        }
    }
