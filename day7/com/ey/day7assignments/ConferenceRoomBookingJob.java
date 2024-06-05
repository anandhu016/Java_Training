package com.ey.day7assignment;

class ConferenceRoomBookingJob implements Runnable {
    private boolean isRoomAvailable = true;

    public synchronized void bookRoom() {
        String managerName = Thread.currentThread().getName();
        
        if (isRoomAvailable) {
            System.out.println(managerName + " is checking the room availability...");
            System.out.println("Room is available. " + managerName + " is booking the room...");
            isRoomAvailable = false;
            System.out.println(managerName + " has booked the room. Conducting the meeting...");
            try {
                Thread.sleep(2000); // Assuming the meeting takes 2 seconds
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(managerName + "'s meeting is over. Room is available for booking.");
            isRoomAvailable = true;
        } 
        else {
            System.out.println("Room is not available. " + managerName + " cannot book the room.");
        }
    }

    @Override
    public void run() {
        bookRoom();
    }
}

