package cn.dev33.satoken.config;

/**
 * sa-token 配置类 Model 
 * <p> 你可以通过yml、properties、java代码等形式配置本类参数，具体请查阅官方文档 
 * @author kong
 *
 */
public class SaTokenConfig {

	/** token名称 (同时也是cookie名称) */
	private String tokenName = "satoken";	
	
	/** token的长久有效期(单位:秒) 默认30天, -1代表永久 */
	private long timeout = 30 * 24 * 60 * 60;	
	
	/** token临时有效期 [指定时间内无操作就视为token过期] (单位/秒), 默认-1 代表不限制 (例如可以设置为1800代表30分钟内无操作就过期) */
	private long activityTimeout = -1;		
	
	/** 是否允许同一账号并发登录 (为true时允许一起登录, 为false时新登录挤掉旧登录)  */
	private Boolean allowConcurrentLogin = true;	
	
	/** 在多人登录同一账号时，是否共用一个token (为true时所有登录共用一个token, 为false时每次登录新建一个token)  */
	private Boolean isShare = true;		
	
	/** 是否尝试从请求体里读取token */
	private Boolean isReadBody = true;		
	
	/** 是否尝试从header里读取token */
	private Boolean isReadHead = true;		
	
	/** 是否尝试从cookie里读取token */
	private Boolean isReadCookie = true;	
	
	/** token风格(默认可取值：uuid、simple-uuid、random-32、random-64、random-128、tik) */
	private String tokenStyle = "uuid";		

	/** 默认dao层实现类中，每次清理过期数据间隔的时间 (单位: 秒) ，默认值30秒，设置为-1代表不启动定时清理 */
	private int dataRefreshPeriod = 30;
	
	/** 获取[token专属session]时是否必须登录 (如果配置为true，会在每次获取[token-session]时校验是否登录) */
	private Boolean tokenSessionCheckLogin = true;	
	 
	/** 是否在初始化配置时打印版本字符画 */
	private Boolean isV = true;

	
	/**
	 * @return tokenName
	 */
	public String getTokenName() {
		return tokenName;
	}

	/**
	 * @param tokenName 要设置的 tokenName
	 */
	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	/**
	 * @return timeout
	 */
	public long getTimeout() {
		return timeout;
	}

	/**
	 * @param timeout 要设置的 timeout
	 */
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}

	/**
	 * @return activityTimeout
	 */
	public long getActivityTimeout() {
		return activityTimeout;
	}

	/**
	 * @param activityTimeout 要设置的 activityTimeout
	 */
	public void setActivityTimeout(long activityTimeout) {
		this.activityTimeout = activityTimeout;
	}

	/**
	 * @return allowConcurrentLogin
	 */
	public Boolean getAllowConcurrentLogin() {
		return allowConcurrentLogin;
	}

	/**
	 * @param allowConcurrentLogin 要设置的 allowConcurrentLogin
	 */
	public void setAllowConcurrentLogin(Boolean allowConcurrentLogin) {
		this.allowConcurrentLogin = allowConcurrentLogin;
	}

	/**
	 * @return isShare
	 */
	public Boolean getIsShare() {
		return isShare;
	}

	/**
	 * @param isShare 要设置的 isShare
	 */
	public void setIsShare(Boolean isShare) {
		this.isShare = isShare;
	}

	/**
	 * @return isReadBody
	 */
	public Boolean getIsReadBody() {
		return isReadBody;
	}

	/**
	 * @param isReadBody 要设置的 isReadBody
	 */
	public void setIsReadBody(Boolean isReadBody) {
		this.isReadBody = isReadBody;
	}

	/**
	 * @return isReadHead
	 */
	public Boolean getIsReadHead() {
		return isReadHead;
	}

	/**
	 * @param isReadHead 要设置的 isReadHead
	 */
	public void setIsReadHead(Boolean isReadHead) {
		this.isReadHead = isReadHead;
	}

	/**
	 * @return isReadCookie
	 */
	public Boolean getIsReadCookie() {
		return isReadCookie;
	}

	/**
	 * @param isReadCookie 要设置的 isReadCookie
	 */
	public void setIsReadCookie(Boolean isReadCookie) {
		this.isReadCookie = isReadCookie;
	}

	/**
	 * @return tokenStyle
	 */
	public String getTokenStyle() {
		return tokenStyle;
	}

	/**
	 * @param tokenStyle 要设置的 tokenStyle
	 */
	public void setTokenStyle(String tokenStyle) {
		this.tokenStyle = tokenStyle;
	}

	/**
	 * @return dataRefreshPeriod
	 */
	public int getDataRefreshPeriod() {
		return dataRefreshPeriod;
	}

	/**
	 * @param dataRefreshPeriod 要设置的 dataRefreshPeriod
	 */
	public void setDataRefreshPeriod(int dataRefreshPeriod) {
		this.dataRefreshPeriod = dataRefreshPeriod;
	}

	/**
	 * @return tokenSessionCheckLogin
	 */
	public Boolean getTokenSessionCheckLogin() {
		return tokenSessionCheckLogin;
	}

	/**
	 * @param tokenSessionCheckLogin 要设置的 tokenSessionCheckLogin
	 */
	public void setTokenSessionCheckLogin(Boolean tokenSessionCheckLogin) {
		this.tokenSessionCheckLogin = tokenSessionCheckLogin;
	}

	/**
	 * @return isV
	 */
	public Boolean getIsV() {
		return isV;
	}

	/**
	 * @param isV 要设置的 isV
	 */
	public void setIsV(Boolean isV) {
		this.isV = isV;
	}

	
	
	@Override
	public String toString() {
		return "SaTokenConfig [tokenName=" + tokenName + ", timeout=" + timeout + ", activityTimeout=" + activityTimeout
				+ ", allowConcurrentLogin=" + allowConcurrentLogin + ", isShare=" + isShare + ", isReadBody="
				+ isReadBody + ", isReadHead=" + isReadHead + ", isReadCookie=" + isReadCookie + ", tokenStyle="
				+ tokenStyle + ", dataRefreshPeriod=" + dataRefreshPeriod + ", tokenSessionCheckLogin="
				+ tokenSessionCheckLogin + ", isV=" + isV + "]";
	}

	

	
	
	

	
	
	

	
	
	
	
	
	
	
	
}
