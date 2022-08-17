package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import egovframework.example.sample.service.SampleVO;
import egovframework.example.sample.service.SampleDefaultVO;

/**
 * @Class Name : SampleDAO.java
 * @Description : Sample DAO Class
 * @Modification Information
 *
 * @author MG Sung
 * @since 2021/12/25
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("sampleDAO")
public class SampleDAO extends EgovAbstractMapper {

	/**
	 * sample을 등록한다.
	 * @param vo - 등록할 정보가 담긴 SampleVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public int insertSample(SampleVO vo) throws Exception {
        return insert("insertSample", vo);
    }

    /**
	 * sample을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateSample(SampleVO vo) throws Exception {
        update("updateSample", vo);
    }

    /**
	 * sample을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SampleVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteSample(SampleVO vo) throws Exception {
        delete("deleteSample", vo);
    }

    /**
	 * sample을 조회한다.
	 * @param vo - 조회할 정보가 담긴 SampleVO
	 * @return 조회한 sample
	 * @exception Exception
	 */
    public SampleVO selectSample(SampleVO vo) throws Exception {
        return (SampleVO) selectOne("selectSample", vo);
    }

    /**
	 * sample 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return sample 목록
	 * @exception Exception
	 */
    public List<?> selectSampleList(SampleDefaultVO searchVO) throws Exception {
        return list("selectSampleList", searchVO);
    }

    /**
	 * sample 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return sample 총 갯수
	 * @exception
	 */
    public int selectSampleListTotCnt(SampleDefaultVO searchVO) {
        return (Integer)selectOne("selectSampleListTotCnt", searchVO);
    }

}
