package ua.savko.yalantistest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ua.savko.yalantistest.model.Member;
import ua.savko.yalantistest.service.MemberService;
import ua.savko.yalantistest.service.MemberServiceImpl;

import java.util.List;

@SpringBootTest
class YalantistestApplicationTests {

	@Test
	void userExistWithEmailTest() {
		MemberServiceImpl memberService = new MemberServiceImpl();
		Boolean so = memberService.isUserExistWithEmail("p@mail.com");
		System.out.println(so);
	}

}
