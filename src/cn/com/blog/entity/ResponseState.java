package cn.com.blog.entity;

public class ResponseState {
	private String code;//0失败，1,成功
	private String context;
	public ResponseState() {
	}
	public ResponseState(String code,String context) {
		this.code=code;
		this.context=context;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	@Override
	public String toString() {
		return "ResponseState [code=" + code + ", context=" + context + "]";
	}
}
