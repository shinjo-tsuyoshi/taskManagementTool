package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RegisterTaskList;
import com.example.demo.repository.AdditionRpository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdditionService {
	
	@Autowired
	private AdditionRpository repository;
	
	
	/**
     * データベースから一覧を取得する
     * @return
     */
	public List<RegisterTaskList> findAll(){
		return repository.findAll();
	}
	
	/**
     * データベースにデータを登録する
     * @return
     */
	public void insert(RegisterTaskList taskItem) {
		// データベースに登録する値を保持するインスタンス
		RegisterTaskList addTask = new RegisterTaskList();
		
		// 画面から受け取った値をデータベースに保存するインスタンスに渡す
		addTask.setTaskName(taskItem.getTaskName());
		addTask.setLabel(taskItem.getLabel());
		addTask.setPriority(taskItem.getPriority());
		addTask.setStartDueDate(taskItem.getStartDueDate());
		addTask.setEndDueDate(taskItem.getEndDueDate());
		addTask.setMemo(taskItem.getMemo());
		
		repository.save(addTask);
	}

}
