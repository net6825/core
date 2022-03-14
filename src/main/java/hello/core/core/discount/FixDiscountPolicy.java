package hello.core.core.discount;


import hello.core.core.member.Grade;
import hello.core.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;   //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP) return discountFixAmount;
        else return 0;
    }
}
