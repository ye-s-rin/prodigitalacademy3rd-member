package member;

public class MemberService {

    MemberRepository memberRepository;

    MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public String work1() {
        return memberRepository.get1();
    }

    public String work2() {
        return memberRepository.get2();
    }

    public String work3() {
        return memberRepository.get3();
    }

    public String work4() {
        return memberRepository.get4();
    }
}
