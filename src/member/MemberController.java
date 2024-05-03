package member;

public class MemberController {

    private MemberService memberService;

    MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    public String call1() {
        return memberService.work1();
    }

    public String call2() {
        return memberService.work2();
    }

    public String call3() {
        return memberService.work3();
    }

    public String call4() {
        return memberService.work4();
    }
}
