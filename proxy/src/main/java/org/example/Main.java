package org.example;

public class Main {
    public static void main(String[] args) {
        File file1 = new ProxyFile("example.txt");
        File file2 = new ProxyFile("sample.txt");

        file1.printContent();
        file1.printContent();

        file2.printContent();
    }
}