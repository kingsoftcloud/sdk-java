package ksyun.client.ked.strategyedit.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StrategyeditRequest
* @Description 请求参数
*/
@Data
public class StrategyeditRequest{
    /**策略组唯一 id
*/
    @KsYunField(name="securityGroupId")
    private String SecurityGroupId;

    /**策略组名称*/
    @KsYunField(name="name")
    private String Name;

    /**描述信息
*/
    @KsYunField(name="description")
    private String Description;


}