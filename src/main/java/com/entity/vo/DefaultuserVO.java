package com.entity.vo;

import com.entity.DefaultuserEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 注册用户
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-17 10:45:07
 */
public class DefaultuserVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 姓名
	 */
	
	private String name;
		
	/**
	 * 性别
	 */
	
	private String sex;
		
	/**
	 * 年龄
	 */
	
	private Integer age;
		
	/**
	 * 电话
	 */
	
	private String phone;
		
	/**
	 * 照片
	 */
	
	private String picture;
		
	/**
	 * 邮箱
	 */
	
	private String email;
		
	/**
	 * 余额
	 */
	
	private Float money;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getName() {
		return name;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * 获取：性别
	 */
	public String getSex() {
		return sex;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setAge(Integer age) {
		this.age = age;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getAge() {
		return age;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * 获取：电话
	 */
	public String getPhone() {
		return phone;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * 获取：照片
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getEmail() {
		return email;
	}
				
	
	/**
	 * 设置：余额
	 */
	 
	public void setMoney(Float money) {
		this.money = money;
	}
	
	/**
	 * 获取：余额
	 */
	public Float getMoney() {
		return money;
	}
			
}
