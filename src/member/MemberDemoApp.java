package member;

public class MemberDemoApp {

    public static void main(String[] args) {

        // 객체 생성 담당 객체
        ObjectMaker memberContainer = ObjectMaker.getInstance();

        MemberRepository memberRepository = memberContainer.makeMemberRepository();
        MemberService memberService = memberContainer.makeMemberService();
        MemberController memberController = memberContainer.makeMemberController();

        System.out.println(memberController.call1());
        System.out.println(memberController.call2());
        System.out.println(memberController.call3());
        System.out.println(memberController.call4());
        // -> memberService.work1();
        // -> memberRepository.get1(); ~ get4();
        // -> "work1" ~ "work4"
    }
    /**
     * 코드 (개인)
     * 짝꿍 코드 비교: 이 코드가 아쉬운 점 (객체지향)
     * + Repository 코드 &
     */
}
