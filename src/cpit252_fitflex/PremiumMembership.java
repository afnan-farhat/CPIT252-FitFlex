package cpit252_fitflex;

class PremiumMembership extends MembershipDecorator {

    public PremiumMembership(Membership membership) {
        super(membership);
    }

    @Override
    public void getInfo() {
        super.getInfo(); // First, print the base membership details
        System.out.println("+ Premium Membership - Access to premium classes");
    }
}
