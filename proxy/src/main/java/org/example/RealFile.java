package org.example;

class RealFile implements File {
    private String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void printContent() {
        System.out.println("Printing content of " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }
}
