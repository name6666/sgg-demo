package net.jhc.sgghspring;

import net.jhc.sgghspring.dao.DepenmentMapper;
import net.jhc.sgghspring.dao.EmployeeMapper;
import net.jhc.sgghspring.pojo.Depenment;
import net.jhc.sgghspring.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SggHspringApplicationTests {

    @Autowired
    DepenmentMapper deleteEmployee;
    @Test
    void contextLoads() {
        Depenment e=new Depenment();
        e.setDemp_department("99");
        e.setDemp_id(9);
//        Depenment depenment=
        deleteEmployee.deleteDepenment(9);
//        System.out.println(depenment.toString());
    }

}
