package nuc.ss.dao;

import nuc.ss.pojo.Department;
import nuc.ss.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工dao
@Repository
public class EmployeeDao {
    //模拟数据库中的数据

    private static Map<Integer, Employee> employees = null;
    //员工所属部门
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer,Employee>();

        employees.put(1001,new Employee(1001,"AA1","453040781@qq.com",1,new Department(101,"部门101")));
        employees.put(1002,new Employee(1002,"AA2","453040782@qq.com",0,new Department(102,"部门102")));
        employees.put(1003,new Employee(1003,"AA3","453040783@qq.com",1,new Department(103,"部门103")));
        employees.put(1004,new Employee(1004,"AA4","453040784@qq.com",0,new Department(104,"部门104")));
        employees.put(1005,new Employee(1005,"AA5","453040785@qq.com",1,new Department(105,"部门105")));

    }
    //主键自增
    private static Integer initId = 1006;
    //增加一个员工
    public void add(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        System.out.println("add===>employee===>"+employee);
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        System.out.println("add2===>employee===>"+employee);
        employees.put(employee.getId(),employee);
    }

    //查询全部员工数据
    public Collection<Employee> getAll(){
        return employees.values();
    }
    //byID
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    //删除员工
    public void delete(Integer id){
        employees.remove(id);
    }
}
