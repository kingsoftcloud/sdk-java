package ksyun.client.knad.getbwiplist.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetBWIpListRequest
 * @Description 请求参数
 */
@Data
public class GetBWIpListRequest {
    /***/
    @KsYunField(name = "KnadId")
    private String KnadId;

    /**
     * 策略类型（1: black, 2: white）
     */
    @KsYunField(name = "type")
    private Integer Type;

    /**
     * 要搜索的ip
     */
    @KsYunField(name = "Ip")
    private String Ip;

    /**
     * 每页条数
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

    /**
     * 开始条数
     */
    @KsYunField(name = "OffSet")
    private Integer OffSet;

}