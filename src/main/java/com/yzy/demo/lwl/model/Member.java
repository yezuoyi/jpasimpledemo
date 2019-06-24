package com.yzy.demo.lwl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.yzy.demo.lwl.model.base.BaseEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "oa_member")
public @ToString class Member extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private @Getter @Setter Long id;

	@Column(length = 20)
	private String name; // 姓名

	private @Getter @Setter String username; // 登录名
	private @Getter @Setter String password; // 密码

	private @Getter @Setter long roleId;

}
