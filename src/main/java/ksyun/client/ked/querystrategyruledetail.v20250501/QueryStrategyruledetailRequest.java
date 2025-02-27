package ksyun.client.ked.querystrategyruledetail.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryStrategyruledetailRequest
* @Description 请求参数
*/
@Data
public class QueryStrategyruledetailRequest{
    /**策略组 id*/
    @KsYunField(name="securityGroupId")
    private String SecurityGroupId;


}