package com.inc.dayary.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inc.dayary.domain.Diary;
import com.inc.dayary.repository.DiaryDao;

@Service
public class DiaryServiceImpl implements DiaryService {
	
	@Autowired
	private DiaryDao diaryDao;

	@Override
	public List<Diary> list() {
		return diaryDao.list();
	}

	@Override
	public void add(Diary diary) {
		diaryDao.add(diary);
	}

	@Override
	public List<Diary> list(String id) {
		return diaryDao.list(id);
	}

}



