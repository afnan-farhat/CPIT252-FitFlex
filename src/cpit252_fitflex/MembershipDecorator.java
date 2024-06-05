package cpit252_fitflex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
// Abstract Decorator - Membership Decorator
abstract class MembershipDecorator implements Membership {

    protected Membership decoratedMembership;

    public MembershipDecorator(Membership membership) {
        this.decoratedMembership = membership;
    }

    public void getInfo() {
        decoratedMembership.getInfo();
    }
}
