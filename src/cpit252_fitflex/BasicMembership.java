package cpit252_fitflex;

class BasicMembership implements Membership {

    private double amount = 500;

    @Override
    public void getInfo() {

        System.out.println("Basic Membership - Access to gym facilities");
    }
    
}
