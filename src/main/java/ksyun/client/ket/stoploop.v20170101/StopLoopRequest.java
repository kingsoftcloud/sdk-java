package ksyun.client.ket.stoploop.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StopLoopRequest
 * @Description 请求参数
 */
@Data
public class StopLoopRequest {
    /**
     * 域名空间
     */
    @KsYunField(name = "UniqName")
    private String UniqName;

    /**
     * 应用名
     */
    @KsYunField(name = "App")
    private String App;

    /**
     * 轮播流名
     */
    @KsYunField(name = "StreamID")
    private String StreamID;

}