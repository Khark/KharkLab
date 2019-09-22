package com.site.code.service;

import java.util.List;

import com.site.code.vo.CodeVo;

public interface CodeService {

	public void insertCode(CodeVo vo) throws Exception;
	
	public List<CodeVo> listCode() throws Exception;
	
	public CodeVo readCode(int CONM) throws Exception;
	
	public CodeVo modifyCode(CodeVo vo) throws Exception;
	
	public CodeVo deleteCode(CodeVo vo) throws Exception;
	
	
}
