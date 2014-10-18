package kt;

import org.apache.ibatis.mapping.ResultMap;


public  interface UserMapper {
	
	UserVo getUser(String name);

}
