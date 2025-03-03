package ksyun.client.pdns.queryendpointregionaz.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname QueryEndPointRegionAZRequest
 * @Description 请求参数
 */
@Data
public class QueryEndPointRegionAZRequest {
    /**
     * 机房code 例如cn-beijing-6
     */
    @KsYunField(name = "Region")
    private String Region;

}