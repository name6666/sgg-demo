package net.jhc.sgghspring.sevice;

import net.jhc.sgghspring.dao.EmployeeMapper;
import net.jhc.sgghspring.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeService {
    @Resource
    EmployeeMapper employeeMapper;

    @Cacheable(cacheNames = {"emp"},condition = "#user_id>6")
    public Employee findone(Integer user_id) {
        System.out.println("EmployeeService.findone");
        return employeeMapper.fineEmployee(user_id);
    }

    public void deleteone(Integer user_id) {
        employeeMapper.deleteEmployee(user_id);
    }

    public void updateone(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    public void addone(Employee employee) {
        employeeMapper.insertEmployee(employee);
    }
}
