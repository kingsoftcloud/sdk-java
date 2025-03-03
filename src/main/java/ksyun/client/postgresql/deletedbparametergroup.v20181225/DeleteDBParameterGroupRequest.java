package ksyun.client.postgresql.deletedbparametergroup.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDBParameterGroupRequest
 * @Description 请求参数
 */
@Data
public class DeleteDBParameterGroupRequest {
    /**
     * #### 参数组ID
     */
    @KsYunField(name = "DBParameterGroupId")
    private String DBParameterGroupId;

}