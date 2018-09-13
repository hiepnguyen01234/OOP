package tuan10;

import java.lang.Exception;

public class MyException extends Exception{
	public String reason;
	public String content;
	public String info;
	public final String EXIST ="0001";
	public final String NOT_EXISTED ="0002";
	public final String INVALID ="0003";
	public final String NO_ITEM ="0004";
	public final String NOT_EMPTY ="0005";
	
	public String getReason() {
		return reason;
	}
	public String getContent() {
		return content;
	}
	public String getInfo() {
		return info;
	}
	public void setReason(String reasonType) {
		switch(reasonType) {
		case "" :
			reason ="null pointer exception";
			break;
		case "EXIST" :
			reason ="the id of the item is already existed";
			break;
		case "NOT_EXISTED" :
			reason ="the id you want to update is not existed";
			break;
		case "INVALID" :
			reason ="the id you've entered is not valid";
			break;
		case "NO_ITEM" :
			reason ="the is no item";
			break;
		case "NOT_EMPTY" :
			reason ="the id you've entered can not be empty";
			break;
		}
	}
	public void setContent(String c) {
		content =c;
	}
	public void setInfo(String i) {
		info =i;
	}
	
	public MyException(String reason) {
		setReason(reason);
	}
	public MyException(String reason,String content) {
		setReason(reason);
		setContent(content);
	}
	public MyException(String reason,String content,String info) {
		setReason(reason);
		setContent(content);
		setInfo(info);
	}
	public MyException(Exception cause,String content) {
		setContent(content);
		if(cause instanceof MyException) {
		setReason(((MyException) cause).reason);
		setInfo(((MyException) cause).info);
		}
	}
	public String getMessage() {
		return ("reason :"+getReason()+"content :"+getContent()+"info :"+getInfo());
	}
	public String toString() {
		return getMessage();
	}

}
