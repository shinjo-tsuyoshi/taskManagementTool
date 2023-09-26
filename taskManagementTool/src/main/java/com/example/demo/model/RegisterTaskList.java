//package com.example.demo.model;
//
//
//import org.springframework.data.annotation.Id;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import lombok.Data;
//
//@Data
//@Entity
////@Table(name="test")
//public class RegisterAddition {
//	
//	@Id
//	@Column(name="id")
//	private Integer id;
//	
//	
//
//}

package com.example.demo.model;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="test")
public class RegisterTaskList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	// ラベル
	@Column(name="label")
	private String label;
	
	// 名称
	@Column(name="taskName")
	private String taskName;
	
	// 優先度
	@Column(name="priority")
	private String priority;
	
	// 開始期日
	@Column(name="startDueDate")
	private Date startDueDate;
	
	// 終了期日
	@Column(name="endDueDate")
	private Date endDueDate;
	
	// メモ
	@Column(name="memo")
	private String memo;

}
