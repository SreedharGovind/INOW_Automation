
package com.smartims.insurancepractice.insurancenow.testscenario03;

public class Counter {
    private static int currentColumnIndex = 4;

    public static synchronized void increment() {
        currentColumnIndex++;
    }

    public static int getCurrentColumnIndex() {
        return currentColumnIndex;
    }
}