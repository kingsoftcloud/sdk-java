package ksyun.client.epc.createresourcerequirement.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateResourceRequirementRequest
* @Description 请求参数
*/
@Data
public class CreateResourceRequirementRequest{
    /**可用区*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

    /**服务器需求数量*/
    @KsYunField(name="RequirementCount")
    private Integer RequirementCount;

    /**项目名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**使用时间，yyyyMMdd*/
    @KsYunField(name="UsageDate")
    private String UsageDate;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

    /**物理机类型*/
    @KsYunField(name="HostType")
    private String HostType;


}