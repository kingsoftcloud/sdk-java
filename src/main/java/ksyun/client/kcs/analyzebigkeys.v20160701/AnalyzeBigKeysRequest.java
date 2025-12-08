package ksyun.client.kcs.analyzebigkeys.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AnalyzeBigKeysRequest
* @Description 请求参数
*/
@Data
public class AnalyzeBigKeysRequest{
    /**任务ID	 大key分析任务id*/
    @KsYunField(name="TaskId")
    private String TaskId;

    /**操作类型	 范围（1，2，3，4），1-缓存分析-结果-基础信息；2-缓存分析-结果-top大key占比图；3-缓存分析-结果-详情；4-缓存分析-结果-详情下载*/
    @KsYunField(name="QueryType")
    private Integer QueryType;

}
