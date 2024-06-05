package com.ey.day7assignment;

public class CopyingFiles {
    public static void main(String[] args) {
    	Object lock = new Object();
    	
        Thread fileCopy1Thread = new Thread(new FileCopy1(lock));
        Thread fileCopy2Thread = new Thread(new FileCopy2(lock));

        fileCopy1Thread.start();
        fileCopy2Thread.start();
        try {
			fileCopy1Thread.join();
			fileCopy2Thread.join();
		} 
        catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println("Both file copy operations completed");
    }
}

