package ksyun.client.knad.addbwiplist.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AddBWIpListRequest
 * @Description 请求参数
 */
@Data
public class AddBWIpListRequest {
    /***/
    @KsYunField(name = "KnadId")
    private String KnadId;

    /**
     * 添加的IP段
     */
    @KsYunField(name = "Ip", type = 2)
    private List<String> IpList;

    /**
     * 策略类型（1: black, 2: white）
     */
    @KsYunField(name = "type")
    private Integer Type;

}