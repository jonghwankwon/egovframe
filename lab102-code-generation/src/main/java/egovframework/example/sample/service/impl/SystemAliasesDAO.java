package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.example.sample.service.SystemAliasesVO;
import egovframework.example.sample.service.SystemAliasesDefaultVO;

/**
 * @Class Name : SystemAliasesDAO.java
 * @Description : SystemAliases DAO Class
 * @Modification Information
 *
 * @author com
 * @since 0701
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("systemAliasesDAO")
public class SystemAliasesDAO extends EgovAbstractDAO {

	/**
	 * SYSTEM_ALIASES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 SystemAliasesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertSystemAliases(SystemAliasesVO vo) throws Exception {
        return (String)insert("systemAliasesDAO.insertSystemAliases_S", vo);
    }

    /**
	 * SYSTEM_ALIASES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SystemAliasesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateSystemAliases(SystemAliasesVO vo) throws Exception {
        update("systemAliasesDAO.updateSystemAliases_S", vo);
    }

    /**
	 * SYSTEM_ALIASES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SystemAliasesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteSystemAliases(SystemAliasesVO vo) throws Exception {
        delete("systemAliasesDAO.deleteSystemAliases_S", vo);
    }

    /**
	 * SYSTEM_ALIASES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 SystemAliasesVO
	 * @return 조회한 SYSTEM_ALIASES
	 * @exception Exception
	 */
    public SystemAliasesVO selectSystemAliases(SystemAliasesVO vo) throws Exception {
        return (SystemAliasesVO) select("systemAliasesDAO.selectSystemAliases_S", vo);
    }

    /**
	 * SYSTEM_ALIASES 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return SYSTEM_ALIASES 목록
	 * @exception Exception
	 */
    public List<?> selectSystemAliasesList(SystemAliasesDefaultVO searchVO) throws Exception {
        return list("systemAliasesDAO.selectSystemAliasesList_D", searchVO);
    }

    /**
	 * SYSTEM_ALIASES 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return SYSTEM_ALIASES 총 갯수
	 * @exception
	 */
    public int selectSystemAliasesListTotCnt(SystemAliasesDefaultVO searchVO) {
        return (Integer)select("systemAliasesDAO.selectSystemAliasesListTotCnt_S", searchVO);
    }

}
