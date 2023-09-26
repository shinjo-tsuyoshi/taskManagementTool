package com.example.demo.controller;

import java.util.List;
import java.util.Objects;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.RegisterTaskList;
import com.example.demo.service.AdditionService;

//@RequestMapping("/taskManagement")

@Controller
public class TaskManagementController {
	
	@Autowired
	AdditionService service;
	
//	トップ
	@RequestMapping("/taskManagement/main")
	public String main(Model model) {
		Random rand = new Random();
	    int num = rand.nextInt(3);
		String str[] = {"タスク管理ツール ", "", "HelloWorld. "};
		
		model.addAttribute("title", str[num]);
		return "mainPage";
	}
	
//	タスク追加
	@RequestMapping("/taskManagement/addition")
	public String addition() {
		return "addition";
	}

//	TODO
	@PostMapping("/taskManagement/todo")
	public String todo(@ModelAttribute RegisterTaskList registerTaskList, Model model) {
		
		if(!Objects.isNull(registerTaskList.getTaskName()) || registerTaskList.getTaskName() == "") {
//			DB登録
			service.insert(registerTaskList);
		}
		
		System.out.println(registerTaskList.getLabel());

		// serviceを使って、本の一覧をDBから取得する
        List<RegisterTaskList> taskList = service.findAll();
        // modelに本の一覧を設定して、画面に渡す
        model.addAttribute("taskList", taskList);
        
		return "todo";
	}
	
	@RequestMapping("/taskManagement/todo")
	public String todo(Model model) {
		
		// serviceを使って、本の一覧をDBから取得する
        List<RegisterTaskList> taskList = service.findAll();
        System.out.println("\n\n\n\n" + "taskList" + "\n\n\n\n");
        System.out.println(taskList);
        // modelに本の一覧を設定して、画面に渡す
        model.addAttribute("taskList", taskList);
        
		return "todo";
	}
	
//	今日のタスク
	@RequestMapping("/taskManagement/todayTask")
	public String todayTask() {
		return "todayTask";
	}
	
//	ガントチャート
	@RequestMapping("/taskManagement/ganttChart")
	public String ganttChart() {
		return "ganttChart";
	}
	
//	編集
	@RequestMapping("/taskManagement/edit")
	public String edit() {
		return "edit";
	}
}
