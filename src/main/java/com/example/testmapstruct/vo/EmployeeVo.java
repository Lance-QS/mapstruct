package com.example.testmapstruct.vo;

import com.example.testmapstruct.po.EmployeeWorkPo;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: EmployeeVo
 * @Author: QS.libra
 * @Description: 员工视图对象
 * @Date: 2021/8/30 11:14
 * @Version: 1.0
 */
@Data
public class EmployeeVo {

    private static final long serialVersionUID = 2L;
    /**
     * 主键
     */
    private String id;
    /**
     * 员工索引号
     */
    private String empIndex;
    /**
     * 公司名称
     */
    private String hospName;
    /**
     * 开始时间
     */
    private Date beginAt;
    /**
     * 结束时间
     */
    private Date endAt;
    /**
     * 工作时长
     */
    private String workTime;
    /**
     * 岗位
     */
    private String post;


    /**
     * 岗位职称
     */
    private String jobTitle;

    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 材料信息（JSON格式？）
     */
    private String attach;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createAt;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateAt;

    public EmployeeVo(EmployeeWorkPo po){
        this.id=po.getId();
        this.attach=po.getAttach();
        this.beginAt=po.getBeginAt();
        this.createAt=po.getCreateAt();
        this.createBy=po.getCreateBy();
        this.deptName=po.getDeptName();
        this.empIndex=po.getEmpIndex();
        this.endAt=po.getEndAt();
        this.hospName=po.getHospName();
        this.jobTitle=po.getJobTitle();
        this.post=po.getPost();
        this.updateAt=po.getUpdateAt();
        this.updateBy=po.getUpdateBy();
        this.workTime=po.getWorkTime();
    }

}
