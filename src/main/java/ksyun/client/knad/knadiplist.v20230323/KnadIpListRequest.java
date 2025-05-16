package ksyun.client.knad.knadiplist.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname KnadIpListRequest
 * @Description 请求参数
 */
@Data
public class KnadIpListRequest {
    /**
     * 高防实例id
     */
    @KsYunField(name = "KnadId")
    private String KnadId;

}