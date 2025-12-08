package ksyun.client.mongodb.modifyparamgroup.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyParamGroupRequest
* @Description 请求参数
*/
@Data
public class ModifyParamGroupRequest{
    /**新参数组名称*/
    @KsYunField(name="NewParamGroupName")
    private String NewParamGroupName;

    /**新参数组描述*/
    @KsYunField(name="NewDescription")
    private String NewDescription;

}
