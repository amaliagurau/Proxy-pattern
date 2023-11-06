package org.example;

class ProxyFile implements File {
    private String fileName;
    private RealFile realFile;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void printContent() {
        if (realFile == null) {
            realFile = new RealFile(fileName);
        }
        realFile.printContent();
    }
}