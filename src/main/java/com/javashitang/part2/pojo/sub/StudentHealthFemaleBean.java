package com.javashitang.part2.pojo.sub;

import com.javashitang.part2.pojo.StudentHealthBean;

public class StudentHealthFemaleBean extends StudentHealthBean{

    /*
     * 女学生健康状况，多了女生的检查项目
     */
    private String uterus;

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }
}
