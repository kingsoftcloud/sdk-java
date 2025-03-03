package ksyun.client.krds.createdbparametergroup.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname CreateDBParameterGroupRequest
 * @Description 请求参数
 */
@Data
public class CreateDBParameterGroupRequest {
    /**
     * 参数组名称
     */
    @KsYunField(name = "DBParameterGroupName")
    private String DBParameterGroupName;

    /**
     * 数据库引擎名称	不同的数据库引擎，需要不同的数据库参数组<br>Engine与EngineVersion的对应关系：<br>mysql      5.5、5.6、5.7、8.0 <br> percona 5.6<br>consistent_mysql     5.7<br>ebs_mysql  5.6、5.7
     */
    @KsYunField(name = "Engine")
    private String Engine;

    /**
     * 数据库引擎版本
     */
    @KsYunField(name = "EngineVersion")
    private String EngineVersion;

    /**
     * 参数名	参数名与参数值同时填写
     */
    @KsYunField(name = "Parameters.Name")
    private List<String> ParametersNameList;

    /**
     * 参数值
     */
    @KsYunField(name = "Parameters.Value")
    private List<String> ParametersValueList;

    /**
     * 参数组描述
     */
    @KsYunField(name = "Description")
    private String Description;

}