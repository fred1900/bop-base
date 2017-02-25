package com.fred1900.bop.base;

/**
 * 非check异常类
 * 
 * @author Fred
 * @since 2017年2月25日
 *
 */

public class AppRtException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String exCode;

	private String exMsg;

	private Throwable exCause;

	public AppRtException(String exCode) {
		super("AppRtException[" + exCode + "]");
		this.exCode = exCode;
	}

	public AppRtException(String exCode, Throwable exCause) {
		super("AppRtException[" + exCode + "]", exCause);
		this.exCode = exCode;
		this.exCause = exCause;
	}

	public AppRtException(String exCode, String exMsg, Throwable exCause) {
		super("AppRtException[" + exCode + "][" + exMsg + "]", exCause);
		this.exCode = exCode;
		this.exMsg = exMsg;
		this.exCause = exCause;
	}

	public AppRtException(Throwable exCause) {
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
