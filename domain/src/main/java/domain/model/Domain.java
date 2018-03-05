package domain.model;

public class Domain {
	
	private String domainName;
	private Integer referralCount;
	
	public Domain(){
		
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public Integer getReferralCount() {
		return referralCount;
	}
	public void setReferralCount(Integer referralCount) {
		this.referralCount = referralCount;
	}
	@Override
	public String toString() {
		return "Domain [domainName=" + domainName + ", referralCount=" + referralCount + "]";
	}
}
