package com.shangwj.blog.mapper.impl;

import com.shangwj.blog.model.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface MenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..Menu
     *
     * @mbggenerated Wed Aug 07 22:47:36 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..Menu
     *
     * @mbggenerated Wed Aug 07 22:47:36 CST 2019
     */
    int insert(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..Menu
     *
     * @mbggenerated Wed Aug 07 22:47:36 CST 2019
     */
    Menu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..Menu
     *
     * @mbggenerated Wed Aug 07 22:47:36 CST 2019
     */
    List<Menu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test..Menu
     *
     * @mbggenerated Wed Aug 07 22:47:36 CST 2019
     */
    int updateByPrimaryKey(Menu record);

    List<Menu> findAllRecursion();
}