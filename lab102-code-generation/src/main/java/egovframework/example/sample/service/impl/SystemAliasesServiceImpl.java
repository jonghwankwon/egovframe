package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.example.sample.service.SystemAliasesService;
import egovframework.example.sample.service.SystemAliasesDefaultVO;
import egovframework.example.sample.service.SystemAliasesVO;
import egovframework.example.sample.service.impl.SystemAliasesDAO;

/**
 * @Class Name : SystemAliasesServiceImpl.java
 * @Description : SystemAliases Business Implement class
 * @Modification Information
 *
 * @author com
 * @since 0701
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Service("systemAliasesService")
public class SystemAliasesServiceImpl extends EgovAbstractServiceImpl implements
        SystemAliasesService {
        
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemAliasesServiceImpl.class);

    @Resource(name="systemAliasesDAO")
    private SystemAliasesDAO systemAliasesDAO;
    
    /** ID Generation */
    //@Resource(name="{egovSystemAliasesIdGnrService}")    
    //private EgovIdGnrService egovIdGnrService;

	/**
	 * SYSTEM_ALIASES을 등록한다.
	 * @param vo - 등록할 정보가 담긴 SystemAliasesVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertSystemAliases(SystemAliasesVO vo) throws Exception {
    	LOGGER.debug(vo.toString());
    	
    	/** ID Generation Service */
    	//TODO 해당 테이블 속성에 따라 ID 제너레이션 서비스 사용
    	//String id = egovIdGnrService.getNextStringId();
    	//vo.setId(id);
    	LOGGER.debug(vo.toString());
    	
    	systemAliasesDAO.insertSystemAliases(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    /**
	 * SYSTEM_ALIASES을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SystemAliasesVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateSystemAliases(SystemAliasesVO vo) throws Exception {
        systemAliasesDAO.updateSystemAliases(vo);
    }

    /**
	 * SYSTEM_ALIASES을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SystemAliasesVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteSystemAliases(SystemAliasesVO vo) throws Exception {
        systemAliasesDAO.deleteSystemAliases(vo);
    }

    /**
	 * SYSTEM_ALIASES을 조회한다.
	 * @param vo - 조회할 정보가 담긴 SystemAliasesVO
	 * @return 조회한 SYSTEM_ALIASES
	 * @exception Exception
	 */
    public SystemAliasesVO selectSystemAliases(SystemAliasesVO vo) throws Exception {
        SystemAliasesVO resultVO = systemAliasesDAO.selectSystemAliases(vo);
        if (resultVO == null)
            throw processException("info.nodata.msg");
        return resultVO;
    }

    /**
	 * SYSTEM_ALIASES 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return SYSTEM_ALIASES 목록
	 * @exception Exception
	 */
    public List<?> selectSystemAliasesList(SystemAliasesDefaultVO searchVO) throws Exception {
        return systemAliasesDAO.selectSystemAliasesList(searchVO);
    }

    /**
	 * SYSTEM_ALIASES 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return SYSTEM_ALIASES 총 갯수
	 * @exception
	 */
    public int selectSystemAliasesListTotCnt(SystemAliasesDefaultVO searchVO) {
		return systemAliasesDAO.selectSystemAliasesListTotCnt(searchVO);
	}
    
}
