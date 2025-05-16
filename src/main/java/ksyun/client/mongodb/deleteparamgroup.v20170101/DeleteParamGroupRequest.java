package ksyun.client.mongodb.deleteparamgroup.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteParamGroupRequest
 * @Description 请求参数
 */
@Data
public class DeleteParamGroupRequest {
    /**
     * 删除参数组
     */
    @KsYunField(name = "ParamGroupId")
    private String ParamGroupId;

}