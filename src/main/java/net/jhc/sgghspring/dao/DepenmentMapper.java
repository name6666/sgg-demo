package net.jhc.sgghspring.dao;

import net.jhc.sgghspring.pojo.Depenment;
import net.jhc.sgghspring.pojo.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepenmentMapper {
    @Select("select * from depant where demp_id= #{demp_id}")
    public Depenment fineDepenment(Integer demp_id);

    @Update("update depant set demp_department=#{demp_department} where demp_id= #{demp_id}")
    public void updateDepenment(Depenment depenment);

    @Delete("delete from depant where demp_id= #{demp_id}")
    public void deleteDepenment(Integer demp_id);

    @Insert("insert into depant(demp_department) value(#{demp_department})")
    public void insertDepenment(Depenment depenment);
}
