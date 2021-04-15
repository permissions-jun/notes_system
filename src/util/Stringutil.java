package util;
//判断用户名和密码是否为空
public class Stringutil {
	
	public static boolean isEmpt(String str) {
		if(str==null || "".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
	

	
	public static boolean notEmpt(String str) {
		if(str!=null && "".equals(str.trim())){
			return true;
		}else {
			return false;
		}
	}

}
