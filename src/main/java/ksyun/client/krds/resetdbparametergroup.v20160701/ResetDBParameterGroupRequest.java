package ksyun.client.krds.resetdbparametergroup.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ResetDBParameterGroupRequest
* @Description 请求参数
*/
@Data
public class ResetDBParameterGroupRequest{
    /**参数组ID	通过[参数组-列表（详情）接口](https://docs.ksyun.com/documents/344)获取*/
    @KsYunField(name="DBParameterGroupId")
    private String DBParameterGroupId;


}