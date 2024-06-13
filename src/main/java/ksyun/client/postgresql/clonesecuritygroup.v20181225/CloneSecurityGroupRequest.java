package ksyun.client.postgresql.clonesecuritygroup.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CloneSecurityGroupRequest
* @Description 请求参数
*/
@Data
public class CloneSecurityGroupRequest{
    /**安全组ID(源安全组ID)*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**安全组名称

##### 不可超过256个字符，中文，字母，数字，中划线，下划线*/
    @KsYunField(name="SecurityGroupName")
    private String SecurityGroupName;

    /**安全组描述

##### 安全组描述 支持1-64个字符 不可超过256个字符，中文，字母，数字，中划线，下划线*/
    @KsYunField(name="SecurityGroupDescription")
    private String SecurityGroupDescription;


}