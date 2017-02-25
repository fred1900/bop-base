package com.fred1900.bop.base;

/**
 * check异常类
 * 
 * @author Fred
 * @since 2017年2月25日
 *
 */

public class AppException extends Exception {

	private static final long serialVersionUID = 1L;

	private String exCode;

	private String exMsg;

	private Throwable exCause;

	public AppException(String exCode) {
		super("AppException[" + exCode + "]");
		this.exCode = exCode;
	}

	public AppException(String exCode, Throwable exCause) {
		super("AppException[" + exCode + "]", exCause);
		this.exCode = exCode;
		this.exCause = exCause;
	}

	public AppException(String exCode, String exMsg, Throwable exCause) {
		super("AppException[" + exCode + "][" + exMsg + "]", exCause);
		this.exCode = exCode;
		this.exMsg = exMsg;
		this.exCause = exCause;
	}

	public AppException(Throwable exCause) {
		super(exCause);
		this.exCause = exCause;
	}

	public String getExCode() {
		return exCode;
	}

	public void setExCode(String exCode) {
		this.exCode = exCode;
	}

	public String getExMsg() {
		return exMsg;
	}

	public void setExMsg(String exMsg) {
		this.exMsg = exMsg;
	}

	public Throwable getExCause() {
		return exCause;
	}

	public void setExCause(Throwable exCause) {
		this.exCause = exCause;
	}
}
