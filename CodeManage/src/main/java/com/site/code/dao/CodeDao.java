package com.site.code.dao;

import java.util.List;

import com.site.code.vo.CodeVo;

public interface CodeDao {

	
	public void insertCode(CodeVo vo) throws Exception;
	
	public List<CodeVo> listCode() throws Exception;
	
	public CodeVo readCode(int CDNM) throws Exception;

	public CodeVo modifyCode(CodeVo vo) throws Exception;
	
	public CodeVo deleteCode(int CDNM) throws Exception;

}
