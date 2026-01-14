package ksyun.client.kfw.queryoverviewdetail.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryOverviewDetailRequest
* @Description 请求参数
*/
@Data
public class QueryOverviewDetailRequest{
    /**云防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="EndTime")
    private String EndTime;

}
