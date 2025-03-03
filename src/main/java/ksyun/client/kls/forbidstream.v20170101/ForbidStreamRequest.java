package ksyun.client.kls.forbidstream.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ForbidStreamRequest
 * @Description 请求参数
 */
@Data
public class ForbidStreamRequest {
    /**
     * 域名空间
     */
    @KsYunField(name = "UniqueName")
    private String UniqueName;

    /**
     * 应用名
     */
    @KsYunField(name = "App")
    private String App;

    /**
     * 推流域名
     */
    @KsYunField(name = "Pubdomain")
    private String Pubdomain;

    /**
     * 流名
     */
    @KsYunField(name = "Stream")
    private String Stream;

    /**
     * 流恢复的时间，Unix秒级时间戳<br/> 注意：默认禁播90天，且最长支持禁播90天<br/>传1，立即断开直播流 <br/>传-1，立即断开直播流并禁播90天
     */
    @KsYunField(name = "ForbidTillUnixTime")
    private Integer ForbidTillUnixTime;

}