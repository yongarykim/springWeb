package kt;

import javax.annotation.Resource;

import org.apache.ibatis.mapping.ResultMap;
import org.springframework.stereotype.Service;


@Service
public class TestService implements ITestService{

	
	//When Autowired
	//private SqlSession sqlSession;
	
	@Resource
	private UserMapper userMapper;
	
	public UserVo getUser(String name){
		
		//general version===========
		return userMapper.getUser(name);

	}
}
