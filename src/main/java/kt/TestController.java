package kt;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@Resource
	private ITestService testService;
	
	
	@RequestMapping("/hello.do")
	public String sayHello(HttpServletRequest request, @RequestParam String name){
		request.setAttribute("result", "name:" + name + ", age:"+testService.getUser(name).getAge() );
		return "hello";  //WEB-INF/view/hello.jsp 
	}
	
	
	@RequestMapping("/go.do")     //  go.do?url=front  로 이용.  
	public String go(@RequestParam String url){
		return url;
	}
	
}
