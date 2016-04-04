package com.sishuok.es.basedata.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.validator.constraints.NotEmpty;

import com.sishuok.es.common.repository.support.annotation.EnableQueryCache;
import com.sishuok.es.core.entity.BaseDataInfo;
import com.sishuok.es.sys.user.entity.User;

/**
 * name用于保存文件原来名称，number用来保存UUID，作为另存为的文件名
 * @author zrb
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "bas_Comment")
@EnableQueryCache
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CommentInfo extends BaseDataInfo {
	private String address;
	@NotEmpty(message = "{not.null}")
	@Pattern(regexp = User.EMAIL_PATTERN, message = "{comment.email.not.valid}")
	private String email;
	private String qq;
	private String suggestion;
	@NotEmpty(message = "{not.null}")
	@Pattern(regexp = User.MOBILE_PHONE_NUMBER_PATTERN, message = "{comment.mobile.phone.number.not.valid}")
	private String telephone;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}