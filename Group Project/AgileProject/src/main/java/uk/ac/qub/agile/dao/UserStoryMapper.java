package uk.ac.qub.agile.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import uk.ac.qub.agile.entry.UserStory;
import uk.ac.qub.agile.entry.UserStoryExample;

public interface UserStoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    long countByExample(UserStoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    int deleteByExample(UserStoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    int insert(UserStory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    int insertSelective(UserStory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    List<UserStory> selectByExample(UserStoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    UserStory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserStory record, @Param("example") UserStoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    int updateByExample(@Param("record") UserStory record, @Param("example") UserStoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    int updateByPrimaryKeySelective(UserStory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userstory
     *
     * @mbg.generated Sun Nov 15 21:28:18 CST 2020
     */
    int updateByPrimaryKey(UserStory record);
}