package ksyun.client.postgresql.resetdbparametergroup.v20181225;

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
    /**参数组ID*/
    @KsYunField(name="DBParameterGroupId")
    private String DBParameterGroupId;


}