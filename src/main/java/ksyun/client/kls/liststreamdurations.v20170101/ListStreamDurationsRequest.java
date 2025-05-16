package ksyun.client.kls.liststreamdurations.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListStreamDurationsRequest
 * @Description 请求参数
 */
@Data
public class ListStreamDurationsRequest {
    /**
     * 域名空间
     */
    @KsYunField(name = "UniqueName")
    private String UniqueName;

    /**
     * 频道
     */
    @KsYunField(name = "App")
    private String App;

    /**
     * 推流域名
     */
    @KsYunField(name = "Pubdomain")
    private String Pubdomain;

    /**
     * 流名，如果携带则返回单条流的推流时长；否则返回整个App下所有流的推流时长
     */
    @KsYunField(name = "Stream")
    private String Stream;

    /**
     * 查询开始时间，UTC时间戳，以当天00:00点为开始时间
     */
    @KsYunField(name = "StartUnixTime")
    private Integer StartUnixTime;

    /**
     * 查询结束时间，UTC时间戳，以当天00:00点为结束时间
     */
    @KsYunField(name = "EndUnixTime")
    private Integer EndUnixTime;

}