package nuc.ss.dao;

import nuc.ss.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门dao
@Repository
public class DepartmentDao {
    //模拟数据库中的数据

    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<Integer,Department>();
        departments.put(101,new Department(101,"部门101"));
        departments.put(102,new Department(102,"部门102"));
        departments.put(103,new Department(103,"部门103"));
        departments.put(104,new Department(104,"部门104"));
        departments.put(105,new Department(105,"部门105"));
    }

    //获得所有部门信息
    public Collection<Department> getDepartments(){
        return departments.values();
    }

    //获得部门信息byid
    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }
}
