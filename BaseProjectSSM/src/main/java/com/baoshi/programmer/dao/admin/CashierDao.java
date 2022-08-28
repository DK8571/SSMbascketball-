package com.baoshi.programmer.dao.admin;

import com.baoshi.programmer.entity.admin.Cashier;
import com.baoshi.programmer.entity.admin.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CashierDao {
    @Select("select * from user where username = #{username}")
    User findByCashiername(String username);

    @Insert("insert into user(id,username,password,roleId,photo,sex,age,address) values(null,#{username},#{password},2,#{photo},#{sex},#{age},#{address})")
    int add(User user);

    @Insert("update user set username = #{username},photo = #{photo},sex = #{sex},age = #{age},address = #{address} where id = #{id}")
    int edit(User user);

    @Delete("delete from user where id in(${value})")
    int delete(String ids);

    @Select({"<script>"+
            "select user.*,cashier.stadiumid,stadium.stadiumname from user,cashier,stadium where user.roleId = 2 and user.id = cashier.id and stadium.id = cashier.stadiumid "+
            "<if test='username != null'>"+
            "and username like '%${username}%'"+
            "</if>"+
            "<if test='sex != null'>"+
            "and sex = #{sex}"+
            "</if>"+
            "<if test='satdiumid != null'>"+
            "and stadiumid = #{satdiumid}"+
            "</if>"+
            "<if test='offset != null and pageSize != null'>"+
            "limit #{offset},#{pageSize}"+
            "</if>"+
            "</script>"
    })
    List<User> findList(Map<String, Object> queryMap);
    @Select({"<script>"+
            "select count(*) from user,cashier,stadium where user.roleId = 2 and user.id = cashier.id and stadium.id = cashier.stadiumid "+
            "<if test='username != null'>and username like '%${username}%'</if>"+
            "<if test='sex != null'>"+
            "and sex = #{sex}"+
            "</if>"+
            "<if test='stadiumid != null'>"+
            "and cashier.stadiumid = #{stadiumid}"+
            "</if>"+
            "</script>"
    })
    int getTotal(Map<String, Object> queryMap);
}
