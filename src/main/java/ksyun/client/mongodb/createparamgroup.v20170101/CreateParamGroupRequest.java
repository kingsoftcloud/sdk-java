package ksyun.client.mongodb.createparamgroup.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateParamGroupRequest
* @Description 请求参数
*/
@Data
public class CreateParamGroupRequest{
    /**参数组名称*/
    @KsYunField(name="ParamGroupName")
    private String ParamGroupName;

    /**参数组描述*/
    @KsYunField(name="Description")
    private String Description;

    /**实例版本*/
    @KsYunField(name="DbVersion")
    private Double DbVersion;

    /**参数项*/
    @KsYunField(name="Params")
    private String Params;

}
