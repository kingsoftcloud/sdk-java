package ksyun.client.krds.deletedbparametergroup.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDBParameterGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteDBParameterGroupRequest{
    /**参数组ID*/
    @KsYunField(name="DBParameterGroupId")
    private String DBParameterGroupId;


}