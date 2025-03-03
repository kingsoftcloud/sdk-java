package ksyun.client.cen.createcen.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateCenRequest
 * @Description 请求参数
 */
@Data
public class CreateCenRequest {
    /**
     * 云企业网的名称
     */
    @KsYunField(name = "CenName")
    private String CenName;


}