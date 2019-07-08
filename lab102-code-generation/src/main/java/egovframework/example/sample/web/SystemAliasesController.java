package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

import egovframework.example.sample.service.SystemAliasesService;
import egovframework.example.sample.service.SystemAliasesDefaultVO;
import egovframework.example.sample.service.SystemAliasesVO;

/**
 * @Class Name : SystemAliasesController.java
 * @Description : SystemAliases Controller class
 * @Modification Information
 *
 * @author com
 * @since 0701
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Controller
@SessionAttributes(types=SystemAliasesVO.class)
public class SystemAliasesController {

    @Resource(name = "systemAliasesService")
    private SystemAliasesService systemAliasesService;
    
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
	
    /**
	 * SYSTEM_ALIASES 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 SystemAliasesDefaultVO
	 * @return "/systemAliases/SystemAliasesList"
	 * @exception Exception
	 */
    @RequestMapping(value="/systemAliases/SystemAliasesList.do")
    public String selectSystemAliasesList(@ModelAttribute("searchVO") SystemAliasesDefaultVO searchVO, 
    		ModelMap model)
            throws Exception {
    	
    	/** EgovPropertyService.sample */
    	searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
    	searchVO.setPageSize(propertiesService.getInt("pageSize"));
    	
    	/** pageing */
    	PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
		paginationInfo.setPageSize(searchVO.getPageSize());
		
		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
        List<?> systemAliasesList = systemAliasesService.selectSystemAliasesList(searchVO);
        model.addAttribute("resultList", systemAliasesList);
        
        int totCnt = systemAliasesService.selectSystemAliasesListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
        model.addAttribute("paginationInfo", paginationInfo);
        
        return "/systemAliases/SystemAliasesList";
    } 
    
    @RequestMapping("/systemAliases/addSystemAliasesView.do")
    public String addSystemAliasesView(
            @ModelAttribute("searchVO") SystemAliasesDefaultVO searchVO, Model model)
            throws Exception {
        model.addAttribute("systemAliasesVO", new SystemAliasesVO());
        return "/systemAliases/SystemAliasesRegister";
    }
    
    @RequestMapping("/systemAliases/addSystemAliases.do")
    public String addSystemAliases(
            SystemAliasesVO systemAliasesVO,
            @ModelAttribute("searchVO") SystemAliasesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        systemAliasesService.insertSystemAliases(systemAliasesVO);
        status.setComplete();
        return "forward:/systemAliases/SystemAliasesList.do";
    }
    
    @RequestMapping("/systemAliases/updateSystemAliasesView.do")
    public String updateSystemAliasesView(
            @RequestParam("objectType") java.lang.String objectType ,
            @ModelAttribute("searchVO") SystemAliasesDefaultVO searchVO, Model model)
            throws Exception {
        SystemAliasesVO systemAliasesVO = new SystemAliasesVO();
        systemAliasesVO.setObjectType(objectType);        
        // 변수명은 CoC 에 따라 systemAliasesVO
        model.addAttribute(selectSystemAliases(systemAliasesVO, searchVO));
        return "/systemAliases/SystemAliasesRegister";
    }

    @RequestMapping("/systemAliases/selectSystemAliases.do")
    public @ModelAttribute("systemAliasesVO")
    SystemAliasesVO selectSystemAliases(
            SystemAliasesVO systemAliasesVO,
            @ModelAttribute("searchVO") SystemAliasesDefaultVO searchVO) throws Exception {
        return systemAliasesService.selectSystemAliases(systemAliasesVO);
    }

    @RequestMapping("/systemAliases/updateSystemAliases.do")
    public String updateSystemAliases(
            SystemAliasesVO systemAliasesVO,
            @ModelAttribute("searchVO") SystemAliasesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        systemAliasesService.updateSystemAliases(systemAliasesVO);
        status.setComplete();
        return "forward:/systemAliases/SystemAliasesList.do";
    }
    
    @RequestMapping("/systemAliases/deleteSystemAliases.do")
    public String deleteSystemAliases(
            SystemAliasesVO systemAliasesVO,
            @ModelAttribute("searchVO") SystemAliasesDefaultVO searchVO, SessionStatus status)
            throws Exception {
        systemAliasesService.deleteSystemAliases(systemAliasesVO);
        status.setComplete();
        return "forward:/systemAliases/SystemAliasesList.do";
    }

}
