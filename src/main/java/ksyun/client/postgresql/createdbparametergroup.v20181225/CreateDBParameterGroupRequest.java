package ksyun.client.postgresql.createdbparametergroup.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDBParameterGroupRequest
* @Description 请求参数
*/
@Data
public class CreateDBParameterGroupRequest{
    /**#### 数据库引擎名称
取值范围:PostgreSQL*/
    @KsYunField(name="Engine")
    private String Engine;

    /**#### 数据库引擎版本
取值范围:  9.6/12.5/9.4/11/10/13*/
    @KsYunField(name="EngineVersion")
    private String EngineVersion;

    /**#### 参数组名称*/
    @KsYunField(name="DBParameterGroupName")
    private String DBParameterGroupName;

    /**#### 参数组描述*/
    @KsYunField(name="Description")
    private String Description;

    /**#### 参数详情
不传入指定参数及数值，则按照默认模板创建参数组*/
    @KsYunField(name="Parameters",type=2)
    private List<ParametersDto> ParametersList;

    @Data
    @ToString
    public static class ParametersDto {
        /**#### 参数名
参数名与参数值同时填写,不传择按默认值创建参数组*/
        @KsYunField(name="Name")
        private String Name;

        /**#### 参数值
参数名与参数值同时填写,不传择按默认值创建参数组*/
        @KsYunField(name="Value")
        private String Value;

    }

}
