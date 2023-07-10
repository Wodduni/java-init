package p11;

import java.util.List;
import java.util.Map;

public class UserInfoService {
	public List<Map<String, String>> getUserInfoList(Map<String, String> param){
		UserInfoRepository userInfoRepository = new UserInfoRepository();
		return userInfoRepository.getUserInfoList(param);
	}
	public int insertUserInfo (Map<String, String>userInfo){
		UserInfoRepository userInfoRepository = new UserInfoRepository();
		return userInfoRepository.insertUserInfo(userInfo);
	}
	public int deleteUserInfo(Map<String, String> userInfo) {
		UserInfoRepository userInfoRepository = new UserInfoRepository();
		return userInfoRepository.deleteUserInfo(userInfo);
	}
}
