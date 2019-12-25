package net.jhc.sgghspring.dao;

import net.jhc.sgghspring.pojo.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {
    @Select("select * from employee where user_id= #{user_id}")
    public Employee fineEmployee(Integer user_id);

    @Update("update employee set user_email=#{user_email}, user_name=#{user_name},user_gender=#{user_gender},user_state=#{user_state} where user_id= #{user_id}")
    public void updateEmployee(Employee employee);

    @Delete("delete from employee where user_id= #{user_id}")
    public void deleteEmployee(Integer user_id);

    @Insert("insert into employee(user_email,user_name,user_gender,user_state) value(#{user_email},#{user_name},#{user_gender},#{user_state})")
    public void insertEmployee(Employee employee);

}
