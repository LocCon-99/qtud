package qtud.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the USERS_BK database table.
 * 
 */
@Entity
@Table(name="USERS_BK")
@NamedQuery(name="UsersBk.findAll", query="SELECT u FROM UsersBk u")
public class UsersBk implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID")
	private String id;

	@Column(name="ALIAS_NAME")
	private String aliasName;

	@Column(name="BIRTH_PLACE")
	private String birthPlace;

	private String cellphone;

	@Column(name="DATE_OF_BIRTH")
	private Timestamp dateOfBirth;

	private String email;

	private String fax;

	@Column(name="FULL_NAME")
	private String fullName;

	private Integer gender;

	@Column(name="IDENTITY_CARD")
	private String identityCard;

	@Column(name="ISSUE_DATE_IDENT")
	private Timestamp issueDateIdent;

	@Column(name="ISSUE_DATE_PASSPORT")
	private Timestamp issueDatePassport;

	@Column(name="ISSUE_PLACE_IDENT")
	private String issuePlaceIdent;

	@Column(name="ISSUE_PLACE_PASSPORT")
	private String issuePlacePassport;

	@Column(name="LAST_BLOCK_DATE")
	private Timestamp lastBlockDate;

	@Column(name="LAST_CHANGE_PASSWORD")
	private Timestamp lastChangePassword;

	@Column(name="LOGIN_FAILURE_COUNT")
	private Integer loginFailureCount;

	@Column(name="NATION_ID")
	private Integer nationId;

	private String nationality;

	@Column(name="NATIVE_COUNTRY")
	private String nativeCountry;

	@Column(name="PASSPORT_NUMBER")
	private String passportNumber;

	private String password;

	@Column(name="PASSWORD_EXPIRE_STATUS")
	private Integer passwordExpireStatus;

	@Column(name="PROVINCE_CODE")
	private String provinceCode;

	@Column(name="RELIGION_ID")
	private Integer religionId;

	private Integer status;

	private String telephone;

	@Column(name="TYPE_OF_WORK")
	private Integer typeOfWork;

	@Column(name="URL_IMAGE")
	private String urlImage;

	@Column(name="USER_ID")
	private String userId;

	@Column(name="USER_NAME")
	private String userName;

	public UsersBk() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Timestamp getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getIdentityCard() {
		return this.identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public Timestamp getIssueDateIdent() {
		return this.issueDateIdent;
	}

	public void setIssueDateIdent(Timestamp issueDateIdent) {
		this.issueDateIdent = issueDateIdent;
	}

	public Timestamp getIssueDatePassport() {
		return this.issueDatePassport;
	}

	public void setIssueDatePassport(Timestamp issueDatePassport) {
		this.issueDatePassport = issueDatePassport;
	}

	public String getIssuePlaceIdent() {
		return this.issuePlaceIdent;
	}

	public void setIssuePlaceIdent(String issuePlaceIdent) {
		this.issuePlaceIdent = issuePlaceIdent;
	}

	public String getIssuePlacePassport() {
		return this.issuePlacePassport;
	}

	public void setIssuePlacePassport(String issuePlacePassport) {
		this.issuePlacePassport = issuePlacePassport;
	}

	public Timestamp getLastBlockDate() {
		return this.lastBlockDate;
	}

	public void setLastBlockDate(Timestamp lastBlockDate) {
		this.lastBlockDate = lastBlockDate;
	}

	public Timestamp getLastChangePassword() {
		return this.lastChangePassword;
	}

	public void setLastChangePassword(Timestamp lastChangePassword) {
		this.lastChangePassword = lastChangePassword;
	}

	public Integer getLoginFailureCount() {
		return this.loginFailureCount;
	}

	public void setLoginFailureCount(Integer loginFailureCount) {
		this.loginFailureCount = loginFailureCount;
	}

	public Integer getNationId() {
		return this.nationId;
	}

	public void setNationId(Integer nationId) {
		this.nationId = nationId;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNativeCountry() {
		return this.nativeCountry;
	}

	public void setNativeCountry(String nativeCountry) {
		this.nativeCountry = nativeCountry;
	}

	public String getPassportNumber() {
		return this.passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPasswordExpireStatus() {
		return this.passwordExpireStatus;
	}

	public void setPasswordExpireStatus(Integer passwordExpireStatus) {
		this.passwordExpireStatus = passwordExpireStatus;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public Integer getReligionId() {
		return this.religionId;
	}

	public void setReligionId(Integer religionId) {
		this.religionId = religionId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getTypeOfWork() {
		return this.typeOfWork;
	}

	public void setTypeOfWork(Integer typeOfWork) {
		this.typeOfWork = typeOfWork;
	}

	public String getUrlImage() {
		return this.urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}