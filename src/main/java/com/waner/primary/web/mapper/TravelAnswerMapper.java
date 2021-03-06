package com.waner.primary.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.waner.primary.web.entity.TravelAnswer;
import com.waner.primary.web.vo.AnswerWithUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TravelAnswerMapper extends BaseMapper<TravelAnswer> {
    int deleteByPrimaryKey(Integer id);

    int insertTravelAnswerMapper(TravelAnswer record);

    int insertSelective(TravelAnswer record);

    TravelAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TravelAnswer record);

    int updateByPrimaryKeyWithBLOBs(TravelAnswer record);

    int updateByPrimaryKey(TravelAnswer record);

    IPage<AnswerWithUser> queryAnswerWithUser(Page pageHelper, @Param("questionId") Integer questionId);

    int queryAnswersWithUserCount(@Param("questionId") Integer questionId);

    List<AnswerWithUser> queryAnswersByUserId(@Param("userId") Integer userId);

    int queryQuestionIdByAnswerId(Integer answerId);

    List<AnswerWithUser> queryWithContent(@Param("title") String title);

	void deleteQuestionAnswerAccording2AnswerId(@Param("answerId") Integer id);
}
