package ksyun.client.knad.deletebw.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteBWRequest
 * @Description 请求参数
 */
@Data
public class DeleteBWRequest {
    /***/
    @KsYunField(name = "KnadId")
    private String KnadId;

    /**
     * 删除的IP的id
     */
    @KsYunField(name = "IpId", type = 2)
    private List<String> IpIdList;

    /**
     * 策略类型（1: black, 2: white）
     */
    @KsYunField(name = "type")
    private Integer Type;

}