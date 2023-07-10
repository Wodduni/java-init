package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoService {
	public List<Map<String, String>> getClassInfoList(Map<String, String> pram){
		ClassInfoRepository classInfoRepository = new ClassInfoRepository();
		return classInfoRepository.getClassList(pram);
	}
	public int insertClassInfo(Map<String, String> classInfo) {
		ClassInfoRepository classInfoRepository = new ClassInfoRepository();
		return classInfoRepository.insertClassInfo(classInfo);
	}
}
