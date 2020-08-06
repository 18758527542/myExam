package com.zzxx.exam.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 实体数据管理, 用来读取数据文件放到内存集合当中
 */
public class EntityContext {
    //
    private Map<Integer, User> users = new HashMap<>();
    //
    private Map<Integer, List<Question>> questions = new HashMap<>();

    public void loadUsers(String filename) {

    }

    public void loadQuestions(String filename) {

    }
}
