package egovframework.example.sample.service;

import java.util.List;
import egovframework.example.sample.service.SystemAliasesDefaultVO;
import egovframework.example.sample.service.SystemAliasesVO;

/**
 * @Class Name : SystemAliasesService.java
 * @Description : SystemAliases Business class
 * @Modification Information
 *
 * @author com
 * @since 0701
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public interface SystemAliasesService {
	
	/**
	 * SYSTEM_ALIASES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 SystemAliasesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    String insertSystemAliases(SystemAliasesVO vo) throws Exception;
    
    /**
	 * SYSTEM_ALIASES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SystemAliasesVO
	 * @return void형
	 * @exception Exception
	 */
    void updateSystemAliases(SystemAliasesVO vo) throws Exception;
    
    /**
	 * SYSTEM_ALIASES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SystemAliasesVO
	 * @return void형 
	 * @exception Exception
	 */
    void deleteSystemAliases(SystemAliasesVO vo) throws Exception;
    
    /**
	 * SYSTEM_ALIASES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 SystemAliasesVO
	 * @return 조회한 SYSTEM_ALIASES
	 * @exception Exception
	 */
    SystemAliasesVO selectSystemAliases(SystemAliasesVO vo) throws Exception;
    
    /**
	 * SYSTEM_ALIASES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return SYSTEM_ALIASES 목록
	 * @exception Exception
	 */
    List selectSystemAliasesList(SystemAliasesDefaultVO searchVO) throws Exception;
    
    /**
	 * SYSTEM_ALIASES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return SYSTEM_ALIASES 총 갯수
	 * @exception
	 */
    int selectSystemAliasesListTotCnt(SystemAliasesDefaultVO searchVO);
    
}
