package com.common.solid.isp;

public class violateISP {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        oldPrinter.print();
        oldPrinter.fax();
        oldPrinter.scan();
    }
}

interface MultiFunctionDevice {
    void print();
    void scan();
    void fax();
}

class OldPrinter implements MultiFunctionDevice {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Fax not supported");
    }
}