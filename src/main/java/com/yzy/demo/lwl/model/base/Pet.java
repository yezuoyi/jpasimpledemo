package com.yzy.demo.lwl.model.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public class Pet extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8652075745543021630L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private @Getter @Setter Long id;

	private @Getter @Setter String name;// 名字
	private @Getter @Setter String variety;// 品种
	private @Getter @Setter double weight;// 体重
	private @Getter @Setter Integer age;// 年龄
	private @Getter @Setter char vaccine;// 是否注射疫苗 y:已注射 n:未注射 d:未知
	private @Getter @Setter Integer ownerId;// 主人id
	private @Getter @Setter char LookingForOwner;// 是否在寻找主人 y:正在寻找 n:未在寻找
	private @Getter @Setter String pic;// 照片地址

}
