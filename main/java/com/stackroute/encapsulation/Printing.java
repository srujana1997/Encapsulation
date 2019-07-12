package main.java.com.stackroute.encapsulation;

public class Printing {
    public static void main(String args[]){
        Printer printer=new Printer("epson",70.0,50,true);
        printer.setTonerLevel(100);
        printer.setAmmountOfPaper(50);
        printer.isOutOfToner(10);
        printer.isOutOfPaper(10);
        int flag=printer.check(10);
        printer.isDuplex(flag);
        printer.printPages(10);
        printer.refillPaper(30);
        printer.refillToner();

    }
}
