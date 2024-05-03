package member;

public class ObjectMaker {

    private static MemberRepository memberRepository;
    private static MemberService memberService;
    private static MemberController memberController;
    private static ObjectMaker instance = new ObjectMaker();

    private ObjectMaker() {
        this.instance = this;

        this.memberRepository = new MemberRepository();
        this.memberService = new MemberService(memberRepository);
        this.memberController = new MemberController(memberService);
    }

    public static ObjectMaker getInstance() {
        if (instance == null) {
            instance = new ObjectMaker();
        }
        return instance;
    }

    public MemberRepository makeMemberRepository() {
        if (this.memberRepository == null) {
            this.memberRepository = new MemberRepository();
        }
        return this.memberRepository;
    }

    public MemberService makeMemberService() {
        if (this.memberService == null) {
            this.memberService = new MemberService(makeMemberRepository());
        }
        return this.memberService;
    }

    public MemberController makeMemberController() {
        if (this.memberController == null) {
            this.memberController = new MemberController(makeMemberService());
        }
        return this.memberController;
    }
}
