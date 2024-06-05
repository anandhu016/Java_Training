package com.ey.day7assignment;

public class ConferenceMain {
    public static void main(String[] args) {
        ConferenceRoomBookingJob job = new ConferenceRoomBookingJob();
        Thread manager1 = new Thread(job, "Manager1");
        Thread manager2 = new Thread(job, "Manager2");
        manager1.start();
        manager2.start();
    }
}
