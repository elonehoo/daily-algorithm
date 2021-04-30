package com.algorithm.year2021.a2May.b01One.code;

import java.util.List;

/**
 * 解决方案
 * @author HCY
 * @since 2021/5/1 7:32 上午
*/
public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int sum = getSum(employees,id,0);
        return sum;
    }

    private int getSum(List<Employee> employees, int id, int sum) {
        for (Employee employee : employees) {
            if (employee.id == id) {
                sum += employee.importance;
                for (Integer subordinate : employee.subordinates) {
                    sum += getSum(employees,subordinate,0);
                }
            }
        }
        return sum;
    }
}
