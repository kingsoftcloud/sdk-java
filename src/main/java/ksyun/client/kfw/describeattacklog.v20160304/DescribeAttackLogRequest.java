package ksyun.client.kfw.describeattacklog.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAttackLogRequest
* @Description 请求参数
*/
@Data
public class DescribeAttackLogRequest{
    /**防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**开始时间 格式yyyy-MM-dd HH:mm*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间，格式yyyy-MM-dd HH:mm*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**查询关键字*/
    @KsYunField(name="QueryKeyword")
    private String QueryKeyword;

    /**最大值1000*/
    @KsYunField(name="MaxResults")
    private String MaxResults;

    /**下一页token*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
