package com.common.solid.isp;

public class MultimediaDevice {
    public static void main(String[] args) {


        Print oldPrinter = new OldPrinterMachine();
        oldPrinter.print();
        Print digitalPrinter = new DigitalPrinter();
        Scan scan = (Scan) digitalPrinter;
        Fax fax = (Fax)  digitalPrinter;
        digitalPrinter.print();
        scan.scan();
        fax.fax();
    }
}
interface Print{
    void print();
}
interface Scan{
    void scan();
}
interface Fax{
    void fax();
}

class OldPrinterMachine implements Print{
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

class DigitalPrinter implements Print,Scan,Fax{

    @Override
    public void fax() {
        System.out.println("Fax Sending......");
    }

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document.......");
    }
}
