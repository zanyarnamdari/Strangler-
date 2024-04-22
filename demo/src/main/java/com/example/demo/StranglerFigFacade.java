package com.example.demo;

// Facade for the legacy systems
class StranglerFigFacade {
    private LegacySystemA legacySystemA;
    private LegacySystemB legacySystemB;
    private NewSystemC newSystemC;

    public StranglerFigFacade() {
        this.legacySystemA = new LegacySystemA();
        this.legacySystemB = new LegacySystemB();
        this.newSystemC = new NewSystemC();
    }

    public void doOperations() {
        legacySystemA.doOperationA();
        legacySystemB.doOperationB();
        newSystemC.doOperationC();
    }
}